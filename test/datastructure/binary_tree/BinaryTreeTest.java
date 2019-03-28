package datastructure.binary_tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

  private BinaryTree binaryTree;

  @BeforeEach
  void setUp() {
    binaryTree = new BinaryTree();
    binaryTree.add(4);
    binaryTree.add(2);
    binaryTree.add(3);
    binaryTree.add(1);
    binaryTree.add(8);
    binaryTree.add(6);
    binaryTree.add(9);
    binaryTree.add(0);
    binaryTree.add(10);
  }

  @Test
  @DisplayName("should return true while adding leftChild to existing node")
  void addNode() {
    assertTrue(binaryTree.add(5));
  }

  @Test
  @DisplayName("should return true while adding rightChild to existing node")
  void addNode1() {
    assertTrue(binaryTree.add(5));
  }

  @Test
  @DisplayName("should return false while adding an existing node.")
  void addNode2() {
    assertFalse(binaryTree.add(4));
  }

  @Test
  @DisplayName("should return true while deleting existing node")
  void deleteNode() {
    assertTrue(binaryTree.delete(4));
  }

  @Test
  @DisplayName("should return false while deleting non-existing node")
  void deleteNode1() {
    assertFalse(binaryTree.delete(5));
  }

  @Test
  @DisplayName("should return true while deleting leftNode which don't have any child")
  void deleteNode2() {
    assertTrue(binaryTree.delete(1));
  }

  @Test
  @DisplayName("should return true while deleting rightNode which don't have any child")
  void deleteNode3() {
    assertTrue(binaryTree.delete(9));
  }

  @Test
  @DisplayName("should return true while deleting node which have left child")
  void deleteNode4() {
    assertTrue(binaryTree.delete(1));
  }

  @Test
  @DisplayName("should return true while deleting node which have right child")
  void deleteNode5() {
    assertTrue(binaryTree.delete(9));
  }
}