package lms;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
public class S extends Frame implements ActionListener
{
BufferedImage bi;
String a1,a2;
Label l1,l2,lbler;
Button b1,b2,b3,b4;
TextField t1,t2;
Frame frm;
 public S()
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
public void setUpS()
 {
 frm.setLayout(null);
 frm.setSize(800,500);
 
new bi(ImageIO.read(new File("C:\\Users\\Manees jaiswal\\Pictures\\a.jpg")));


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
 
 frm.setVisible(true);
 }

public void paint(Graphics g)
{
super.paint(g);
g.drawImage(bi,0,0,getwidth(),getHeight(),null);
}

public void getData()
{
a1=t1.getText();
a2=t2.getText();
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
  getData();
  if(a1.equals("")||a2.equals(""))
   {
   lbler.setText("Please fill all the enteries.");
   }
  else
   {
   lbler.setText("All enteries are filled successfully.");
   }
  }
 }
}
 