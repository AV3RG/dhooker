dependencies {
    compileOnly("gg.rohan.delegasm:delegasm-annotation:0.2.0")
    annotationProcessor("gg.rohan.delegasm:delegasm-processor:0.2.0")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])

            groupId = project.group.toString()
            artifactId = project.name
            version = project.version.toString()
        }
    }
}
