def someMethod(Closure c) {
    println "Executing closure"
    def result = c() //capture the result of the closure
    println "Closure completed. The return value is $result"
}

someMethod { println "Hello from closure"; return 100 }

someMethod {
    def x = 10
    println "x = $x"
    return x
}