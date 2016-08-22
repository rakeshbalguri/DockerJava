Building the image from the docker file: docker build -t dockerjava:1.0 .
docker run --name DockerJava dockerjava:1.0

docker rm containerName : To delete a container
docker images : To see the list of images
docker ps -a : To see the list of Docker Containers
docker rmi id : To delete the image

docker start DockerJava: To start the container
docker logs DockerJava: To see the logs from that container

docker rm $(docker ps -a -q) ---> Remove a container.


Run with MySQL

docker run --link my-sql:mysql --name DockerJava sagra02/dockerjava:1.0  --link my-sql:mysql -d DockerJava


docker run --name DockerJava --link mysql:db -d sagra02/dockerjava


Get the IP Address of the container
docker inspect containerId


MySQL

docker run --name mysqldb -e MYSQL_USER=mysql -e MYSQL_PASSWORD=mysql -e MYSQL_DATABASE=sample -e MYSQL_ROOT_PASSWORD=supersecret -d mysql/mysql-server:5.7


Run the instance
docker run --name DockerJava --link mysqldb:db dockerjava:1.0


Commands:

Build a docker image: docker build -t dockerjava:1.0 .
Run a docker image: docker run --name DockerJava dockerjava:1.0






