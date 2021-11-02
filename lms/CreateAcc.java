package lms;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CreateAcc extends Frame implements ActionListener
{
Connection con;
ResultSet rec;
Statement st;
PreparedStatement pst;
JLabel l1,l2,l3,l4,l5,lbler;
JButton b1,b2;
JTextField t1,t2,t3,t5;
Choice c1;
String a1,a2,a3,a4,a5;
Frame frm;
 public CreateAcc()
 {
 l1=new JLabel("Enter UserID.");
 l2=new JLabel("Enter Password.");
 l3=new JLabel("Re-Enter Password.");
 l4=new JLabel("Security Question:");
 l5=new JLabel("Answer:");
 lbler=new JLabel("");
 
 t1=new JTextField();
 t2=new JTextField();
 t3=new JTextField();
 c1=new Choice();
 t5=new JTextField();
 
 b1=new JButton("Submit");
 b2=new JButton("Close");
 b1.addActionListener(this);
 b2.addActionListener(this);

 frm=new Frame("Create an Account");
 }
public void setUpCreateAcc()
 {
 frm.setLayout(null);
 frm.setSize(700,700);
 l1.setBounds(100,100,200,25);
 t1.setBounds(300,100,200,25);

 l2.setBounds(100,160,200,25);
 t2.setBounds(300,160,200,25);

 l3.setBounds(100,220,200,25);
 t3.setBounds(300,220,200,25);

 l4.setBounds(100,280,200,25);
 c1.setBounds(300,280,200,25);

 l5.setBounds(100,340,200,25);
 t5.setBounds(300,340,200,25);

 lbler.setBounds(100,400,200,25);
 
 b1.setBounds(300,450,100,25);
 b2.setBounds(400,450,100,25);

 frm.add(l1);
 frm.add(l2);
 frm.add(l3);
 frm.add(l4);
 frm.add(l5);
 frm.add(lbler);
 
 frm.add(t1);
 frm.add(t2);
 frm.add(t3);
 frm.add(c1);
 frm.add(t5);

 frm.add(b1);
 frm.add(b2);
 c1.add("Your name!");
 c1.add("DOB");
 
 frm.setBackground(Color.gray); 
 frm.setVisible(true);
 }
public void getData()
{
a1=t1.getText();
a2=t2.getText();
a3=t3.getText();
a4=c1.getSelectedItem();
a5=t5.getText();
}
public void connect()
{
try
 {
 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 con=DriverManager.getConnection("jdbc:odbc:KMSDSN");
 }
catch(Exception ex)
 {
 System.out.println(ex);
 }
}
public void searchUserID()
{
try
{
connect();
st=con.createStatement();
String str=t1.getText();
rec=st.executeQuery("select * from CreateAcc where userid='"+str+"'");
if(rec.next())
{
lbler.setText("UserId alredy Exit!");
}
else
{
putData();
lbler.setText("All Enteries are successfully filled.");
}
}
catch(Exception ex)
{
System.out.println(ex);
}
}
public void putData()
{
try
{
pst=con.prepareStatement("insert into createAcc values('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"')");
pst.executeUpdate();
}
catch(SQLException se)
 {
 System.out.println(se);
 }
}

public void actionPerformed(ActionEvent ae)
 {
 if(ae.getSource()==b2)
  {
  frm.setVisible(false);
  }
 else if(ae.getSource()==b1)
  {
  getData();
  if(a1.equals("")||a2.equals("")||a3.equals("")||a4.equals("")||a5.equals(""))
   {
   lbler.setText("Please Fill all the Enteries.");
   }
  else 
   {
   connect();
   searchUserID();
   }
  }
 }
}
 