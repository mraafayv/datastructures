package datastructures;
import java.util.*;


public class LinkedList{

    Node head;


    LinkedList insert(LinkedList list, int data){
        Node newNode = new Node(data);
        newNode.next = null;

        if(list.head == null){
            list.head = newNode;
        }

        else{
            Node lastNode = list.head;

            while (lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }


        return list;
    }

    LinkedList insertAt(LinkedList list){


        System.out.println("Items in List: ");
        printList(list);

        Scanner a = new Scanner(System.in);
        System.out.println("\n" +" Press 1. to Insert at First position" + "\n" +
                           " Press 2. to Insert at Random position" + "\n" +
                           " Press 3. to Insert at Last position ");
        int input = a.nextInt();

        if(input == 1){
            System.out.println("Enter the data you want to add in the list: ");
            int data = a.nextInt();
            Node newNode = new Node(data);
            newNode.next = head;

            list.head = newNode;
            System.out.println("Updated list: ");
            printList(list);
        }

        else if (input == 2){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the key you want your data to be inserted after: ");
            printList(list);
            int key = in.nextInt();
//            System.out.println();
            System.out.println("Enter the data you want to add in the list: ");
            int data = a.nextInt();
            Node newNode = new Node(data);
            Node currNode = list.head;

            while (currNode.next != null){

                if (currNode.data == key){
                    Node temp  = currNode.next;
                    currNode.next = newNode;
                    newNode.next = temp;
                    System.out.print(newNode);
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
            System.out.println("Updated list: ");
            printList(list);
        }


        return  list;
    }


    LinkedList printList(LinkedList list){

        if(list.head == null){
            System.out.println("List is empty!");
        }
        else {
            Node currentNode = list.head;
            while (currentNode != null) {
                System.out.print(currentNode.data + " --> ");
                currentNode = currentNode.next;
            }
        }
        return list;
    }

    LinkedList deleteKey(LinkedList list){
        printList(list);
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the element you want to delete: ");
        int key = input.nextInt();

        if(key == head.data){
            Node nextNode = head.next;
            list.head = nextNode;
            System.out.println("Key "+key+" deleted successfully");
        }

        else {
            Node currNode = list.head;
            while (currNode.next != null){
                Node prevNode = currNode;
                currNode = currNode.next;

                if (currNode.data == key){
                    prevNode.next = currNode.next;
                    System.out.println("Key "+key+" deleted successfully");
                }
            }
        }


        return  list;
    }


    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;

        }


    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        list.insert(list, 10);
//        list.insert(list, 20);
//        list.insert(list, 30);
//        list.insert(list, 40);

//        list.deleteKey(list);
//        list.printList(list);
        list.insertAt(list);



    }
}
