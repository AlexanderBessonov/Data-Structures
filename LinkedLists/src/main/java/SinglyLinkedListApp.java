package main.java;

import java.util.ArrayList;

public class SinglyLinkedListApp {

    public static void main(String[] args) {

        MySinglyLinkedList mylist = new MySinglyLinkedList();
        System.out.println(mylist.isEmpty());

        for (int i = 0; i < 10; i++) {
            mylist.add(i);
        }
        mylist.printNodes();
     //  ArrayList<Integer> blist = new ArrayList<>();
        mylist.deleteById(9);
        mylist.printNodes();
        System.out.println("index of 8 : "+mylist.indexOf(8));

        System.out.println("***************************");

        for (int i = 0; i < 10; i++) {
            mylist.add(i);
        }
        mylist.printNodes();
        System.out.println("kth item from the last :"+mylist.getKthItemFromLast(3) );
        mylist.removeKthItemFromLast(3);
        mylist.printNodes();
    }
}
