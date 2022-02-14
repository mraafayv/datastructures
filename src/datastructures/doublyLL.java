package datastructures;
import java.util.*;

public class doublyLL {
    Node head;


    doublyLL insert(doublyLL list, int data){
//        System.out.println("Enter the element you want to insert: ");
//        Scanner input = new Scanner(System.in);
//        int data = input.nextInt();

        Node newNode = new Node(data);
        newNode.next = null;

        if (list.head == null){
            list.head = newNode;
            newNode.prev = null;


        }

        else {
            Node lastNode = list.head;
            lastNode.prev = null;
            while (lastNode.next != null){
//                Node prevPos = lastNode;
//                lastNode.prev = lastNode;
                lastNode = lastNode.next;

            }
            lastNode.next = newNode;
            newNode.prev = lastNode;


        }
//        printList(list);

        return list;
    }




    doublyLL insertAt(doublyLL list){
        System.out.println("Items in List: ");
        printList(list);

        Scanner a = new Scanner(System.in);
        System.out.println("\n" +" Press 1. to Insert at First position" + "\n" +
                " Press 2. to Insert at Random position" + "\n" +
                " Press 3. to Insert at Last position ");
        int input = a.nextInt();

        if (input == 1){

            System.out.println("Enter the data you want to add in the list: ");
            int data = a.nextInt();
            Node newNode = new Node(data);

            head.prev = newNode;
            newNode.next = list.head;
            list.head = newNode;
            newNode.prev = null;

            System.out.println("Updated list: ");
            printList(list);
        }

        else if (input == 2){

            printList(list);
            System.out.println("Enter the key you want your data to be inserted after: ");
            int key = a.nextInt();

            System.out.println("Enter the data you want to add in the list: ");
            int data = a.nextInt();

            Node newNode = new Node(data);
            Node currNode = list.head;

            while (currNode.next != null){

                if (currNode.data == key){
                    Node prevPos = currNode;
                    Node nextPos = currNode.next;
                    newNode.prev = prevPos;
                    newNode.next = nextPos;
                    currNode.next = newNode;
//                    currNode.data = newNode.data;

                }

                currNode = currNode.next;
            }


            System.out.println("Updated list: ");
            printList(list);
        }

        else if (input == 3){
            System.out.println("Enter the data you want to add in the list: ");
            int data = a.nextInt();
            Node newNode = new Node(data);
            Node lastNode = list.head;

            while (lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
            newNode.prev = lastNode;
            newNode.next = null;

            System.out.println("Updated list: ");
            printList(list);
        }
        return list;
    }

    doublyLL printList(doublyLL list){

        Node currNode = list.head;
        String prevPos = "null";

            while (currNode != null) {
                System.out.print("(" + "prev: "+prevPos +")" + currNode.data+" --> ");
                prevPos = Integer.toString(currNode.data);
                currNode = currNode.next;
            }



        return list;
    }


    doublyLL reverse(doublyLL list){

        Node currNode = list.head;

        while (currNode.next != null){

            currNode = currNode.next;
        }

            list.head = currNode;

        while (currNode.prev != null) {
            Node temp = currNode.next;
            currNode.next = currNode.prev;
            currNode.prev = temp;
            currNode = currNode.next;

        }
        Node temp = currNode.prev;
        currNode.prev = currNode.next;
        currNode.next = temp;

//        while (currNode.next != null){
//
//            currNode = currNode.next;
//        }



        return list;
    }


    public class Node{

        int data;
        Node prev;
        Node next;



        Node(int data){
            this.data = data;
        }

    }


    public static void main(String[] args) {

        doublyLL list = new doublyLL();
        list.insert(list, 10);
        list.insert(list, 20);
        list.insert(list, 30);
        list.insert(list, 40);
//        list.insertAt(list);
        list.reverse(list);
        list.printList(list);
    }
}
