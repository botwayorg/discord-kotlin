/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin application project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/7.4.2/userguide/building_java_projects.html
 */

plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.7.10"

    // Apply the application plugin to add support for building a CLI application in Java.
    application

    kotlin("plugin.serialization") version "1.7.10"
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()

    maven("https://oss.sonatype.org/content/repositories/snapshots")
}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:30.1.1-jre")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
    
    implementation("dev.kord:kord-core:0.8.0-M15")

    implementation("net.mamoe.yamlkt:yamlkt:0.10.2")

    implementation("com.beust:klaxon:5.5")
}

application {
    // Define the main class for the application.
    mainClass.set("core.BotKt")
}
