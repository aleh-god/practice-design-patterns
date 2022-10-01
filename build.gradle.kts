buildscript {
    repositories {
        google()
        mavenCentral()
        jcenter()
    }

    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:${DaggerHilt.version}")
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.3.0" apply false
    id("com.android.library") version "7.3.0" apply false
    id("org.jetbrains.kotlin.android") version "1.7.10" apply false
    id("org.jetbrains.kotlin.jvm") version "1.7.10" apply false
    id("org.jlleitschuh.gradle.ktlint") version "11.0.0"
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}