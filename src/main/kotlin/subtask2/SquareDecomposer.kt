package subtask2

import kotlin.math.sqrt

class SquareDecomposer {
    fun decomposeNumber(number: Int): Array<Int>? {
        var arr: Array<Int>?
        for (i in number - 1 downTo 1) {
            arr = (square(number)  - square(i)).getMaxMember()
            if (arr != null) return arr.plus(i)
        }
        return null
    }

    private fun Long.getMaxMember(): Array<Int>? {
        val maxMember = (sqrt(this.toDouble())).toInt()
        var arr: Array<Int>?
        for (i in maxMember downTo 1) {
            if (this - square(i) == 0L)
                return Array(1) { i }
            arr = (this - square(i)).getMaxMember()
            var tempResult: Long = 0
            arr?.forEach { tempResult +=square(it) }
            if (tempResult == this - square(i) && arr!=null && !arr.contains(i))
                return arr.plus(i)
        }
        return null
    }
    private fun square(i: Int) :Long{
        return (i * i).toLong()
    }
}

    // TODO: Complete the following function
    /*fun decomposeNumber(number: Int): Array<Int>? {
        var square = (number.toLong() * number.toLong())
        var mas = mutableListOf<Int>()
        var i = number - 1
        while (i > 0) {
            if (square - i * i >= 0) {
                square -= i * i
                mas.add(i)
            }
            i--
        }
        while (square != 0L){
            square = (number.toLong() * number.toLong())
            val mas1 = mutableListOf<Int>()
            i = number - 1
            square -= i * i
            i = mas[1] - 1
            mas1.add(number - 1)
            while (i > 0) {
                if (square - i * i >= 0) {
                    square -= i * i
                    mas1.add(i)
                    //mas[mas.size-1] = mas[mas.size-1] - 1
                }
                i--
            }
            mas = mas1
        }

        mas.sort()
        return mas.toTypedArray()
        throw NotImplementedError("Not implemented")

    }*/


