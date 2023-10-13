
package phonebook;

import java.util.* ;
public class main {

    
    public static void main(String[] args) {
        
        linkedList<Contact> l = new linkedList() ;
       PhoneBook p = new PhoneBook() ;
       
       Contact c1 = new Contact ("G", "111111", "hhhhh", "ssss", "aaaa", "pppp" ) ;
       Contact c2 = new Contact ("B", "888", "lll", "ssss", "122", "hhhh" ) ;
       Contact c3 = new Contact ("Z", "555", "oooo", "s", "1ppp", "rrr" ) ;
       Contact c4 = new Contact ("D", "0000", "oooo", "s", "1ppp", "rrr" ) ;
  Contact c5= new Contact ("A", "00009", "oooo", "s", "1ppp", "rrr" ) ;
       
       p.addContact(c1);
       p.addContact(c2);
       p.addContact(c3);
       p.addContact(c5);
       p.addContact(c4); 
       
       
p.prints(l);



        
      
        
        
       
       
       int ch = 0 ;
       do {
          System.out.println("Welcome to the Linked Tree Phonebook !");
       System.out.println("Please choose an option :");
       System.out.println("1.Add a contact");
       System.out.println("2.Search for a contact ");
       System.out.println("3.Delete a contact");
       
       Scanner input = new Scanner (System.in) ;
       ch = input.nextInt() ;
       switch(ch)
       {
           case 1 :
               
       }
       }while (ch != 8) ; 
      
    } 
    
}
