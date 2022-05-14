package RailwayTicketBookingApplication;

import java.util.*;

public class BookedTicketDB {
	static  final int MAXSIZE=1;
	static int id=1;
	
	static int upperCount=MAXSIZE;
	static int middleCount=MAXSIZE;
	static int lowerCount=MAXSIZE;
	static int reCount=MAXSIZE;
	static int wtCount=MAXSIZE;
	
	
	static final String L="L";
	static final String M="M";
	static final String U="U";
	static final String RE="RE";
	static final String WT="WT";
	
	
	static Map<Integer,String> record=new HashMap<>();
	static LinkedList<Ticket> lower=new LinkedList<>();
	static LinkedList<Ticket> upper=new LinkedList<>();
	static LinkedList<Ticket> reserve=new LinkedList<>();
	static LinkedList<Ticket> middle=new LinkedList<>();
	static LinkedList<Ticket> waitingList=new LinkedList<>();

  static boolean checkBerthAvailable() {
	  return ((upperCount !=0 && upperCount<=MAXSIZE )|| (middleCount !=0 && middleCount<=MAXSIZE)||(lowerCount !=0 && lowerCount<=MAXSIZE)|| (reCount!=0&& reCount<=MAXSIZE)|| (wtCount!=0 && wtCount<=MAXSIZE));
  }
  
  static void showAvailableDetails() {
	 System.out.println("-----------Seat Available Details-----------");
     System.out.println("Upper Berth : "+upperCount);
     System.out.println("Middle Berth : "+middleCount);
     System.out.println("lower Berth : "+lowerCount);
     System.out.println("reserve Berth : "+reCount);
     System.out.println("WaitingList Berth : "+wtCount);
  }
  
  static String addAvailbleBerth(Ticket ticket) {
	  String berth=ticket.getBerth();
	  //check whether user enter berth is available
	  if(berth.equals(L) && lowerCount!=0 && lowerCount<=MAXSIZE)   {
		  record.put(ticket.getId(),ticket.getBerth());
		  lower.add(ticket); lowerCount--;
		  return L;
	  }
	  if(berth.equals(M) && middleCount!=0 && middleCount<=MAXSIZE) 
	  {
		  record.put(ticket.getId(),ticket.getBerth());
		  middle.add(ticket); middleCount --; 
		  return M;
	  } 
	  if(berth.equals(U) && upperCount!=0 && upperCount<=MAXSIZE)   {
		  record.put(ticket.getId(),ticket.getBerth());
		  upper.add(ticket); upperCount --; 
		  return U;
	  }
	 
	 //expected berth is not available so give available berth
	  if(lowerCount!=0 && lowerCount<=MAXSIZE)   {
		  ticket.setBerth(L);
		  record.put(ticket.getId(),ticket.getBerth());
		  lower.add(ticket); lowerCount--;
		  return L;
	  }
	  if(middleCount!=0 && middleCount<=MAXSIZE) 
	  {
		  ticket.setBerth(M);
		  record.put(ticket.getId(),ticket.getBerth());
		  middle.add(ticket); middleCount --; 
		  return M;
	  }
	  if(upperCount!=0 && upperCount<=MAXSIZE)   {
		  ticket.setBerth(U);
		  record.put(ticket.getId(),ticket.getBerth());
		  upper.add(ticket); upperCount --; 
		  return U;
	  }
	  if(reCount!=0 && reCount<=MAXSIZE){
		  ticket.setBerth(RE);
		  record.put(ticket.getId(),ticket.getBerth());
		  reserve.add(ticket); reCount --; 
		  return RE;
	  }
	  
	  ticket.setBerth(WT);
	  record.put(ticket.getId(),ticket.getBerth());
	  waitingList.add(ticket);
	  wtCount--;
	  return WT;
  }
  
  static void printAllTicket() {
	  printTicket("Upper",upper);
	  printTicket("Middle",middle);
	  printTicket("Lower",lower);
	  printTicket("Reverve",reserve);
	  printTicket("Waiting List",waitingList);
  }
  private static void printTicket(String berth,LinkedList<Ticket> tickets) {
	  if(tickets.size()==0) return;
	  System.out.println("-----------"+berth+" Berth-----------");
	  for (Ticket ticket : tickets) 
	  {
		  System.out.println(ticket+" Seats");
	  }
	  
  }
  
  static boolean isValidID(int id)
  {
	  return record.containsKey(id);
  }
  
  static void cancelTicket(int id) {
	  String berth=record.get(id);
	  if(berth.equals(L)) {
		  deteleTicket(lower,id);
		  record.remove(id);
		  lowerCount++;
		  return ;
	  }
	  if(berth.equals(U)) {
		  deteleTicket(upper,id);
		  record.remove(id);
		  upperCount++;
		  return;
	  }
	  if(berth.equals(M)) {
		  deteleTicket(middle,id);
		  record.remove(id);
		  middleCount++;
		  return;
	  }
	  if(berth.equals(RE)) {
		  deteleTicket(reserve,id);
		  record.remove(id);
		  reCount++;
		  return;
	  }
	  if(berth.equals(WT)) {
		  deteleTicket(waitingList,id);
		  record.remove(id);
		  wtCount++;
		  return;
	  }
  }
  private static void deteleTicket(LinkedList<Ticket> tickets,int id) {
	  for (Ticket ticket : tickets) 
	  {
		  if(ticket.getId()==id) {
		  tickets.remove(ticket);
		  break;
		 }
	  }
  }
  
   static void allocateBerth() {
	  if(reserve.size()==0)
		  return;
	  Ticket object=reserve.poll();
	  cancelTicket(object.getId());
	  String berth=addAvailbleBerth(object);
	  System.out.println(object.getId()+" got berth in "+berth);
	  if(waitingList.size()==0)
		  return;
	  Ticket object2=waitingList.poll();
	   cancelTicket(object2.getId());
	   addAvailbleBerth(object2);
	  
  }
}
