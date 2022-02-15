package datastructures;
import java.util.*;


public class Stack{

    Node top = null;



    Stack push(Stack list, int data){
        Node newNode = new Node(data);
        Node temp = top;
        top = newNode;
        newNode.next = temp;

        System.out.println(newNode.data+" inserted Successfully!");



        return list;
    }

    void pop() {


        if (top == null) {
            System.out.println("!--------Underflow-------!");
        }
        else {
            Node temp = top;
            top = top.next;
            System.out.println(temp.data + " Successfully popped out");
        }
    }



    Stack printStack(Stack list){
        System.out.println();
        System.out.println("Stack:");
        System.out.println("___");
        Node temp = top;
        while (temp != null){

            System.out.println(temp.data);
            System.out.println("___");
            temp = temp.next;
        }

        return list;
    }

    boolean isEmpty(Stack list){
        boolean answer;
        if(top == null) {
            answer = true;
        }
        else {
            answer = false;
        }
        System.out.println(answer);
        return answer;
    }



    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;

        }


    }
    public static void main(String[] args) {
        Stack list = new Stack();
        list.push(list, 10);
        list.push(list, 20);
        list.push(list, 30);
        list.push(list, 40);
        list.printStack(list);
//        System.out.println("****************");
//        list.pop();
//        System.out.println("****************");
        System.out.println();
//        list.printStack(list);
        list.isEmpty(list);



    }
}
