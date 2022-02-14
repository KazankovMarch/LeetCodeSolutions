fun getAllElements(root1: TreeNode?, root2: TreeNode?): List<Int> =
    when {
        root1 == null && root2 != null -> root2.toValListRecursive()
        root1 != null && root2 == null -> root1.toValListRecursive()
        root1 != null && root2 != null -> {
            (root1.toValListRecursive() + root2.toValListRecursive()).sorted()
        }
        else -> emptyList()
    }


fun TreeNode.toValListRecursive(): List<Int> {
    val result = mutableListOf<Int>()
    if(left != null) result.addAll(left!!.toValListRecursive())
    result.add(`val`)
    if(right != null) result.addAll(right!!.toValListRecursive())
    return result
}
