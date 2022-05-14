package RailwayTicketBookingApplication;
import java.util.Scanner;
public class TicketPOJO {
  //name
  //age
  //berth -changeable
	
	boolean createObject(){
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter Name : ");
		 String name=scan.nextLine();
		 System.out.println("Enter Age : ");
		 int age=scan.nextInt();
		 System.out.println("Enter Prefered Berth :(U | M | L)");
		 String berth=scan.next().toUpperCase();
		
		 if(!BookedTicketDB.checkBerthAvailable())
		 {
			 return false;
		 }
		 
		 //creating object
         Ticket object =new Ticket(BookedTicketDB.id,name,age,berth);
         BookedTicketDB.id++;
		 String newBerth=BookedTicketDB.addAvailbleBerth(object);
		 
		 
		 if(berth.equals(newBerth)) {
			 System.out.println("Ticket Booked Successfully & ID is :"+object.getId());
		 }
		 else {
			 System.out.println("Prefered Berth is not availble so booked in "+newBerth+" Berth & ID is : "+object.getId());
		 }
		 return true;
		 
	}
}
