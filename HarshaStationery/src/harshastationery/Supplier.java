package harshastationery;

//import static harshastationery.Customer.isValidMobileNo;
//import static harshastationery.Employee.isValidMobileNo;
import java.util.regex.*; 

import project.ConnectionProvider;
import java.sql.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class Supplier extends JFrame implements ActionListener,ComponentListener{
    
        
    @SuppressWarnings("empty-statement")
            
            
            
    JButton close;
    JButton viewbtn;
    JButton updatebtn;
    JButton deletebtn;
    JButton addbtn;
    JButton resetbtn;
    JButton Overview;
    JTextField sidtf;
    JTextField snametf;
    JTextField emailtf;
    JTextField snumbertf;
    JTextField saddresstf;
    JTextField gsttf;      
    
    Supplier(){
    Font f1 = new Font("alegreya black",Font.BOLD,22);   
    Font lf = new Font("alegreya black",Font.BOLD,28);
   ImageIcon closeimg = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\close1.png");
    ImageIcon sidepic = (new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\addsupplier.png"));
    
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
    
    //action buttons
    
    
     updatebtn = new JButton();
    updatebtn.setText("Update");
    updatebtn.setPreferredSize(new Dimension(110,33));
    updatebtn.addActionListener(this);
    updatebtn.setBounds(40,0,85,30);
    updatebtn.setFocusable(false);
    closepanel.add(updatebtn);
    
    deletebtn = new JButton();
    deletebtn.setText("Delete");
    deletebtn.setPreferredSize(new Dimension(110,33));
    deletebtn.setBounds(150,0,85,30);
    deletebtn.setFocusable(false);
    deletebtn.addActionListener(this);
    closepanel.add(deletebtn);
    
    Overview = new JButton();
    Overview.setText("Overview");
    Overview.setPreferredSize(new Dimension(110,33));
    Overview.setBounds(260,0,95,30);
    Overview.addActionListener(this);
    Overview.setFocusable(false);
    closepanel.add(Overview); 
    
     JSeparator line1 =new  JSeparator();
    //line.setPreferredSize(new Dimension(390,8));
    line1.setBounds(25,42,280,20);
    line1.setForeground(Color.BLACK);
    jp.add(line1);
    
    
    
    //Side Decoration
    JLabel logol= new JLabel();
    logol.setText("Add Supplier Details");
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
    cp.setBounds(330,45,500,360);
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
     sidtf.setPreferredSize(new Dimension(200,25));
    //tfid.setBounds(125,34,235,22);
    cp.add(sidtf);
   
    
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
    
    JLabel gstid = new JLabel("GST  ID                 : ");
    gstid.setBounds(30,145,130,60);
    gstid.setFont(f1);
    //saddress.setPreferredSize(new Dimension(130,25));
    gstid.setBackground(Color.black);
    gstid.setForeground(Color.WHITE);
    cp.add(gstid);
    
    gsttf = new JTextField();
    //tfnumber.setBounds(173,150,186,22);
   gsttf.setPreferredSize(new Dimension(200,25));
    cp.add(gsttf);
    
    //add btn panel
    JPanel addbtnpanel = new JPanel();
    addbtnpanel.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
    addbtnpanel.setBounds(450,420,100,30);
    //addbtnpanel.setBackground( new Color(10,0,0));
    jp.add(addbtnpanel);
    
    addbtn = new JButton();
    addbtn.setText("Add");
    addbtn.setPreferredSize(new Dimension(110,33));
    addbtn.addActionListener(this);
    //addbtn.setBounds(1,0,70,30);
    addbtn.setFocusable(false);
    addbtnpanel.add(addbtn);
    
    //reset btn panel
    JPanel resetbtnpanel = new JPanel();
    resetbtnpanel.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
    resetbtnpanel.setBounds(580,420,100,30);
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
    this.setBounds(220,180,880,460);
    this.addComponentListener(this);
    //this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    //this.setLocation(330,120);
    this.add(jp);
    this.setUndecorated(true);
    this.setVisible(true);
    
   
    }
  /* public static void main(String args[]){
        new Supplier();
    }*/
     public static boolean isValidMobileNo(String num) {
            Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}"); 
            Matcher match = ptrn.matcher(num);  
            return (match.find() && match.group().equals(num));  
    }
                 
 public static boolean isValidemail(String email){
            String regex = "^(.+)@(.+)$";   
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email );
             return( matcher.matches());  
    }
    

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
        if (e.getSource() == updatebtn){
           
            setVisible(false);
            updateSupplier us = new updateSupplier();
            us.setVisible(true);
            
        }
        if (e.getSource() == deletebtn){
            setVisible(false);
            deleteSupplier ds = new deleteSupplier();
            ds.setVisible(true);
        }
         if(e.getSource()== Overview){
            
            Supplier_View cv = new Supplier_View();
            this.setVisible(false);
            cv.setVisible(true);
            
        }
         if(e.getSource()== addbtn){
             if (snametf.getText().equals("")||emailtf.getText().equals("")||snumbertf.getText().equals("")||saddresstf.getText().equals("")||gsttf.getText().equals("")){
              JOptionPane.showMessageDialog(null,"Few Parameters Missing");  
            }
            else{
                 String emailin = emailtf.getText();
                 if (isValidemail(emailin)){
                     String num = snumbertf.getText();
             if (isValidMobileNo(num)){
            String id = sidtf.getText();
            String name=snametf.getText();
            String email=emailtf.getText();
            String number = snumbertf.getText();
            String address =saddresstf.getText();
            String gst = gsttf.getText();
            try{
                Connection con = ConnectionProvider.getCon();
                Statement st=con.createStatement();
                st.executeUpdate("insert into supplier_details values('"+id+"','"+name+"','"+email+"','"+number+"','"+address+"','"+gst+"')");
                JOptionPane.showMessageDialog(null,"Successfully Added");
                setVisible(false);
                new Supplier().setVisible(true);
            }
            catch(HeadlessException | SQLException s){
                JOptionPane.showMessageDialog(null,s);
             }
                 }
              else{
              JOptionPane.showMessageDialog(null,"The Entered Mobile No is \"NOT\" Valid");  
            }
                 }
            else{
              JOptionPane.showMessageDialog(null,"The Entered Email is \"NOT\" Valid");  
            }
             } 
             
        }
        
        
    }

    @Override
    public void componentResized(ComponentEvent e) {
        }

    @Override
    public void componentMoved(ComponentEvent e) {
        }

    @Override
    public void componentShown(ComponentEvent e) {
        Connection con=null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
    
        try{
                con = ConnectionProvider.getCon();
               Statement st = con.createStatement();
               
                
                String query = "SELECT S_Id FROM supplier_details ORDER BY S_Id DESC LIMIT 1";
                preparedStatement = con.prepareStatement(query);
               resultSet = preparedStatement.executeQuery();
               int lastEmpId = 0;
            if (resultSet.next()) {
                lastEmpId = resultSet.getInt("S_Id");
            }
            int newCustId = lastEmpId + 1;
            sidtf.setText(String.valueOf(newCustId));


        }
           catch(SQLException s){
               JOptionPane.showMessageDialog(null,s);    
           }
        finally {
            // Close the database resources
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                //if (connection != null) connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        }

           
        

    @Override
    public void componentHidden(ComponentEvent e) {
        }
    
}

