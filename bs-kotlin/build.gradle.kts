plugins {
    id("tag.plugin.greeting") version("0")
}

buildScan.tag("ROOTPROJECT_BUILD")

project("app") {
    rootProject.buildScan.tag("SUBPROJECT_FROM_ROOT")
}

allprojects {
    rootProject.buildScan.tag("PROJECT-" + this.name)
}