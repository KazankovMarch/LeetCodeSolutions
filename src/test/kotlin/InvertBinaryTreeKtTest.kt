import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class InvertBinaryTreeKtTest {

    @Test
    fun full3LevelTree() {
        val root = TreeNode(4)
        root.left = TreeNode(2)
        root.right = TreeNode(7)
        root.left!!.left = TreeNode(1)
        root.left!!.right = TreeNode(3)
        root.right!!.left = TreeNode(6)
        root.right!!.right = TreeNode(9)

        val resultRoot = invertTree(root)

        assertEquals(4, resultRoot!!.`val`)
        assertEquals(7, resultRoot.left!!.`val`)
        assertEquals(2, resultRoot.right!!.`val`)
        assertEquals(9, resultRoot.left!!.left!!.`val`)
        assertEquals(6, resultRoot.left!!.right!!.`val`)
        assertEquals(3, resultRoot.right!!.left!!.`val`)
        assertEquals(1, resultRoot.right!!.right!!.`val`)
        assertNull(resultRoot.left!!.left!!.left)
        assertNull(resultRoot.left!!.left!!.right)
        assertNull(resultRoot.left!!.right!!.left)
        assertNull(resultRoot.left!!.right!!.right)
        assertNull(resultRoot.right!!.left!!.left)
        assertNull(resultRoot.right!!.left!!.right)
        assertNull(resultRoot.right!!.right!!.left)
        assertNull(resultRoot.right!!.right!!.right)
    }

    @Test
    fun full2LevelTree() {
        val root = TreeNode(2)
        root.left = TreeNode(1)
        root.right = TreeNode(3)

        val resultRoot = invertTree(root)

        assertEquals(2, resultRoot!!.`val`)
        assertEquals(3, resultRoot.left!!.`val`)
        assertEquals(1, resultRoot.right!!.`val`)
        assertNull(resultRoot.left!!.left)
        assertNull(resultRoot.left!!.right)
        assertNull(resultRoot.right!!.left)
        assertNull(resultRoot.right!!.right)
    }

}