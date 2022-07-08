import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.0"
    `java-library`
}

group = "com.github.kpavlov"
version = "1.0-SNAPSHOT"

val kotestVersion = "5.3.2"

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    api(kotlin("stdlib-jdk8"))
    // Test dependencies
    testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "17"
        languageVersion= "1.7"
        apiVersion= "1.7"
    }
}
