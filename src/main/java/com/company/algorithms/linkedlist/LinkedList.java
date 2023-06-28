package com.company.algorithms.linkedlist;

import java.util.HashSet;
import java.util.Objects;

@SuppressWarnings("unused")
public class LinkedList {
  public static final String EMPTY_LIST_EXCEPTION = "EmptyListException";
  public static final String LOOP_FOUND = "loop found";
  public static final String LOOP_NOT_FOUND = "loop not found";
  private Node head = null;
  private int size = 0;

  public boolean isEmpty() {
    return size == 0;
  }

  public int size() {
    return size;
  }

  public int peek() {
    if (isEmpty()) {
      throw new IllegalStateException(EMPTY_LIST_EXCEPTION);
    }
    return head.value;
  }

  public void addHead(int value) {
    head = new Node(value, head);
    size++;
  }

  public void addTail(int value) {
    Node newNode = new Node(value, null);
    if (head == null) {
      head = newNode;
    } else {
      Node curr = head;
      while (curr.next != null) {
        curr = curr.next;
      }
      curr.next = newNode;
    }
    size++;
  }

  public int removeHead() {
    if (isEmpty()) {
      throw new IllegalStateException(EMPTY_LIST_EXCEPTION);
    }

    int value = head.value;
    head = head.next;
    size--;
    return value;
  }

  public boolean search(int data) {
    Node temp = head;
    while (temp != null) {
      if (temp.value == data) {
        return true;
      }
      temp = temp.next;
    }
    return false;
  }

  public boolean deleteNode(int delValue) {
    if (isEmpty()) {
      throw new IllegalStateException(EMPTY_LIST_EXCEPTION);
    }

    if (delValue == head.value) {
      head = head.next;
      size--;
      return true;
    }

    Node temp = head;
    while (temp.next != null) {
      if (temp.next.value == delValue) {
        temp.next = temp.next.next;
        size--;
        return true;
      }
      temp = temp.next;
    }
    return false;
  }

  public boolean deleteNodes(int delValue) {
    Node currNode = head;
    Node nextNode;
    boolean found = false;
    while (currNode != null && currNode.value == delValue) {
      /* first node */
      head = currNode.next;
      currNode = head;
      found = true;
    }
    while (currNode != null) {
      nextNode = currNode.next;
      if (nextNode != null && nextNode.value == delValue) {
        currNode.next = nextNode.next;
        found = true;
      } else {
        currNode = nextNode;
      }
    }
    return found;
  }

  private Node reverseRecurseUtil(Node currentNode, Node nextNode) {
    if (currentNode == null) {
      return null;
    }

    if (currentNode.next == null) {
      currentNode.next = nextNode;
      return currentNode;
    }
    Node ret = reverseRecurseUtil(currentNode.next, currentNode);
    currentNode.next = nextNode;
    return ret;
  }

  public void reverseRecurse() {
    head = reverseRecurseUtil(head, null);
  }

  public void reverse() {
    Node curr = head;
    Node prev = null;
    Node next;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
  }

  public LinkedList copyListReversed() {
    Node tempNode = null;
    Node tempNode2;
    Node curr = head;
    while (curr != null) {
      tempNode2 = new Node(curr.value, tempNode);
      curr = curr.next;
      tempNode = tempNode2;
    }
    LinkedList ll2 = new LinkedList();
    ll2.head = tempNode;
    return ll2;
  }

  public LinkedList copyList() {
    LinkedList ll2 = new LinkedList();
    if (head == null) {
      return ll2;
    }

    Node curr = head;
    Node headNode = new Node(curr.value, null);
    Node tailNode = headNode;
    curr = curr.next;

    while (curr != null) {
      Node tempNode = new Node(curr.value, null);
      tailNode.next = tempNode;
      tailNode = tempNode;
      curr = curr.next;
    }

    ll2.head = headNode;
    return ll2;
  }

  public boolean compareList(LinkedList ll) {
    return compareList(head, ll.head);
  }

