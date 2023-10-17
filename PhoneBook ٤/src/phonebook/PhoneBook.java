  public void printContacts(linkedList <Contact> l)
    {
        if(events.isEmpty()) {
        System.out.println("Empty list") ;  
    return ;
    }
    else 
    {
     l.findFirst();
      while(!l.last()) //print all events except last one
        {
            System.out.println("Name : " + l.retrieve().getName() )  ;
   System.out.println("Phone Number : " + l.retrieve().getPhone()) ;
   System.out.println("Email Address: " + l.retrieve().getEmail()) ;
   System.out.println("Address : " + l.retrieve().getAddress()) ;
   System.out.println("Notes : " + l.retrieve().getNotes()) ;
   events.findNext();
        }
        //print last event
                  System.out.println("Name : " + l.retrieve().getName() )  ;
   System.out.println("Phone Number : " + l.retrieve().getPhone()) ;
   System.out.println("Email Address: " + l.retrieve().getEmail()) ;
   System.out.println("Address : " + l.retrieve().getAddress()) ;
   System.out.println("Notes : " + l.retrieve().getNotes()) ;
    }
    }
              
}
   
   

