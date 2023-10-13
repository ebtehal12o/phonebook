
package phonebook;


public class Node <T> {
    
    public T data ;
    public Node<T> next ;
    
    public Node ()
    { 
        data = null;
        next = null ;
        
    }
    public Node(T d) 
    {
        next = null ;
        data = d;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
    
}
