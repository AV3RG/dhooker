version = "0.1-SNAPSHOT"
group = "gg.rohan.dhooker"


subprojects.forEach { subProj ->

    subProj.plugins.apply("java-library")
    subProj.plugins.apply("maven-publish")

    subProj.repositories {
        mavenCentral()
    }

    if (subProj.name != "api") {
        subProj.dependencies {
            add("compileOnly", project(":api"))
        }
    }

    subProj.group = group
    subProj.version = version

    subProj.tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
    }

}
