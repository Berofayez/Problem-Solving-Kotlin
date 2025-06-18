import java.util.*

fun isWellFormed(expression: String): Boolean{
    val stack = Stack<Char>()


    for (char in expression){
        when(char){
            '(', '{', '[' -> stack.push(char)
            ')' -> {
                if (stack.isEmpty() || stack.pop() != '(') return false
            }
            '}' -> {
                if (stack.isEmpty() || stack.pop() != '{') return false
            }
            ']' -> {
                if (stack.isEmpty() || stack.removeLast() != '[') return false
            }

        }
    }

    return stack.isEmpty()
}

