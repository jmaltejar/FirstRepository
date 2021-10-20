
package queuelinkedlist;

public class Node {
     String name;
     String concern;
     Node next;
    
    public Node(String name, String concern){
        this.name = name;
        this.concern = concern;
        this.next = null;
    }
}
