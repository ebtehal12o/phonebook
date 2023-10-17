package phonebook;

import java.util.* ;

public class main {
    Scanner input = new Scanner (System.in) ;
    
    public static void main(String[] args) {
        
        linkedList<Contact> l = new linkedList() ;
       PhoneBook p = new PhoneBook() ;
  
       int ch = 0 ;

        
        do {
          System.out.println("Welcome to the Linked Tree Phonebook !");
       System.out.println("Please choose an option :");
       System.out.println("1.Add a contact");
       System.out.println("2.Search for a contact ");
       System.out.println("3.Delete a contact");
        System.out.println("4. Schedule an event");
        System.out.println("5. Print event details");
        System.out.println("6. Print contacts by first name");
        System.out.println("7. Print all events alphabetically");
        System.out.println("8. Exit");
        System.out.println("\nEnter your choice: ");


       Scanner input = new Scanner (System.in) ;
       ch = input.nextInt() ;
       String nam , num, note, em, adr, bir , mm= input.nextLine();
         
       switch(ch)
       {
           case 1 :
               System.out.println("Enter the contact's name: ");
               nam = input.nextLine(); 
               System.out.println("Enter the contact's phone number: ");
               num = input.nextLine() ;
               System.out.println("Enter the contact's email address: ");
               em = input.nextLine() ;
               System.out.println("Enter the contact's address: ");
               adr = input.nextLine();
                 System.out.println("Enter the contact's birthday: ");
                 bir = input.nextLine();
                 System.out.println("Enter any notes for the contact: ");
                 note  = input.nextLine();
                 
                 Contact c = new Contact ( nam , num , em , adr ,bir , note);
                 p.addContact(c);
                 
                 System.out.println("Contact added successfully!");
                 
                 break;
                 
                 
                 
           case 2 :
               
                System.out.println("Enter search criteria:");
        System.out.println("1. Name");
        System.out.println("2. Phone Number");
        System.out.println("3. Email Address");
        System.out.println("4. Address");
        System.out.println("5. Birthday");
        System.out.println("\nEnter your choice: ");
        int choice = input.nextInt();
        
        switch(choice){
            
            
            
            case 1 :
                System.out.println("Enter the contact's name: ");
                nam = input.nextLine(); 
                p.searchContact(nam).toString() ;
                
                
                break;
                
            case 2 :
                System.out.println("Enter the contact's Phone Number: ");
                num = input.nextLine(); 
                p.searchContact(num).toString() ;
                
                break;
                
            case 3 , 4 , 5:
             System.out.println("Enter the contact's Email address or address or Birthday : "); 
             mm = input.nextLine();
            p.printContacts(p.searchContacts(mm)); 
             
             break;
            
        } 
               break;


               case 3:
               System.out.println("Enter the contact you want to delete: ");
               nam = input.nextLine(); 
               p.deleteContact(nam);
               break ;
               
               case 4:
                   System.out.println("Enter event title : ") ;
                   String t = input.nextLine() ;
                   System.out.println("Enter contact name : ") ;
                   String n = input.nextLine() ;
                   System.out.println("Enter event date and time (MM/DD/yyyy HH:MM) : ") ;
                   String d = input.nextLine() ;
                   String time = input.nextLine() ;
                   System.out.println("Enter event location : ") ;
                   String loc = input.nextLine() ;
                   
                   Event e = new Event (t , d ,time , loc , n) ;
                   p.scheduleEvent( e , n) ; 
               break;  

               case 5:{
               System.out.println("Enter search criteria: 1.contactname 2.Event tittle: ");
               int ser = input.nextInt();
               
               switch(ser){
                   
                   case 1 :
                    
                       p.PrintContactsShareFirstName();
                       break;
                       
                   case 2 :
               
                    p.PrintContactsShareEvent();
                    break;             
               }
               break ;
           }
           
           case 6:
           p.PrintContactsShareFirstName();
           break;
           
           case 7 :
               p.printAllEvents();    
               break ;
               
       }
       }while (ch != 8) ; 
      
    } 
    
}
