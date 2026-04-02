# Valhalla Playground
A simple playground to explore and test the new features introduced by Project Valhalla in Java.

## Requirements

- [Project Valhalla Early-Access Build](https://jdk.java.net/valhalla/) (based on JDK 27)
- Maven 3.9+

## Technical stack

| | Version |
|---|---|
| [Project Valhalla Early-Access Build](https://jdk.java.net/valhalla/) | based on JDK 27 |
| [Spring Boot](https://spring.io/projects/spring-boot) | 3.2.x |
| [Maven](https://maven.apache.org/) | 3.9+ |

## What I've done

- download JDK Early Access from https://jdk.java.net/valhalla/
- Project Structure > pointer sur la bonne jdk
- Spring Initializr
- POM.xml : java.version => 27
- POM.xml : add plugin compiler
- POM.xml : plugin spring-boot-maven : add --enable-preview pour pouvoir lancer les tests et l'appli
- Dans le terminal : $env:JAVA_HOME = ".....\....\jdk-27-ea-valhalla"
- clean compile : .\mvnw.cmd clean compile => BUILD SUCCESS