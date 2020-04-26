/*	LeetCode
 *���ϴδ����һ���ֵ�֮���һȦ���ݺ�С͵�ַ�����һ���µĿ����Եĵ������������ֻ��һ����ڣ����ǳ�֮Ϊ��������
 * ���ˡ�����֮�⣬ÿ����������ֻ��һ��������������֮������һ�����֮�󣬴�����С͵��ʶ��������ط������з��ݵ�����������һ�ö��������� �������ֱ�������ķ�����ͬһ�����ϱ���٣����ݽ��Զ�������
 *�����ڲ���������������£�С͵һ���ܹ���ȡ����߽�
 *ʾ�� 1:
 *����: [3,2,3,null,3,null,1]
     3
    / \
   2   3
    \   \ 
     3   1
 *���: 7 
 *����: С͵һ���ܹ���ȡ����߽�� = 3 + 3 + 1 = 7.
 */
package ������_��̬�滮;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

/**
 * @author ���°�
 *
 * 2020��3��19��-����4:30:47
 */
public class ��̬�滮_��ҽ���III {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	/**
	 * @type ��̬�滮
	 * @thinking  �����Ƿ�͵ȡ��ǰ�ڵ�    1.͵ȡ��ǰ�ڵ㣺��ǰ�ӽڵ㲻��͵ȡ  2.��͵ȡ��ǰ�ڵ㣺����ν    @result ȡ1��2���ֵ
	 */
	private static int[] fun1(TreeNode node) {
		if (node == null) return new int[2];
		int[] result = new int[2];
		
		int[] left = fun1(node.left);
		int[] right = fun1(node.right);
		
		// ��͵ȡ��ǰ�ڵ�
		result[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
		// ͵ȡ��ǰ�ڵ�
		result[1] = left[0] + right[0] + node.val;
		
		return result;
		
	}
	
	
	
	/**
	 * @type �ݹ�+��¼��֦
	 * @thinking 1.͵үү�����ӵ�Ǯ   2.͵���ӵ�Ǯ     @result��ȡ1��2�����ֵ
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
