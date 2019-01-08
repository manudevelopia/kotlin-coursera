package intro


fun main(args: Array<String>) {
    println(areYouOldEnough())
    println(getDescription(Color.BLUE))
    println(whenSyntax(0))
    println(whenSyntax(1))
    println(whenSyntax("string"))
}

// if
fun areYouOldEnough(age: Int = 0): Boolean {

    val oldEnough = if (age > 18) true else false

    // No ternary operator
    // (age > 18) ? true : false

    return oldEnough
}

// when as swich

enum class Color {
    BLUE, ORANGE, RED
}

fun getDescription(color: Color): String =
        when (color) {
            Color.BLUE -> "cold"
            Color.ORANGE -> "mild"
            Color.RED -> {
                "hot"
            }
        }

// 'is' is java 'instanceof'
fun whenSyntax(a: Any) = when (a) {
    0 -> "is zero"
    is Int -> "is integer"
    is String -> "is string of lengh ${a.length}"
    else -> "other"
}

fun updateWeather(degrees: Int) {
    val (description, colour) = when {
        degrees < 5 -> "cold" to Color.BLUE
        degrees < 23 -> "mild" to Color.ORANGE
        else -> "hot" to Color.RED
    }
}
