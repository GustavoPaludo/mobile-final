FROM mysql:latest

ENV MYSQL_ROOT_PASSWORD=root
ENV MYSQL_DATABASE=mobile
ENV MYSQL_USER=root
ENV MYSQL_PASSWORD=root

COPY dump/init.sql /docker-entrypoint-initdb.d/
