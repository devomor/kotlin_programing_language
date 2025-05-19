fun main() {

   when (2) {
    1 -> println("One")
    2, 3 -> println("Two or Three")
    in 4..10 -> println("In range")
    else -> println("Other")
  } 
}
