
package queuelinkedlist;

public class Queue {
    private Node front;
    private Node rear;
    private int size;
    
    public Queue(){
        front = null;
        rear = null;
        size = 0;
    }
    public boolean isEmpty(){
        boolean response = false;
        
        if(size == 0){
            response = true;
        }
        
        return response;
    }
    
    public void enqueue(String name, String concern){
        Node node = new Node(name, concern);
        if(front == null){
            front = node;
            rear = node;
        }
        else{
            rear.next = node;
            rear = node;
        }
        size++;
    }
    
    public Node dequeue(){
        Node response = null;
        if(front != null){
            if(front.next != null){
                response = new Node(front.name, front.concern);
                front = front.next;
                size--;
            }
            else{
                response = new Node(front.name, front.concern);
                front = null;
                rear = null;
                size--;
            }
        }
        return response;
    }
    
    public Node peek(){
        Node response = null;
        if(!isEmpty()){
            response = new Node(front.name, front.concern);
        }
        return response;
    }
}
