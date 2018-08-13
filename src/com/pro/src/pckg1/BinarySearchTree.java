package com.pro.src.pckg1;

import javax.swing.tree.TreeNode;

public class BinarySearchTree {
	
	private BinaryTree root;
	
	public void insert(Integer data) {
		if (root == null)
			this.root = new BinaryTree(data);
		else root.insert(data);
	}

	public BinaryTree find(Integer data) {
		
		if(root != null)
			return root.find(data);
		
		return null;
	}
	
	public void delete(Integer data) {
		
	}
}
