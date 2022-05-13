package TaxiBookingApplication;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {
   static int id=1;
   public static void main(String args[] ) {
	  while(true) {
		  startFlow();
	  }
   }
   
   
   public static void startFlow() {
	   showDetails(); 
	   Scanner scan=new Scanner(System.in);
	   int choice=scan.nextInt();
	   switch(choice) {
	   case 1: {
		        //1.Book Ticket
		        System.out.println("Enter Name :");
		        String name=scan.next();
		        System.out.println("Enter Age");        
		        int age=scan.nextInt();
		        System.out.println("Enter Berth (U |M| L)");
		        String berth=scan.next().toUpperCase();
		        
		        
		        //check Available
		        String newBerth=TicketDetails.checkBerth(berth.toUpperCase());
		        if(newBerth.equals("NO Ticket Currenly Available :(")) {
		        	System.out.println(newBerth);
		        }
		        else {
		        	//creating object and add it in queue
			        BookedTicket bt=new BookedTicket(id,name,age,newBerth);
			        id++;
			        BookTicket.add(bt);
			        
			        if(newBerth.equals(berth))
			        System.out.println("Ticket Booked SuccessFully!! \n Your Ticket id is : "+bt.getId());
			        else
			        System.out.println("Ticket Booked SuccessFully!! \n "+berth+" is not Available so, Booked in : "+newBerth+" level. \nYour Ticket id is : "+bt.getId());  	
		        }
		        System.out.println("\n");
		        break;
	           }
	   case 2: {
		         System.out.println("2.cancel \nEnter the Id :");
		         int id=scan.nextInt();
		         
		         CancelTicket.cancel(id);
		         break;
       		   }
	   case 3: {
		   
        	   }
	   case 4: {
		   
       	       }
	   case 5: {
		   
       		   }
	   
	   default:{
		   	System.out.println("Invalid Option Exiting!!");
	         }
	   } 
   }
   
   
   
   static void showDetails() {
	   System.out.println("1.Book Ticket");
	   System.out.println("2.Cancel Ticket");
	   System.out.println("3.Available Ticket");
	   System.out.println("4.Booked Ticket");
	   System.out.println("5.Exit \n");
	 }
}
