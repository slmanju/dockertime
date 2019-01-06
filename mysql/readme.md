steps needed
Create database scripts
Create Dockerfile
Create custom docker image
Create container using custom image
Connect and play!

$ docker build -t test-mysql .
$ docker images

Now we have built our own custom mysql docker image. Let's run it.
$ docker run -d -p 3316:3306 --name docker-test-mysql -e MYSQL_ROOT_PASSWORD=letmein test-mysql

Our container is up and running in background. 

Connect to running container's bash
$ docker exec -it docker-test-mysql bash

Now we are inside our container's bash.
root@d99c0222c0bc:/#

Here we can use normal mysql commands to connect into our database and play.
$ mysql -uroot -p
(letmein)

mysql> show databases;
mysql> use todos;
mysql> show tables;
mysql> select * from employees;




