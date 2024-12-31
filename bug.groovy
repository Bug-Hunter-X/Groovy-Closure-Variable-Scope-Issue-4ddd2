def someMethod(Closure c) {
    println "Executing closure"
    c()
}

someMethod { println "Hello from closure" }

someMethod {
    def x = 10
    println "x = $x"
}