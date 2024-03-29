buildscript {
    repositories {
        jcenter()
        mavenLocal()
    }

    dependencies {

    }
}

plugins {
    id("org.jetbrains.kotlin.jvm")
    id("si.kamino.gradle.lokalise")
}

repositories {
    google()
    jcenter()
}

lokalise {
    id = "<project_id>"
    token = "<token>"
    indentation = "4sp"
}
