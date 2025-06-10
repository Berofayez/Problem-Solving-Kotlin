class BinarySearch {
    fun binarySearch(input: IntArray, target: Int) : Int{
        var low =0
        var high = input.size-1
        var mid: Int
        while(low <= high) {
            mid = low + (high-low)/2
            when {
                target > input[mid] -> low = mid + 1
                target == input[mid] -> return mid
                target < input[mid] -> high = mid - 1
            }
        }
        return -1
    }
}
//time o(log(n))
//space o(1)