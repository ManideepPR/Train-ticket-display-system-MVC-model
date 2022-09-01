import java.awt.Desktop;  
import java.io.*;

import java.io.FileWriter;

public class Model {
	private String trainname;
	private Integer price;
	private String ticket_no;
	private String coach;
	private String destination;
	
	    
    
	   
	//FileWriter fw = new FileWriter(db.txt);
	
	public void addtrain(String s,FileWriter fw)
	{
		try
		{
		fw.write("s\n");
		}
		catch(Exception e)
		{System.out.println(e);}
	}
	
public String gettrainname() {
  return trainname;
 }
 public void settrainname(String trainname) {
  this.trainname = trainname;
 }
 
 public int getprice() {
  return price;
 }
 public void setprice(int price) {
  this.price = price;
 }
 
 public String getticket_no() {
  return ticket_no;
 }
 public void setticket_no(String ticket_no) {
  this.ticket_no = ticket_no;
 }
 
 public String getcoach() {
  return coach;
 }
 public void setcoach(String coach) {
  this.coach = coach;
 }
 public String getdestination() {
	  return destination;
}
public void setdestination(String destination) {
	  this.destination = destination;

}
	
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
