package queuelinkedlist;

import java.util.Scanner;

public class QueueLinkedList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue queue = new Queue();
        String choice = "";
        String name;
        String concern;

        do {
 
            System.out.println("[1] Sign up for doctor\'s consultation\n"
                    + "[2] Enter room\n"
                    + "[3] Begin consultation\n"
                    + "[4] Closing time\n"
                    + "[5] Exit\n");
            System.out.println("");
            System.out.print("Enter choice: ");
            choice = input.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("\nInput name: ");
                    name = input.nextLine();
                    System.out.print("Nature of concern: ");
                    concern = input.nextLine();
                    queue.enqueue(name, concern);
                    System.out.println("Patient queued.\n");
                    break;
                case "2":
                    Node node = queue.peek();
                    if (node == null) {
                        System.out.println("queue is empty!\n");
                    } else {
                        System.out.println("Front - " + node.name);
                        System.out.println("");
                    }
                    break;
                case "3":
                    Node response = queue.dequeue();
                    if (response == null) {
                        System.out.println("queue is empty!\n");
                    } else {
                        System.out.println("Name: " + response.name);
                        System.out.println("Concern: " + response.concern);
                        System.out.println("Patient consulted.\n");
                    }
                    break;
                case "4":
                    Node n = queue.peek();

                while (n != null) {
                    n = queue.dequeue();
                }
                System.out.println("queue has been emptied.\n");
                break;
                case "5" :
                    System.exit(0);
                    break;
                default :
                    System.out.println("Invalid input.\n");
            }
        } while (true);
    }
}
