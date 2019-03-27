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
  }

  @Test
  @DisplayName("should return true while adding non-existing node.")
  void addNode() {
    assertTrue(binaryTree.add(1));
  }

  @Test
  @DisplayName("should return false while adding an existing node.")
  void addNode1() {
    assertFalse(binaryTree.add(4));
  }
}