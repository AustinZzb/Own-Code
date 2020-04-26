/*
 *	
 */
package Tree;

import java.util.LinkedList;
import java.util.Queue;

import Tree.printer.BinaryTreeInfo;

/**
 * 	@author ���°�
 *
 * 	2020��3��26��-����8:33:13
 */

public class BinaryTree<E>  implements BinaryTreeInfo{
	protected int size = 0;
	protected Node<E> root = null;
	
	public void clear() {
		root = null;
		size = 0;
	}

	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	/**
	 * 	@method �������
	 */
	public int deep() {
		return hight_0(root);
	}
	
	/**
	 * 	@method ���ĸ߶�
	 */
	public int hight() {
//		return hight(root);
		return hight_0(root);
	}
	
	private int hight_0(Node<E> node) {
		if(node == null) return 0;
		
		Queue<Node<E>> queue = new LinkedList<Node<E>>();
		queue.offer(node);
		int hight = 0, len = queue.size();
		
		while(!queue.isEmpty()) {
			Node<E> newnode = queue.poll();
			len--;
			
			if(newnode.left != null)
				queue.offer(newnode.left);
			if(newnode.right != null)
				queue.offer(newnode.right);
			
			if (len == 0) {
				hight++;
				len = queue.size();
			}
			
		}
		
		return hight;
	}	
	
	/**
	 * 	@method �ж��Ƿ�Ϊ��ȫ������
	 */
	public boolean isCompele() {
		
		if (root == null) return false;
		
		// @thinking �������
		@SuppressWarnings("rawtypes")
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		
		boolean leaf = false;
		while (!queue.isEmpty()) {
			@SuppressWarnings("rawtypes")
			Node node = queue.poll();
			
			if (leaf && !node.isLeaf())
				return false;
			
			if (node.left != null) {
				queue.offer(node.left);
			} else if (node.right != null) {
				return false;
			}
			
			if (node.right != null) {
				queue.offer(node.right);
			} else {
				leaf = true;
			}			
		}
		
		return true;	
	}
	
	/**
	 * 	@method �������
	 */
	public void preoderTree_floor(Visitor<E> visitor) {
		if (visitor == null) return;
		preoderTree_floor(root, visitor);
	}
	
	private void preoderTree_floor(Node<E> node, Visitor<E> visitor) {
		if(node == null || visitor.flag) return ;
		
		Queue<Node<E>> queue = new LinkedList<Node<E>>();
		queue.offer(node);
		
		while(!queue.isEmpty()) {
			Node<E> newnode = queue.poll();
			if(visitor.flag) return ;
			visitor.flag = visitor.visitor(newnode.element);
			if(newnode.left != null)
				queue.offer(newnode.left);
			if(newnode.right != null)
				queue.offer(newnode.right);
		}
		
	}
	
	/**
	 * 	@method �������
	 */
	public void preoderTree_beh(Visitor<E> visitor) {
		if (visitor == null) return;
		preoderTree_beh(root, visitor);
	}
	
	private void preoderTree_beh(Node<E> node, Visitor<E> visitor) {
		if(node == null || visitor.flag) return ;
		
		preoderTree_beh(node.left, visitor);
		preoderTree_beh(node.right, visitor);
		if(visitor.flag) return ;
		visitor.flag = visitor.visitor(node.element);
	}
	
	/**
	 * 	@method �������
	 */
	public void preoderTree_mid(Visitor<E> visitor) {
		if (visitor == null) return;
		preoderTree_mid(root, visitor);
	}
	
	private void preoderTree_mid(Node<E> node, Visitor<E> visitor) {
		if(node == null || visitor.flag) return ;
		
		preoderTree_mid(node.left, visitor);
		if(visitor.flag) return ;
		visitor.flag = visitor.visitor(node.element);
		preoderTree_mid(node.right, visitor);
	}
	
	/**
	 * 	@method ǰ�����
	 */
	public void preoderTree_bef(Visitor<E> visitor) {
		if (visitor == null) return;
		preoderTree_bef(root, visitor);
	}
	
	private void preoderTree_bef(Node<E> node, Visitor<E> visitor) {
		if(node == null || visitor.flag) return ;
		
		visitor.flag = visitor.visitor(node.element);
		preoderTree_bef(node.left, visitor);
		preoderTree_bef(node.right, visitor);
	}
	
	/**
	 * 	@method ǰ���ڵ� 
	 */
	protected Node<E> befnode(Node<E> node){
		if (node == null) return null;
		
		// @note ǰ���ڵ�����������
		Node<E> pNode = node.left;
		if (pNode != null) {
			while (pNode.right != null) {
				pNode = pNode.right;
			}
			return pNode;
		}
		
		// @note �Ӹ��ڵ㡢�游�ڵ�Ѱ��ǰ���ڵ�
		while (node.parent != null && node == node.parent.left) {
			node = node.parent;
		}
		
		return node.parent;
	}
	
	/**
	 * 	@method ��̽ڵ�
	 */
	protected Node<E> behnode(Node<E> node){
		if (node == null) return null;
		
		// @note ��̽ڵ�����������
		if (node.right != null) {
			Node<E> bNode = node.right;
			while (bNode.left != null) {
				bNode = bNode.left;
			}
			return bNode;
		}
		
		// @note �Ӹ��ڵ㣬�游�ڵ���Ѱ�Һ�̽ڵ�
		if (node.parent != null && node == node.parent.right) {
			node = node.parent;
		}
		
		return node.parent;
	}
	
	/**
	 * 	@method �ض��ڵ�߶�
	 */
	@SuppressWarnings("unused")
	private int hight(Node<E> node) {
		// TODO Auto-generated method stub
		if (node == null) return 0;
		return 1 + Math.max(hight(node.left), hight(node.right));
	}
	
	/**
	 * 	@abstract ����������
	 */
	public static abstract class Visitor<E> {
		boolean flag; 
		abstract boolean visitor(E element);
	} 
	
	/**
	 * @method ����һ��Node�ڵ�
	 */
	protected Node<E> createNode(E element, Node<E> parent) {
		return new Node<E>(element, parent);
	}
	
	/**
	 * 	@class �ڲ��ڵ���
	 */
	protected static class Node<E>{
		E element;
		Node<E> left;
		Node<E> right;
		Node<E> parent;
		int hight = 1;
		
		public Node(E element, Node<E> parent) {
			// TODO Auto-generated constructor stub
			this.element = element;
			this.parent = parent;
		}
		
		/**
		 * 	@method �ж��Ƿ���Ҷ�ӽڵ�
		 */
		public boolean isLeaf() {
			return left == null && right == null;
		}
		
		/**
		 * @method �ж��Ƿ���������
		 */
		public boolean isLeftChild() {
			return parent != null && this == parent.left;
		}
		
		/**
		 * @method �ж��Ƿ���������
		 */
		public boolean isRightChild() {
			return parent != null && this == parent.right;
		}
		
		/**
		 * 	@method �ж��Ƿ��������ӽڵ�
		 */
		public boolean hasTwoChildren() {
			return left != null && right != null;
		}
	}	
	
	@Override
	public Object root() {
		return root;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object left(Object node) {
		return ((Node<E>)node).left;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Object right(Object node) {
		return ((Node<E>)node).right;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Object string(Object node) {
		Node<E> mynode = (Node<E>)node;
		if (mynode.parent != null) 
			return ((Node<E>)node).element+"("+mynode.parent.element+")";
		return ((Node<E>)node).element+"(null)";
	}
}
