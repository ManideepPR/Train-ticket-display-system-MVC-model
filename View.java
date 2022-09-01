import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class View extends JFrame implements ActionListener 
{
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4,t5;
	JButton submit,show;
	JTextArea screen;
	
	View()
	{
		setTitle("Train details");
		setSize(700,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		l1=new JLabel("Train Name");
		l1.setBounds(20,50,100,20);
		c.add(l1);
		
		t1=new JTextField();
		t1.setBounds(130,50,100,20);
		c.add(t1);
		
		l2=new JLabel("Ticket Price");
		l2.setBounds(20,100,100,20);
		c.add(l2);
		
		t2=new JTextField();
		t2.setBounds(130,100,100,20);
		c.add(t2);
		
		l3=new JLabel("Ticket Number");
		l3.setBounds(20,150,100,20);
		c.add(l3);
		
		t3=new JTextField();
		t3.setBounds(130,150,100,20);
		c.add(t3);
		
		l4=new JLabel("Coach");
		l4.setBounds(20,200,100,20);
		c.add(l4);
		
		t4=new JTextField();
		t4.setBounds(130,200,100,20);
		c.add(t4);
		
		l5=new JLabel("Destination");
		l5.setBounds(20,250,100,20);
		c.add(l5);
		
		t5=new JTextField();
		t5.setBounds(130,250,100,20);
		c.add(t5);
		
		submit=new JButton("Enter");
		submit.setBounds(100,300,100,20);
		c.add(submit);
		
		//submit.addActionListener(this);
		
		show=new JButton("Display");
		show.setBounds(300,10,100,20);
		c.add(show);
		
		show.addActionListener(this);
		
		screen = new JTextArea();
		screen.setBounds(300,30,300,300);
		c.add(screen);
		
		setVisible(true);
	}
	
	
		public String gettrainnamee()
		{
		return t1.getText();
		}
		public String gettrainpricee()
		{
		return t2.getText();
		}
		public String getrainticket_noo()
		{
		return t3.getText();
		}
		public String gettraincoachh()
		{
		return t4.getText();
		}
		public String gettraindestinationn()
		{
		return t5.getText();
		}
	
	
	void submitListener(ActionListener listenerForSubmit)
	{
		submit.addActionListener(listenerForSubmit);
	}
	
	public void show1(String s,String n,String t, String c, String d)
	{
		screen.setText("Train Name: "+ s +"\n"+"Ticket price "+n+"\n"+"Ticket_no: "+t+ "\n"+"Coach: "+c+"\n"+"Destination: "+d);
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		String train_name=t1.getText();
			
		String price=t2.getText();
		
		String ticket_no=t3.getText();
		
		String coach=t4.getText();
		
		String des=t5.getText();
		show1(train_name,price,ticket_no,coach,des);
	}
	
}

