import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    jacoco
    `maven-publish`
}

val versionString = "1.0.1"

group = "io.github.bkosm"
version = versionString

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks {
    test {
        useJUnitPlatform()
    }

    withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }

    jacocoTestReport {
        reports {
            csv.required.set(true)
        }
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "io.github.bkosm"
            artifactId = "ktuple"
            version = versionString

            from(components["java"])
        }
    }
}
