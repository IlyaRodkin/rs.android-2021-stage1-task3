package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        try {
            val countPoster = array[0].toLong()
            val countColorFactorial = factorial(array[1])
            var countDifPoster = 0L
            var i = 0
            // if(array[0]==array[1])return 1
            while (countDifPoster != countPoster && array[1] - i>0) {
                i++
                countDifPoster = countColorFactorial / (factorial(i) * factorial(array[1] - i))
            }
            return if (countDifPoster == countPoster) i else null
        } catch (e: Exception) {
            throw NotImplementedError("Not implemented")
        }
    }

    private fun factorial(num: Int): Long {
        var result = 1L
        for (i in 2..num) result *= i
        return result
    }
}
