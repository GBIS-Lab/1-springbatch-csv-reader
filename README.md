# springbatch-csv-reader
springbatch with input csv file

# Spring Batch - Lecture CSV avec Spring Boot

## 📄 Description
Ce projet lit un fichier CSV contenant des données de smartphones et les affiche.
Il démontre l'utilisation de Spring Batch simple sans configuration modulaire.

## 🚀 Technologies
- Java 17
- Spring Boot 3.x
- Spring Batch
[- Spring Data JPA
- H2 Database
- Thymeleaf
- API REST]

## 📁 Structure du projet
- `config/` : configuration Spring Batch
- `model/` : entités JPA
- `repository/` : interface DAO
- `reader/`, `processor/`, `writer/` : composants batch
- `controller/` : interface web + API

## 📦 Lancement
```bash
./mvnw spring-boot:run


![Build](https://img.shields.io/badge/build-passing-brightgreen)
![Java](https://img.shields.io/badge/java-17-blue)
![Spring](https://img.shields.io/badge/spring--boot-3.2.0-success)
