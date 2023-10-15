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
        // this will be a linked list that will return contacts that have same emailAddress or email or birthday
        linkedList<Contact> l1 = new linkedList<Contact> (); 
        
        // check if the linked list is empty will return nothing
        if(contacts.isEmpty()) 
            return null ;
        
        contacts.findFirst(); 
        while( !contacts.last() ) // will check all elements except last one 
        {      
         if(contacts.retrieve().getAddress().equals(n) || contacts.retrieve().getEmail().equals(n) || contacts.retrieve().getBirthday().equals(n) )  //will compare if equals will add it in l 
             l1.insert(contacts.retrieve());
         contacts.findNext();
        }
        
        if(contacts.retrieve().getAddress().equals(n) || contacts.retrieve().getEmail().equals(n) || contacts.retrieve().getBirthday().equals(n) ) //check the last element
             l1.insert(contacts.retrieve());
        
        return l1 ;
        
    }
    
    public Contact searchContact(String n) //will search By name or phone number 
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
        if( contacts.retrieve().getName().equals(n) ||  contacts.retrieve().getPhone().equals(n))  //check last element
                x = contacts.retrieve() ;
   return x ;   
    }
    
    //this method will search for an event by title if exist will return true if not will return false
    public boolean searchEvent(String t){
    if(events.isEmpty())
        return false ;
    else
    {
            events.findFirst() ;
            while (!events.last())
            {
                if(events.retrieve().getEventTitle().equals(t)) 
                    return true ;  
                else
                events.findNext();
    }
            if(events.retrieve().getEventTitle().equals(t)) //check last element 
                return true ;
}
     return false ; //if not found return flase
    }
    
    //this method will add event , will check if exist not add it if not exist will add it
    public void addEvent(Event e)
    {
        if(events.isEmpty())
            return  ;
        else
        {
            if(!searchEvent(e.getEventTitle())) //if not exist
              events.addSorted(e) ; // add sorted
        } 
    }           
    
    //will return a linked list events that have same contact name
public linkedList<Event> getEventsContact(String n) 
            {
           Contact c =  searchContact(n) ;
           if(c!= null)
               return c.contact_events ;
           return null;
            }

//will return linked list contacts that have same event title
public linkedList<Contact> getContactsEvent(String n)
{
    Event e = searchEventTitle(n) ;
    if(e != null)
        return e.contactsEvent ;
    return null ;
    
}

// search an event by title name 
 public Event searchEventTitle(String t)
{
 if(events.isEmpty())
     return null ;

 events.findFirst();
 while(events.last()) //check all elemnts except last one 
 {
     if(events.retrieve().getEventTitle().equals(contacts))
         return events.retrieve() ;
     else
     events.findNext();
 }
 if(events.retrieve().getEventTitle().equals(contacts)) //check last elemnt
     return events.retrieve() ;
 
 return null ;
}
   
    public void printContacts()  {
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
