fun main() {

var name =   great("omar faruk");
    println(name);
    println(add(1,3));
}

//function
fun great(name:String): String{
   return "Hello "+ name;    
}

// Single-expression function
fun add(a: Int, b: Int) = a + b
