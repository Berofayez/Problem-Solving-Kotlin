fun sortArray012(array: IntArray){
    var mid = 0
    var low = 0
    var high = array.size

    while (mid<high){
        when(mid){
            0 ->{
                swipe(array, mid, low)
                mid++
                low++
            }
            1 ->{
                mid++
            }
            2 ->{
                swipe(array, mid, high)
                high--
            }
        }
    }
}

fun swipe(array: IntArray, a: Int, b: Int){
    var temp = array[a]
    array[a] = array[b]
    array[b] = temp
}
//[021102]