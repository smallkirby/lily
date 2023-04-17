plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "xyz.smallkirby"
version = "0.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(15)
}

application {
    mainClass.set("MainKt")
}