  private boolean compareList(Node head1, Node head2) {
    if (head1 == null && head2 == null) {
      return true;
    } else if (head1 == null || head2 == null || head1.value != head2.value) {
      return false;
    } else {
      return compareList(head1.next, head2.next);
    }
  }

  public boolean compareList2(LinkedList ll2) {
    Node head1 = head;
    Node head2 = ll2.head;
    while (head1 != null && head2 != null) {
      if (head1.value != head2.value) {
        return false;
      }
      head1 = head1.next;
      head2 = head2.next;
    }
    return (head1 == null && head2 == null);
  }

  public int findLength() {
    Node curr = head;
    int count = 0;
    while (curr != null) {
      count++;
      curr = curr.next;
    }
    return count;
  }

  public int nthNodeFromBeginning(int index) {
    if (index > size() || index < 1) {
      return Integer.MAX_VALUE;
    }
    int count = 0;
    Node curr = head;
    while (curr != null && count < index - 1) {
      count++;
      curr = curr.next;
    }
    return curr.value;
  }

  public int nthNodeFromEnd(int index) {
    int size = findLength();
    int startIndex;
    if (size != 0 && size < index) {
      return Integer.MAX_VALUE;
    }
    startIndex = size - index + 1;
    return nthNodeFromBeginning(startIndex);
  }

  public int nthNodeFromEnd2(int index) {
    int count = 1;
    Node forward = head;
    Node curr = head;
    while (forward != null && count <= index) {
      count++;
      forward = forward.next;
    }
    if (forward == null) {
      return Integer.MAX_VALUE;
    }
    while (forward != null) {
      forward = forward.next;
      curr = curr.next;
    }
    return curr.value;
  }

  public Node findIntersection(LinkedList lst2) {
    Node head2 = lst2.head;
    int l1 = 0;
    int l2 = 0;
    Node tempHead = head;
    Node tempHead2 = head2;
    while (tempHead != null) {
      l1++;
      tempHead = tempHead.next;
    }
    while (tempHead2 != null) {
      l2++;
      tempHead2 = tempHead2.next;
    }
    int diff;
    tempHead = head;
    tempHead2 = head2;
    if (l1 < l2) {
      Node temp = tempHead;
      tempHead = tempHead2;
      tempHead2 = temp;
      diff = l2 - l1;
    } else {
      diff = l1 - l2;
    }
    while (diff > 0) {
      tempHead = tempHead.next;
      diff--;
    }
    while (tempHead != tempHead2) {
      tempHead = tempHead.next;
      tempHead2 = tempHead2.next;
    }
    return tempHead;
  }

  public void deleteList() {
    head = null;
    size = 0;
  }

  public void print() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.value + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public void sortedInsert(int value) {
    Node newNode = new Node(value, null);
    Node curr = head;
    if (curr == null || curr.value > value) {
      newNode.next = head;
      head = newNode;
      return;
    }
    while (curr.next != null && curr.next.value < value) {
      curr = curr.next;
    }
    newNode.next = curr.next;
    curr.next = newNode;
  }

  public void bubbleSort() {
    Node curr;
    Node end = null;
    int temp;
    if (head == null || head.next == null) {
      return;
    }
    boolean flag = true;
    while (flag) {
      flag = false;
      curr = head;
      while (curr.next != end) {
        if (curr.value > curr.next.value) {
          flag = true;
          temp = curr.value;
          curr.value = curr.next.value;
          curr.next.value = temp;
        }
        curr = curr.next;
      }
      end = curr;
    }
  }

  public void selectionSort() {
    Node curr;
    Node end = null;
    Node maxNode;
    int temp;
    int max;
    if (head == null || head.next == null) {
      return;
    }
    while (head != end) {
      curr = head;
      max = curr.value;
      maxNode = curr;
      while (curr.next != end) {
        if (max < curr.next.value) {
          maxNode = curr.next;
          max = curr.next.value;
        }
        curr = curr.next;
      }
      end = curr;
      if (curr.value < max) {
        temp = curr.value;
        curr.value = max;
        maxNode.value = temp;
      }
    }
  }

