fun main() {
//List
val names = listOf("Omar", "Hasan")
val numbers = mutableListOf(1, 2, 3)
names.forEach { println(it) }

//map 
val user = mapOf("name" to "Omar", "age" to 25)
println(user["name"])
println(user["age"])

}
