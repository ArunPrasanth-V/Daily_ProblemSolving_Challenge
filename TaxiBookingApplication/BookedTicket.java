package TaxiBookingApplication;

import java.util.LinkedList;
import java.util.Queue;

public class BookedTicket {
	private String name;
	private int age;
	private String berth;
	private int id;
	
	public BookedTicket(int id,String name, int age, String berth) {
		this.name = name;
		this.age = age;
		this.id=id;
		this.berth = berth;
	}
	
	public String getBerth() {
		return berth;
	}
	public int getid() {
		return id;
	}
	public void setBerth(String berth) {
		this.berth = berth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
