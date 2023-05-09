package com.globoalsoftwaresupport.trees;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {
	
	private Node<T> root;

	@Override
	public void insert(T data) {
		if(root == null) {
			root = new Node<>(data,null);
		}else {
			insert(data,root);
		}
	}

	private void insert(T data, Node<T> node) {
		if(node.getData().compareTo(data) > 0) {
			if(node.getLeftChild() != null) {
				insert(data,node.getLeftChild());
			}else {
				node.setLeftChild(new Node<>(data, node));
			}
		}else {
			if(node.getRightChild() != null) {
				insert(data,node.getRightChild());
			}else {
				node.setRightChild(new Node<>(data, node));
			}
		}
	}

	@Override
	public void remove(T data) {
		if(root == null) return;
		
		remove(data, root);
	}

	private void remove(T data, Node<T> node) {
		if(root == null) return;
		
		if(data.compareTo(node.getData()) < 0){
			remove(data, node.getLeftChild());
		} else if(data.compareTo(node.getData()) > 0) {
			remove(data, node.getRightChild());
		} else {
			if(node.getLeftChild()==null && node.getRightChild()==null) {
				Node<T> parent = node.getParentNode();
				if(parent!= null && parent.getLeftChild() == node) {
					parent.setLeftChild(null);
				}else if (parent!= null && parent.getRightChild() == node) {
					parent.setRightChild(null);
				}if(parent == null) {
					root = null;
				}
				
				node = null;
				
				
			}
			
			else if(node.getLeftChild()==null && node.getRightChild()!=null) {
				Node<T> parent = node.getParentNode();
				
				if(parent != null && parent.getLeftChild() == node) {
					parent.setLeftChild(node.getRightChild());
				} else if(parent != null && parent.getRightChild() == node) {
					parent.setRightChild(node.getRightChild());
				}
				
				
				if(parent == null) {
					root = node.getRightChild();
				}
				
				node.getRightChild().setParentNode(parent);
				node = null;
			}
			
			
			
			else if(node.getLeftChild()!=null && node.getRightChild()==null) {
				Node<T> parent = node.getParentNode();
				
				if(parent != null && parent.getLeftChild() == node) {
					parent.setLeftChild(node.getLeftChild());
				} else if(parent != null && parent.getRightChild() == node) {
					parent.setRightChild(node.getLeftChild());
				}
				
				
				if(parent == null) {
					root = node.getLeftChild();
				}
				
				node.getLeftChild().setParentNode(parent);
				node = null;
			}
			
			else {
				Node<T> predecessor = getPredecessor(node.getLeftChild());
				
				T temp = predecessor.getData();
				predecessor.setData(node.getData());
				node.setData(temp);
				
				remove(data, predecessor);
			}
		}
	}

	private Node<T> getPredecessor(Node<T> node) {
		if(node.getRightChild() != null)
			return getPredecessor(node.getRightChild());
		
		return node;
	}

	@Override
	public void traversal() {
		
		if(root == null) return;
		
		traversal(root);
		
	}
	
	private void traversal(Node<T> node) {
		if(node.getLeftChild() != null)
			traversal(node.getLeftChild());
		
		System.out.print(node + " - ");
		
		if(node.getRightChild() != null)
			traversal(node.getRightChild());
		
	}

	public T getMyMin() {
		Node<T> node = null;
		if(root == null || root.getData() == null) {
			return null;
		}
		if(root.getLeftChild() == null) {
			node = root;
		}else {
			node = root.getLeftChild();
			while(true) {
				if(node.getLeftChild()== null && node.getRightChild() == null) {
					return node.getData();
				}else if(node.getLeftChild() != null) {
					node = node.getLeftChild();
				}else if(node.getRightChild() != null) {
					node = node.getRightChild();
				}else {
					node = node.getLeftChild().getLeftChild();
				}
			}
		}
		
		return node.getData();
	}

	@Override
	public T getMin() {
		if(root == null)
			return null;
		
		return getMin(root);
	}

	private T getMin(Node<T> node) {
		if(node.getLeftChild() != null)
			return getMin(node.getLeftChild());
		
		return node.getData();
	}

	@Override
	public T getMax() {
		if(root == null)
			return null;
		
		return getMax(root);
	}
	
	private T getMax(Node<T> node) {
		if(node.getRightChild() != null)
			return getMax(node.getRightChild());
		
		return node.getData();
	}
	
	
	public boolean isTreeSame(Node<T> node1, Node<T> node2) {
		
		boolean check = true;
		
		if(node1.getData() != node2.getData())
			return false;
		
		if((node1.getLeftChild() == null && node2.getLeftChild() != null) || (node1.getLeftChild() != null && node2.getLeftChild() == null) ||
				(node1.getRightChild() == null && node2.getRightChild() != null) || (node1.getRightChild() != null && node2.getRightChild() == null)	) {
			return false;
		}
		
		if(node1.getLeftChild() != null && node2.getLeftChild() != null) {
			 check = isTreeSame(node1.getLeftChild(), node2.getLeftChild(), check);
		}
		
		if(node1.getRightChild() != null && node2.getRightChild() != null) {
			 check = isTreeSame(node1.getRightChild(), node2.getRightChild(), check);
		}
		
		return check;
	}

	private boolean isTreeSame(Node<T> node1, Node<T> node2, boolean check) {
		
			if(!check)
				return false;
			
			return isTreeSame(node1, node2);

	}

	public Node<T> getRoot() {
		return root;
	}

	public void setRoot(Node<T> root) {
		this.root = root;
	}
	
	public Node<T> getKSmallest(Node<T> node, int k) {
		
		int n = treeSize(node.getLeftChild()) +1;
		
		if(n==k) return node;
		
		if(n>k) return getKSmallest(node.getLeftChild(),k);
		
		if(n<k) return getKSmallest(node.getRightChild(),k-n);
		
		return null;
		
	}

	private int treeSize(Node<T> node) {
		if(node == null) return 0;
		
		return (treeSize(node.getLeftChild()) + treeSize(node.getRightChild()) +1);
	}
	
	
	public int getTotalAge(Node<T> node) {
		int result = 0;
		
		if(node!= null) {
			//result = node.getData().getAge();
			result = getTotalAgeSum(node, result);
		}
			
		return result;
		
		
	}

	private int getTotalAgeSum(Node<T> node, int result) {
		
		if(node != null) {
			result = result + ((Person)node.getData()).getAge();
		}
		
			if(node.getLeftChild() != null)
				result = getTotalAgeSum(node.getLeftChild(), result);
		
		
		
			if(node.getRightChild() != null)
				result = getTotalAgeSum(node.getRightChild(), result);
		
		
		return result;
		
	}
	
	
	public int getTotalAge2(Node<T> node) {
	    if (node == null) {
	        return 0;
	    }
	    
	    int ageSum = ((Person) node.getData()).getAge();
	    ageSum += getTotalAge(node.getLeftChild());
	    ageSum += getTotalAge(node.getRightChild());
	    
	    return ageSum;
	}

	
	


}
