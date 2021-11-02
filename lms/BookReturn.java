package lms;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class BookReturn extends Frame implements ActionListener,ItemListener
{
Connection con;
ResultSet rec;
Statement st;
PreparedStatement pst;
String a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,b16,c16,a17,a18,a19,a20,a21,a22,a23,a24,a25,a26,a27,a28,a29,a30;
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,lbler;
Button b1,b2;
TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t12,t13,t14,t15,t16,t17,t18,t19,t20,n16,m16,c4,c5,c6,c7,c8,c9,t21,t22,t23;
Choice c1,c2,c3,c11;
Frame frm;
 public BookReturn()
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
 l21=new Label("Current Date:");
 l22=new Label("Number of days:");
 l23=new Label("Fine Amount:");
 l24=new Label("Paid Amount:");
lbler=new Label("Book Return");

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
 c1=new Choice();
 c2=new Choice();
 c3=new Choice();
 c11=new Choice();
 t12=new TextField();
 t13=new TextField();
 t14=new TextField();
 t15=new TextField();
 t16=new TextField();
 n16=new TextField();
 m16=new TextField();
 t17=new TextField();
 t18=new TextField();
 t19=new TextField();
 t20=new TextField();
 t21=new TextField();
 t22=new TextField();
 t23=new TextField();
c4=new TextField();
c5=new TextField();
c6=new TextField();
c7=new TextField();
c8=new TextField();
c9=new TextField();
 
 b1=new Button("Save");
 b1.addActionListener(this);

 b2=new Button("Close");
 b2.addActionListener(this);

 c1.addItemListener(this);
 c2.addItemListener(this);
 c11.addItemListener(this);

 frm=new Frame("Book Return details:");
 }
public void setUpBookReturn()
 {
 frm.setLayout(null);
 frm.setSize(1200,700);
 lbler.setBounds(100,450,200,25);
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

  l21.setBounds(1300,100,200,25);
  c1.setBounds(1500,100,66,25);
  c2.setBounds(1566,100,66,25);
  c3.setBounds(1632,100,68,25);


  l22.setBounds(1300,130,200,25);
  t21.setBounds(1500,130,200,25);

  l23.setBounds(1300,160,200,25);
  t22.setBounds(1500,160,200,25);

  l24.setBounds(1300,190,200,25);
  t23.setBounds(1500,190,200,25);


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
 frm.add(l21);
 frm.add(l22);
 frm.add(l23);
 frm.add(l24);
 frm.add(lbler);

 frm.add(t1);
frm.add(c1);
frm.add(c2);
frm.add(c3);
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
 frm.add(t19);
 frm.add(t20);
 frm.add(t21);
 frm.add(t22);
 frm.add(t23);

 frm.add(b1);
 frm.add(b2);
 
 frm.setBackground(Color.gray); 
for(int i=1;i<=30;i++)
{
c1.addItem(""+i);
}
for(int i=1;i<=12;i++)
{
c2.addItem(""+i);
}
for(int i=2020;i<=2050;i++)
{
c3.addItem(""+i);
}
 connect();
 addBookID();
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
a19=c4.getText();
a20=c5.getText();
a21=c6.getText();
a22=c7.getText();
a23=c8.getText();
a24=c9.getText();
a25=c1.getSelectedItem();
a26=c2.getSelectedItem();
a27=c3.getSelectedItem();
a28=t21.getText();
a29=t22.getText();
a30=t23.getText();


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
pst=con.prepareStatement("insert into bookReturn values('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"','"+a6+"','"+a7+"','"+a8+"','"+a9+"','"+a10+"','"+a11+"','"+a12+"','"+a13+"','"+a14+"','"+a15+"','"+a16+"','"+b16+"','"+c16+"','"+a17+"','"+a18+"','"+a19+"','"+a20+"','"+a21+"','"+a22+"','"+a23+"','"+a24+"','"+a25+"','"+a26+"','"+a27+"','"+a28+"','"+a29+"','"+a30+"')");
pst.executeUpdate();
}
catch(SQLException se)
 {
 System.out.println(se);
 }
}

