package datastructure.binary_tree;

class BinaryTree {

  private Node rootNode;

  private Node addNode(Node current, int value) {
    if (current == null) {
      return new Node(value);
    }
    if (value < current.value) {
      current.left = addNode(current.left, value);
    }
    if (value > current.value) {
      current.right = addNode(current.right, value);
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

  private int findSmallestValue(Node root) {
    return root.left == null ? root.value : findSmallestValue(root.left);
  }

  private Node deleteRecursive(Node current, int value) {
    if (value == current.value) {
      return getNode(current);
    }
    if (value < current.value) {
      current.left = deleteRecursive(current.left, value);
      return current;
    }
    current.right = deleteRecursive(current.right, value);
    return current;
  }

  private Node getNode(Node current) {
    if (current.left == null && current.right == null)
      return null;
    if (current.right == null)
      return current.left;
    if (current.left == null)
      return current.right;
    int smallestValue = findSmallestValue(current.right);
    current.value = smallestValue;
    current.right = deleteRecursive(current.right, smallestValue);
    return current;
  }

  boolean add(int value) {
    if (contains(value)) {
      return false;
    }
    rootNode = addNode(rootNode, value);
    return true;
  }

  boolean delete(int value) {
    if (!contains(value)) {
      return false;
    }
    rootNode = deleteRecursive(rootNode, value);
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
