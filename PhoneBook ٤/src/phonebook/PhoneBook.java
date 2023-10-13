
package phonebook;


public class PhoneBook {
    
   linkedList<Contact> contacts ;
   linkedList<Event> events ;
   
   public PhoneBook() {
        contacts = new linkedList<>() ;
    }
   
    public PhoneBook(linkedList<Contact> contacts) {
        this.contacts = contacts;
    }
   
    
    public void addContact(Contact c) //this method check if the Contact is exsist in the linked list will not add it , if not exist will add it
    {
      if(contacts.isEmpty())  //check if there is no elemnts in the linked list then will add it
          contacts.insert(c);
      
      else
      {  
      boolean exist = true ;
      contacts.findFirst(); 
      while(!contacts.last()) //check all elements in the linked list except last one
      {
          if((contacts.retrieve().getName().equals(c.getName()) || contacts.retrieve().getPhone().equals(c.getPhone()))) 
              exist = false ;     
          contacts.findNext();     //if not found go to the next element
      }
      if (exist == true)
          contacts.addSorted(c); //will add if not found
      
      if(!(contacts.retrieve().getName().equals(c.getName()) || contacts.retrieve().getPhone().equals(c.getPhone())) ) //will check the last element
          contacts.addSorted(c); 
    }
    
    }
    
    public void deleteContact(String name)
    {
        if(contacts.isEmpty())
            return ;
        else {
            contacts.findFirst();
        while( !contacts.last() )
        {
            if(contacts.retrieve().getName().equals(name))
            {
                contacts.remove();
            System.out.println("Delet successfully !");
            return ;
            }
            else 
            contacts.findNext();
        }  
         if(contacts.retrieve().getName().equals(name))
            {
                contacts.remove();
            System.out.println("Delet successfully !");
            return ;   
        }
         else
             System.out.println("canot found");
        }
        
    }
    public linkedList<Contact> searchContacts(String n)
    {
        linkedList<Contact> l1 = new linkedList<Contact> (); // this will be a linked list that will return contacts that have same emailAddress 
        
        if(contacts.isEmpty()) // check if the linked list is empty will return nothing
            return null ;
        
        contacts.findFirst(); 
        while( !contacts.last() ) // will check all elements except last one 
        {      
         if(contacts.retrieve().getAddress().equals(n) || contacts.retrieve().getEmail().equals(n) || contacts.retrieve().getBirthday().equals(n) )  //will compare the email address in contacts with email address that i recived 
             l1.insert(contacts.retrieve());
         
         contacts.findNext();
        }
        
        if(contacts.retrieve().getAddress().equals(n) || contacts.retrieve().getEmail().equals(n) || contacts.retrieve().getBirthday().equals(n) ) //check the last element
             l1.insert(contacts.retrieve());
        
        return l1 ;
        
    }
    
    public Contact searchContact(String n)
    {
        if(contacts.isEmpty())
            return null;

        Contact x = null ;
            contacts.findFirst();
        while(! contacts.last())
        {
            if( contacts.retrieve().getName().equals(n) ||  contacts.retrieve().getPhone().equals(n))  
                x = contacts.retrieve() ;
            else 
              contacts.findNext();
        }
   return x ;
            
        
    }
    
   
    
    
      public void printContacts( )  {
        int i = 1;
            contacts.findFirst();
            while( !contacts.last())
            {
                {
 
                System.out.println("element = " + i++ +  contacts.retrieve()) ; 
                        contacts.findNext(); 
                }
            }
            
            
    }
   
}
