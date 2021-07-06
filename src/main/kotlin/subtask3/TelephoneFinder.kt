package subtask3

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        if(number.toInt() < 0) return null

        var arrNumb: Array<String> = emptyArray()

        val naighZero = arrayOf(8)
        val naighOne = arrayOf(2,4)
        val naighTwo = arrayOf(1,3,5)
        val naighThree = arrayOf(2,6)
        val naighFour = arrayOf(1,5,7)
        val naighFive = arrayOf(2,4,6,8)
        val naighSix = arrayOf(3,5,9)
        val naighSeven = arrayOf(4,8)
        val naighEight = arrayOf(0,5,7,9)
        val naighNine = arrayOf(6,8)
        val numbNeighbors = arrayOf(naighZero,naighOne,naighTwo,naighThree,naighFour,naighFive,naighSix,naighSeven,naighEight,naighNine)

        for(i in number.indices){
            var tmpNumber = number.toCharArray()
            val numb = number[i].toString().toInt()
            for (j in numbNeighbors[numb].indices){
                tmpNumber[i] = (numbNeighbors[numb][j] + '0'.toInt()).toChar()
                arrNumb = arrNumb.plus(String(tmpNumber))
            }
        }

        return arrNumb
        throw NotImplementedError("Not implemented")
    }
}
