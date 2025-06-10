import java.util.Stack


fun inorderTraversal(root: TreeNode?){
    val stack = Stack<TreeNode>()
    var current = root
    while(current!= null || stack.isNotEmpty()){
        while(current!= null){
            stack.push(current)
            current = current.left
        }
        current = stack.pop()
        print(current.value)
        current = current.right
    }
}

fun preorderTraversal(root: TreeNode?){
    val stack = Stack<TreeNode>()
    stack.push(root)
    while(stack.isNotEmpty()){
         var current = stack.pop()
        print(current.value)

        current.right?.let { stack.push(it) }
        current.left?.let { stack.push(it) }
    }
}
fun postorderTraversal(root: TreeNode?){
    val stack1 = Stack<TreeNode>()
    val stack2 = Stack<TreeNode>()

    stack1.push(root)
    while(stack1.isNotEmpty()){
        val node = stack1.pop()
        stack2.push(node)

        node.left?.let { stack1.push(it) }
        node.right?.let { stack1.push(it) }
    }

    while (stack2.isNotEmpty()) {
        print(stack2.pop().value)
    }
}
fun main() {

    val root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.left?.left = TreeNode(4)
    root.left?.right = TreeNode(5)
    root.right?.left = TreeNode(6)
    root.right?.right = TreeNode(7)

    println("Inorder (non-recursive):")
    inorderTraversal(root)

    println("\nPreorder (non-recursive):")
    preorderTraversal(root)

    println("\nPostorder (non-recursive):")
    postorderTraversal(root)
}