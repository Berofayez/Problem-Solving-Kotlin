
fun validMountainArray(array: IntArray): Boolean{
    var n = array.size
    if(n<3) return false
    var i =0
    while (i+1< n && array[i]<array[i+1]){
        i++
    }
    if(i==0 || i == n-1) return false

    while (i+1< n && array[i]>array[i+1]){
        i++
    }
    return i==n-1
}