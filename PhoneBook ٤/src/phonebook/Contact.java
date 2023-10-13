
package phonebook;
import java.util.* ;
public class Contact implements Comparable {

private String contact_name ; 
private String phone_number;
private String email_address;
private String address;
private String birthday ;
private String notes;
public String eventContact ;
linkedList<Event> contact_events = new linkedList<Event>() ;

public Contact (String contact_name ,String phone_number,String email_address , String address ,String birthday ,String notes){
      //  this.contact_events = new linkedList; 
this.contact_name=contact_name;
this.phone_number=phone_number;
this.email_address=email_address;
this.address=address;
this.birthday=birthday;
this.notes=notes;
}

public Contact(Contact c)
    {
     //   this.contact_events = new linkedList;
      this.contact_name = c.contact_name;
        this.phone_number = c.phone_number;
        this.email_address = c.email_address;
        this.address = c.address;
        this.birthday =c.birthday;
        this.notes = c.notes;
    }
@Override
public int compareTo (String n ){
return contact_name.compareTo(n);
}

 public String getName(){
return contact_name ;
}
public String getPhone(){
return phone_number ;
}
public String getEmail(){
return email_address ;
}
public String getAddress(){
return address ;
}
public String getBirthday(){
return birthday ;
}
public String getNotes(){
return notes ;
}

public void setContact_name (String contact_name ){
this.contact_name=contact_name;
}

public void setPhone_number (String phone_number ){
this.phone_number=phone_number;
}
public void setEmail_address (String email_address ){
this.email_address=email_address;
}


public void setAddress (String address ){
this.address=address;
}
public void setBirthday (String birthday ){
this.birthday=birthday;
}

public void setNotes (String notes ){
this.notes=notes;
}


public String toString(){
return contact_name + "," + phone_number + "," + email_address+ "," + address +"," +birthday+ ","+ notes ;
}


}
