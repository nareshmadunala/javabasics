package org.madunala.DSA;

import java.util.LinkedList;

/**
 * @author nareshmadunala
 */
public class ReversingLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll.descendingIterator().forEachRemaining(ll1::add);
        System.out.println(ll1);
    }
}

