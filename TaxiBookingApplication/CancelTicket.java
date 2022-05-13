package TaxiBookingApplication;

import java.util.LinkedList;
import java.util.Queue;

public class CancelTicket {
	static void cancel(int id) {
		if(!BookTicket.isVaidId(id)) {
			System.out.println("Invalid ID :(");
		}
		else {
			//get the lists
			LinkedList<BookedTicket> tickets=BookTicket.getLevel(id);
			//get particular Element
			BookedTicket ticket=BookTicket.getTicket(tickets,id);
			//remove the element in that list
			tickets.remove(ticket);
			//remove from map
			BookTicket.idList.remove(ticket.getid());
			//change the length 
			TicketDetails.checkBerth(ticket.getBerth());
			
			//check any person reserved seat
			if(BookTicket.reserve.size()!=0)
			{
				//if yes mean get that
				BookedTicket t=BookTicket.reserve.getFirst();
				//change the length 
				TicketDetails.checkBerth(t.getBerth());
				
				//change that to appropriate Berth
				t.setBerth(ticket.getBerth());
				//change the length 
				TicketDetails.increment(t.getBerth());
				tickets.add(t);
				BookTicket.reserve.pollFirst();
				
				BookTicket.idList.remove(t.getid());
				BookTicket.idList.put(t.getid(),t.getBerth());
				System.out.println(t.getid()+" get Seated in "+t.getBerth()+" Level");
				if(BookTicket.waitingList.size()!=0) {
					t=BookTicket.waitingList.getFirst();
					t.setBerth("RE");
					BookTicket.reserve.add(t);
					BookTicket.waitingList.pollFirst();
					TicketDetails.wt--;
					
					BookTicket.idList.remove(t.getid());
					BookTicket.idList.put(t.getid(),t.getBerth());
					
				}
				else {
					TicketDetails.re--;
				}
				
			}
			else {
				System.out.println("ID : "+id +" Removed Successfully!!\n");
			
			}
		}
	}
}
