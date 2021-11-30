package edu.cscc;

public class LinkedList<Object> {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void addFirst(Object content) {
        Node ptr = head;
        head = new Node(content,ptr);
    }

    public void addLast(Object content) {
        Node last = new Node(content,null);
        if (head == null) {
            head = last;
        } else {
            Node ptr = head;
            while(ptr.getNext() != null) {
                ptr = ptr.getNext();
            }
            ptr.setNext(last);
        }
    }

    public boolean deleteFirst() {
        if (head == null) {
            return false;
        } else {
            head = head.getNext();
            return true;
        }
    }

    public boolean deleteLast() {
        if (head == null) {
            return false;
        }
        else if (head.getNext() == null) {
            head = null;
            return true;
        } else {
            Node ptr = head;
            while (ptr.getNext().getNext() != null) {
                ptr = ptr.getNext();
            }
            ptr.setNext(null);
            return true;
        }
    }

    public Node getHead() {
        return head;
    }

    public String toString() {
        String str;
        if (head == null) {
            str = "<empty>";
        } else {
            Node ptr = head;
            str = "("+ptr.getContent().toString()+")";
            while(ptr.getNext() != null) {
                str = str + "->";
                ptr = ptr.getNext();
                str = str + "(" + ptr.getContent().toString() + ")";
            }
        }
        return str;
    }
}
