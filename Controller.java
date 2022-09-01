import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller 
{
	private View theView;
	private Model theModel;
	
	Controller(View theView,Model theModel)
		{
			this.theModel = theModel;
			this.theView = theView;
		}
	
	public String addd(View theView)
	{
	String s1=" ";
	String s2=theView.gettrainnamee();
	String s3=theView.gettrainpricee();
	
	String s4=theView.getrainticket_noo();
	String s5=theView.gettraincoachh();
	String s6=theView.gettraindestinationn();
	s1=s2+s3+s4+s5+s6;
	return s1;
	}
	
	
	
	//
	public void settrainname(String name)
		{
			theModel.settrainname(name);
		}
	public void settrainprice(int price)
		{
			theModel.setprice(price);
		}
	public void settrainticket_no(String tn)
		{
			theModel.setticket_no(tn);
		}
	public void settraincoach(String coach)
		{
			theModel.setcoach(coach);
		}
	public void settraindestination(String des)
		{
			theModel.setdestination(des);
		}
	
	
	public String gettrain()
		{
			return theModel.gettrainname();
		}
	public int getprice()
		{
			return theModel.getprice();
		}
	public String getticket_no()
		{
			return theModel.getticket_no();
		}
	public String getcoach()
		{
			return theModel.getcoach();
		}
	public String getdes()
		{
			return theModel.getdestination();
		}
		
		
		
	
	
	
}
