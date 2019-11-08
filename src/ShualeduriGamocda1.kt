
/*
* Created by Nika,Lasha,Saba,Tengo,Nika
*/

// 1. Kvela Klass Schirdeba ToString()
// 2. equals & hashCode
// 3. copy

data class Laptop (val brand: String, val price:Int)
{
    fun show()
    {
        println("Awesome Machine...")

    }

}

fun main(args : Array<String>)
{
    var lap1 = Laptop("Dell",2000)
    var lap2 = Laptop("Dell",2000)

    var lap3 = lap1.copy(price=2200);
    println(lap1.equals(lap2))

    println(lap3)
}