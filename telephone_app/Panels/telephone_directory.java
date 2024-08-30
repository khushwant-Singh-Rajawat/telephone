package telephone_app.Panels;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import kush.models.Mylib;

public class telephone_directory extends JFrame
{
    CardLayout cl1;
    CardLayout cl2;
    
    MenuBar bar;
    MenuItem m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11;
    Menu f1,f2,f3,f4;
    
    Container CT;
    
    Panel welcome;
    
    AdminReg ar;
    Homepage p1;
    Login p2;
    
    RegForm1 rg;
    RegUpdate up;
    
    AdminUpdate au;
    Show so;
	
    SearchBy  s1;
    SearchBy1 s2;
    SearchBy2 s3;
        
    public telephone_directory() {
        setSize(1000, 1000);
        setVisible(true);
        cl1=new CardLayout();
        cl2=new CardLayout();
        
        CT=getContentPane();
        bar=new MenuBar();
        f1=new Menu("Home");
        f2=new Menu("Admin");
        f3=new Menu("Customer");
        f4=new Menu("Customer");
        
        m1=new MenuItem("Go To Home");
        m2=new MenuItem("Logout");
        m3=new MenuItem("Exit");
        m4=new MenuItem("Admin Register");
        m5=new MenuItem("Admin Update");
        m6=new MenuItem("Admin Show");
        m7=new MenuItem("Register");
        m8=new MenuItem("Update");
        m9=new MenuItem("Search By Name");
        m10=new MenuItem("Search By Contact");
        m11=new MenuItem("Search By Colony");
        
        welcome=new Panel();
        p1=new Homepage();
        p2=new Login();
         
        ar=new AdminReg();
        rg=new RegForm1();
	up=new RegUpdate();
	
        au=new AdminUpdate();
	so=new Show();
		
		
	s1=new SearchBy();
        s2=new SearchBy1();
	s3=new SearchBy2();
                
        setLayout(cl1);
        welcome.setLayout(cl2);

                
        welcome.add(p1,"card1");
        welcome.add(p2,"card2");
         
        setMenuBar(bar);
        bar.add(f1);
        bar.add(f2);
        bar.add(f3);
         
        f1.add(m1);
        f1.addSeparator();
        f1.add(m2);
        f1.addSeparator();
        f1.add(m3);
         
        f2.add(m4);
        f2.addSeparator();
        f2.add(m5);
        f2.addSeparator();
        f2.add(m6);
         
        f3.add(m7);
        f3.addSeparator();
        f3.add(m8);
        f3.addSeparator();
        f3.add(m9);
        f3.addSeparator();
        f3.add(m10);
        f3.addSeparator();
        f3.add(m11);
         
	add(welcome,"wel_card");
	add(rg,"rgc");
	add(up,"upc");
	add(ar,"arc");
	add(au,"auc");
	add(so,"soc");
	add(s1,"s1c");
        add(s2,"s2c");
	add(s3,"s3c");

	m1.setEnabled(true);
	m2.setEnabled(true);
	m3.setEnabled(true);
	m4.setEnabled(true);
	m5.setEnabled(true);
	m6.setEnabled(true);
	m7.setEnabled(true);
	m8.setEnabled(true);
	m9.setEnabled(true);
	m10.setEnabled(true);
	m11.setEnabled(true);

	p2.jButton3.addActionListener(new B());
	p2.jButton2.addActionListener(new B());
	p1.jButton2.addActionListener(new B());
	p1.jButton3.addActionListener(new B());

	

	m1.addActionListener(new B());
	m2.addActionListener(new B());
	m3.addActionListener(new B());
	m4.addActionListener(new B());
	m5.addActionListener(new B());
	m6.addActionListener(new B());
	m7.addActionListener(new B());
	m8.addActionListener(new B());
	m9.addActionListener(new B());
	m10.addActionListener(new B());
	m11.addActionListener(new B());
    }
    
