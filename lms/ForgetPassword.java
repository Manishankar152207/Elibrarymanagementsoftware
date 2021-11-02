package lms;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class ForgetPassword extends Frame implements ActionListener
{
Connection con;
ResultSet rec;
Statement st;
PreparedStatement pst;
String a1,a2;
Label l1,l2,l3,l4,l5,l6,lbler;
Button b1,b2,b3;
TextField t1,t2;
Frame frm;
 public ForgetPassword()
 {
 l1=new Label("Enter User ID:");
 l2=new Label("Your Security Question:");
 l5=new Label(".........................");
 l3=new Label("Give Answer:");
 l4=new Label("Your Password:");
 l6=new Label(".........................");
 lbler=new Label("");

 t1=new TextField();
 t2=new TextField();

 b1=new Button("OK");
 b1.addActionListener(this);
 b2=new Button("Retrive");
 b2.addActionListener(this);
 b3=new Button("Exit");
 b3.addActionListener(this);

 frm=new Frame("Forget Password");
 }
public void setUpForgetPassword()
 {
 frm.setLayout(null);
 frm.setSize(700,500);
 lbler.setBounds(100,215,200,25);
 l1.setBounds(100,100,200,25);
 t1.setBounds(300,100,200,25);

 l2.setBounds(100,130,200,25);
 l5.setBounds(300,130,200,25);

 l3.setBounds(100,160,200,25);
 t2.setBounds(300,160,200,25);

 l4.setBounds(100,190,200,25);
 l6.setBounds(300,190,200,25);
 
 b1.setBounds(525,100,50,25);
 b2.setBounds(525,160,50,25);
 b3.setBounds(525,250,50,25);

 frm.add(l1);
 frm.add(l2);
 frm.add(l3);
 frm.add(l4);
 frm.add(l5);
 frm.add(l6);
 frm.add(lbler);

 frm.add(t1);
 frm.add(t2);
 
 frm.add(b1);
 frm.add(b2);
 frm.add(b3);
 
 frm.setBackground(Color.gray); 
 frm.setVisible(true);
 }
public void getData()
{
a1=t1.getText();
a2=t2.getText();
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
l5.setText(rec.getString(4));
}
else
{
l1.setText("Invalid UserId!");
}
}
catch(Exception ex)
{
System.out.println(ex);
}
}
public void showPass()
{
try
{
connect();
st=con.createStatement();
String str1=t1.getText();
String str=t2.getText();
rec=st.executeQuery("select * from CreateAcc where userid='"+str1+"' and ans='"+str+"'");
while(rec.next())
{
l6.setText(rec.getString(2));
}
}
catch(Exception ex)
{
System.out.println(ex);
}
}

public void actionPerformed(ActionEvent ae)
 {
 if(ae.getSource()==b3)
  {
 System.exit(0);
  }
 else if(ae.getSource()==b1)
  {
  connect();
  searchUserID();
  }
 else if(ae.getSource()==b2)
  {
  connect();
  showPass();
  }
 }
}
 