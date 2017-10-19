mvn clean package
docker build-t Suma
docker run -d --name Suma -p 8080:8080  Suma