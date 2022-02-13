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


    LinkedList printList(LinkedList list){
        Node currentNode = list.head;
        while (currentNode != null){
            System.out.print(currentNode.data+" --> ");
            currentNode = currentNode.next;
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
        list.insert(list, 10);
        list.insert(list, 20);
        list.insert(list, 30);
        list.insert(list, 40);

        list.deleteKey(list);
        list.printList(list);



    }
}
