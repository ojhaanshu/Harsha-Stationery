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


public class deleteEmployee extends JFrame implements ActionListener{
    
    
    @SuppressWarnings("empty-statement")
            
    JButton close;
    JButton search;
    JButton updatebtn;
    JButton deletebtn;
    JButton addbtn;
    JButton resetbtn;
    
    JTextField tfid;
    JTextField tfname;
    JTextField tfsurname;
    JTextField tfnumber;
    JTextField tfaddr;
    JComboBox gender;
    
   deleteEmployee(){
    Font f1 = new Font("alegreya black",Font.BOLD,22);   
    Font lf = new Font("alegreya black",Font.BOLD,25);
    ImageIcon closeimg = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\close1.png");
    ImageIcon sidepic = (new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\deleteemployee.png"));
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
     
    JSeparator line1 =new  JSeparator();
    //line.setPreferredSize(new Dimension(390,8));
    line1.setBounds(20,42,300,20);
    line1.setForeground(Color.BLACK);
    jp.add(line1);
    
    
    //main detail filling area
    JLabel logol= new JLabel();
    logol.setText("Delete Employee Details");
    logol.setFont(lf);
    logol.setLayout(null);
    logol.setBounds(25, 40, 500, 40);
    
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
    cp.setLayout(new FlowLayout(FlowLayout.LEADING,13,18));
    cp.setBounds(330,45,500,320);
    cp.setBackground( new Color(0,0,0));
    jp.add(cp);
    
  
    //customer details panel
    JLabel productID = new JLabel("Employee-ID              : ");
    //customerID.setBounds(30,20,100,50);
    productID.setFont(f1);
    productID.setBackground(Color.black);
    productID.setForeground(Color.WHITE);
    cp.add(productID);
    
    tfid = new JTextField();
     tfid.setPreferredSize(new Dimension(120,25));
    //tfid.setBounds(125,34,235,22);
    cp.add(tfid);
    
     search = new JButton("");
     search.setPreferredSize(new Dimension(25,25));
     search.addActionListener(this);
     search.setIcon(searchicon);
     cp.add(search);
    
    
    
    
    
    JSeparator line =new  JSeparator();
    line.setPreferredSize(new Dimension(480,5));
    line.setForeground(Color.white);
    cp.add(line);
    
    
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
    //addbtn.setBounds(1,0,70,30);
    resetbtn.addActionListener(this);
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
  /*  public static void main(String args[]){
        new deleteEmployee();
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()== close){
                
                setVisible(false);
                
                
            }
        
        
        if (e.getSource() == resetbtn){
            setVisible(false);
            deleteProduct pd = new deleteProduct();
            pd.setVisible(true);
        }
        if(e.getSource()==search ){
            String id = tfid.getText();
           try{
               Connection con = ConnectionProvider.getCon();
               Statement st = con.createStatement();
               ResultSet rs=st.executeQuery("select * from employee where Emp_Id = '"+id+"'");
               if(rs.next())
               {
                 tfid.setText(rs.getString(1)); 
                 tfname.setText(rs.getString(2));
                 tfsurname.setText(rs.getString(3)); 
                 tfnumber.setText(rs.getString(4)); 
                 gender.setSelectedItem(rs.getString(5));
                 tfaddr.setText(rs.getString(6));
                 tfid.setEditable(false);
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
            String id= tfid.getText();
            int a = JOptionPane.showConfirmDialog(null,"Do you really want to delete","Select",JOptionPane.YES_NO_OPTION);
            if(a==0){
                 try{
                Connection con = ConnectionProvider.getCon();
                Statement st=con.createStatement();
                st.executeUpdate("delete from employee where Emp_Id='"+id+"' ");
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