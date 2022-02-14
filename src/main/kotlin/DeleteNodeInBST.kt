/*
fun deleteNode(root: TreeNode?, key: Int): TreeNode? {
    if(root == null) return null
    val parentNode = findParentNodeRecursive(key, root, null)
    if(parentNode == null) { // delete the root
        if(root.left == null) {
            val newRoot = root.right
            root.right = null
            return newRoot
        }
        if(root.right == null) {
            val newRoot = root.left
            root.left = null
            return newRoot
        }
        root.left!!.
    } else {

    }
}

fun findParentNodeRecursive(key: Int, node: TreeNode, parent: TreeNode?): TreeNode? {

}
*/
