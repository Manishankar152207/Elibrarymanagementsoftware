package lms;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class AddNewBook extends Frame implements ActionListener
{
Connection con;
ResultSet rec;
Statement st;
PreparedStatement pst;
String a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
Label l1,l2,l3,l4,l5,l6,l7,l8,lbler;
Button b1,b2;
TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
Frame frm;
 public AddNewBook()
 {
 l1=new Label("Book number:");
 l2=new Label("Title:");
 l3=new Label("Author's Name:");
 l4=new Label("Publiction:");
 l5=new Label("Number of pages:");
 l6=new Label("Purchase Date:");
 l7=new Label("Department:");
 l8=new Label("Status:");
 lbler=new Label("");
 
 t1=new TextField();
 t2=new TextField();
 t3=new TextField();
 t4=new TextField();
 t5=new TextField();
 t6=new TextField();
 t7=new TextField();
 t8=new TextField();
 t9=new TextField();
 t10=new TextField();
 
 b1=new Button("Save");
 b1.addActionListener(this);
 b2=new Button("Close");
 b2.addActionListener(this);

 frm=new Frame("Add New Book Details:");
 }
public void setUpAddNewBook()
 {
 frm.setLayout(null);
 frm.setSize(700,800);
 lbler.setBounds(100,350,200,25);
 l1.setBounds(100,100,200,25);
 t1.setBounds(300,100,200,25);

 l2.setBounds(100,130,200,25);
 t2.setBounds(300,130,200,25);

 l3.setBounds(100,160,200,25);
 t3.setBounds(300,160,200,25);

 l4.setBounds(100,190,200,25);
 t4.setBounds(300,190,200,25);

 l5.setBounds(100,220,200,25);
 t5.setBounds(300,220,200,25);
 
 l6.setBounds(100,250,200,25);
 t6.setBounds(300,250,66,25);
 t9.setBounds(366,250,66,25);
 t10.setBounds(432,250,68,25);

 l7.setBounds(100,280,200,25);
 t7.setBounds(300,280,200,25);

 l8.setBounds(100,310,200,25);
 t8.setBounds(300,310,200,25);

 b1.setBounds(300,400,100,25);
 b2.setBounds(400,400,100,25);

 frm.add(l1);
 frm.add(l2);
 frm.add(l3);
 frm.add(l4);
 frm.add(l5);
 frm.add(l6);
 frm.add(l7);
 frm.add(l8);
 frm.add(lbler);

 frm.add(t1);
 frm.add(t2);
 frm.add(t3);
 frm.add(t4);
 frm.add(t5);
 frm.add(t6);
 frm.add(t7);
 frm.add(t8);
 frm.add(t9);
 frm.add(t10);

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
a5=t5.getText();
a6=t6.getText();
a7=t7.getText();
a8=t8.getText();
a9=t9.getText();
a10=t10.getText();
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

public void searchBookID()
{
try
{
connect();
st=con.createStatement();
String str=t1.getText();
rec=st.executeQuery("select * from AddnewBook where bookno='"+str+"'");
if(rec.next())
{
lbler.setText("Book alredy Exit!");
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
pst=con.prepareStatement("insert into addNewBook values('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"','"+a6+"','"+a7+"','"+a8+"','"+a9+"','"+a10+"')");
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
  if(a1.equals("")||a2.equals("")||a3.equals("")||a4.equals("")||a5.equals("")||a6.equals("")||a7.equals("")||a8.equals("")||a9.equals("")||a10.equals(""))
   {
   lbler.setText("Please Fill all the Enteries.");
   }
  else 
   {
   connect();
   searchBookID();
   }
  }
 }

}
 