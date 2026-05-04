plugins {
    id("java-library")
//    id("xyz.jpenilla.run-paper") version "3.0.2"
    id("maven-publish")
}

group = "com.github.minica660"
version = "1.0"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
    maven { url = uri("https://jitpack.io") }

}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.11-R0.1-SNAPSHOT")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.15.2")

}

java {
    toolchain.languageVersion = JavaLanguageVersion.of(21)
}
