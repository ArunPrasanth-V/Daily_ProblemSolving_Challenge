package RailwayTicketBookingApplication;
import java.util.*;
public class Main {
	
 static Scanner scan=new Scanner(System.in);
 
	public static void main(String[] args) {
 /*Ask 
   1.Booking  2. Cancel 3.Available Ticket 4.Booked Ticket 5.Exit */
    boolean isContinue=true;
	while(isContinue) 
	{			
	     int choice =askchoice(); 
	     if(choice==1) booking();
	     else if(choice ==2) cancelTicket();
	     else if(choice ==3) checkAvailableTicket();
	     else if(choice ==4) showBookedTicket();
	     else {
	    	 isContinue=false;
	    	System.out.println("Exiting...."); 
	     }		
	}
	
}
 static int askchoice() {
	 System.out.println("\nEnter Your Choice ! \n1.Booking\n2.Cancel\n3.Available Ticket\n4.BookedTicket\n5.Exit");
     return scan.nextInt();
 }
 
 static void booking() {
	 TicketPOJO object=new TicketPOJO();
	 
	 if(! object.createObject()) {
		 System.out.println("Ticket Unavailable :(");
	 }
	 
 }
 static void cancelTicket() {
	 System.out.println("Enter id :");
	 int id =scan.nextInt();
	 if(!BookedTicketDB.isValidID(id)) {
		 System.out.println("Invalid Record :(");
	 }
	 else {
		 BookedTicketDB.cancelTicket(id);
		 BookedTicketDB.allocateBerth();
	 }
	 
 }
 static void checkAvailableTicket() {
	 BookedTicketDB.showAvailableDetails();
	 
 }
 static void showBookedTicket() {
	 BookedTicketDB.printAllTicket();
 }
 
 
}
