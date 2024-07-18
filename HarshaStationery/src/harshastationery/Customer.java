package harshastationery;

import project.ConnectionProvider;
import java.sql.*;

import java.util.regex.*;  

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
//import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
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
public class Customer extends JFrame implements ActionListener,ComponentListener{
    
    
    @SuppressWarnings("empty-statement")
            
    JButton close;
    JButton searchbtn;
    JButton updatebtn;
    JButton deletebtn;
    JButton Overview;
    JButton addbtn;
    JButton resetbtn;
    
    JTextField tfid;
    JTextField tfname;
    JTextField tfsurname;
    JTextField tfnumber;
    JComboBox gender;
    
    Customer(){
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
    
    
    updatebtn = new JButton();
    updatebtn.setText("Update");
    updatebtn.setPreferredSize(new Dimension(110,33));
    updatebtn.setBounds(40,0,85,30);
    updatebtn.addActionListener(this);
    updatebtn.setFocusable(false);
    closepanel.add(updatebtn);
    
    deletebtn = new JButton();
    deletebtn.setText("Delete");
    deletebtn.setPreferredSize(new Dimension(110,33));
    deletebtn.setBounds(150,0,85,30);
    deletebtn.addActionListener(this);
    deletebtn.setFocusable(false);
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
    
    //main detail filling area
    JLabel logol= new JLabel();
    logol.setText(" Add Customer Details");
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
    cp.setLayout(new FlowLayout(FlowLayout.LEADING,13,25));
    cp.setBounds(350,45,500,320);
    cp.setBackground( new Color(0,0,0));
    jp.add(cp);
    
  
    //customer details panel
    JLabel customerID = new JLabel("Customer-ID  : ");
    customerID.setBounds(30,20,190,50);
    customerID.setFont(f1);
    customerID.setBackground(Color.black);
    customerID.setForeground(Color.WHITE);
    cp.add(customerID);
    
      tfid = new JTextField();
     tfid.setPreferredSize(new Dimension(200,25));
     tfid.addComponentListener(this);
    //tfid.setBounds(125,34,235,22);
    cp.add(tfid);
   
    
    JLabel name = new JLabel("First Name     : ");
    name.setBounds(30,60,190,50);
    name.setFont(f1);
    name.setBackground(Color.black);
    name.setForeground(Color.WHITE);
    cp.add(name);
    
     tfname = new JTextField();
    //tfname.setBounds(125,34,235,22);
    tfname.setPreferredSize(new Dimension(200,25));
    cp.add(tfname);
   
    JLabel surname = new JLabel("Last Name      : ");
    surname.setBounds(30,105,150,60);
    surname.setFont(f1);
    surname.setBackground(Color.black);
    surname.setForeground(Color.WHITE);
    cp.add(surname);
    
    tfsurname = new JTextField();
    //tfsurname.setBounds(160,100,200,22);
    tfsurname.setPreferredSize(new Dimension(200,25));
    cp.add(tfsurname);
    
    JLabel numb = new JLabel("Contact no.    : ");
    numb.setBounds(30,145,150,60);
    numb.setFont(f1);
    numb.setBackground(Color.black);
    numb.setForeground(Color.WHITE);
    cp.add(numb);
    
     tfnumber = new JTextField();
    //tfnumber.setBounds(173,150,186,22);
    tfnumber.setPreferredSize(new Dimension(200,25));
    cp.add(tfnumber);
    
    JLabel genderl = new JLabel("Gender           : ");
    genderl.setBounds(30,190,150,60);
    genderl.setFont(f1);
    genderl.setBackground(Color.black);
    genderl.setForeground(Color.WHITE);
    cp.add(genderl);
    
    String [] Gender = {"Male","Female","Others"};
    gender = new JComboBox(Gender);
    gender.setPreferredSize(new Dimension(140,25));
    //gender.setBounds(135,208,110,25);
    cp.add(gender);
    
    //add btn panel
    JPanel addbtnpanel = new JPanel();
    addbtnpanel.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
    addbtnpanel.setBounds(470,375,100,30);
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
    resetbtnpanel.setBounds(600,375,100,30);
    //addbtnpanel.setBackground( new Color(10,0,0));
    jp.add(resetbtnpanel);
    
    //reset btn
    resetbtn = new JButton();
    resetbtn.setText("Reset");
    resetbtn.addActionListener(this);
    resetbtn.setPreferredSize(new Dimension(110,33));
    //addbtn.setBounds(1,0,70,30);
    addbtn.setFocusable(false);
    resetbtnpanel.add(resetbtn);
    
    
    
 this .setLayout(null);
    this.setBounds(220,180,880,420);
    this.addComponentListener(this);
    //this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    //this.setLocation(270,120);
    this.add(jp);
    this.setUndecorated(true);
    this.setVisible(true);
   
    }
   /* public static void main(String args[]){
        new Customer();
    }*/
    public static boolean isValidMobileNo(String num) {
            Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}"); 
            Matcher match = ptrn.matcher(num);  
            return (match.find() && match.group().equals(num));  
    }
    public static String exist(String name , String num){
        String idcheck="";
        try{
            
            
            Connection con =ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(" Select * from customer_details where C_First_Name ='"+name+"'AND C_Contact_No = '"+num+"' ");
          if(rs.next()){
             idcheck = rs.getString(1);
            
          }
        }
        catch(Exception q){
           
        }
       return idcheck; 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()== close){
              //  homepage hp = new homepage();
                setVisible(false);
                
              // hp.setVisible(true);
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
        if(e.getSource()== Overview){
            
            customer_view cv = new customer_view();
            this.setVisible(false);
            cv.setVisible(true);
            
        }
        
        if(e.getSource()== addbtn){
            if (tfname.getText().equals("")||tfsurname.getText().equals("")){
              JOptionPane.showMessageDialog(null,"Few Parameters Missing");  
            }
           
                
            
            else{
            String num = tfnumber.getText();
            if (isValidMobileNo(num)){ 
            String id = tfid.getText();
            String name=tfname.getText();
            String sname=tfsurname.getText();
            String number = tfnumber.getText();
            String gen =(String)gender.getSelectedItem();
            String idcheck = exist(name,number);
             if(idcheck!= ""){
             JOptionPane.showMessageDialog(null,"Already exist and its Customer id is "+idcheck);  
           
          }
             else{
            try{
                 Connection con = ConnectionProvider.getCon();
                Statement st=con.createStatement();
                st.executeUpdate("insert into customer_details values('"+id+"','"+name+"','"+sname+"','"+number+"','"+gen+"')");
                JOptionPane.showMessageDialog(null,"Successfully Added");
                setVisible(false);
                new Customer().setVisible(true);
            }
             catch(HeadlessException | SQLException s){
                JOptionPane.showMessageDialog(null,s);
            }
            
            }
            }
            else{
              JOptionPane.showMessageDialog(null,"The Entered Mobile No is \"NOT\" Valid");  
            }
            } 
            
        }
       

}
 @Override
    public void componentHidden(ComponentEvent e) {
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
               
                
                String query = "SELECT Cust_Id FROM customer_details ORDER BY Cust_Id DESC LIMIT 1";
                preparedStatement = con.prepareStatement(query);
               resultSet = preparedStatement.executeQuery();
               int lastCustId = 0;
            if (resultSet.next()) {
                lastCustId = resultSet.getInt("Cust_Id");
            }
            int newCustId = lastCustId + 1;
            tfid.setText(String.valueOf(newCustId));


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
}        
       

        
    

   


 


