package intro

fun main(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "Kotlin"

    println("Hello, $name! or better said ${getNameUpcase(name)}!!!")

    println("Who is there, maybe ${getNameUpcase()}???")
}

fun getNameUpcase(name: String = "John Doe") : String {
    return name.toUpperCase()
}