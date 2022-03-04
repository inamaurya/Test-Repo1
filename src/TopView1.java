//Java program to print top
//view of binary tree
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

//class to create a node
 class Node1 {
	int data;
	Node1 left, right;

	public Node1(int data)
	{
		this.data = data;
		left = right = null;
	}
}

//class of binary tree
public class TopView1 {
	Node1 root;

	public TopView1() { root = null; }

	// function should print the topView of
	// the binary tree
	private void TopView(Node1 root)
	{
		class QueueObj {
			Node1 node;
			int hd;

			QueueObj(Node1 node, int hd)
			{
				this.node = node;
				this.hd = hd;
			}
		}
		Queue<QueueObj> q = new LinkedList<QueueObj>();
		Map<Integer, Node1> topViewMap
			= new TreeMap<Integer, Node1>();

		if (root == null) {
			return;
		}
		else {
			q.add(new QueueObj(root, 0));
		}

		System.out.println(
			"The top view of the tree is : ");

		// count function returns 1 if the container
		// contains an element whose key is equivalent
		// to hd, or returns zero otherwise.
		while (!q.isEmpty()) {
			QueueObj tmpNode = q.poll();
			if (!topViewMap.containsKey(tmpNode.hd)) {
				topViewMap.put(tmpNode.hd, tmpNode.node);
			}

			if (tmpNode.node.left != null) {
				q.add(new QueueObj(tmpNode.node.left,
								tmpNode.hd - 1));
			}
			if (tmpNode.node.right != null) {
				q.add(new QueueObj(tmpNode.node.right,
								tmpNode.hd + 1));
			}
		}
		for (Entry<Integer, Node1> entry :
			topViewMap.entrySet()) {
			System.out.print(entry.getValue().data);
		}
	}

	// Driver Program to test above functions
	public static void main(String[] args)
	{
		/* Create following Binary Tree
			1
		/ \
		2 3
		\
			4
			\
			5
			\
				6*/
		TopView1 tree = new TopView1();
		tree.root = new Node1(1);
		tree.root.left = new Node1(2);
		tree.root.right = new Node1(3);
		tree.root.left.right = new Node1(4);
		tree.root.left.right.right = new Node1(5);
		tree.root.left.right.right.right = new Node1(6);
		System.out.println(
			"Following are nodes in top view of Binary Tree");
		tree.TopView(tree.root);
	}
}
