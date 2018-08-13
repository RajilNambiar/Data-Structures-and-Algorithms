package com.pro.src.pckg1;

public class BinaryTree {

	private Integer data;
	private BinaryTree leftChild;
	private BinaryTree rightChild;
	
	public BinaryTree(Integer data) {
		this.data = data; 
	}

	public void setLeftChild(BinaryTree leftChild) {
		this.leftChild = leftChild;
	}

	public BinaryTree find(Integer data){
		if(this.data == data)
			return this;
		if(data < this.data && leftChild != null)
			return leftChild.find(data);
		if(rightChild != null)
			return rightChild.find(data);
		return null;
		
	}
	
	public void insert(Integer data) {
		if (this.data <= data) {
			if(this.rightChild == null)
				this.rightChild = new BinaryTree(data);
			else 
				this.rightChild.insert(data);
		}else{
			if(this.leftChild == null)
				this.leftChild = new BinaryTree(data);
			else
				this.leftChild.insert(data);		
		}
	}
	
	public void setRightChild(BinaryTree rightChild) {
		this.rightChild = rightChild;
	}

	public Integer getData() {
		return data;
	}

	public BinaryTree getLeftChild() {
		return leftChild;
	}

	public BinaryTree getRightChild() {
		return rightChild;
	}

}
