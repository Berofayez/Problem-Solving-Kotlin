fun majorityElement(array: IntArray): Int{
    var count =0
    var result =0

    for(i in array){
        if(count == 0){
            result=i
        }
        count+= if(i==result) +1 else -1
    }
    return result
}



//time o(n)
//space o(1)