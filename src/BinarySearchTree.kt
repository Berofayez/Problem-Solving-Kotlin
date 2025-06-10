class TreeNode1(val value: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class BinarySearchTree {
    var root: TreeNode? = null

    fun insert(value: Int) {
        root = insertRec(root, value)
    }

    private fun insertRec(node: TreeNode?, value: Int): TreeNode? {
        node ?: return TreeNode(value)

        if(value< node.value){
            node.left = insertRec(node.left, value)
        } else if(value > node.value) {
            node.right = insertRec(node.right, value)
        }
        return node
    }

    fun inorderRec(node: TreeNode?){
        if(node != null) {
            inorderRec(node.left)
            print("${node.value} ")
            inorderRec(node.right)
        }
    }
    fun preorderRec(node: TreeNode?){
        if(node != null) {
            print("${node.value} ")
            inorderRec(node.left)
            inorderRec(node.right)
        }
    }

    fun postorderRec(node: TreeNode?){
        if(node != null) {

            inorderRec(node.left)
            inorderRec(node.right)
            print("${node.value} ")
        }
    }

    fun searchRec(node: TreeNode?, value: Int): Boolean {
        node ?: return false
        if(value== node.value) return true
        return if (value < node.value) searchRec(node.left, value)
        else searchRec(node.right, value)
    }
}