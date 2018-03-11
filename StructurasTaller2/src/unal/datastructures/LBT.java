package unal.datastructures;

public class LBT<T extends Comparable<? super T>> extends LinkedBinaryTree<T>
		implements BinaryTree<T> {

	public LBT() {
	}

	public LBT(BinaryTreeNode<T> a) {
		this.root = this.copyTree(a);
	}

	@Override
	public void makeTree(T preorder, BinaryTree<T> binaryTree,
			BinaryTree<T> binaryTree2) {
		if (binaryTree == null && binaryTree2 != null) {
			this.root = new BinaryTreeNode<T>(preorder, null,
					((LinkedBinaryTree<T>) binaryTree2).root);
			return;
		}
		if (binaryTree2 == null && binaryTree != null) {
			this.root = new BinaryTreeNode<T>(preorder,
					((LinkedBinaryTree<T>) binaryTree).root, null);
			return;
		}
		if (binaryTree2 == null && binaryTree == null) {
			this.root = new BinaryTreeNode<T>(preorder, null, null);
			return;
		}
		this.root = new BinaryTreeNode<T>(preorder,
				((LinkedBinaryTree<T>) binaryTree).root,
				((LinkedBinaryTree<T>) binaryTree2).root);
	}

	private T maxElement1(BinaryTreeNode<T> a) {
		T temp = a.element, temp2 = a.element;
		if (a.getLeftChild() != null) {
			temp2 = this.maxElement1(a.getLeftChild());
			if (temp2 != null)
				if (temp.compareTo(temp2) < 0)
					temp = temp2;
		}
		if (a.getRightChild() != null) {
			temp2 = this.maxElement1(a.getRightChild());
			if (temp2 != null)
				if (temp.compareTo(temp2) < 0)
					temp = temp2;
		}
		return temp;
	}

	public T maxElement() {
		return (root == null) ? null : this.maxElement1(root);
	}

	private T minElement1(BinaryTreeNode<T> a) {
		T temp = a.element, temp2;
		if (a.getLeftChild() != null) {
			temp2 = this.minElement1(a.getLeftChild());
			if (temp2 != null)
				if (temp.compareTo(temp2) > 0)
					temp = temp2;
		}
		if (a.getRightChild() != null) {
			temp2 = this.minElement1(a.getRightChild());
			if (temp2 != null)
				if (temp.compareTo(temp2) > 0)
					temp = temp2;
		}
		return temp;
	}

	public T minElement() {
		return (this.root == null) ? null : this.minElement1(this.root);
	}

	private boolean isFull1(BinaryTreeNode<T> a, int nivel) {
		if (nivel == 1
				&& (a.getLeftChild() == null || a.getRightChild() == null))
			return false;
		if (nivel == this.height())
			return true;
		if (a.getLeftChild() == null || a.getRightChild() == null)
			return false;
		return isFull1(a.getLeftChild(), nivel + 1)
				&& isFull1(a.getRightChild(), nivel + 1);
	}

	public boolean isFull() {
		return (this.root == null) ? null : this.isFull1(this.root, 1);
	}

	private boolean isComplete1(BinaryTreeNode<T> a, int nivel) {
		if (nivel + 1 == this.height()
				&& (a.getLeftChild() != null || a.getRightChild() != null))
			return true;
		boolean x = false, y = false;
		if (a.getLeftChild() != null)
			x = this.isComplete1(a.getLeftChild(), nivel + 1);
		if (a.getRightChild() != null)
			y = this.isComplete1(a.getRightChild(), nivel + 1);
		return x && y;
	}

	public boolean isComplete() {
		if (this.height() == 1)
			return false;
		return (this.root == null) ? null : this.isComplete1(this.root, 1);
	}

	private int numLeaves1(BinaryTreeNode<T> a) {
		if (a == null)
			return 0;
		if (a.getLeftChild() == null && a.getRightChild() == null)
			return 1;
		return this.numLeaves1(a.getLeftChild())
				+ this.numLeaves1(a.getRightChild());
	}

	public int numLeaves() {
		return (this.root == null) ? 0 : this.numLeaves1(this.root);
	}

	private void reverse1(BinaryTreeNode<T> a) {
		if (a == null)
			return;
		BinaryTreeNode<T> temp = a.getLeftChild();
		a.setLeftChild(a.getRightChild());
		a.setRightChild(temp);
		reverse1(a.getLeftChild());
		reverse1(a.getRightChild());
	}

	public void reverse() {
		if (this.root == null)
			return;
		reverse1(this.root);
	}

	public boolean compare1(BinaryTreeNode<T> a, BinaryTreeNode<T> b) {
		if (a == null && b == null)
			return true;
		if (a == null || b == null)
			return false;
		if (a.element != b.element)
			return false;
		return compare1(a.leftChild, b.leftChild)
				&& compare1(a.rightChild, b.rightChild);
	}

	public boolean compare(LBT<T> otro) {
		return (otro.root == null || this.root == null) ? false : compare1(
				this.root, otro.root);
	}

	public int height1(BinaryTreeNode<T> a, int level) {
		if (a == null)
			return level - 1;
		int j = this.height1(a.getLeftChild(), level + 1);
		int k = this.height1(a.getRightChild(), level + 1);
		return (j < k) ? k : j;
	}

	public boolean isBalanced() {
		if (this.root == null)
			return false;
		return (this.height1(this.root.getLeftChild(), 1)
				- this.height1(this.root.getRightChild(), 1) <= 2 && this
				.height1(this.root.getLeftChild(), 1)
				- this.height1(this.root.getRightChild(), 1) >= -2) ? true
				: false;
	}

	public BinaryTreeNode<T> copyTree(BinaryTreeNode<T> a) {
		if (a == null)
			return null;
		return new BinaryTreeNode<T>(a.element, copyTree(a.leftChild),
				copyTree(a.rightChild));
	}

	private void nullarbol(BinaryTreeNode<T> a) {
		if (a == null)
			return;
		a.element = null;
		nullarbol(a.leftChild);
		nullarbol(a.rightChild);
	}

	public void llenarArbol(BinaryTreeNode<T> a) {
		if (a == null)
			return;
		if (a.leftChild == null && a.rightChild == null)
			return;
		if (a.leftChild == null) {
			a.leftChild = this.copyTree(a.rightChild);
			nullarbol(a.leftChild);
		} else if (a.rightChild == null) {
			a.rightChild = this.copyTree(a.leftChild);
			nullarbol(a.rightChild);
		}
		llenarArbol(a.leftChild);
		llenarArbol(a.rightChild);
	}

	public void prettyPrint() {

		int high = this.height() * 2;
		String x = "", y = "", y1 = "";
		for (int i = 0; i < high; i++)
			x += " ";
		x += "   ";
		for (int i = 0; i < high; i++)
			y += "_";
		for (int i = 0; i < high; i++)
			y1 += " ";
		int cont = 0;

		ArrayQueue<BinaryTreeNode<T>> cola = new ArrayQueue<>();
		ArrayQueue<BinaryTreeNode<T>> cola2 = new ArrayQueue<>();
		BinaryTreeNode<T> temp = null;

		temp = this.copyTree(this.root);
		this.llenarArbol(temp);
		cola.put(temp);

		System.out.print(x);
		do {
			temp = cola.remove();
			if (temp != null) {
				if (temp.getLeftChild() != null) {
					if (temp.element != null
							&& temp.getLeftChild().element != null) {
						System.out.print(y);
					} else
						System.out.print(y1);
					cola2.put(temp.getLeftChild());
				} else {
					System.out.print(y1);
				}
				if (temp.element != null)
					System.out.print(temp.getElement());
				else
					System.out.print(" ");
				if (temp.getRightChild() != null) {
					if (temp.element != null
							&& temp.getRightChild().element != null) {
						System.out.print(y);
					} else
						System.out.print(y1);
					cola2.put(temp.getRightChild());
				} else {
					if ((cont + 1) % 4 == 0 && high == 1)
						;
					else
						System.out.print(y1);
				}
				if (cola.isEmpty()) {
					System.out.println();
					high /= 2;
					if (x.length() > 0)
						x = x.substring(0, x.length() - ((int) high + 1));
					y = y.substring(0, y.length() - ((int) high));
					y1 = y1.substring(0, y1.length() - ((int) high));

					if (high < 2 && !(this.height() % 2 == 0))
						x = x.substring(0, x.length() - 1);
					System.out.print(x);
					while (!cola2.isEmpty())
						cola.put(cola2.remove());
					cont = 0;
				} else {

					cont++;
					if (cont == 2 && high == 2) {
						System.out.print(y1);
					}
					if (cont % 4 == 0 && high == 1)
						;
					else if (cont % 2 == 0) {
						System.out.print(" ");
					} else {
						if (high < 2) {
							System.out.print(y1 + " ");
							if (this.height() % 2 == 0)
								System.out.print(" ");
						} else
							System.out.print(y1 + y1 + " ");
					}

				}
			}

		} while (temp != null);
		System.out.println();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private BinaryTreeNode<T> createTree1(T[] preorder, T[] inorder) {
		int j;
		if (inorder[1] == null)
			return new BinaryTreeNode<T>(inorder[0], null, null);
		if (preorder[1] == null)
			return new BinaryTreeNode<T>(preorder[0], null, null);
		if (preorder[0] == null || inorder[0] == null)
			return null;

		for (j = 0; j < inorder.length; j++)
			if (inorder[j] == preorder[0]) {
				break;
			}
		T[] preorder1 = (T[]) new Comparable[20], preorder2 = (T[]) new Comparable[20], inorder1 = (T[]) new Comparable[20], inorder2 = (T[]) new Comparable[20];

		for (int i = 1; i < preorder.length; i++)
			preorder1[i - 1] = preorder[i];
		for (int i = 0; i < j; i++)
			inorder1[i] = inorder[i];

		for (int i = tam(inorder1) + 1, n = 0; i < preorder.length; i++, n++)
			preorder2[n] = preorder[i];
		for (int i = j + 1, n = 0; i < inorder.length; i++, n++)
			inorder2[n] = inorder[i];

		return new BinaryTreeNode(preorder[0],
				createTree1(preorder1, inorder1), createTree1(preorder2,
						inorder2));
	}

	public int tam(T[] arreglo) {
		int cont = 0;
		for (; arreglo[cont] != null; cont++)
			;
		return cont;
	}

	@SuppressWarnings({ "unchecked" })
	public void createTree(T[] preorder, T[] inorder) {
		int j;
		for (j = 0; j < inorder.length; j++)
			if (inorder[j] == preorder[0]) {
				break;
			}

		T[] preorder1 = (T[]) new Comparable[20], preorder2 = (T[]) new Comparable[20];
		T[] inorder1 = (T[]) new Comparable[20], inorder2 = (T[]) new Comparable[20];

		for (int i = 1; i < preorder.length; i++)
			preorder1[i - 1] = preorder[i];

		for (int i = 0; i < j; i++)
			inorder1[i] = inorder[i];

		for (int i = tam(inorder1) + 1, n = 0; i < preorder.length; i++, n++)
			preorder2[n] = preorder[i];

		for (int i = j + 1, n = 0; i < inorder.length; i++, n++)
			inorder2[n] = inorder[i];

		this.makeTree(preorder[0],
				new LBT<T>(createTree1(preorder1, inorder1)), new LBT<T>(
						createTree1(preorder2, inorder2)));
	}

	public void imprimirArreglo(T[] arreglo) {
		for (int i = 0; i < arreglo.length && arreglo[i] != null; i++)
			System.out.print(arreglo[i] + " ");
	}

	public static void main(String[] args) {
		LBT<Integer> a = new LBT<>(), z = new LBT<>();
		LBT<Character> b = new LBT<>(), y = new LBT<>();
		
		z.makeTree(new Integer(2), null, null);

		System.out.println("***First Tree***");
		
		Integer[] preorder = { 1, 2, 4, 8, 5, 0, 3, 6, 9, 7 };
		Integer[] inorder = { 4, 8, 2, 0, 5, 1, 6, 9, 3, 7 };

		a.createTree(preorder, inorder);
		a.prettyPrint();

		System.out.println("Preorder sequence is ");
		a.preOrderOutput();
		System.out.println();

		System.out.println("Inorder sequence is ");
		a.inOrderOutput();
		System.out.println();

		System.out.println("Postorder sequence is ");
		a.postOrderOutput();
		System.out.println();

		System.out.println("Level order sequence is ");
		a.levelOrderOutput();
		System.out.println();

		System.out.println("Number of nodes = " + a.size());
		System.out.println("Height = " + a.height());
		System.out.println("Number of leaves:" + a.numLeaves());
		System.out.println("is full?: " + a.isFull());
		System.out.println("is complete?: " + a.isComplete());
		System.out.println("is balanced?: "+ a.isBalanced());
		System.out.println("is equals to z?: " + a.compare(z));
		System.out.println("Max Element: " + a.maxElement());
		System.out.println("Min Element: " + a.minElement());
		a.reverse();
		
		System.out.println("\n***Second Tree***");
		
		y.makeTree(new Character('N'),null,null);
		
		Character[] preorderchar = { 'G','D','B','H','E','I','A','C','J','K','F' };
		Character[] inorderchar = { 'A','B','D','G','E','H','I','C','F','J','K' };
		
		b.createTree(preorderchar, inorderchar);
		b.prettyPrint();

		System.out.println("Preorder sequence is ");
		b.preOrderOutput();
		System.out.println();

		System.out.println("Inorder sequence is ");
		b.inOrderOutput();
		System.out.println();

		System.out.println("Postorder sequence is ");
		b.postOrderOutput();
		System.out.println();

		System.out.println("Level order sequence is ");
		b.levelOrderOutput();
		System.out.println();

		System.out.println("Number of nodes = " + b.size());
		System.out.println("Height = " + b.height());
		System.out.println("Number of leaves:" + b.numLeaves());
		System.out.println("is full?: " + b.isFull());
		System.out.println("is complete?: " + b.isComplete());
		System.out.println("is balanced?: "+ b.isBalanced());
		System.out.println("is equals to z?: " + b.compare(y));
		System.out.println("Max Element: " + b.maxElement());
		System.out.println("Min Element: " + b.minElement());
		b.reverse();
	}

}
