package intro

fun main(args: Array<String>) {
    loopFor()
    loopForWithIndex()
    loopForInRange()
    loopForIteratingMap()
    loopDownToByStep()
    loopString()
}

fun loopFor() {
    val list = listOf("a", "b", "c")
    for (s in list) {
        print(s)
    }
}

fun loopForWithIndex() {
    val list = listOf("a", "b", "c")
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}

fun loopForInRange() {

    // include 9 as last member
    for (i in 1..9) {
        print(i)
    }


    // not include 10 as last member
    for (i in 1 until 10){
        print(i)
    }
}

// for iterating map
fun loopForIteratingMap() {
    val map = mapOf(
            1 to "one",
            2 to "two",
            3 to "three")

    for ((key, value) in map) {
        println("$key = $value")
    }
}

fun loopDownToByStep() {
    for (i in 9 downTo 1 step 2) {
        print(i)
    }
}

fun loopString() {
    for (ch in "abc"){
        print( ch + 1)
    }

}
