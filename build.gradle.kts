plugins {
    kotlin("jvm") version "1.9.22"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    //DCS: Base de datos H2
    implementation("com.h2database:h2:2.2.224")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}