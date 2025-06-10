
fun printLeftNodes(root: TreeNode?) {
    if(root == null) return
    printLeftHelper(root, isLeft = false)
}

fun printLeftHelper(root: TreeNode?, isLeft: Boolean) {
    if(root == null) return
    if(isLeft){
        print(root.value)
    }
    printLeftHelper(root.left, true)
    printLeftHelper(root.right, false)

}
