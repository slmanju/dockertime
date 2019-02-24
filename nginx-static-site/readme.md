docker build -t nginx-test .
docker container run -d -p 80:80 --name nginx-test nginx-test
