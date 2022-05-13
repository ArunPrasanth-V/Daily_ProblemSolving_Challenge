package TaxiBookingApplication;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
public class BookTicket {
	static Map<Integer,String> idList=new HashMap<>();
	static LinkedList<BookedTicket> Upper=new LinkedList<BookedTicket>();
	static LinkedList<BookedTicket> middle=new LinkedList<BookedTicket>();
	static LinkedList<BookedTicket> lower=new LinkedList<BookedTicket>();
	static LinkedList<BookedTicket> reserve=new LinkedList<BookedTicket>();
	static LinkedList<BookedTicket> waitingList=new LinkedList<BookedTicket>();
	
	static void add(BookedTicket ticket){
		LinkedList<BookedTicket> lists=checkBerth(ticket.getBerth());
		lists.add(ticket);
		idList.put(ticket.getId(),ticket.getBerth());
		
	}
	static boolean isVaidId( int id) {
		return idList.containsKey(id);
	}
	static LinkedList<BookedTicket>  getLevel(int id){
		
		return checkBerth(idList.get(id));
	}
	static LinkedList<BookedTicket> checkBerth(String ticket){
		if(ticket.equals("U")) {
			return Upper;
		}
		else if(ticket.equals("M")) {
			return middle;
		}
		else if(ticket.equals("L")) {
			return lower;
		}
		else if(ticket.equals("RE")) {
			return reserve;
		}
		else //(ticket.getBerth().equals("WL")) {
			return waitingList;
	}
	static BookedTicket getTicket(List<BookedTicket> tickets,int id) {
		BookedTicket ticket=tickets.get(0);
		for(int i=0;i<tickets.size();i++) {
			ticket=tickets.get(i);
			if(ticket.getid() == id)
				  break;
		}
		return ticket;
	}
}
