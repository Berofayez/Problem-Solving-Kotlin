class FindPairsWithSum {
    fun findPairsWithSum(arr: ArrayList<Int>, target: Int): List<Pair<Int, Int>> {
        val seen = HashSet<Int>()
        val result = mutableListOf<Pair<Int, Int>>()

        for(num in arr){
            if(seen.contains(target-num)){
                result.add(Pair(num, target-num))
            }
            seen.add(num)
        }
        return result
    }
}
// time o(n)
// space o(n)