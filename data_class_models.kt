
// Define the data class
data class User(val id: Int, val name: String)

fun main() {
    // Create a list of users
    val users = listOf(
        User(1, "Omar"),
        User(2, "Hasan"),
        User(3, "Aisha")
    )

    // Print all users
   users.forEach { println("ID: ${it.id}, Name: ${it.name}") }
       // Find a user by ID
    val user2 = users.find { it.id == 2 }
    println("\nUser with ID 2: $user2")

    // Filter users with names starting with 'A'
    val filteredUsers = users.filter { it.name.startsWith("A") }
    println("\nUsers whose names start with 'A':")
    filteredUsers.forEach { println(it) }

    // Copy a user and change the name
    val updatedUser = user2?.copy(name = "Hasan Ali")
    println("\nUpdated user: $updatedUser")

}
