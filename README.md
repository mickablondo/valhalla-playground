# Valhalla Playground
A simple playground to explore and test the new features introduced by Project Valhalla in Java.

## Requirements

- [Project Valhalla Early-Access Build](https://jdk.java.net/valhalla/) (based on JDK 27)
- Maven 3.9+

## Technical stack

| | Version         |
|---|-----------------|
| [Project Valhalla Early-Access Build](https://jdk.java.net/valhalla/) | based on JDK 27 |
| [Spring Boot](https://spring.io/projects/spring-boot) | 4.1.0-M4        |
| [Maven](https://maven.apache.org/) | 3.9.14          |

## What I've done

- download JDK Early Access from https://jdk.java.net/valhalla/
- Project Structure > pointer sur la bonne jdk
- Spring Initializr
- POM.xml : java.version => 27
- POM.xml : add plugin compiler
- POM.xml : plugin spring-boot-maven : add --enable-preview pour pouvoir lancer les tests et l'appli
- Dans le terminal : $env:JAVA_HOME = ".....\....\jdk-27-ea-valhalla" car non reconnu par Intellij 2026.1
- clean compile : .\mvnw.cmd clean compile => BUILD SUCCESS

Attention, risque de conflit entre lombok et les value classes Valhalla.
Attention, problème pour ouvrir Project Structure avec une jdk 27 sur Intellij 2026.1.