FROM mysql

LABEL maintainer="Manjula Jayawardana"

ENV MYSQL_DATABASE todos

COPY ./db-scripts/ /docker-entrypoint-initdb.d/

