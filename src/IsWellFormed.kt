fun isWellFormed(expression: String): Boolean{
    val stack = ArrayDeque<Char>()


    for (char in expression){
        when(char){
            '(', '{', '[' -> stack.addLast(char) 
            ')' -> {
                if (stack.isEmpty() || stack.removeLast() != '(') return false
            }
            '}' -> {
                if (stack.isEmpty() || stack.removeLast() != '{') return false
            }
            ']' -> {
                if (stack.isEmpty() || stack.removeLast() != '[') return false
            }

        }
    }

    return stack.isEmpty()
}

