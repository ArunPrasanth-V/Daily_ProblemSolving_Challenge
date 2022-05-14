package RailwayTicketBookingApplication
;

public class Ticket {
  private int id;
  private String name;
  private int age;
  private String berth;
  
  Ticket(int id,String name,int age,String berth){
	  this.id=id;
	  this.name=name;
	  this.age=age;
	  this.berth=berth;
  }
  
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBerth() {
	return berth;
}
public void setBerth(String berth) {
	this.berth = berth;
}

@Override
public String toString() {
	return "ID= " + id + ", Name=" + name + ", Age=" + age + ", Berth=" + berth;
}
}
