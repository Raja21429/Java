package Tree;

public class BSTNode {
	int data;
	BSTNode left;
	BSTNode right;
	
	public BSTNode(int newdata) {
		this.data=newdata;
	}
	public int getData() {
		return data;
	}
	public BSTNode getLeft() {
		return left;
	}
	public BSTNode getRight() {
		return right;
	}
	public void setData(int data) {
		this.data = data;
	}
	public void setLeft(BSTNode left) {
		this.left = left;
	}
	public void setRight(BSTNode right) {
		this.right = right;
	}

}
