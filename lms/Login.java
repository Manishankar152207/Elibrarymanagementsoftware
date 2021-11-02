package lms;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends Frame implements ActionListener
{
Connection con;
ResultSet rec;
Statement st;
PreparedStatement pst;
String a1,a2;
Label l1,l2,lbler;
Button b1,b2,b3,b4;
TextField t1,t2;
Frame frm;
 public Login()
 {
 l1=new Label("Enter ID:");
 l2=new Label("Enter password:");
 lbler=new Label("");

 t1=new TextField();
 t2=new TextField();
 
 b1=new Button("Login");
 b1.addActionListener(this);
 b2=new Button("Exit");
 b2.addActionListener(this);
 b3=new Button("Forget password ");
 b3.addActionListener(this);
 b4=new Button("Change password");
 b4.addActionListener(this);

 frm=new Frame("Login:");
 }
public void setUpLogin()
 {
 frm.setLayout(null);
 frm.setSize(800,500);

 l1.setBounds(100,100,200,25);
 t1.setBounds(300,100,200,25);

 l2.setBounds(100,130,200,25);
 t2.setBounds(300,130,200,25);

 
 b1.setBounds(600,100,100,25);
 b2.setBounds(600,130,100,25);
 b3.setBounds(150,200,200,25);
 b4.setBounds(355,200,200,25);

 lbler.setBounds(100,160,200,25);

 frm.add(l1);
 frm.add(l2);
 frm.add(lbler);

 frm.add(t1);
 frm.add(t2);

 frm.add(b1);
 frm.add(b2);
 frm.add(b3);
 frm.add(b4);

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

public void searchData()
{
try
{
connect();
st=con.createStatement();
getData();
rec=st.executeQuery("select * from CreateAcc where userid='"+a1+"' and psw='"+a2+"'");
if(rec.next())
{
BookIssued ob=new BookIssued();
  ob.setUpBookIssued();
}
else
{
lbler.setText("Enter correct Details!");
}
}
catch(Exception ex)
{
System.out.println(ex);
}
}




public void actionPerformed(ActionEvent ae)
 {
 if(ae.getSource()==b2)
  {
  System.exit(0);
  }
 else if(ae.getSource()==b3)
  {
  ForgetPassword ob=new ForgetPassword();
  ob.setUpForgetPassword();
  }
 else if(ae.getSource()==b4)
  {
  ChangePassword ob=new ChangePassword();
  ob.setUpChangePassword();
  }
 else if(ae.getSource()==b1)
  {
   connect();
   searchData();
  }
 }
}
 