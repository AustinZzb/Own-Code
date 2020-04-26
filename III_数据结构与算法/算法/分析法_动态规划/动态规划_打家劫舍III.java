/*	LeetCode
 *在上次打劫完一条街道之后和一圈房屋后，小偷又发现了一个新的可行窃的地区。这个地区只有一个入口，我们称之为“根”。
 * 除了“根”之外，每栋房子有且只有一个“父“房子与之相连。一番侦察之后，聪明的小偷意识到“这个地方的所有房屋的排列类似于一棵二叉树”。 如果两个直接相连的房子在同一天晚上被打劫，房屋将自动报警。
 *计算在不触动警报的情况下，小偷一晚能够盗取的最高金额。
 *示例 1:
 *输入: [3,2,3,null,3,null,1]
     3
    / \
   2   3
    \   \ 
     3   1
 *输出: 7 
 *解释: 小偷一晚能够盗取的最高金额 = 3 + 3 + 1 = 7.
 */
package 分析法_动态规划;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

/**
 * @author 张致邦
 *
 * 2020年3月19日-下午4:30:47
 */
public class 动态规划_打家劫舍III {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	/**
	 * @type 动态规划
	 * @thinking  考虑是否偷取当前节点    1.偷取当前节点：当前子节点不能偷取  2.不偷取当前节点：无所谓    @result 取1、2最大值
	 */
	private static int[] fun1(TreeNode node) {
		if (node == null) return new int[2];
		int[] result = new int[2];
		
		int[] left = fun1(node.left);
		int[] right = fun1(node.right);
		
		// 不偷取当前节点
		result[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
		// 偷取当前节点
		result[1] = left[0] + right[0] + node.val;
		
		return result;
		
	}
	
	
	
	/**
	 * @type 递归+记录剪枝
	 * @thinking 1.偷爷爷和孙子的钱   2.偷儿子的钱     @result：取1、2的最大值
	 */
	private static HashMap<TreeNode, Integer> map = new HashMap<TreeNode, Integer>();
	
	private static int fun(TreeNode node) {
		if (node == null) return 0;
		if (map.containsKey(node)) return map.get(node);
		
		int money = node.val;
		if (node.left != null)
			money += fun(node.left.left) + fun(node.left.right);
		if (node.right != null) 
			money += fun(node.right.left) + fun(node.right.right);
		
		int n = Math.max(money, fun(node.left) + fun(node.right));
		map.put(node, n);
		return n;
		
	}
	
}
