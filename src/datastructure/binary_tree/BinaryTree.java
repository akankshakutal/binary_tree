package datastructure.binary_tree;

class BinaryTree {

  private Node rootNode;

  private Node addNode(Node current, int value) {
    if (current == null) {
      return new Node(value);
    }
    if (value < current.value) {
      current.left = this.addNode(current.left, value);
    }
    if (value > current.value) {
      current.right = this.addNode(current.right, value);
    }
    return current;
  }

  private boolean containsNode(Node current, int value) {
    if (current == null) {
      return false;
    }
    if (value == current.value) {
      return true;
    }
    if (value < current.value) {
      return containsNode(current.left, value);
    }
    return containsNode(current.right, value);
  }

  private boolean contains(int value) {
    return containsNode(rootNode, value);
  }

  boolean add(int value) {
    if (contains(value)) {
      return false;
    }
    rootNode = addNode(rootNode, value);
    return true;
  }

  private class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
      this.value = value;
      right = null;
      left = null;
    }
  }

}
