package harshastationery;

import static harshastationery.Customer.isValidMobileNo;
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


public class Employee extends JFrame implements ActionListener,ComponentListener{
    
    
    @SuppressWarnings("empty-statement")
    JButton close;
    JButton viewbtn;
    JButton updatebtn;
    JButton deletebtn;
    JButton addbtn;
    JButton resetbtn;
    JButton Overview;
    JTextField tfid;
    JTextField tfname;
    JTextField tfsurname;
    JTextField tfnumber;
    JTextField tfaddr;
    JComboBox gender;
    
    
    Employee(){
    Font f1 = new Font("alegreya black",Font.BOLD,22);   
    Font lf = new Font("alegreya black",Font.BOLD,28);
    ImageIcon closeimg = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\close1.png");
    ImageIcon sidepic = (new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\addemployee.png" ));
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
    close.setFocusable(false);
    close.addActionListener(this);
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
    line1.setBounds(20,42,300,20);
    line1.setForeground(Color.BLACK);
    jp.add(line1);
    
    
    //main detail filling area
    JLabel logol= new JLabel();
    logol.setText("Add Employee Details");
    logol.setFont(lf);
    logol.setLayout(null);
    logol.setBounds(25, 44, 500, 40);
    
    jp.add(logol);
    
     JSeparator line2 =new  JSeparator();
    //line.setPreferredSize(new Dimension(390,8));
    line2.setBounds(20,85,300,20);
    line2.setForeground(Color.BLACK);
    jp.add(line2);
    
    //side image 
    JLabel sideimg = new JLabel();
    sideimg.setBounds(20,40,360,360);
    sideimg.setIcon(sidepic);
    jp.add(sideimg);
    
     //detail filling panel
    JPanel cp = new JPanel();
    cp.setLayout(new FlowLayout(FlowLayout.LEADING,13,20));
    cp.setBounds(350,50,500,320);
    cp.setBackground( new Color(0,0,0));
    jp.add(cp);
  
    //customer details panel
    JLabel customerID = new JLabel("Employee-ID     : ");
    //customerID.setBounds(30,20,100,50);
    customerID.setFont(f1);
    customerID.setBackground(Color.black);
    customerID.setForeground(Color.WHITE);
    cp.add(customerID);
    
    tfid = new JTextField();
     tfid.setPreferredSize(new Dimension(200,25));
    //tfid.setBounds(125,34,235,22);
    cp.add(tfid);
   
    
    JLabel name = new JLabel("First Name        : ");
    name.setBounds(30,60,150,50);
    name.setFont(f1);
    name.setBackground(Color.black);
    name.setForeground(Color.WHITE);
    cp.add(name);
    
    tfname = new JTextField();
    //tfname.setBounds(125,34,235,22);
    tfname.setPreferredSize(new Dimension(200,25));
    cp.add(tfname);
   
    JLabel surname = new JLabel("Last Name        : ");
    surname.setBounds(30,105,150,60);
    surname.setFont(f1);
    surname.setBackground(Color.black);
    surname.setForeground(Color.WHITE);
    cp.add(surname);
    
     tfsurname = new JTextField();
    //tfsurname.setBounds(160,100,200,22);
    tfsurname.setPreferredSize(new Dimension(200,25));
    cp.add(tfsurname);
    
    JLabel numb = new JLabel("Contact no.      : ");
    numb.setBounds(30,145,200,60);
    numb.setFont(f1);
    numb.setBackground(Color.black);
    numb.setForeground(Color.WHITE);
    cp.add(numb);
    
    tfnumber = new JTextField();
    //tfnumber.setBounds(173,150,186,22);
    tfnumber.setPreferredSize(new Dimension(200,25));
    cp.add(tfnumber);
    
    JLabel genderl = new JLabel("Gender             : ");
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
    
    JLabel addr = new JLabel("Address            : ");
    addr.setBounds(30,145,100,60);
    addr.setFont(f1);
    //addr.setPreferredSize(new Dimension(100,25));
    addr.setBackground(Color.black);
    addr.setForeground(Color.WHITE);
    cp.add(addr);
    
    tfaddr = new JTextField();
    //tfnumber.setBounds(173,150,186,22);
    tfaddr.setPreferredSize(new Dimension(200,25));
    cp.add(tfaddr);
    
    //add btn panel
    JPanel addbtnpanel = new JPanel();
    addbtnpanel.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
    addbtnpanel.setBounds(480,375,100,30);
    //addbtnpanel.setBackground( new Color(10,0,0));
    jp.add(addbtnpanel);
    
     addbtn = new JButton();
    addbtn.setText("Add");
    addbtn.setPreferredSize(new Dimension(100,28));
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
    resetbtn.setPreferredSize(new Dimension(100,28));
    resetbtn.addActionListener(this);
    //addbtn.setBounds(1,0,70,30);
    resetbtn.setFocusable(false);
    resetbtnpanel.add(resetbtn);
    

    
    
    
 this .setLayout(null);
    this.setBounds(220,180,880,420);
    //this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    //this.setLocation(330,120);
    this.add(jp);
    this.addComponentListener(this);
    this.setUndecorated(true);
    this.setVisible(true);
    
    }
  /* public static void main(String args[]){
        new Employee();
    }*/
     public static boolean isValidMobileNo(String num) {
            Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}"); 
            Matcher match = ptrn.matcher(num);  
            return (match.find() && match.group().equals(num));  
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()== close){
                
                setVisible(false);
                
                
            }
        
        
        if (e.getSource() == resetbtn){
            setVisible(false);
            Employee emp = new Employee();
            emp.setVisible(true);
        }
         if (e.getSource() == updatebtn){
            
            updateEmployee ue = new updateEmployee();
            setVisible(false);
            ue.setVisible(true);
        }
         if (e.getSource() == deletebtn){
            
            deleteEmployee de = new deleteEmployee();
            setVisible(false);
            de.setVisible(true);
        }
          if(e.getSource()== Overview){
            
            Employee_view cv = new Employee_view();
            this.setVisible(false);
            cv.setVisible(true);
            
        }
         
