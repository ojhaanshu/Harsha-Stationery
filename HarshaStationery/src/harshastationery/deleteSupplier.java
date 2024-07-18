package harshastationery;

import project.ConnectionProvider;
import java.sql.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class deleteSupplier extends JFrame implements ActionListener{
    
    
    @SuppressWarnings("empty-statement")
            
            
            
    JButton close;
    JButton viewbtn;
    JButton updatebtn;
    JButton deletebtn;
    JButton addbtn;
    JButton resetbtn;
    JButton search;
    
    JTextField sidtf;
    JTextField snametf;
    JTextField emailtf;
    JTextField snumbertf;
    JTextField saddresstf;
    JTextField gsttf; 
    
    deleteSupplier(){
    Font f1 = new Font("alegreya black",Font.BOLD,22);   
    Font lf = new Font("alegreya black",Font.BOLD,25);
   ImageIcon closeimg = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\close1.png");
    ImageIcon sidepic = (new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\deletesupplier.png"));
    ImageIcon searchicon = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\find1.png");
    
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
    close.addActionListener(this);
    close.setFocusable(false);
    closepanel.add(close);
    
    
     JSeparator line1 =new  JSeparator();
    //line.setPreferredSize(new Dimension(390,8));
    line1.setBounds(25,42,280,20);
    line1.setForeground(Color.BLACK);
    jp.add(line1);
    
    
    
    //main detail filling area
    JLabel logol= new JLabel();
    logol.setText("Delete Supplier Details");
    logol.setFont(lf);
    logol.setLayout(null);
    logol.setBounds(25, 40, 500, 40);
    
    jp.add(logol);
    
    JSeparator line2 =new  JSeparator();
    //line.setPreferredSize(new Dimension(390,8));
    line2.setBounds(25,85,280,20);
    line2.setForeground(Color.BLACK);
    jp.add(line2);
    
    
    //side image 
    JLabel sideimg = new JLabel();
    sideimg.setBounds(0,38,360,360);
    sideimg.setIcon(sidepic);
    jp.add(sideimg);
    
    
    
    //detail filling panel
    JPanel cp = new JPanel();
    cp.setLayout(new FlowLayout(FlowLayout.LEADING,13,25));
    cp.setBounds(330,45,500,320);
    cp.setBackground( new Color(0,0,0));
    jp.add(cp);
    
  
    //customer details panel
    JLabel supplierID = new JLabel("Supplier-ID            : ");
    //customerID.setBounds(30,20,100,50);
    supplierID.setFont(f1);
    supplierID.setBackground(Color.black);
    supplierID.setForeground(Color.WHITE);
    cp.add(supplierID);
    
     sidtf = new JTextField();
     sidtf.setPreferredSize(new Dimension(125,25));
    //tfid.setBounds(125,34,235,22);
    cp.add(sidtf);
    
    search = new JButton("");
     search.setPreferredSize(new Dimension(25,25));
     search.addActionListener(this);
     search.setIcon(searchicon);
     cp.add(search);
    
    
    
     JSeparator line =new  JSeparator();
    line.setPreferredSize(new Dimension(480,5));
    line.setForeground(Color.white);
    cp.add(line);
    
   
    
    JLabel sname = new JLabel("Supplier Name      : ");
    sname.setBounds(30,60,150,50);
    sname.setFont(f1);
    sname.setBackground(Color.black);
    sname.setForeground(Color.WHITE);
    cp.add(sname);
    
    snametf = new JTextField();
    //tfname.setBounds(125,34,235,22);
    snametf.setPreferredSize(new Dimension(200,25));
    cp.add(snametf);
   
    JLabel semail = new JLabel("Email-ID                 : ");
    semail.setBounds(30,105,150,60);
    semail.setFont(f1);
    semail.setBackground(Color.black);
    semail.setForeground(Color.WHITE);
    cp.add(semail);
    
     emailtf = new JTextField();
    //tfsurname.setBounds(160,100,200,22);
    emailtf.setPreferredSize(new Dimension(200,25));
    cp.add(emailtf);
    
    JLabel snumber = new JLabel("contact no.            : ");
    snumber.setBounds(30,145,150,60);
    snumber.setFont(f1);
    snumber.setBackground(Color.black);
    snumber.setForeground(Color.WHITE);
    cp.add(snumber);
    
    snumbertf = new JTextField();
    //tfnumber.setBounds(173,150,186,22);
    snumbertf.setPreferredSize(new Dimension(200,25));
    cp.add(snumbertf);
    
    
    
    JLabel saddress = new JLabel("Address                 : ");
    saddress.setBounds(30,145,130,60);
    saddress.setFont(f1);
    //saddress.setPreferredSize(new Dimension(130,25));
    saddress.setBackground(Color.black);
    saddress.setForeground(Color.WHITE);
    cp.add(saddress);
    
     saddresstf = new JTextField();
    //tfnumber.setBounds(173,150,186,22);
    saddresstf.setPreferredSize(new Dimension(200,25));
    cp.add(saddresstf);
    
    //add btn panel
    JPanel addbtnpanel = new JPanel();
    addbtnpanel.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
    addbtnpanel.setBounds(450,375,100,30);
    //addbtnpanel.setBackground( new Color(10,0,0));
    jp.add(addbtnpanel);
    
    deletebtn = new JButton();
    deletebtn.setText("Delete");
    deletebtn.setPreferredSize(new Dimension(110,33));
    deletebtn.addActionListener(this);
    //addbtn.setBounds(1,0,70,30);
    deletebtn.setFocusable(false);
    addbtnpanel.add(deletebtn);
    
    //reset btn panel
    JPanel resetbtnpanel = new JPanel();
    resetbtnpanel.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
    resetbtnpanel.setBounds(580,375,100,30);
    //addbtnpanel.setBackground( new Color(10,0,0));
    jp.add(resetbtnpanel);
    
    //reset btn
   resetbtn = new JButton();
    resetbtn.setText("Reset");
    resetbtn.setPreferredSize(new Dimension(110,33));
    resetbtn.addActionListener(this);
    //addbtn.setBounds(1,0,70,30);
    resetbtn.setFocusable(false);
    resetbtnpanel.add(resetbtn);
    

    
    
    
 this .setLayout(null);
    this.setBounds(220,180,880,420);
    //this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    //this.setLocation(330,120);
    this.add(jp);
    this.setUndecorated(true);
    this.setVisible(true);
    
   
    }
   /* public static void main(String args[]){
        new deleteSupplier();
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()== close){
                
                setVisible(false);
                
                
            }
        
        
        if (e.getSource() == resetbtn){
            setVisible(false);
            Supplier c = new Supplier();
            c.setVisible(true);
        }
        
        if(e.getSource()==search ){
            String id = sidtf.getText();
           try{
               Connection con = ConnectionProvider.getCon();
               Statement st = con.createStatement();
               ResultSet rs=st.executeQuery("select * from supplier_details where S_Id = '"+id+"'");
               if(rs.next())
               {
                 sidtf.setText(rs.getString(1)); 
                 snametf.setText(rs.getString(2));
                 emailtf.setText(rs.getString(3)); 
                 snumbertf.setText(rs.getString(4)); 
                 saddresstf.setText(rs.getString(5));
                 gsttf.setText(rs.getString(6));
                 sidtf.setEditable(false);
               }
               else{
                 JOptionPane.showMessageDialog(null,"The given ID does not exist"); 
               }
        }
           catch(SQLException s){
               JOptionPane.showMessageDialog(null,s);    
           }
        }
        
        if (e.getSource()== deletebtn){
            String id= sidtf.getText();
            int a = JOptionPane.showConfirmDialog(null,"Do you really want to delete","Select",JOptionPane.YES_NO_OPTION);
            if(a==0){
                 try{
                Connection con = ConnectionProvider.getCon();
                Statement st=con.createStatement();
                st.executeUpdate("delete from supplier_details where S_Id='"+id+"' ");
                JOptionPane.showMessageDialog(null,"Successfully Deleted");
                setVisible(false);
                new deleteSupplier().setVisible(true);
            }
            catch( SQLException s){
                JOptionPane.showMessageDialog(null,s);
            }
            }
        } 
         
    }
    
}

