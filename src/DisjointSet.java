public class DisjointSet {


    public Node make(int key) {
        Node node = new Node();
        node.key = key;
        node.root = node;
        node.rank = 0;
        return node;
    }

    public Node find(Node node) {
        if(node != node.root) {
            node.root = find(node.root);
        }
        return node.root;
    }

    public void union(Node node1, Node node2) {
        if(node1.rank > node2.rank) {
            node2.root = node1;
        } else {
            node1.root = node2;
            if(node1.rank == node2.rank) {
                node2.rank = node2.rank + 1;
            }
        }
    }

    public void path(Node node) {
        boolean q = false;
        System.out.println("Sciezka dla " + node.key);
        while (!q) {
            if (node.rank < node.root.rank) {
                System.out.println(node.key);
                node = node.root;
            }
            if(node.rank == node.root.rank) {
                System.out.println(node.key);
                q = true;
            }
        }
    }

}