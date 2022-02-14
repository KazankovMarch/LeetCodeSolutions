/*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class DeleteNodeInBSTKtTest {

    @Test
    fun `Example 1`() {
        val root = TreeNode(5)
        root.left = TreeNode(3)
        root.left!!.left = TreeNode(2)
        root.left!!.right = TreeNode(4)
        root.right = TreeNode(6)
        root.right!!.right = TreeNode(7)

        val initialKeyList = getKeysRecursive(root)
        val keyToRemove = 3

        deleteNode(root, keyToRemove)

        validateBST(root)
        assertEquals(
            keyToRemove,
            initialKeyList - getKeysRecursive(root)
        )
    }

    private fun validateBST(root: TreeNode) {
        root.left?.let {
            root.`val` >= it.`val`
            validateBST(it)
        }
        root.right?.let {
            root.`val` >= it.`val`
            validateBST(it)
        }
    }

    private fun getKeysRecursive(root: TreeNode): List<Int> {
        val keys = mutableListOf(root.`val`)
        root.left?.let {
            keys += getKeysRecursive(it)
        }
        root.right?.let {
            keys += getKeysRecursive(it)
        }
        return keys
    }


}*/
