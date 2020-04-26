/*
 *	
 */
package Tree;

import org.junit.Test;

import Tree.printer.BinaryTrees;

/**
 * 	@author 张致邦
 *
 * 	2020年3月26日-下午9:11:47
 */
public class Main {

	@Test
	public void AVL() {
		Integer[] elements = new Integer[] {
				
				60, 99, 72, 24, 7, 80, 74, 70, 37, 38, 10, 68, 4, 46, 22
		};
		AVLTree<Integer> tree = new AVLTree<Integer>();
		
		for (Integer integer : elements) {
			tree.add(integer);
		}
		
		for (Integer integer : elements) {
			tree.remove(integer);
			System.out.println("------------------【"+integer+"】-------------------");
			BinaryTrees.println(tree);
		}
	}	
	
	@Test
	public void BST() {
		Integer[] elements = new Integer[] {
			2, 5 ,8, 6, 10, 12, 13, 15, 56, 89, 19, 20, 21 	
		};
		BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
		
		for (Integer integer : elements) {
			tree.add(integer);
		}
		
		BinaryTrees.println(tree);
	}

}
