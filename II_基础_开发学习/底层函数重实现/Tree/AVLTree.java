/*
 *	AVLTree
 *	通过平衡因子调节二叉搜索树
 */
package Tree;

import java.util.Comparator;

/**
 * 	@author 张致邦
 *
 * 	2020年4月1日-下午5:46:17
 */
@SuppressWarnings("unused")
public class AVLTree<E> extends BinarySearchTree<E> {
	public AVLTree() {
		this(null);
	}
	
	public AVLTree(Comparator<E> comparator) {
		super(comparator);
	}
	
	/**
	 * @method 加入新节点之后的调整
	 * @see Tree.BinarySearchTree#afteradd(Tree.BinaryTree.Node)
	 */
	@Override
	protected void afteradd(Node<E> node) {
		while ((node = node.parent) != null) {  
			if (isBalance(node)) {  // @note 如果该节点平衡，则修改该节点高度
				updateHight(node);
			} else { // @note 不平衡则进行旋转	知识点：树的旋转
				rebalance(node);
				break;
			}
		}
	}
	
	/**
	 * @method 删除新节点之后的调整
	 * @see Tree.BinarySearchTree#afteRemove(Tree.BinaryTree.Node)
	 */
	@Override
	protected void afteRemove(Node<E> node) {
		while ((node = node.parent) != null) {  
			if (isBalance(node)) {  // @note 如果该节点平衡，则修改该节点高度
				updateHight(node);
			} else { // @note 不平衡则进行旋转	知识点：树的旋转
				rebalance(node);
			}
		}
	}
	
	/**
	 * @method AVLNode<E> createNode(E element, Node<E> parent)
	 * @see Tree.BinaryTree#createNode(java.lang.Object, Tree.BinaryTree.Node)
	 */
	@Override
	protected Node<E> createNode(E element, Node<E> parent) {
		return new AVLNode<>(element, parent);
	}
	
	/**
	 * @method 恢复平衡
	 */
	private void rebalance(Node<E> grand) {
		Node<E> parent = ((AVLNode<E>)grand).tallerChild();
		Node<E> node = ((AVLNode<E>)parent).tallerChild();
		
		if (parent.isLeftChild()) {		// L
			if (node.isLeftChild()) {		// LL
				rotate(grand, node.left, node, node.right, parent, parent.right, grand, grand.right);
			} else {	// LR
				rotate(grand, parent.left, parent, node.left, node, node.right, grand, grand.right);
			}
		} else {	// R
			if (node.isRightChild()) {		// RR
				rotate(grand, grand.left, grand, parent.left, parent, node.left, node, node.right);
			} else {	// RL
				rotate(grand, grand.left, grand, node.left, node, node.right, parent, parent.right);
			}
		}
	}
	
	/**
	 * @method 万能回复平衡的方法
	 * @thinking 观察所有恢复平衡之后的模板均为  a-b-c-d-e-f-g，所以可以直接根据结果对不平衡的节点进行无讨论分析旋转
	 */
	private void rotate(
			Node<E> r, // 根节点
			Node<E> a, Node<E> b, Node<E> c,
			Node<E> d,
			Node<E> e, Node<E> f, Node<E> g
			) {
		// @note 首先将d作为根节点
		d.parent = r.parent;
		if (r.isLeftChild()) {
			r.parent.left = d;
		} else if (r.isRightChild()) {
			r.parent.right = d;
		} else {
			root = d;
		}
		
		d.left = b;
		d.right = f;
		b.parent = d;
		f.parent = d;
		updateHight(d);
		
		// @note 以b为根节点的左子树
		b.left = a;
		b.right = c;
		if (a != null) a.parent = b;
		if (c != null) c.parent = b;
		updateHight(b);
		
		// @note 以f为根节点的右子树
		f.left = e;
		f.right = g;
		if (e != null) e.parent = f;
		if (g != null) g.parent = f;
		updateHight(f);
	}
	
	/**
	 * @method 左旋转
	 */
	private void rotateLeft(Node<E> grand) {
		Node<E> parent = grand.right;
		Node<E> child = parent.left;
		grand.right = child;
		parent.left = grand;
		
		afterRotate(grand, parent, child);
	}
	
	/**
	 * @method 右旋转
	 */
	private void rotateRight(Node<E> grand) {
		Node<E> parent = grand.left;
		Node<E> child = parent.right;
		grand.left = child;
		parent.right = grand;
		
		afterRotate(grand, parent, child);
	}
	
	/**
	 *	@method 旋转
	 */
	private void afterRotate(Node<E> grand, Node<E> parent, Node<E> child) {
		parent.parent = grand.parent;
		if (grand.isLeftChild()) {
			grand.parent.left = parent;
		} else if(grand.isRightChild()) {
			grand.parent.right = parent;
		} else {
			root = parent;
		}
		
		if (child != null)
			child.parent = grand;
		grand.parent = parent;
		
		updateHight(grand);
		updateHight(parent);
	}
	
	/**
	 * @method 更新高度
	 */
	private void updateHight(Node<E> node) {
		((AVLNode<E>)node).updateHight();
	}
	
	/**
	 * @method 判断节点是否平衡
	 */
	private boolean isBalance(Node<E> node) {
		return Math.abs(((AVLNode<E>)node).balanceFactor()) <= 1;
	}
	
	/**
	 * @class class AVLNode<E> extends Node<E>
	 */
	protected static class AVLNode<E> extends Node<E> {
		/**
		 * @param element parent
		 */
		public AVLNode(E element, Node<E> parent) {
			super(element, parent);
		}
	
		/**
		 * @method 平衡因子
		 */
		public int balanceFactor() {
			int leftHight = left == null ? 0 : left.hight;
			int rightHight = right == null ? 0 : right.hight;
			return leftHight - rightHight;
		}
		
		/**
		 * @method 更新高度
		 */
		public void updateHight() {
			int leftHight = left == null ? 0 : left.hight;
			int rightHight = right == null ? 0 : right.hight;
			hight = 1 + Math.max(leftHight, rightHight);
		}
		
		/**
		 * @method 返回左右子树中，高度较高的子树
		 */
		public Node<E> tallerChild() {
			int leftHight = left == null ? 0 : left.hight;
			int rightHight = right == null ? 0 : right.hight;
			return leftHight > rightHight ? left : right;
		}
	}
	
	
}




















