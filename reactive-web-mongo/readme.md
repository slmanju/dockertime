#### Build the project
`mvn clean package`

#### Run as docker containers
`docker-compose up -d`

#### Insert data
`curl -X POST \
   http://localhost:8081/books \
   -H 'Content-Type: application/json' \
   -d '{
 	"title": "Java 8 in action"
 }'`
 
 #### Fetch data
 `curl -X GET http://localhost:8081/books`
 
 #### Verify data
` docker container exec -it mongo-container mongo`

`use springreactive`

`db.book.find().pretty()`