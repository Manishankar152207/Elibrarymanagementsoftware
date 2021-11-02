package lms;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class BookIssued extends Frame implements ActionListener,ItemListener
{
Connection con;
ResultSet rec;
Statement st;
PreparedStatement pst;
String a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,b16,c16,a17,a18,a19,a20,a21,a22,a23,a24;
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,lbler;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
TextField t2,t3,t4,t5,t6,t7,t8,t9,t10,t12,t13,t14,t15,t16,t17,t18,n16,m16;
Choice c1,c4,c5,c6,c7,c8,c9,c11;
Frame frm;
 public BookIssued()
 {
 l1=new Label("Roll no:");
 l2=new Label("Name:");
 l3=new Label("Father Name:");
 l4=new Label("Course:");
 l5=new Label("Branch:");
 l6=new Label("Semester:");
 l7=new Label("Session Start:");
 l8=new Label("Session End:");
 l9=new Label("Department:");
 l10=new Label("Status:");
 l11=new Label("Book number:");
 l12=new Label("Title:");
 l13=new Label("Author's Name:");
 l14=new Label("Publiction:");
 l15=new Label("Number of pages:");
 l16=new Label("Purchase Date:");
 l17=new Label("Department:");
 l18=new Label("Status:");
 l19=new Label("Issue Date:");
 l20=new Label("Return Date:");
 lbler=new Label("aaaaaaaaaaa");

 c1=new Choice();
 c1.addItemListener(this);
 t2=new TextField();
 t3=new TextField();
 t4=new TextField();
 t5=new TextField();
 t6=new TextField();
 t7=new TextField();
 t8=new TextField();
 t9=new TextField();
 t10=new TextField();
 c11=new Choice();
 c11.addItemListener(this);
 t12=new TextField();
 t13=new TextField();
 t14=new TextField();
 t15=new TextField();
 t16=new TextField();
 n16=new TextField();
 m16=new TextField();
 t17=new TextField();
 t18=new TextField();

c4=new Choice();
c5=new Choice();
c6=new Choice();
c7=new Choice();
c8=new Choice();
c9=new Choice();
 
 b1=new Button("Save");
 b1.addActionListener(this);

 b2=new Button("Close");
 b2.addActionListener(this);

 b3=new Button("Add New Book");
 b3.addActionListener(this);

 b4=new Button("Add New Student");
 b4.addActionListener(this);

 b5=new Button("Update Book");
 b5.addActionListener(this);

 b6=new Button("Update Student");
 b6.addActionListener(this);

 b7=new Button("Return Book");
 b7.addActionListener(this);

 b8=new Button("Creat Account");
 b8.addActionListener(this);

 b9=new Button("Exit");
 b9.addActionListener(this);


 frm=new Frame("Book Issued details:");
 }
public void setUpBookIssued()
 {
 frm.setLayout(null);
 frm.setSize(1000,1600);
 lbler.setBounds(200,70,200,25);
 l1.setBounds(100,100,200,25);
 c1.setBounds(300,100,200,25);

 l2.setBounds(100,130,200,25);
 t2.setBounds(300,130,200,25);

 l3.setBounds(100,160,200,25);
 t3.setBounds(300,160,200,25);

 l4.setBounds(100,190,200,25);
 t4.setBounds(300,190,200,25);

 l5.setBounds(100,220,200,25);
 t5.setBounds(300,220,200,25);
 
 l6.setBounds(100,250,200,25);
 t6.setBounds(300,250,200,25);

 l7.setBounds(100,280,200,25);
 t7.setBounds(300,280,200,25);

 l8.setBounds(100,310,200,25);
 t8.setBounds(300,310,200,25);

 l9.setBounds(100,340,200,25);
 t9.setBounds(300,340,200,25);


 l10.setBounds(100,370,200,25);
 t10.setBounds(300,370,200,25);

 l11.setBounds(700,100,200,25);
 c11.setBounds(900,100,200,25);

 l12.setBounds(700,130,200,25);
 t12.setBounds(900,130,200,25);

 l13.setBounds(700,160,200,25);
 t13.setBounds(900,160,200,25);

 l14.setBounds(700,190,200,25);
 t14.setBounds(900,190,200,25);


 l15.setBounds(700,220,200,25);
 t15.setBounds(900,220,200,25);
 
 l16.setBounds(700,250,200,25);
 t16.setBounds(900,250,66,25);
 n16.setBounds(966,250,66,25);
 m16.setBounds(1032,250,68,25);
 
 l17.setBounds(700,280,200,25);
 t17.setBounds(900,280,200,25);

 l18.setBounds(700,310,200,25);
 t18.setBounds(900,310,200,25);

 l19.setBounds(700,340,200,25);
 c4.setBounds(900,340,66,25);
 c5.setBounds(966,340,66,25);
 c6.setBounds(1032,340,68,25);
 
 l20.setBounds(700,370,200,25);
 c7.setBounds(900,370,66,25);
 c8.setBounds(966,370,66,25);
 c9.setBounds(1032,370,68,25);
 
 
 b1.setBounds(500,500,100,25);
 b2.setBounds(600,500,100,25);
 b3.setBounds(1250,100,100,25);
 b4.setBounds(1250,145,100,25);
 b5.setBounds(1250,190,100,25);
 b6.setBounds(1250,235,100,25);
 b7.setBounds(1250,280,100,25);
 b8.setBounds(1250,325,100,25);
 b9.setBounds(1250,370,100,25);

 frm.add(l1);
 frm.add(l2);
 frm.add(l3);
 frm.add(l4);
 frm.add(l5);
 frm.add(l6);
 frm.add(l7);
 frm.add(l8);
 frm.add(l9);
 frm.add(l10);
 frm.add(l11);
 frm.add(l12);
 frm.add(l13);
 frm.add(l14);
 frm.add(l15);
 frm.add(l16);
 frm.add(l17);
 frm.add(l18);
 frm.add(l19);
 frm.add(l20);
 frm.add(lbler);

 frm.add(c1);
 frm.add(c4);
 frm.add(c5);
 frm.add(c6);
 frm.add(c7);
 frm.add(c8);
 frm.add(c9);
 frm.add(t2);
 frm.add(t3);
 frm.add(t4);
 frm.add(t5);
 frm.add(t6);
 frm.add(t7);
 frm.add(t8);
 frm.add(t9);
 frm.add(t10);
 frm.add(c11);
 frm.add(t12);
 frm.add(t13);
 frm.add(t14);
 frm.add(t15);
 frm.add(t16);
 frm.add(n16);
 frm.add(m16);
 frm.add(t17);
 frm.add(t18);
 

 frm.add(b1);
 frm.add(b2);
 frm.add(b3);
 frm.add(b4);
 frm.add(b5);
 frm.add(b6);
 frm.add(b7);
 frm.add(b8);
 frm.add(b9);
 
 frm.setBackground(Color.gray); 
for(int i=1;i<=30;i++)
{
c4.addItem(""+i);
}
for(int i=1;i<=12;i++)
{
c5.addItem(""+i);
}
for(int i=2020;i<=2050;i++)
{
c6.addItem(""+i);
}
for(int i=1;i<=30;i++)
{
c7.addItem(""+i);
}
for(int i=1;i<=12;i++)
{
c8.addItem(""+i);
}
for(int i=2020;i<=2050;i++)
{
c9.addItem(""+i);
}
 connect();
 addStsID(); 
 addBookID();

 frm.setVisible(true);
 }
public void getData()
{
a1=c1.getSelectedItem();
a2=t2.getText();
a3=t3.getText();
a4=t4.getText();
a5=t5.getText();
a6=t6.getText();
a7=t7.getText();
a8=t8.getText();
a9=t9.getText();
a10=t10.getText();

a11=c11.getSelectedItem();
a12=t12.getText();
a13=t13.getText();
a14=t14.getText();
a15=t15.getText();
a16=t16.getText();
b16=n16.getText();
c16=m16.getText();
a17=t17.getText();
a18=t18.getText();
a19=c4.getSelectedItem();
a20=c5.getSelectedItem();
a21=c6.getSelectedItem();
a22=c7.getSelectedItem();
a23=c8.getSelectedItem();
a24=c9.getSelectedItem();



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

public void putData()
{
try
{
pst=con.prepareStatement("insert into bookissued values('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"','"+a6+"','"+a7+"','"+a8+"','"+a9+"','"+a10+"','"+a11+"','"+a12+"','"+a13+"','"+a14+"','"+a15+"','"+a16+"','"+b16+"','"+c16+"','"+a17+"','"+a18+"','"+a19+"','"+a20+"','"+a21+"','"+a22+"','"+a23+"','"+a24+"')");
pst.executeUpdate();
}
catch(SQLException se)
 {
 System.out.println(se);
 }
}


public void addStsID()
{
try
{
connect();
st=con.createStatement();
rec=st.executeQuery("select * from AddNewSts");
while(rec.next())
{
c1.addItem(rec.getString(1));
}
}
catch(Exception ex)
{
System.out.println(ex);
}
}
public void showStsDetail()
{
try
{
connect();
st=con.createStatement();
String stuid=c1.getSelectedItem();
rec=st.executeQuery("select * from AddNewSts where rollno='"+stuid+"'");
while(rec.next())
{
t2.setText(rec.getString(2));
t3.setText(rec.getString(3));
t4.setText(rec.getString(4));
t5.setText(rec.getString(5));
t6.setText(rec.getString(6));
t7.setText(rec.getString(7));
t8.setText(rec.getString(8));
t9.setText(rec.getString(9));
t10.setText(rec.getString(10));

}
}
catch(Exception ex)
{
System.out.println(ex);
}
}
public void addBookID()
{
try
{
connect();
st=con.createStatement();
String str="avail";
rec=st.executeQuery("select * from AddNewBook where status='"+str+"'");
while(rec.next())
{
c11.addItem(rec.getString(1));
}
}
catch(Exception ex)
{
System.out.println(ex);
}
}
public void showBookDetail()
{
try
{
connect();
st=con.createStatement();
String bookid=c11.getSelectedItem();
rec=st.executeQuery("select * from AddNewBook where bookno='"+bookid+"'");
while(rec.next())
{
t12.setText(rec.getString(2));
t13.setText(rec.getString(3));
t14.setText(rec.getString(4));
t15.setText(rec.getString(5));
t16.setText(rec.getString(6));
n16.setText(rec.getString(7));
m16.setText(rec.getString(8));
t17.setText(rec.getString(9));
t18.setText(rec.getString(10));
}
}
catch(Exception ex)
{
System.out.println(ex);
}
}

public void showStatus()
{
try
{
String s1="iss";
String bookid=c11.getSelectedItem();
pst=con.prepareStatement("update AddNewBook set status='"+s1+"' where bookno='"+bookid+"'");
pst.executeUpdate();
}
catch(Exception ex)
{
System.out.println(ex);
}
}



public void itemStateChanged(ItemEvent ie)
{
 if(ie.getSource()==c1)
  {
  showStsDetail();
  }
 else if(ie.getSource()==c11)
  {
  showBookDetail();
  }
}
public void actionPerformed(ActionEvent ae)
 {
 if(ae.getSource()==b2)
  {
  frm.setVisible(false);
  }
 else if(ae.getSource()==b3)
  {
  AddNewBook ob=new AddNewBook();
  ob.setUpAddNewBook();
  }
 else if(ae.getSource()==b4)
  {
  AddNewSts ob=new AddNewSts();
  ob.setUpAddNewSts();
  }
  else if(ae.getSource()==b5)
  {
  UpdateNewBook ob=new UpdateNewBook();
  ob.setUpUpdateNewBook();
  }
  else if(ae.getSource()==b6)
  {
  UpdateStsDetail ob=new UpdateStsDetail();
  ob.setUpUpdateStsDetail();
  }
  else if(ae.getSource()==b7)
  {
  BookReturn ob=new BookReturn ();
  ob.setUpBookReturn();
  }
  else if(ae.getSource()==b8)
  {
  CreateAcc ob=new CreateAcc();
  ob.setUpCreateAcc();
  }
  else if(ae.getSource()==b9)
  {
  System.exit(0);
  }
  else if(ae.getSource()==b1)
  {
  getData();
  if(a1.equals("")||a2.equals("")||a3.equals("")||a4.equals("")||a5.equals("")||a6.equals("")||a7.equals("")||a8.equals("")||a9.equals("")||a10.equals("")||a11.equals("")||a12.equals("")||a13.equals("")||a14.equals("")||a15.equals("")||a16.equals("")||b16.equals("")||c16.equals("")||a17.equals("")||a18.equals("")||a19.equals("")||a20.equals("")||a21.equals("")||a22.equals("")||a23.equals("")||a24.equals(""))
   {
   lbler.setText("Please Fill all the Enteries.");
   }
  else 
   {
   connect();
   putData();
   showStatus();
   lbler.setText("All Enteries are successfully filled.");
   }
  }
 }
}
 