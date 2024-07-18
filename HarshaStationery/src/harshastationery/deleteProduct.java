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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;


public class deleteProduct extends JFrame implements ActionListener{
    
    
    @SuppressWarnings("empty-statement")
            
    JButton close;
    JButton search;
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
    deleteProduct(){
    Font f1 = new Font("alegreya black",Font.BOLD,22);   
    Font lf = new Font("alegreya black",Font.BOLD,28);
    ImageIcon closeimg = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\close1.png");
    ImageIcon sidepic = (new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\deleteproduct1 (2).png" ));
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
    line1.setBounds(25,42,300,20);
    line1.setForeground(Color.BLACK);
    jp.add(line1);
    
    
    
    //main detail filling area
    JLabel logol= new JLabel();
    logol.setText("Delete Product Details");
    logol.setFont(lf);
    logol.setLayout(null);
    logol.setBounds(25, 49, 500, 40);
    
    jp.add(logol);
    
     JSeparator line2 =new  JSeparator();
    //line.setPreferredSize(new Dimension(390,8));
    line2.setBounds(25,90,300,20);
    line2.setForeground(Color.BLACK);
    jp.add(line2);
    
    
    
    //side image 
    JLabel sideimg = new JLabel();
    sideimg.setBounds(20,38,360,360);
    sideimg.setIcon(sidepic);
    jp.add(sideimg);
    
    
    
    
    
    
    
    //detail filling panel
    JPanel cp = new JPanel();
    cp.setLayout(new FlowLayout(FlowLayout.LEADING,13,18));
    cp.setBounds(380,45,500,380);
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
     pid.setPreferredSize(new Dimension(120,25));
    //tfid.setBounds(125,34,235,22);
    cp.add(pid);
    
     search = new JButton("");
     search.setPreferredSize(new Dimension(25,25));
     search.addActionListener(this);
     search.setIcon(searchicon);
     search.setBackground(Color.WHITE);
     cp.add(search);
    
    
    
    
    
    JSeparator line =new  JSeparator();
    line.setPreferredSize(new Dimension(480,5));
    line.setForeground(Color.white);
    cp.add(line);
   
    
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
    
    JLabel Price = new JLabel("Price (1Unit)            :");
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
    
    JLabel GSTrate = new JLabel("GST rate                  :");
    GSTrate.setBounds(30,145,150,60);
    GSTrate.setFont(f1);
    GSTrate.setBackground(Color.black);
    GSTrate.setForeground(Color.WHITE);
    cp.add(GSTrate);
    
    gsttf = new JTextField();
   gsttf.setPreferredSize(new Dimension(210,25));
   cp.add(gsttf);
    
    JLabel hsncode = new JLabel("HSN code                :");
    hsncode.setBounds(30,190,150,60);
    hsncode.setFont(f1);
    hsncode.setBackground(Color.black);
    hsncode.setForeground(Color.WHITE);
    cp.add(hsncode);
    
    
    hsncodetf = new JTextField();
    //tfnumber.setBounds(173,150,186,22);
    hsncodetf.setPreferredSize(new Dimension(210,25));
    cp.add(hsncodetf);
    
    
    JLabel supplier  = new JLabel("Supplier                  :");
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
    
    //add btn panel
    JPanel addbtnpanel = new JPanel();
    addbtnpanel.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
    addbtnpanel.setBounds(470,435,100,30);
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
    resetbtnpanel.setBounds(600,435,100,30);
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
    this.setBounds(220,180,880,500);
    //this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    //this.setLocation(330,120);
    this.add(jp);
    this.setUndecorated(true);
    this.setVisible(true);
    
   
    }
   /* public static void main(String args[]){
        new deleteProduct();
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
            String id = pid.getText();
           try{
               Connection con = ConnectionProvider.getCon();
               Statement st = con.createStatement();
               ResultSet rs=st.executeQuery("select * from product_details where P_Id = '"+id+"'");
               if(rs.next())
               {
                 //pid.setText(rs.getString(1)); 
                 pnametf.setText(rs.getString(2));
                 quantitytf.setText(rs.getString(3)); 
                 pricetf.setText(rs.getString(4)); 
                 gsttf.setText(rs.getString(5));
                 hsncodetf.setText(rs.getString(6));
                 tfsupp.setText(rs.getString(7));
                 pid.setEditable(false);
               }
               else{
                 JOptionPane.showMessageDialog(null,"The given ID does not exist"); 
                 pnametf.setEditable(false);
                 quantitytf.setEditable(false);
                 pricetf.setEditable(false);;
                 gsttf.setEditable(false);
                 hsncodetf.setEditable(false);
                 tfsupp.setEditable(false);
                 deletebtn.setEnabled(false);
               }
        }
           catch(SQLException s){
               JOptionPane.showMessageDialog(null,s);    
           }
        }
        
         if (e.getSource()== deletebtn){
            String id=pid.getText();
            int a = JOptionPane.showConfirmDialog(null,"Do you really want to delete","Select",JOptionPane.YES_NO_OPTION);
            if(a==0){
                 try{
                Connection con = ConnectionProvider.getCon();
                Statement st=con.createStatement();
                st.executeUpdate("delete from product_details where P_Id='"+id+"' ");
                JOptionPane.showMessageDialog(null,"Successfully Deleted");
                setVisible(false);
                new deleteProduct().setVisible(true);
            }
            catch( SQLException s){
                JOptionPane.showMessageDialog(null,s);
            }
            }
           
        
        
    }
    
    }
}