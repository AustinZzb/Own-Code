/**
 *	 ����������: ��ڵ�С���ҽڵ㣨��Ȼ�����Զ���Ƚ�����
 */
package Tree;

import java.util.Comparator;

/**
 * 	@author ���°�
 *
 * 	2020��2��28��-����9:51:04
 */

@SuppressWarnings("unchecked")
public class BinarySearchTree<E> extends BinaryTree<E>{
	private Comparator<E> comparator = null;
	
	public BinarySearchTree() {
		this(null);
	}
	
	
	public BinarySearchTree(Comparator<E> comparator) {
		this.comparator = comparator;
	}
	
		
	public boolean contains(E element) {
		return node(element) != null;
	}
	
	
	public void add(E element) {
		elementNotNullCheck(element);
		
		// @note ��Ӹ��ڵ�
		if(root == null) {
			root = createNode(element, null);
//			System.out.println("���ڵ㣺" + root.element);
			// @note ����ӽڵ�֮��Ĵ���
			afteradd(root);
			size ++;
			return ;
		}
		
		// @note ��������ڵ㣬ͨ���ҵ����ĸ��ڵ�������
		Node<E> parent = root;
		Node<E> node = root;
		int n = 0;
		while(node != null) {
			n = equles(node.element, element);
			parent = node;
			if(n < 0) {
				node = node.right;
			}else if(n > 0) {
				node = node.left;
			}else {
				node.element = element;
				return ;
			}
		}
		
		Node<E> newnode = createNode(element, parent);
		if(n < 0) {
			parent.right = newnode;
//			System.out.println(parent.element + "���ҽڵ㣺" + newnode.element);
		}else {
			parent.left = newnode;
//			System.out.println(parent.element + "����ڵ㣺" + newnode.element);
		}
		// @note ����ӽڵ�֮��Ĵ���
		afteradd(newnode);
		size++;
	}
	
	
	/**
	 *  @method �����½ڵ�֮��Ĳ���
	 */
	protected void afteradd(Node<E> node) { }
	
	/**
	 *  @method ɾ���½ڵ�֮��Ĳ���
	 */
	protected void afteRemove(Node<E> node) { }
	
	/**
	 * 	@method ɾ���ڵ�
	 */
	public void remove(E element) {
		remove(node(element));
	}
	
	
	private int equles(E e1, E e2) {	
		if(comparator != null)
			return comparator.compare(e1, e2);
		return ((Comparable<E>)e1).compareTo(e2); 
	}
	
		
	/**
	 * 	@method �ж��Ƿ�Ϊ�գ��׳����ʹ����쳣
	 */
	private void elementNotNullCheck(E elemnt) {
		if(elemnt == null) {
			throw new IllegalArgumentException("element must not be null");
		}
	}
	
	
	private void remove(Node<E> node){
		if (node == null) return ;
		
		/**
		 * 	@thinking ��������ö�Ϊ2�ڵ��ǰ�����̽ڵ㶼�Ƕ�Ϊ1��0�Ľڵ�
		 */
		if (node.hasTwoChildren()) { // ��Ϊ2�Ľڵ�
			// @note �ҵ��ýڵ��ǰ�����̽ڵ�
			Node<E> bef = befnode(node);	
			// @note ��ǰ�����̽ڵ㸲��node��ֵ
			node.element = bef.element;
			// @note ɾ��ǰ�����̽ڵ�
			node = bef;
		}
		
		Node<E> replacement = node.left != null ? node.left : node.right;
		
		if (replacement != null) { // ��Ϊ1�Ľڵ�
			replacement.parent = node.parent;
			
			if (node.parent == null) { // ��Ϊ1�ĸ��ڵ�
				root = replacement;
			} else if (node == node.parent.left) {
				node.parent.left = replacement;
			} else {
				node.parent.right = replacement;
			}
		} else if (node.parent == null) { // ��Ϊ0�ĸ��ڵ�
			root = null;
		} else {
			if (node == node.parent.left) {
				node.parent.left = null;
			} else {
				node.parent.right = null;
			}
		}
		
		afteRemove(node);
	}
	
	
	/**
	 * 	@method ���ݽڵ�ֵѰ�ҵ��ڵ�
	 */
	private Node<E> node(E element) {		
		Node<E> node = root;
		while (node != null) {
			int temp = equles(element, node.element);
			
			if (temp == 0) {
				return node;
			} else if (temp > 0) {
				node = node.right;
			} else {
				node = node.left;
			}
		}
		
		return null;
	}
}






















