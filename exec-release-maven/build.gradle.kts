plugins {
    java
}

dependencies {
    compile(project(":exec-core"))
    compile("org.slf4j:slf4j-api:1.7.25")
    compile("com.networknt:config:1.5.20")
    compile("com.networknt:service:1.5.20")
    testCompile("junit:junit:4.12")
    testCompile("ch.qos.logback:logback-classic:1.2.3")
}
