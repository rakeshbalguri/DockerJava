Building the image from the docker file: docker build -t osboxes/dockerjava:1.0 .
docker run --name DockerJava osboxes/dockerjava:1.0

docker rm containerName : To delete a container
docker images : To see the list of images
docker ps -a : To see the list of Docker Containers

docker start DockerJava: To start the container
docker logs DockerJava: To see the logs from that container




Run with MySQL

docker run --link my-sql:mysql --name DockerJava osboxes/dockerjava:1.0  --link my-sql:mysql -d DockerJava


docker run --name DockerJava --link mysql:db -d osboxes/dockerjava


Get the IP Address of the container
docker inspect -f '{{ .NetworkSettings.IPAddress }}' containerName


MySQL

docker run --name mysqldb -e MYSQL_USER=mysql -e MYSQL_PASSWORD=mysql -e MYSQL_DATABASE=sample -e MYSQL_ROOT_PASSWORD=supersecret -d mysql/mysql-server:5.7


Run the instance
docker run --name DockerJava --link mysqldb:db osboxes/dockerjava:1.0