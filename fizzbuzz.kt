fun main() {
    for (a in 1..100) {
        if (a % 15 == 0) {
            println("fizzbuzz")
        } else if (a % 3 == 0) {
            println("fizz")
        } else if (a % 5 == 0) {
            println("buzz")
        } else {
            println(a)
        }

    }
}

