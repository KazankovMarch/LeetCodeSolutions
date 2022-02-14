import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class AllElementsInTwoBinarySearchTreesKtTest {


    @Test
    fun `Example 1`() {
        val root1 = TreeNode(2)
        root1.left = TreeNode(1)
        root1.right = TreeNode(4)
        val root2 = TreeNode(1)
        root2.left = TreeNode(0)
        root2.right = TreeNode(3)
        assertEquals(
            listOf(0,1,1,2,3,4),
            getAllElements(root1, root2)
        )
    }

    @Test
    fun `Example 2`() {
        val root1 = TreeNode(1)
        root1.right = TreeNode(8)
        val root2 = TreeNode(8)
        root2.left = TreeNode(1)
        assertEquals(
            listOf(1,1,8,8),
            getAllElements(root1, root2)
        )
    }

}