  public void insertionSort() {
    Node curr;
    Node stop;
    int temp;
    if (head == null || head.next == null) {
      return;
    }
    stop = head.next;
    while (stop != null) {
      curr = head;
      while (curr != stop) {
        if (curr.value > stop.value) {
          temp = curr.value;
          curr.value = stop.value;
          stop.value = temp;
        }
        curr = curr.next;
      }
      stop = stop.next;
    }
  }

  public void removeDuplicate() {
    Node curr = head;
    while (curr != null) {
      if (curr.next != null && curr.value == curr.next.value) {
        curr.next = curr.next.next;
      } else {
        curr = curr.next;
      }
    }
  }

  public void makeLoop() {
    Node temp = head;
    while (temp != null) {
      if (temp.next == null) {
        temp.next = head;
        return;
      }
      temp = temp.next;
    }
  }

  public boolean loopDetect() {
    Node curr = head;
    HashSet<Node> hs = new HashSet<>();
    while (curr != null) {
      if (hs.contains(curr)) {
        System.out.println(LOOP_FOUND);
        return true;
      }
      hs.add(curr);
      curr = curr.next;
    }
    System.out.println(LOOP_NOT_FOUND);
    return false;
  }

  boolean loopDetect2() {
    Node slowPtr;
    Node fastPtr;
    fastPtr = head;
    slowPtr = fastPtr;
    while (fastPtr.next != null && fastPtr.next.next != null) {
      slowPtr = slowPtr.next;
      fastPtr = fastPtr.next.next;
      if (slowPtr == fastPtr) {
        System.out.println(LOOP_FOUND);
        return true;
      }
    }
    System.out.println(LOOP_NOT_FOUND);
    return false;
  }

  boolean reverseListLoopDetect() {
    Node tempHead = head;
    reverse();
    if (tempHead == head) {
      reverse();
      System.out.println(LOOP_FOUND);
      return true;
    } else {
      reverse();
      System.out.println(LOOP_NOT_FOUND);
      return false;
    }
  }

  public int loopTypeDetect() {
    Node slowPtr;
    Node fastPtr;
    fastPtr = head;
    slowPtr = fastPtr;
    while (fastPtr.next != null && fastPtr.next.next != null) {
      if (head == fastPtr.next || head == fastPtr.next.next) {
        System.out.println("circular list loop found");
        return 2;
      }
      slowPtr = slowPtr.next;
      fastPtr = fastPtr.next.next;
      if (slowPtr == fastPtr) {
        System.out.println(LOOP_FOUND);
        return 1;
      }
    }
    System.out.println(LOOP_NOT_FOUND);
    return 0;
  }

  public Node loopPointDetect() {
    Node slowPtr;
    Node fastPtr;
    fastPtr = head;
    slowPtr = fastPtr;
    while (fastPtr.next != null && fastPtr.next.next != null) {
      slowPtr = slowPtr.next;
      fastPtr = fastPtr.next.next;
      if (slowPtr == fastPtr) {
        return slowPtr;
      }
    }
    return null;
  }

  public void removeLoop() {
    Node loopPoint = loopPointDetect();
    if (loopPoint == null) {
      return;
    }
    Node firstPtr = head;
    if (loopPoint == head) {
      while (firstPtr.next != head) {
        firstPtr = firstPtr.next;
      }
      firstPtr.next = null;
      return;
    }
    Node secondPtr = loopPoint;
    while (firstPtr.next != secondPtr.next) {
      firstPtr = firstPtr.next;
      secondPtr = secondPtr.next;
    }
    secondPtr.next = null;
  }

  static class Node {
    int value;
    Node next;

    Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      Node node = (Node) o;

      if (value != node.value) {
        return false;
      }
      return Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
      int result = value;
      result = 31 * result + (next != null ? next.hashCode() : 0);
      return result;
    }
  }
}
