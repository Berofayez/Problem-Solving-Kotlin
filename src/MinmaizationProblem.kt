fun findMin(A: ArrayList<Int>, B: ArrayList<Int>, C: ArrayList<Int>): Int{
    A.sort()
    B.sort()
    C.sort()
    var i = 0
    var j = 0
    var k = 0
    var minDif = Int.MAX_VALUE

    while(i < A.size && j < B.size && k < C.size){
        var a = A[i]
        var b = B[j]
        var c = C[k]

        var max = maxOf(a,b,c)
        var min = minOf(a,b,c)

        var currentMin = max-min

        minDif = Math.min(minDif, currentMin)

        when(min){
            a -> i++
            b -> j++
            c -> k++
        }
    }
    return minDif

}

fun main() {
    val A = arrayListOf(18,7,9,20)
    val B = arrayListOf(45, 34, 2, 34, 7)
    val C = arrayListOf(2, 3, 10, 8)

    println(findMin(A, B, C))
}