        if(e.getSource()== addbtn){
            if (tfname.getText().equals("")||tfsurname.getText().equals("")||tfnumber.getText().equals("")||tfaddr.getText().equals("")){
              JOptionPane.showMessageDialog(null,"Few Parameters Missing");  
            }
            else{
            String num = tfnumber.getText();
            if (isValidMobileNo(num)){
            
            String id = tfid.getText();
            String name=tfname.getText();
            String surname=tfsurname.getText();
            String number = tfnumber.getText();
            String address =tfaddr.getText();
            String gen =(String)gender.getSelectedItem();
            try{
                Connection con = ConnectionProvider.getCon();
                Statement st=con.createStatement();
                st.executeUpdate("insert into Employee values('"+id+"','"+name+"','"+surname+"','"+number+"','"+gen+"','"+address+"')");
                JOptionPane.showMessageDialog(null,"Successfully Added");
                setVisible(false);
                new Employee().setVisible(true);
            }
            catch(HeadlessException | SQLException s){
                JOptionPane.showMessageDialog(null,s);
            }
             }
            else{
              JOptionPane.showMessageDialog(null,"The Entered Mobile No is \"NOT\" Valid");  
            }
           
        }
        }   
        
    } 
     @Override
    public void componentShown(ComponentEvent e) {
        Connection con=null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
    
        try{
                con = ConnectionProvider.getCon();
               Statement st = con.createStatement();
               
                
                String query = "SELECT Emp_Id FROM employee ORDER BY Emp_Id DESC LIMIT 1";
                preparedStatement = con.prepareStatement(query);
               resultSet = preparedStatement.executeQuery();
               int lastEmpId = 0;
            if (resultSet.next()) {
                lastEmpId = resultSet.getInt("Emp_Id");
            }
            int newCustId = lastEmpId + 1;
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

    @Override
    public void componentResized(ComponentEvent e) {
        }

    @Override
    public void componentMoved(ComponentEvent e) {
        }

   

    @Override
    public void componentHidden(ComponentEvent e) {
         }
}
    
    
    

