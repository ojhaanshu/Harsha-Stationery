package harshastationery;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java .awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
public class Myprofile extends JFrame implements ActionListener{
    
    
    @SuppressWarnings("empty-statement")
            
    JButton close;
    JButton searchbtn;
    JButton updatebtn;
    JButton deletebtn;
    JButton addbtn;
    JButton resetbtn;
   
    
    Myprofile(){
    Font f2 = new Font("alegreya black",Font.BOLD,19); 
    Font f1 = new Font("alegreya black",Font.BOLD,22);   
    Font lf = new Font("alegreya black",Font.BOLD,25);
    ImageIcon closeimg = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\close1.png");
    ImageIcon sidepic = (new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\addcustomer.png"));
    
    //frame background
    JPanel jp = new JPanel();
    jp.setLayout(null);
    jp.setBounds(0,0,1100,600);
    jp.setBackground(Color.WHITE);
    
    
    //upper close panel
    JPanel closepanel = new JPanel();
    closepanel.setLayout(null);
    closepanel.setBounds(0,0,880,30);
    closepanel.setBackground(new Color(0,0,0));
    jp.add(closepanel);
    
    //upper close button
    close = new JButton();
    close.setBounds(850,0,30,30);
    close.setIcon(closeimg);
    close.setFocusable(false);
    close.addActionListener(this);
    closepanel.add(close);
    
    //action buttons
    
     JSeparator line1 =new  JSeparator();
    //line.setPreferredSize(new Dimension(390,8));
    line1.setBounds(25,42,280,20);
    line1.setForeground(Color.BLACK);
    jp.add(line1);
    
    //main detail filling area
    JLabel logol= new JLabel();
    logol.setText("          My Profile");
    logol.setFont(lf);
    logol.setLayout(null);
    logol.setBounds(25, 47, 500, 30);
    
    jp.add(logol);
    
     //side image 
    JLabel sideimg = new JLabel();
    sideimg.setBounds(0,38,360,360);
    sideimg.setIcon(sidepic);
    jp.add(sideimg);
    
    JSeparator line2 =new  JSeparator();
    //line.setPreferredSize(new Dimension(390,8));
    line2.setBounds(25,90,280,20);
    line2.setForeground(Color.BLACK);
    jp.add(line2);
    
    //detail filling panel
    JPanel cp = new JPanel();
    cp.setLayout(new FlowLayout(FlowLayout.LEADING,13,22));
    cp.setBounds(350,45,500,320);
    cp.setBackground( new Color(0,0,0));
    jp.add(cp);
    
  
    //customer details panel
    JLabel customerID = new JLabel("Shop Name  : ");
    customerID.setBounds(30,20,190,50);
    customerID.setFont(f1);
    customerID.setBackground(Color.BLACK);
    customerID.setForeground(Color.GRAY);
    cp.add(customerID);
    
    JLabel shopname = new JLabel(" Harsha Stationery And Xerox ");
    shopname.setBounds(30,20,190,50);
    shopname.setFont(f1);
   shopname.setBackground(Color.black);
    shopname.setForeground(Color.WHITE);
    cp.add(shopname);
    
     
    
    JLabel addr = new JLabel("Address  : ");
    addr.setBounds(0,0,0,0);
    addr.setFont(f1);
   // addr.setBackground(Color.red);
    addr.setForeground(Color.GRAY);
    cp.add(addr);
    
     JLabel addrvalue = new JLabel(" Tembi Naka , Thane Vachanalaya ");
    addrvalue.setBounds(0,0,0,0);
    addrvalue.setFont(f2);
    //addrvalue.setBackground(Color.red);
    addrvalue.setForeground(Color.WHITE);
    cp.add(addrvalue);
    
    JLabel addrvalue2 = new JLabel("                          Bldg. Shop No:4  Thane(west).");
    addrvalue2.setBounds(0,0,0,0);
    addrvalue2.setFont(f2);
    addrvalue2.setBackground(Color.red);
    addrvalue2.setForeground(Color.WHITE);
    cp.add(addrvalue2);
    
    
    
     JLabel email = new JLabel("Email id  : ");
    email.setBounds(60,40,0,0);
    email.setFont(f1);
    email.setBackground(Color.black);
    email.setForeground(Color.GRAY);
    cp.add(email);
    
    JLabel emailvalue = new JLabel(" rpenterprise99@gmail.com");
    emailvalue.setBounds(60,40,0,0);
    emailvalue.setFont(f1);
    emailvalue.setBackground(Color.black);
    emailvalue.setForeground(Color.WHITE);
    cp.add(emailvalue);
    
    JLabel num = new JLabel("Phone Number  : ");
     num.setBounds(60,40,0,0);
     num.setFont(f1);
     num.setBackground(Color.black);
     num.setForeground(Color.GRAY);
    cp.add( num);
    
    JLabel numvalue = new JLabel(" 7900004323                     ");
     numvalue.setBounds(60,40,0,0);
     numvalue.setFont(f1);
     numvalue.setBackground(Color.black);
     numvalue.setForeground(Color.WHITE);
    cp.add( numvalue);
        

    
    
   
    JLabel surname = new JLabel("GST ID  : ");
    surname.setBounds(30,105,150,60);
    surname.setFont(f1);
    surname.setBackground(Color.black);
    surname.setForeground(Color.GRAY);
    cp.add(surname);
    
    JLabel gstvalue = new JLabel("27ACDPW7090D1ZC ");
    gstvalue.setBounds(30,105,150,60);
    gstvalue.setFont(f1);
    gstvalue.setBackground(Color.black);
    gstvalue.setForeground(Color.WHITE);
    cp.add(gstvalue);
    
    
    
   
    
    
 this .setLayout(null);
    this.setBounds(220,180,880,420);
    //this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    //this.setLocation(270,120);
    this.add(jp);
    this.setUndecorated(true);
    this.setVisible(true);
    
   
    }
  /*  public static void main(String args[]){
        new Myprofile();
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()== close){
                
                setVisible(false);
                
               
            }
        
        
        if (e.getSource() == resetbtn){
            setVisible(false);
            Customer c = new Customer();
            c.setVisible(true);
        }
        
        if(e.getSource()== updatebtn){
            updateCustomer uc = new updateCustomer();
            uc.setVisible(true);
        }
        if(e.getSource()== deletebtn){
            deleteCustomer dc = new deleteCustomer();
            dc.setVisible(true);
        }
        
        
    }

   


 }


