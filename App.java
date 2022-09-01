import java.awt.Desktop;  
import java.io.*;

import java.io.FileWriter;
public class App {
    
    public static void main(String[] args) {
    	
    	View theView = new View();
    
    	Model theModel = new Model();
        
        Controller theController = new Controller(theView,theModel);
		
		theView.setVisible(true);

		try{    
           FileWriter fw=new FileWriter("db.txt");    
		   String m = theController.addd(theView);
              theModel.addtrain(m,fw);
          }catch(Exception e){System.out.println(e);}     
		  
	String s1=" ";
	String s2=theView.gettrainnamee();
	String s3=theView.gettrainpricee();
	
	String s4=theView.getrainticket_noo();
	String s5=theView.gettraincoachh();
	String s6=theView.gettraindestinationn();
	s1=s2+s3+s4+s5+s6;
	System.out.println(s1);
			
		
		
		
	
        
    }
}