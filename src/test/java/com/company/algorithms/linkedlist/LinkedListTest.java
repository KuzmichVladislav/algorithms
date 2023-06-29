package com.company.algorithms.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkedListTest {

  LinkedList linkedList;

  @BeforeEach
  void setUp() {
    linkedList = new LinkedList();
    linkedList.addHead(1);
    linkedList.addHead(2);
    linkedList.addHead(3);
    linkedList.print();
  }

  @Test
  void testIsEmpty() {
    boolean result = linkedList.isEmpty();
    Assertions.assertFalse(result);
  }

  @Test
  void testSize() {
    int result = linkedList.size();
    Assertions.assertEquals(3, result);
  }

  @Test
  void testPeek() {
    int result = linkedList.peek();
    Assertions.assertEquals(3, result);
  }

  @Test
  void testAddHead() {
    linkedList.addHead(5);
    Assertions.assertEquals(4, linkedList.size());
    int result = linkedList.peek();
    Assertions.assertEquals(5, result);
  }

  @Test
  void testAddTail() {
    linkedList.addTail(0);
    Assertions.assertEquals(4, linkedList.size());
  }

  @Test
  void testRemoveHead() {
    int result = linkedList.removeHead();
    Assertions.assertEquals(3, result);
  }

  @Test
  void testSearch() {
    boolean result = linkedList.search(5);
    Assertions.assertFalse(result);
    boolean result2 = linkedList.search(3);
    Assertions.assertTrue(result2);
  }

  @Test
  void testDeleteNode() {
    boolean result = linkedList.deleteNode(3);
    Assertions.assertTrue(result);
    boolean result2 = linkedList.deleteNode(5);
    Assertions.assertFalse(result2);
  }

  @Test
  void testDeleteNodes() {
    boolean result = linkedList.deleteNodes(1);
    Assertions.assertTrue(result);
  }

  @Test
  void testReverseRecurse() {
    linkedList.reverseRecurse();
    int result = linkedList.peek();
    Assertions.assertEquals(1, result);
  }

  @Test
  void testReverse() {
    linkedList.reverse();
    int result = linkedList.peek();
    Assertions.assertEquals(1, result);
  }

  @Test
  void testCopyListReversed() {
    LinkedList result = linkedList.copyListReversed();
    Assertions.assertNotEquals(new LinkedList(), result);
  }

  @Test
  void testCopyList() {
    LinkedList result = linkedList.copyList();
    Assertions.assertNotEquals(new LinkedList(), result);
  }

  @Test
  void testCompareList() {
    boolean result = linkedList.compareList(new LinkedList());
    Assertions.assertFalse(result);
  }

  @Test
  void testCompareList2() {
    boolean result = linkedList.compareList2(new LinkedList());
    Assertions.assertFalse(result);
  }

  @Test
  void testFindLength() {
    int result = linkedList.findLength();
    Assertions.assertEquals(3, result);
  }

  @Test
  void testNthNodeFromBeginning() {
    int result = linkedList.nthNodeFromBeginning(2);
    Assertions.assertEquals(2, result);
  }

  @Test
  void testNthNodeFromEnd() {
    int result = linkedList.nthNodeFromEnd(2);
    Assertions.assertEquals(2, result);
  }

  @Test
  void testFindIntersection() {
    LinkedList.Node result = linkedList.findIntersection(new LinkedList());
    Assertions.assertNull(result);
  }

  @Test
  void testDeleteList() {
    linkedList.deleteList();
    Assertions.assertEquals(0, linkedList.size());
  }
}