    class B implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		if(s.equalsIgnoreCase("Enter"))
		{
			cl2.show(welcome,"card2");
		}
		else if(s.equalsIgnoreCase("Back"))
		{
			cl2.show(welcome,"card1");
		}
		else if(s.equalsIgnoreCase("exit"))
		{
			System.exit(0);
		}
		else if(s.equalsIgnoreCase("Login"))
		{

		int n=Integer.parseInt(p2.jTextField1.getText().trim());
		String pass=p2.jTextField2.getText().trim();

		String role=check_login(n,pass);
		if(role!=null)
		{
                    p2.setVisible(false);
                    p1.setVisible(false);
                    p1.jButton2.setVisible(true);
                    p1.jButton3.setVisible(true);
				
                    if(role.equalsIgnoreCase("admin"))//student
                    {
					
			m1.setEnabled(true);
			m2.setEnabled(true);
			m3.setEnabled(true);
			m4.setEnabled(true);
			m5.setEnabled(true);
			m6.setEnabled(true);
			m7.setEnabled(true);
			m8.setEnabled(true);
			m9.setEnabled(true);
			m10.setEnabled(true);
			m11.setEnabled(true);
                    }
		}
                    else
                    {
                            JOptionPane.showMessageDialog(null,"Either username or password is incorrect");
                    }
		}
		else if(s.equalsIgnoreCase("Admin Register"))
		{
			cl1.show(CT,"arc");
		}
		else if(s.equalsIgnoreCase("Admin Update"))
		{
			cl1.show(CT,"auc");
		}
		else if(s.equalsIgnoreCase("Admin Show"))
		{
			cl1.show(CT,"soc");
		}
		
		else if(s.equalsIgnoreCase("Register"))
		{
			cl1.show(CT,"rgc");
		}
		else if(s.equalsIgnoreCase("Update"))
		{
			cl1.show(CT,"upc");
		}
		else if(s.equalsIgnoreCase("Search By Name"))
		{
			cl1.show(CT,"s2c");
		}
		
		else if(s.equalsIgnoreCase("Search By Contact"))
		{
			cl1.show(CT,"s1c");
		}
		else if(s.equalsIgnoreCase("Search By Colony"))
		{
			cl1.show(CT,"s3c");
		}
		else if(s.equalsIgnoreCase("Go To Home"))
		{
			p1.setVisible(true);
			cl1.show(CT,"wel_card");
			cl2.show(welcome,"card1");
		}
		
		else if(s.equalsIgnoreCase("Logout"))
		{
			p1.setVisible(true);
			cl1.show(CT,"wel_card");
			cl2.show(welcome,"card1");
			
			p1.jButton2.setVisible(true);
			p1.jButton3.setVisible(true);
			
			p2.jTextField2.setText("");
			

			m1.setEnabled(true);
			m2.setEnabled(true);
			m3.setEnabled(true);
			m4.setEnabled(true);
			m5.setEnabled(true);
			m6.setEnabled(true);
			m7.setEnabled(true);
			m8.setEnabled(true);
			m9.setEnabled(true);
			m10.setEnabled(true);
                        m11.setEnabled(true);
			
		}
		else if(s.equalsIgnoreCase("back"))
		{
			cl2.show(welcome,"card1");
		}
        }
    }
    public  static void main(String args[])
    {
       telephone_directory obj=new telephone_directory();
       obj.setVisible(true);
       obj.setSize(1000,1000);
    }
    private String check_login(int id, String pass) //It returns the role of user
	{
		String ans=null;
		try
		{
			Mylib obj=new Mylib();
			Connection cn=obj.createconnection();
			
                        Statement st=cn.createStatement();
			String sql="select role from logindata where id=? and password=?";
			PreparedStatement pst=cn.prepareStatement(sql);

			pst.setInt(1,id);
			pst.setString(2,pass);

			ResultSet rs=pst.executeQuery();

			if(rs.next())
			{
				ans=rs.getString(1);
			}
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,""+e);
		}
		return ans;
	}
    }