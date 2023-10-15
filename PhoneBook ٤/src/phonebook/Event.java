
package phonebook;


public class Event {
    
    private String eventTitle ;
    private String date ;
    private String time ;
    private String location ; 
    private String contactName ;
    public linkedList<Contact> contactsEvent = new linkedList<Contact>() ;

    public Event(String eventTitle, String date, String time, String location , String contactName) {
        this.eventTitle = eventTitle;
        this.date = date;
        this.time = time;
        this.location = location;
        this.contactName = contactName ;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

   public int compareTo (String e ){
return eventTitle.compareTo(e);
}
    @Override
    public String toString() {
        return "Event{" + "eventTitle=" + eventTitle + ", date=" + date + ", time=" + time + ", location=" + location + ", contactName=" + contactName + '}';
    }

  
    
    
    
}
