fun main() {
val p = Person("Omar", 24)
     println(p.greet())

}

class Person(val name: String, var age: Int) {
    fun greet() {
        println("Hello, I am $name")
    }
}
