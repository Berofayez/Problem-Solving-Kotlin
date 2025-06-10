import java.util.LinkedList
import java.util.Queue


data class TreeNode(val value: Int, var left: TreeNode? = null, var right: TreeNode? = null)


fun levelOrderTraversal(root: TreeNode){
    if (root == null) return

    val queue: Queue<TreeNode> = LinkedList()
    queue.add(root)
    while (queue.isNotEmpty()){
        val current= queue.remove()
        print("${current.value}")

        current.left?.let { queue.add(it) }
        current.right?.let { queue.add(it) }

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

    println("Level Order Traversal:")
    levelOrderTraversal(root)
}

