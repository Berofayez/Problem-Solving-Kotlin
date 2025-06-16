fun precedence(op: Char): Int {
    return when (op) {
        '+', '-' -> 1
        '*', '/' -> 2
        else -> -1
    }
}

fun isOperator(c: Char): Boolean {
    return c == '+' || c == '-' || c == '*' || c == '/'
}

fun infixToPostfix(expression: String): String {
    val stack = ArrayDeque<Char>()
    val result = StringBuilder()

    for (char in expression) {
        when {
            char.isLetterOrDigit() -> result.append(char)

            char == '(' -> stack.addLast(char)

            char == ')' -> {
                while (!stack.isEmpty() && stack.last() != '(') {
                    result.append(stack.removeLast())
                }
                if (!stack.isEmpty() && stack.last() == '(') {
                    stack.removeLast()
                }
            }

            isOperator(char) -> {
                while (!stack.isEmpty() && precedence(char) <= precedence(stack.last())) {
                    result.append(stack.removeLast())
                }
                stack.addLast(char)
            }
        }
    }

    // Pop remaining operators from the stack
    while (!stack.isEmpty()) {
        result.append(stack.removeLast())
    }

    return result.toString()
}
