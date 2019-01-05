package intro

fun main(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "Kotlin"

    println("Hello, $name! or better said ${getNameUpcase(name)}!!!")
}

fun getNameUpcase(name: String) : String {
    return name.toUpperCase()
}