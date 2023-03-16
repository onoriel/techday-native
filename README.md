# Techday Spring Boot Native Application


Spring Boot application with Native capabilities using Spring Native, oracle jdbc dependencies and spring-openapi.

## Packaging artifact

```console
mvn clean package
```

## Running JVM artifact
### Running with Maven Spring Boot plugin
```console
mvn spring-boot:run
```
### Running with Java
```console
java -jar ./target/workshop-native-0.0.1-SNAPSHOT.jar
```

## Building Docker Image
```console
mvn -Pnative spring-boot:build-image -Dspring-boot.build-image.imageName=onoriel/workshop-native:latest
```

## Running Docker Image
```console
docker run --rm -p 7080:7080 onoriel/workshop-native --spring.datasource.plain-url=<<ORACLE_DB_IP>>:<<ORACLE_DB_PORT>>/xe
```

## Building GraalVM Native Version
```console
mvn -Pnative native:compile
```

## Running GraalVM Native Version 
```console
./target/workshop-native
```

