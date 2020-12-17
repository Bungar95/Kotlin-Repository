package dailyChallenges.day10

import dailyChallenges.loadTxtAsInt

class Day10 {

    var oneDifference = 0
    var threeDifference = 1

    fun day10(){
        var array = loadTxtAsInt("src/main/kotlin/dailyChallenges/day10/day10.txt").sorted()
        var iterator = array.listIterator()
        var xPoint = iterator.next()

        while (iterator.hasNext()){
            var yPoint = iterator.next()
            addToCounters(xPoint, yPoint)
            if(yPoint == array.last()) addToCounters(xPoint, yPoint) //needed because last element won't go through loop
            xPoint = yPoint
        }
        println(oneDifference*threeDifference)
    }

    private fun addToCounters(xPoint: Int, yPoint: Int) {
        when(yPoint-xPoint){
            3 -> threeDifference++
            1 -> oneDifference++
        }
    }

}