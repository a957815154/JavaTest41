mvn clean
mvn package
docker build -t mysql4 ./docker/mysql/
docker build -t jar4 .