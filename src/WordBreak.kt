fun wordBreak(s: String, wordDict: List<String>): Boolean{
    var n = s.length
    var set = wordDict.toSet()
    var dp = Array<Boolean>(n+1) {false}
    dp[0] = true
    for(i in 1..n){
        for(j in 0..i){
            if (dp[j] && set.contains(s.substring(j,i))){
                dp[i] = true
                break
            }
        }
    }
    return dp[n]
}

fun main() {
    val s = "leetcode"
    val wordDict = listOf("leet", "code")
    println(wordBreak(s, wordDict))
}