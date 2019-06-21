plugins {
    application
    kotlin("jvm") version "1.3.40"
}

application {
    mainClassName = "ranges.RangesKt"
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.3.31")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

repositories {
    jcenter()
}