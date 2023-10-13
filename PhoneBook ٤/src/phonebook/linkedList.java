
package phonebook;


public class linkedList<T> {
    
    private Node<T> head ;
    private Node<T> current ;
    
    public linkedList()
    {
        head = current =null ;
    }
    
    public boolean isEmpty()
    {
       return head == null ;
    }
    
    public boolean full()
    {
        return false ;
    }
    
    public boolean last()
    {
        if (current.next == null)
            return true ;
        return false ;
    }
    
    public void findFirst()
    {
        current = head ;
    }
    
    public void findNext()
    {
        current = current.next ;
    }
    
    public void update(T d)
    {
        current.data = d ;
    }
    
    public T retrieve()
    {
        return current.data ;
    }
    
    public boolean isFull()
    {
        return false ;
    }
    
    public void remove() // this method will remove the element in the current 
            
    {
        if(current == head) // if current at the first of the linked list will remove it
        {
          head =head.next ;
        current = current.next ;
                }
        else
        {
            Node<T> p = head ;
            while(p.next != current) //will check if the element in the middle will remove it
                p = p.next ;
            
            p.next = current.next ;
            
            if(current.next != null) //check if the element in the last 
                current = current.next ;
            else
                current = head ;
        }
    } 
        public void insert(T d)
        {
        Node<T> p = new Node<T>(d) ;
        if (head == null)
        {
          head = p ; 
        current = p ;
        }
        else
        {
            p.next = current.next ;
            current.next = p ;
            current = p ;
        }
                    
        }
        
        
    
    
    public void addSorted(T d) //this method recive node then compare it's name with elements of the linked list then will add it based on its name
    {
        Node<T> p = new Node<T> (d) ;
        if(head == null) //if the linked list is empty insert it at the first
        {
            head = p ;  
            current = p ;
        }   
        else
        if(((Contact)d).compareTo(((Contact)head.data).getName()) < 0)  //if the new node is smaller than first one add it in the first
        {
        p.next = head ;
        head = p ;     
        }
        else
        {
            Node<T> c = head ;
            Node<T> r = null ;
            while(c!= null &&(((Contact)c.data).compareTo(((Contact)d).getName()) <= 0) ) //search for its position and add it in the middle or last
            {
                r = c ; 
                c = c.next ;
            }
            r.next = p ;
            p.next= c ;        
        }
    }
    
    public linkedList<T> search (T cont){
        
        linkedList<T> result = new linkedList();
        
        Node <T> current = head;
        while (current != null){
            if (current.data.equals(cont)){
                result.addSorted(current.data);
            }
            current = current.next;
        }
        return result;
    }
      System.out.println("test gihub") ;
        
    }

    
    
    
    
       
    
        
        
    

