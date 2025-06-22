fun getMaxSumHeights(arr: Array<Int>): Long{
    var n = arr.size
    var maxSum = 0L;

    for (peak in 0 until  n){
        var height = arr[peak]
        var sum = 0L

        for(i in peak downTo 0){
            height = minOf(arr[i], height)
            sum+=height

        }

        for(i in peak+1 until n){
            height = minOf(arr[i], height)
            sum+=height

        }
        maxSum = maxOf(sum, maxSum)
    }
    return maxSum
}
// 5 ,10, 5, 10, 5

fun main() {
    var arr = arrayOf(5 ,10, 5, 10, 5)

    println(getMaxSumHeights(arr))
}