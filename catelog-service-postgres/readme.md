### Create postgres docker container using postgres image
`docker run --name postgres-container \
-d \
-p 5433:5432 \
-e POSTGRES_USER=postgres \
-e POSTGRES_PASSWORD=postgres \
-e POSTGRES_DB=postgres \
-v $HOME/docker/pg-data:/var/lib/postgresql/data \
postgres`

-- name = name of the container  
-d = run in daemon/detach mode  
-p = expose a port  
-e = add environment variables  
-v = bind mount  
--link = link another docker container  

### Build
`mvn clean package`

### Create the docker image
`docker build -t spring-postgress-app .`

### Run the docker container suing built image
`docker container run \
-d \
-p 8080:8080 \
--link postgres-container:postgres-database \
--name spring-postgress-container \
spring-postgress-app`

### Inspect logs
`docker container logs -f spring-postgress-container`

### Test it
`curl -X GET \
   http://localhost:8080/`
   
`curl -X POST \
   http://localhost:8080/products/save \
   -H 'cache-control: no-cache' \
   -H 'content-type: application/json' \
   -d '{
 	"price": 234
 }'`

`curl -X GET http://localhost:8080/products`

### Connect from psql and check data in database
`psql -h localhost -p 5433 -U postgres -d postgres`
`\d`
`select * from product`

Note: linking is not the standard way to link containers. should use docker-compose.