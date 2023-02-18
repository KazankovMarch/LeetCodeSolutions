/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
fun invertTree(root: TreeNode?): TreeNode? {
    if(root != null) {
        val bufferForLeft = root.left
        root.left = invertTree(root.right)
        root.right = invertTree(bufferForLeft)
    }
    return root
}