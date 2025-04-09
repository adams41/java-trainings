package datastructures.binarysearchtree;

public class BinarySearchTree {

    public static void main(String[] args) {


        Node node = new Node();
        node.setValue(50);
        Node leftNode = new Node();
        leftNode.setValue(30);
        node.setLeftNode(leftNode);
        Node rightNode = new Node();
        rightNode.setValue(40);
        node.setRightNode(rightNode);

    }


    public Node insertNewNodes(Node node, int value) {
        if (node == null) {
            Node newNode = new Node();
            newNode.setValue(value);
            return newNode;

        } else if (value < node.getValue()) {
            node.setLeftNode(insertNewNodes(node.getLeftNode(), value));

        } else if (value > node.getValue()) {
            node.setRightNode(insertNewNodes(node.getRightNode(), value));
        }
        return node;
    }


    public Node searchTree (Node node, int value) {

        if (node == null) {
            return null;
        } else if (value < node.getValue()) {

            return searchTree(node.getLeftNode(), value);

        } else if (value > node.getValue()) {

            return searchTree(node.getRightNode(), value);

        } else {

            System.out.println("Value found!");
            return node;
        }
    }

}
