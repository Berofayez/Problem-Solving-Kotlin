fun moveZeroes(array: IntArray){
    var saveposition = 0

    for(i in array.indices){
        if(array[i]!=0){
            array[saveposition] = array[i]
            saveposition++
        }
    }

    for(i in saveposition until array.size-1){
        array[i] == 0
    }
}

//Time: O(n) –
//
//Space: O(1) –.