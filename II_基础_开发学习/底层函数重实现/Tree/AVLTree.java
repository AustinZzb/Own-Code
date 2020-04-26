/*
 *	AVLTree
 *	ͨ��ƽ�����ӵ��ڶ���������
 */
package Tree;

import java.util.Comparator;

/**
 * 	@author ���°�
 *
 * 	2020��4��1��-����5:46:17
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
	 * @method �����½ڵ�֮��ĵ���
	 * @see Tree.BinarySearchTree#afteradd(Tree.BinaryTree.Node)
	 */
	@Override
	protected void afteradd(Node<E> node) {
		while ((node = node.parent) != null) {  
			if (isBalance(node)) {  // @note ����ýڵ�ƽ�⣬���޸ĸýڵ�߶�
				updateHight(node);
			} else { // @note ��ƽ���������ת	֪ʶ�㣺������ת
				rebalance(node);
				break;
			}
		}
	}
	
	/**
	 * @method ɾ���½ڵ�֮��ĵ���
	 * @see Tree.BinarySearchTree#afteRemove(Tree.BinaryTree.Node)
	 */
	@Override
	protected void afteRemove(Node<E> node) {
		while ((node = node.parent) != null) {  
			if (isBalance(node)) {  // @note ����ýڵ�ƽ�⣬���޸ĸýڵ�߶�
				updateHight(node);
			} else { // @note ��ƽ���������ת	֪ʶ�㣺������ת
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
	 * @method �ָ�ƽ��
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
	 * @method ���ܻظ�ƽ��ķ���
	 * @thinking �۲����лָ�ƽ��֮���ģ���Ϊ  a-b-c-d-e-f-g�����Կ���ֱ�Ӹ��ݽ���Բ�ƽ��Ľڵ���������۷�����ת
	 */
	private void rotate(
			Node<E> r, // ���ڵ�
			Node<E> a, Node<E> b, Node<E> c,
			Node<E> d,
			Node<E> e, Node<E> f, Node<E> g
			) {
		// @note ���Ƚ�d��Ϊ���ڵ�
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
		
		// @note ��bΪ���ڵ��������
		b.left = a;
		b.right = c;
		if (a != null) a.parent = b;
		if (c != null) c.parent = b;
		updateHight(b);
		
		// @note ��fΪ���ڵ��������
		f.left = e;
		f.right = g;
		if (e != null) e.parent = f;
		if (g != null) g.parent = f;
		updateHight(f);
	}
	
	/**
	 * @method ����ת
	 */
	private void rotateLeft(Node<E> grand) {
		Node<E> parent = grand.right;
		Node<E> child = parent.left;
		grand.right = child;
		parent.left = grand;
		
		afterRotate(grand, parent, child);
	}
	
	/**
	 * @method ����ת
	 */
	private void rotateRight(Node<E> grand) {
		Node<E> parent = grand.left;
		Node<E> child = parent.right;
		grand.left = child;
		parent.right = grand;
		
		afterRotate(grand, parent, child);
	}
	
	/**
	 *	@method ��ת
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
	 * @method ���¸߶�
	 */
	private void updateHight(Node<E> node) {
		((AVLNode<E>)node).updateHight();
	}
	
	/**
	 * @method �жϽڵ��Ƿ�ƽ��
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
		 * @method ƽ������
		 */
		public int balanceFactor() {
			int leftHight = left == null ? 0 : left.hight;
			int rightHight = right == null ? 0 : right.hight;
			return leftHight - rightHight;
		}
		
		/**
		 * @method ���¸߶�
		 */
		public void updateHight() {
			int leftHight = left == null ? 0 : left.hight;
			int rightHight = right == null ? 0 : right.hight;
			hight = 1 + Math.max(leftHight, rightHight);
		}
		
		/**
		 * @method �������������У��߶Ƚϸߵ�����
		 */
		public Node<E> tallerChild() {
			int leftHight = left == null ? 0 : left.hight;
			int rightHight = right == null ? 0 : right.hight;
			return leftHight > rightHight ? left : right;
		}
	}
	
	
}




















