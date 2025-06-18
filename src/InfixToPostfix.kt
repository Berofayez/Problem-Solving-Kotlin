import java.util.Stack

fun precedence(op: Char): Int {
    return when (op) {
        '+','-' -> 1
        '*','/' -> 2
        else -> -1
    }
}

fun isOperator(c: Char): Boolean {
    return c== '+' || c == '-' || c == '*' || c == '/'
}

fun infixToPostfix(expression: String): String{
    val stack = Stack<Char>()
    val result = StringBuilder()
    for( char in expression){
        when {
            char.isLetterOrDigit() -> result.append(char)

            char == '(' -> stack.push(char)

            char == ')' -> {
                while(!stack.isEmpty() && stack.peek()!='('){
                    result.append(stack.pop())
                }
                if(!stack.isEmpty() && stack.peek()=='('){
                    stack.pop()
                }
            }
            isOperator(char) -> {
                while(!stack.isEmpty() && precedence(char)<=precedence(stack.peek())){
                    result.append(stack.pop())
                }
                stack.push(char)
            }
        }

    }
    while (!stack.isEmpty()){
        result.append(stack.pop())
    }
    return result.toString()
}
