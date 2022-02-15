package datastructures;


public class Queue {

    Node front;
    Node rear;


    Queue Enqueue(Queue que, int data){

        Node newNode = new Node(data);
        newNode.next = null;

        if (front == null){
            front = newNode;
            rear = newNode;
            front.next = newNode.next;
        }


        else {
            Node temp = front;

            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            rear = newNode;

        }

        System.out.println("Element "+"'"+newNode.data+"'"+" successfully added in the queue!");
        System.out.println();
        return que;
    }


Queue printQueue(Queue que){
    Node temp = front;

    System.out.println();
    System.out.println(" Queue: ");
    System.out.println("---------");

    System.out.print("|");

    while (temp != null){
        System.out.print(" ");
        System.out.print(temp.data);
        System.out.print(" |");
        temp = temp.next;
    }


    System.out.println();
        return que;
}


Queue Dequeue(Queue que){

        if (front == null){
            System.out.print("Queue Underflow");
            System.out.println();
        }

        else {
            System.out.println();
            System.out.print("Element "+"'"+front.data+"'"+" successfully removed from the queue!");
            System.out.println();
            front = front.next;
        }

        return  que;
}


    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {


        Queue q1 = new Queue();
        q1.Enqueue(q1, 1);
        q1.Enqueue(q1, 2);
        q1.Enqueue(q1, 3);
        q1.Enqueue(q1, 4);
        q1.printQueue(q1);
        q1.Dequeue(q1);
        q1.printQueue(q1);

    }
}


