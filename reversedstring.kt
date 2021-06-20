fun main() {
    val str = "Hello Adabe, how was your weekend?"

    val reverse = reverse(str)
    println(reverse)
}

fun reverse(str: String):
        String {
    var reverseString = ""
    for (i in str.length - 1 downTo 0) {
        reverseString += str[i]
    }
    return reverseString

}
