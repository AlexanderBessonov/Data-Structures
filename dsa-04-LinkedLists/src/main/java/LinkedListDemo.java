package main.java;

import java.util.ArrayList;

public class LinkedListDemo {

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;

        System.out.println("Node1 is address is : "+node1+"Node1 next address is "+node1.next);
        System.out.println("Node2 is address: "+node2+"Node2 next address is " + node2.next);
        System.out.println("Node3 is address: "+node3+"Node3 next address is " + node3.next);
        System.out.println("Node4 is address: "+node4+"Node4 next address is " + node4.next);

        System.out.println(node1);//Node@49e4cb85
        System.out.println(node1.id);
        System.out.println(node1.next.id+" Id of the second node");
        System.out.println("Next address: "+ node1.next);//null

        Node current;
        Node head = node1;
        current=head;
        while (current!=null){
            System.out.println("Id of node is: "+current.id);
            current=current.next;
        }
//        ArrayList<Node> nodeArrayList = new ArrayList<>();
//        nodeArrayList.add();
    }




}
