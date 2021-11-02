package lms;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class ChangePassword extends Frame implements ActionListener
{
Connection con;
ResultSet rec;
Statement st;
PreparedStatement pst;
String a1,a2,a3,a4;
Label l1,l2,l3,l4,lbler;
Button b1,b2;
TextField t1,t2,t3,t4;
Frame frm;
 public ChangePassword()
 {
 l1=new Label("Enter User ID:");
 l2=new Label("Enter password:");
 l3=new Label("New Password:");
 l4=new Label("Re-Enter New Password:");
 lbler=new Label("");
 
 t1=new TextField();
 t2=new TextField();
 t3=new TextField();
 t4=new TextField();

 b1=new Button("Change");
 b1.addActionListener(this);
 b2=new Button("Close");
 b2.addActionListener(this);

 frm=new Frame("Change Password");
 }
public void setUpChangePassword()
 {
 frm.setLayout(null);
 frm.setSize(700,700);
 lbler.setBounds(100,240,200,25);
 l1.setBounds(100,100,200,25);
 t1.setBounds(300,100,200,25);

 l2.setBounds(100,130,200,25);
 t2.setBounds(300,130,200,25);

 l3.setBounds(100,160,200,25);
 t3.setBounds(300,160,200,25);

 l4.setBounds(100,190,200,25);
 t4.setBounds(300,190,200,25);
 
 b1.setBounds(300,270,100,25);
 b2.setBounds(405,270,100,25);

 frm.add(l1);
 frm.add(l2);
 frm.add(l3);
 frm.add(l4);
 frm.add(lbler);

 frm.add(t1);
 frm.add(t2);
 frm.add(t3);
 frm.add(t4);
 

 frm.add(b1);
 frm.add(b2);
 
 frm.setBackground(Color.gray); 
 frm.setVisible(true);
 }
 public void getData()
{
a1=t1.getText();
a2=t2.getText();
a3=t3.getText();
a4=t4.getText();
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
public void showUpdate()
{
try
{
getData();
pst=con.prepareStatement("update CreateAcc set psw='"+a3+"',cpsw='"+a4+"' where userid='"+a1+"' and psw='"+a2+"'");
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
   connect();
   showUpdate();
  }
 }
}
 