import DailyChallenges.Day1.day1
import DailyChallenges.Day2.day2
import DailyChallenges.Day3.day3

fun main() {

    while (true) {
        println("Welcome to Advent of Code: (write day1, day2... day24")
        when (readLine()?.toLowerCase()) {
            "hello", "hi", "howdy" -> println("Hello user, tell me which day.")
            "day1" -> day1()
            "day2" -> day2()
            "day3" -> day3()
            "exit", "leave", "c" -> {
                println("Bye!")
                return
            }
        }
    }

}