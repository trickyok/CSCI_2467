package edu.cscc;

public class Main {

    public static void main(String[] args) {
        list1();
        list2();
        testList1();
    }

    // Use linked list with Strings
    public static void list1() {
        LinkedList<String> llist = new LinkedList();
        llist.addFirst("one");
        llist.addLast("two");
        llist.addLast("three");
        llist.addFirst("zero");
        llist.addLast("xxxx");
        llist.addFirst("yyyyy");
        llist.deleteLast();
        llist.deleteFirst();
        System.out.println(llist);
        llist.deleteFirst();
        llist.deleteLast();
        llist.deleteFirst();
        llist.deleteLast();
        System.out.println(llist);
    }

    // Use linked list with Integers
    public static void list2() {
        LinkedList<Integer> llist = new LinkedList();
        llist.addFirst(1);
        llist.addLast(2);
        llist.addLast(3);
        llist.addFirst(0);
        llist.addLast(142);
        llist.addFirst(-97);
        llist.deleteLast();
        llist.deleteFirst();
        System.out.println(llist);
        llist.deleteFirst();
        llist.deleteLast();
        llist.deleteFirst();
        llist.deleteLast();
        System.out.println(llist);
    }

    // Testing linked list with doubles for inclusion
    public static void testList1() {
        LinkedList<Double> llist = new LinkedList<>();
        llist.addFirst(1.2);
        llist.addFirst(6.9);
        llist.addLast(0.21);
        llist.addFirst(12.425);
        llist.addLast(8132.69);
        System.out.println(llist);
        llist.deleteFirst();
        llist.deleteLast();
        llist.deleteLast();
        llist.deleteLast();
        System.out.println(llist + " lol");
        llist.deleteFirst();
        System.out.println(llist);
    }
}



















/*
Why are you reading all the way down here?
Kudos to you for reading through the code, even though
there's not much to check on this one.
 */
