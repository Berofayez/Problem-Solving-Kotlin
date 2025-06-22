fun moveZeroes(array: IntArray) {
    var saveposition = 0
    for(i in array.indices){
        if(array[i] != 0){
            array[saveposition++] = array[i]
        }
    }
//    [001024]

    for(i in saveposition until array.size){
        array[saveposition++] = 0
    }
}

fun main(){
    var array:IntArray = intArrayOf(0, 0, 1, 0,2, 3)

    moveZeroes(array)

    println(array.joinToString())
}