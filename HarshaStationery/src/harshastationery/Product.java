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
import java.awt.event.ComponentListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class Product extends JFrame implements ActionListener,ComponentListener{
    
    
    @SuppressWarnings("empty-statement")
            
    JButton close;
    JButton viewbtn;
    JButton updatebtn;
    JButton deletebtn;
    JButton addbtn;
    JButton resetbtn; 
    
    JTextField pid;
    JTextField pnametf;
    JTextField pricetf;
    JTextField gsttf;
    JTextField hsncodetf;
    JTextField quantitytf;
    JTextField tfsupp;
    
    Product(){
    Font f1 = new Font("alegreya black",Font.BOLD,22);   
    Font lf = new Font("alegreya black",Font.BOLD,28);
    ImageIcon closeimg = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\close1.png");
    ImageIcon sidepic = (new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\addproduct.png"));
    
    //frame background
    JPanel jp = new JPanel();
    jp.setLayout(null);
    jp.setBounds(0,0,1100,800);
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
    JSeparator line1 =new  JSeparator();
    //line.setPreferredSize(new Dimension(390,8));
    line1.setBounds(25,42,280,20);
    line1.setForeground(Color.BLACK);
    jp.add(line1);
    
    
    //side decoration
    JLabel logol= new JLabel();
    logol.setText("Add Product Details");
    logol.setFont(lf);
    logol.setLayout(null);
    logol.setBounds(25, 49, 500, 40);
    
    jp.add(logol);
    
    
     //side image 
    JLabel sideimg = new JLabel();
    sideimg.setBounds(20,38,360,360);
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
    cp.setBounds(350,45,500,380);
    cp.setBackground( new Color(0,0,0));
    jp.add(cp);
    
  
    //customer details panel
    JLabel productID = new JLabel("Product-ID              : ");
    //customerID.setBounds(30,20,100,50);
    productID.setFont(f1);
    productID.setBackground(Color.black);
    productID.setForeground(Color.WHITE);
    cp.add(productID);
    
    pid = new JTextField();
     pid.setPreferredSize(new Dimension(210,25));
    //tfid.setBounds(125,34,235,22);
    cp.add(pid);
   
    
    JLabel pname = new JLabel("product Name        : ");
    pname.setBounds(30,60,200,50);
    pname.setFont(f1);
    pname.setBackground(Color.black);
    pname.setForeground(Color.WHITE);
    cp.add(pname);
    
     pnametf = new JTextField();
    //tfname.setBounds(125,34,235,22);
    pnametf.setPreferredSize(new Dimension(210,25));
    cp.add(pnametf);
    
    JLabel Price = new JLabel("Price (1Unit)           :");
    Price.setBounds(30,105,150,60);
    Price.setFont(f1);
    Price.setBackground(Color.black);
    Price.setForeground(Color.WHITE);
    cp.add(Price);
    
     pricetf = new JTextField();
    //tfsurname.setBounds(160,100,200,22);
    pricetf.setPreferredSize(new Dimension(210,25));
    cp.add(pricetf);
    
   
    JLabel quantity = new JLabel("Quantity                  :");
    quantity.setBounds(30,105,150,60);
    quantity.setFont(f1);
    quantity.setBackground(Color.black);
    quantity.setForeground(Color.WHITE);
    cp.add(quantity);
    
    quantitytf = new JTextField();
    //tfsurname.setBounds(160,100,200,22);
    quantitytf.setPreferredSize(new Dimension(210,25));
    cp.add(quantitytf);
    
    JLabel GSTrate = new JLabel("GST rate(%)           :");
    GSTrate.setBounds(30,145,150,60);
    GSTrate.setFont(f1);
    GSTrate.setBackground(Color.black);
    GSTrate.setForeground(Color.WHITE);
    cp.add(GSTrate);
    
   gsttf = new JTextField();
   gsttf.setPreferredSize(new Dimension(210,25));
   cp.add(gsttf);
    
    JLabel hsncode = new JLabel("HSN code              :");
    hsncode.setBounds(30,190,150,60);
    hsncode.setFont(f1);
    hsncode.setBackground(Color.black);
    hsncode.setForeground(Color.WHITE);
    cp.add(hsncode);
    
    
     hsncodetf = new JTextField();
    //tfnumber.setBounds(173,150,186,22);
    hsncodetf.setPreferredSize(new Dimension(210,25));
    cp.add(hsncodetf);
    
    
    JLabel supplier  = new JLabel("Supplier ID            :");
    supplier.setBounds(30,145,100,60);
    supplier.setFont(f1);
    //supplier.setPreferredSize(new Dimension(100,25));
    supplier.setBackground(Color.black);
    supplier.setForeground(Color.WHITE);
    cp.add(supplier);
    
    tfsupp = new JTextField();
    //tfnumber.setBounds(173,150,186,22);
    tfsupp.setPreferredSize(new Dimension(210,25));
    cp.add(tfsupp);
    
    
    //border
    Border blackline = BorderFactory.createLineBorder(Color.black);
    //add btn panel
    JPanel addbtnpanel = new JPanel();
    addbtnpanel.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
    addbtnpanel.setBounds(470,435,100,30);
    //addbtnpanel.setBackground( new Color(10,0,0));
    jp.add(addbtnpanel);
    
    addbtn = new JButton();
    addbtn.setText("Add");
    addbtn.setPreferredSize(new Dimension(110,33));
    //addbtn.setBackground(Color.WHITE);
   // addbtn.setBorder(blackline);
    addbtn.setFocusable(false);
    addbtn.addActionListener(this);
    
    addbtnpanel.add(addbtn);
    
    //reset btn panel
    JPanel resetbtnpanel = new JPanel();
    resetbtnpanel.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
    resetbtnpanel.setBounds(600,435,100,30);
    //addbtnpanel.setBackground( new Color(10,0,0));
    jp.add(resetbtnpanel);
    
    //reset btn
    resetbtn = new JButton();
    resetbtn.setText("Reset");
    resetbtn.setPreferredSize(new Dimension(110,33));
   //resetbtn.setBackground(Color.WHITE);
    resetbtn.addActionListener(this);
   // resetbtn.setBorder(blackline);
    resetbtn.setFocusable(false);
    resetbtnpanel.add(resetbtn);
    

    
    
    
 this .setLayout(null);
    this.setBounds(220,180,880,500);
    this.addComponentListener(this);
    //this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    //this.setLocation(330,120);
    this.add(jp);
    this.setUndecorated(true);
    this.setVisible(true);
    
   
    }
   /* public static void main(String args[]){
        new Product();
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()== close){
                
                setVisible(false);
                
                
            }
        
        
        if (e.getSource() == resetbtn){
            setVisible(false);
            Product p = new Product();
            p.setVisible(true);
        }
        
         if(e.getSource()== updatebtn){
            updateProduct up = new updateProduct();
            setVisible(false);
            up.setVisible(true);
        }
        if(e.getSource()== deletebtn){
            deleteProduct dp = new deleteProduct();
            setVisible(false);
            dp.setVisible(true);
        }
         
            if(e.getSource()== addbtn){
                if (pnametf.getText().equals("")||pricetf.getText().equals("")||gsttf.getText().equals("")||hsncodetf.getText().equals("")||quantitytf.getText().equals("")||tfsupp.getText().equals("")){
              JOptionPane.showMessageDialog(null,"Few Parameters Missing");  
            }
            else{
            String id = pid .getText();       
            String name=pnametf.getText();
            String price=pricetf.getText();
            String qnty = quantitytf.getText();
            String gst =gsttf.getText();
            String hsn =hsncodetf.getText();
            String supp = tfsupp.getText();
            try{
                Connection con = ConnectionProvider.getCon();
                Statement st=con.createStatement();
                st.executeUpdate("insert into product_details values('"+id+"','"+name+"','"+price+"','"+qnty+"','"+gst+"','"+hsn+"','"+supp+"')");
                JOptionPane.showMessageDialog(null,"Successfully Added");
                setVisible(false);
                new Product().setVisible(true);
            }
            catch( SQLException s){
                JOptionPane.showMessageDialog(null,s);
               /* setVisible(false);
                new Product().setVisible(true);*/
            }
       }
    }
  }

    @Override
    public void componentResized(ComponentEvent e) {}

    @Override
    public void componentMoved(ComponentEvent e) {}

    @Override
    public void componentShown(ComponentEvent e) {
        Connection con=null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
    
        try{
                con = ConnectionProvider.getCon();
               Statement st = con.createStatement();
               
                
                String query = "SELECT P_Id FROM product_details ORDER BY P_Id DESC LIMIT 1";
                preparedStatement = con.prepareStatement(query);
               resultSet = preparedStatement.executeQuery();
               int lastproId = 0;
            if (resultSet.next()) {
                lastproId = resultSet.getInt("P_Id");
            }
            int newproId = lastproId + 1;
            pid.setText(String.valueOf(newproId));


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


    