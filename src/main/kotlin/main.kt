import dailyChallenges.day1.Day1
import dailyChallenges.day10.Day10
import dailyChallenges.day12.Day12
import dailyChallenges.day2.Day2
import dailyChallenges.day3.Day3
import dailyChallenges.day4.Day4
import dailyChallenges.day5.Day5
import dailyChallenges.day6.Day6
import dailyChallenges.day7.Day7
import dailyChallenges.day8.Day8
import dailyChallenges.day9.Day9

fun main() {

    while (true) {
        println("Welcome to Advent of Code: (write day1, day2... day24")
        when (readLine()?.toLowerCase()) {
            "hello", "hi", "howdy", "hej", "bok", "konichiwa", "guten tag" -> println("Hello AoC user, tell me which day to check.")
            "day1" -> Day1().day1()
            "day2" -> Day2().day2()
            "day3" -> Day3().day3()
            "day4" -> Day4().day4()
            "day5" -> Day5().day5()
            "day6" -> Day6().day6()
            "day7" -> Day7().day7()
            "day8" -> Day8().day8()
            "day9" -> Day9().day9()
            "day10" -> Day10().day10()
            "day11" -> println("Didn't feel like doing this one, sorry mate.")
            "day12" -> Day12().day12()
            "exit", "leave", "c" -> {
                println("Bye!")
                return
            }
        }
    }
}