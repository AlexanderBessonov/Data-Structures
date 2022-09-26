package main.java;

public class forWeek22 {

    public static void main(String[] args) {

        MySinglyLinkedList mySinglyLinkedList = new MySinglyLinkedList();
        mySinglyLinkedList.add(1);
        mySinglyLinkedList.add(1);
        mySinglyLinkedList.add(3);
        mySinglyLinkedList.add(4);
        mySinglyLinkedList.add(4);
        mySinglyLinkedList.add(4);
        mySinglyLinkedList.add(5);
        mySinglyLinkedList.add(6);
        mySinglyLinkedList.add(6);

        System.out.println(mySinglyLinkedList.isEmpty());
        mySinglyLinkedList.printNodes();
        mySinglyLinkedList.removeDuplicates();
        mySinglyLinkedList.printNodes();


    }




}
