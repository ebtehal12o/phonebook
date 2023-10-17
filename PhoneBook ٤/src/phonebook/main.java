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
       String nam , num, note, em, adr, bir = input.nextLine();
         
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
                p.searchContact(nam) ;
                
                break;
                
            case 2 :
                System.out.println("Enter the contact's Phone Number: ");
                num = input.nextLine(); 
                p.searchContact(num) ;
                
                break;
                
            case 3 , 4 , 5:
             System.out.println("Enter the contact's Email address or address or Birthday : "); 
             mm = input.nextLine();
             p.searchContacts(mm);
             
             break;
            
        } 
               break;
               
               
           
           
                 
                 
               
               
               
       }
       }while (ch != 8) ; 
      
    } 
    
}
   
        
