
    fun findHeight(root: TreeNode?): Int {
        if (root == null) return 0
        val leftHeight = findHeight(root.left)
        val rightHeight = findHeight(root.right)
        return maxOf(leftHeight, rightHeight) +1
    }


//space o(1)
//time o(n)

fun main() {

    val root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.left?.left = TreeNode(4)
    root.left?.right = TreeNode(5)
    root.left?.left?.left = TreeNode(6)

    val height = findHeight(root)
    println("Height of the binary tree is: $height")
}