public void addBookID()
{
try
{
connect();
st=con.createStatement();
String str="iss";
rec=st.executeQuery("select * from BookIssued where status2='"+str+"'");
while(rec.next())
{
c11.addItem(rec.getString(11));
}
}
catch(Exception ex)
{
System.out.println(ex);
}
}
public void showDetail()
{
try
{
connect();
st=con.createStatement();
String bookid=c11.getSelectedItem();
rec=st.executeQuery("select * from BookIssued where bookno='"+bookid+"'");
while(rec.next())
{
t1.setText(rec.getString(1));
t2.setText(rec.getString(2));
t3.setText(rec.getString(3));
t4.setText(rec.getString(4));
t5.setText(rec.getString(5));
t6.setText(rec.getString(6));
t7.setText(rec.getString(7));
t8.setText(rec.getString(8));
t9.setText(rec.getString(9));
t10.setText(rec.getString(10));

t12.setText(rec.getString(12));
t13.setText(rec.getString(13));
t14.setText(rec.getString(14));
t15.setText(rec.getString(15));
t16.setText(rec.getString(16));
n16.setText(rec.getString(17));
m16.setText(rec.getString(18));
t17.setText(rec.getString(19));
t18.setText(rec.getString(20));
c4.setText(rec.getString(21));
c5.setText(rec.getString(22));
c6.setText(rec.getString(23));
c7.setText(rec.getString(24));
c8.setText(rec.getString(25));
c9.setText(rec.getString(26));
}
}
catch(Exception ex)
{
System.out.println(ex);
}
}
public void days()
{
String Rd,Cd,Rm,Cm;
 Rd=c7.getText();
 Cd=c1.getSelectedItem();
 Rm=c8.getText();
 Cm=c2.getSelectedItem();
int m,n,o,p,d;
 m=Integer.parseInt(Rd);
 n=Integer.parseInt(Cd);
 o=Integer.parseInt(Rm);
 p=Integer.parseInt(Cm);
 if(o==p)
  {
  if(n>=m)
    {
    d=n-m;
    t21.setText(""+d);
    }
  else
    {
    t21.setText(""+0);
    }
  }
}
public void month()
 {
String Rd,Cd,Rm,Cm;
 Rd=c7.getText();
 Cd=c1.getSelectedItem();
 Rm=c8.getText();
 Cm=c2.getSelectedItem();
int m,n,o,p,d;
 m=Integer.parseInt(Rd);
 n=Integer.parseInt(Cd);
 o=Integer.parseInt(Rm);
 p=Integer.parseInt(Cm);

 int s=p-o;
 if(s>0)
  {
  d=(s-1)*30+30-m+n;
  t21.setText(""+d);
  }
 }
public void fineAmount()
{
String n=t21.getText();
 int A,k;
k=Integer.parseInt(n);
if(k>7)
 {
 int q=k-7;
 A=14+q*5;
 t22.setText(""+A);
 }
else
 {
 A=k*2;
 t22.setText(""+A);
 }
}
public void showAvail()
{
try
{
String s1="avail";
String bookId=c11.getSelectedItem();
pst=con.prepareStatement("update AddNewBook set status='"+s1+"' where bookno='"+bookId+"'");
pst.executeUpdate();
}
catch(SQLException se)
 {
 System.out.println(se);
 }
}
public void itemStateChanged(ItemEvent ie)
{
 if(ie.getSource()==c11)
  {
  showDetail();
  }
 if(ie.getSource()==c1||ie.getSource()==c2)
  {
  days();
  month();
  fineAmount();
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
  if(a1.equals("")||a2.equals("")||a3.equals("")||a4.equals("")||a5.equals("")||a6.equals("")||a7.equals("")||a8.equals("")||a9.equals("")||a10.equals("")||a11.equals("")||a12.equals("")||a13.equals("")||a14.equals("")||a15.equals("")||a16.equals("")||b16.equals("")||c16.equals("")||a17.equals("")||a18.equals("")||a19.equals("")||a20.equals("")||a21.equals("")||a22.equals("")||a23.equals("")||a24.equals("")||a25.equals("")||a26.equals("")||a27.equals("")||a28.equals("")||a29.equals("")||a30.equals(""))
   {
   lbler.setText("Please Fill all the Enteries.");
   }
  else 
   {
   String f=t22.getText();
   String p=t23.getText();
   if(p.equals(f))
     {
    connect();
    putData();
    showAvail();
    lbler.setText("All Enteries are successfully filled.");
     }
   else
     {
    lbler.setText("Plz check Paid Amount!");
     }
   }
  }
 }
}
 