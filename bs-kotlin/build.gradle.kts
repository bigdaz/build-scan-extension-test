buildScan.tag("ROOTPROJECT_BUILD")

project("app") {
    rootProject.buildScan.tag("SUBPROJECT_FROM_ROOT")
}