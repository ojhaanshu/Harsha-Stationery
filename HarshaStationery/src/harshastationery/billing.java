
package harshastationery;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.BorderLayout;
import project.ConnectionProvider;
import java.sql.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import java .util.Date;
import javax.swing.table.DefaultTableModel;


public class billing extends JFrame implements ActionListener {
     
    JButton add;
    JButton close;
    JButton save;
    JButton reset;
    JButton remove;
    
    JTextField tfid;
    JTextField tfname;
    JTextField tfsurname;
    JTextField tfnumber;
    JComboBox gender;
    
    JTextField protfid;
    JTextField protfname;
    JTextField pricetf;
    JTextField tfquantity;
     JTextField tfgst;
     JTextField tfhsn;
     JTextField tfsupp;
     
      JLabel datetf;
      JLabel timetf;
    
      JTable table;
      
      JTextField tftotal;
      JTextField tfptotal;
      JTextField tfrtotal;
      
      public int  finaltotal = 0;
       DefaultTableModel tableModel;
       JScrollPane scrollPane;
    billing(){
        
        //image
        ImageIcon cornerlogo = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\invoice1.png");
        ImageIcon logobg = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\billing.png");
        ImageIcon Iadd = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\add.png");
        ImageIcon Isave = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\save.png");
        ImageIcon Ireset = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\reset.png");
        ImageIcon Iclose = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\close.png");
        ImageIcon Iremove = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\removed.png");
       
       //background Panel
       
        Font f1 = new Font("alegreya black",Font.BOLD,22);
        Font f2 = new Font("alegreya black",Font.BOLD,26);
        Font f3 = new Font("alegreya black",Font.BOLD,18);
        
        
        
        //background image on  label
        JLabel bg=new JLabel();
        bg.setBounds(0,0,1400,700);
       // bg.setIcon(img);
        
        JPanel cbg = new JPanel();
        cbg .setLayout(null);
        cbg.setBounds(0,0,1400,700);
        cbg.setBackground(new Color(234, 221, 202));
        bg.add(cbg);
        
        // heading panel
        JPanel heading = new JPanel();
        heading .setLayout(null);
        heading.setBounds(0,0,1400,100);
        heading.setBackground(new Color(234, 221, 202));
        cbg.add(heading);
        
        JLabel logoLabel = new JLabel();
        logoLabel.setIcon(cornerlogo);
        logoLabel.setLayout(null);
        logoLabel.setBounds(5,0,100,100);
        heading.add(logoLabel);
        
        //text on heading
        JLabel text = new JLabel();
        text.setIcon(logobg);
        text.setLayout(null);
        text.setBounds(90,0,300,100);
        heading.add(text);
        
        //panel oftime and date
        JPanel tnd = new JPanel();
        tnd.setLayout(null);
        tnd.setBounds(1150,0,250,95);
        tnd.setBackground(new Color(234, 221, 202));
        heading.add(tnd);
        
        JLabel ldate = new JLabel("Date: ");
        ldate.setBounds(2,2,60,40);
        ldate.setFont(f1);
        tnd.add(ldate);
        
        datetf = new JLabel();
        datetf.setBounds( 60,12,100, 22);
        SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
        Date date=new Date();
        datetf.setText(dFormat.format(date));
        datetf.setFont(f3);
        tnd.add(datetf);
        
        
        JLabel time = new JLabel("Time:");
        time.setBounds(2,50,60,40);
        time.setFont(f1);
        tnd.add(time);
       
         timetf = new JLabel();
        timetf.setBounds( 65,62,100, 22);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        timetf.setText(dtf.format(now));
        timetf.setFont(f3);
        tnd.add(timetf);
        
        JSeparator line0 = new JSeparator();
       line0.setBounds(0,98,1400,70);
       line0.setForeground(Color.BLACK);
        heading.add(line0);
        
        
        //cutomer details panel
        JPanel custdt = new JPanel();
        custdt.setLayout(null);
        custdt.setBackground(new Color(234, 221, 202));
        custdt.setBounds(0,110,1400,150);
        cbg.add(custdt);
       
        JLabel title = new JLabel("Customer Details :");
        title.setBounds(2,0,280,25);
        title.setFont(f2);
        custdt.add(title);
        
         JLabel customerID = new JLabel("Customer-ID  : ");
         customerID.setBounds(2,40,160,50);
         customerID.setFont(f1);
         //customerID.setBackground(Color.black);
         //customerID.setForeground(Color.WHITE);
         custdt.add(customerID);
    
        tfid = new JTextField();
         tfid.setBounds(160,55,55,25);
         tfid.addActionListener(this);
    //tfid.setBounds(125,34,235,22);
         custdt.add(tfid);
   
    
       JLabel name = new JLabel("First Name : ");
        name.setBounds(250,40,160,50);
        name.setFont(f1);
        //name.setBackground(Color.black);
        //name.setForeground(Color.WHITE);
        custdt.add(name);
    
    tfname = new JTextField();
    //tfname.setBounds(125,34,235,22);
    tfname.setBounds(380,55,190,25);
    custdt.add(tfname);
   
    JLabel surname = new JLabel("Last Name : ");
    surname.setBounds(600,40,150,50);
    surname.setFont(f1);
    //surname.setBackground(Color.black);
    //surname.setForeground(Color.WHITE);
    custdt.add(surname);
    
     tfsurname = new JTextField();
    //tfsurname.setBounds(160,100,200,22);
    tfsurname.setBounds(730,55,190,25);
    custdt.add(tfsurname);
    
    JLabel numb = new JLabel("Contact no.  : ");
    numb.setBounds(2,80,160,50);
    numb.setFont(f1);
    //numb.setBackground(Color.black);
   // numb.setForeground(Color.WHITE);
    custdt.add(numb);
    
     tfnumber = new JTextField();
    //tfnumber.setBounds(173,150,186,22);
    tfnumber.setBounds(160,95,190,25);
    custdt.add(tfnumber);
    
    JLabel genderl = new JLabel("Gender  : ");;
    genderl.setBounds(380,80,160,50);
    genderl.setFont(f1);
    //genderl.setBackground(Color.black);
   // genderl.setForeground(Color.WHITE);
    custdt.add(genderl);
    
   String [] Gender = {"Male","Female","Others"};
     gender = new JComboBox(Gender);
    gender.setBounds(500,95,160,25);
    gender.setBackground(Color.WHITE);
   custdt.add(gender);
    
     JSeparator line1 = new JSeparator();
     line1.setBounds(0,140,1400,70);
     line1.setForeground(Color.BLACK);
    custdt.add(line1);
     
     
     //product details panel
        JPanel prodt = new JPanel();
        prodt.setLayout(null);
        prodt.setBackground(new Color(234, 221, 202));
        prodt.setBounds(0,260,1400,150);
        cbg.add(prodt);
       
        JLabel protitle = new JLabel("Product Details :");
        protitle.setBounds(2,0,280,25);
        protitle.setFont(f2);
        prodt.add(protitle);
        
         JLabel proID = new JLabel("Product-ID  : ");
         proID.setBounds(2,40,140,50);
         proID.setFont(f1);
         //customerID.setBackground(Color.black);
         //customerID.setForeground(Color.WHITE);
         prodt.add(proID);
    
         protfid = new JTextField();
         protfid.setBounds(140,55,55,25);
         protfid.addActionListener(this);
    //tfid.setBounds(125,34,235,22);
         prodt.add(protfid);
   
    
       JLabel proname = new JLabel("Product Name : ");
        proname.setBounds(250,40,190,50);
        proname.setFont(f1);
        //name.setBackground(Color.black);
        //name.setForeground(Color.WHITE);
        prodt.add(proname);
    
   protfname = new JTextField();
    //tfname.setBounds(125,34,235,22);
    protfname.setBounds(410,55,190,25);
    prodt.add(protfname);
    
    JLabel Price = new JLabel("Price  : ");
    Price.setBounds(640,40,90,50);
    Price.setFont(f1);
    //surname.setBackground(Color.black);
    //surname.setForeground(Color.WHITE);
    prodt.add(Price);
    
    pricetf = new JTextField();
    //tfsurname.setBounds(160,100,200,22);
    pricetf.setBounds(720,55,100,25);
    prodt.add(pricetf);
   
    JLabel Quantity = new JLabel("Quantity : ");
    Quantity.setBounds(860,40,140,50);
    Quantity.setFont(f1);
    //surname.setBackground(Color.black);
    //surname.setForeground(Color.WHITE);
    prodt.add(Quantity);
    
    tfquantity = new JTextField();
    //tfsurname.setBounds(160,100,200,22);
    tfquantity.setBounds(970,55,100,25);
    prodt.add(tfquantity);
    
    JLabel gst = new JLabel("GST rate  : ");
    gst.setBounds(2,80,120,50);
    gst.setFont(f1);
    //numb.setBackground(Color.black);
   // numb.setForeground(Color.WHITE);
    prodt.add(gst);
    
    tfgst = new JTextField();
    //tfnumber.setBounds(173,150,186,22);
    tfgst.setBounds(120,95,190,25);
    prodt.add(tfgst);
    
    JLabel hsn = new JLabel("HSN Code  : ");
    hsn.setBounds(380,80,160,50);
    hsn.setFont(f1);
    //genderl.setBackground(Color.black);
   // genderl.setForeground(Color.WHITE);
    prodt.add(hsn);
    
    tfhsn = new JTextField();
    //tfnumber.setBounds(173,150,186,22);
    tfhsn.setBounds(510,95,160,25);
    prodt.add(tfhsn);
    
    JLabel supplier = new JLabel("Supplier  : ");
    supplier.setBounds(720,80,120,50);
    supplier.setFont(f1);
    //genderl.setBackground(Color.black);
   // genderl.setForeground(Color.WHITE);
    prodt.add(supplier);
    
    tfsupp = new JTextField();
    //tfnumber.setBounds(173,150,186,22);
    tfsupp.setBounds(840,95,160,25);
    prodt.add(tfsupp);
    
    
    add = new JButton("Add");
    add.setBounds(1050,95,80,25);
    add.setBackground(Color.WHITE);
    add.addActionListener(this);
    add.setIcon(Iadd);
    prodt.add(add);
    
   
     JSeparator line2 = new JSeparator();
     line2.setBounds(0,140,1400,70);
     line2.setForeground(Color.BLACK);
     prodt.add(line2);
     
     //Calculation details panel
        JPanel calcdt = new JPanel();
        calcdt.setLayout(null);
        calcdt.setBackground(new Color(234, 221, 202));
        calcdt.setBounds(0,405,1400,500);
        cbg.add(calcdt);
        
        JLabel calctitle = new JLabel("Calculation Details :");
        calctitle.setBounds(3,0,350,30);
        calctitle.setFont(f2);
        calcdt.add(calctitle);
        
         JLabel rate = new JLabel("Total :");
         rate.setBounds(3,55,100,25);
         rate.setFont(f2);
         calcdt.add(rate);
         
          tftotal = new JTextField();
         //tfnumber.setBounds(173,150,186,22);
         tftotal.setBounds(105,57,120,27);
         calcdt.add(tftotal);
    
        JLabel gstrate = new JLabel("Paid Amount  :");
         gstrate.setBounds(3,110,235,25);
         gstrate.setFont(f2);
         calcdt.add(gstrate);
         
          tfptotal = new JTextField();
         //tfnumber.setBounds(173,150,186,22);
         tfptotal.setBounds(205,112,130,27);
         tfptotal.addActionListener(this);
         calcdt.add(tfptotal);
         
          JLabel qnt = new JLabel("Return Amount  :");
         qnt.setBounds(3,165,235,25);
         qnt.setFont(f2);
         calcdt.add(qnt);
         
         tfrtotal = new JTextField();
         //tfnumber.setBounds(173,150,186,22);
         tfrtotal.setBounds(225,164,130,27);
         tfrtotal.addActionListener(this);
         calcdt.add(tfrtotal);
         
        /* JLabel total = new JLabel("Total        :");
         total.setBounds(3,185,120,25);
         total.setFont(f1);
         calcdt.add(total);
         
          JTextField tftotal = new JTextField();
         //tfnumber.setBounds(173,150,186,22);
         tftotal.setBounds(135,185,120,25);
         calcdt.add(tftotal);*/
         
         save = new JButton("Save");
         save.setBounds(3,225,100,25);
         save.setBackground(Color.WHITE);
         save.addActionListener(this);
         save.setIcon(Isave);
         calcdt.add(save);
    
         reset = new JButton("Reset");
         reset.setBounds(120,225,100,25);
         reset.setBackground(Color.WHITE);
         reset.addActionListener(this);
         reset.setIcon(Ireset);
         calcdt.add(reset);
         
        remove = new JButton("Remove");
         remove.setBounds(240,225,100,25);
         remove.setBackground(Color.WHITE);
         remove.addActionListener(this);
         remove.setIcon(Iremove);
         calcdt.add(remove); 
    
         close = new JButton("Close");
         close.setBounds(360,225,100,25);
         close.setBackground(Color.WHITE);
         close.addActionListener(this);
         close.setIcon(Iclose);
         calcdt.add(close);
    
         
        //table
        JPanel tabledt = new JPanel();
       //tabledt.setLayout(null);
        tabledt.setBackground( new Color(234, 221, 202));
        tabledt.setBounds(547,20,800,255);
        
        calcdt.add(tabledt);
         
        /*JLabel Tname = new JLabel("Product Name");
        Tname.setBounds(0,0,200,28);
        Tname.setBackground(Color.WHITE);
        
        Border blackline = BorderFactory.createLineBorder(Color.black);
        Tname.setBorder(blackline);
        Tname.setFont(f1);
        
        JLabel Trate = new JLabel("Rate");
        Trate.setBackground(Color.WHITE);
        Trate.setBounds(200,0,200,28);
        Trate.setBorder(blackline);
        Trate.setFont(f1);
        
        JLabel TQuantity = new JLabel("Quantity");
        TQuantity.setBackground(Color.WHITE);
        TQuantity.setBounds(400,0,200,28);
        TQuantity.setBorder(blackline);
        TQuantity.setFont(f1);
        
        JLabel Ttotal = new JLabel("Total");
        Ttotal.setBackground(Color.WHITE);
        Ttotal.setBounds(600,0,200,28);
        Ttotal.setBorder(blackline);
        Ttotal.setFont(f1);
        
        tabledt.add(Tname);
        tabledt.add(Trate);
        tabledt.add(TQuantity);
        tabledt.add(Ttotal);
        
        /* jt = new JTable(20,4);
        
        */
        //tableModel = new DefaultTableModel();
        


       tableModel = new DefaultTableModel();
       table = new JTable(tableModel);
      tableModel.addColumn("Product Name");
      tableModel.addColumn("Rate");
      tableModel.addColumn("Quantity");
      tableModel.addColumn("Total");


        //JTable table = new JTable(20, 4);
         scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);

       // JLabel lblHeading = new JLabel("Stock Quotes");
       // lblHeading.setFont(new Font("Arial",Font.TRUETYPE_FONT,24));

      tabledt.setLayout(new BorderLayout());

        //frame.getContentPane().add(lblHeading,BorderLayout.PAGE_START);
        tabledt.add(scrollPane,BorderLayout.CENTER);

     //calcdt .add(scrollPane);    
    this .add(bg);        
    this .setLayout(null);
    this.setBounds(0,0,1400,700);
    //this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    //this.setLocation(330,120);
    //this.add(jp);
    this.setUndecorated(true);
    this.setVisible(true);
    }
   /* public static void main(String args[]){
        billing bg = new billing();
        
    }*/
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
      if (e.getSource()== close){
                
                setVisible(false);
                
              
            }
      if (e.getSource() == tfid){
         String id = tfid.getText();
         try{
             Connection con = ConnectionProvider.getCon();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("select * from customer_details where Cust_ID like '"+id+"'");
             if (rs.next())
             {
                  tfid.setText(rs.getString(1)); 
                 tfname.setText(rs.getString(2));
                 tfsurname.setText(rs.getString(3)); 
                 tfnumber.setText(rs.getString(4)); 
                 gender.setSelectedItem(rs.getString(5));
             }
             else{
                 tfname.setText("");
                 tfsurname.setText("");
                 tfnumber.setText("");
                 gender.setSelectedItem("");
                  JOptionPane.showMessageDialog(null,"There is no Customer with this ID "); 
             }
             }
         catch(Exception s){
             JOptionPane.showMessageDialog(null,s);    
         }
      }
      
        if (e.getSource() == protfid){
        String id = protfid.getText();
           try{
               Connection con = ConnectionProvider.getCon();
               Statement st = con.createStatement();
               ResultSet rs=st.executeQuery("select * from product_details where P_Id like '"+id+"'");
               if(rs.next())
               {
                    
                 //pid.setText(rs.getString(1)); 
                 protfname.setText(rs.getString(2));
                 pricetf.setText(rs.getString(3)); 
                 tfquantity.setText(rs.getString(4)); 
                 tfgst.setText(rs.getString(5));
                 tfhsn.setText(rs.getString(6));
                 tfsupp.setText(rs.getString(7));
                 
                 if(((tfquantity.getText())).equals("0")||(Integer.parseInt(tfquantity.getText()))<(0)){
                   tfquantity.setEditable(false);
                   JOptionPane.showMessageDialog(null,"Sorry!!!This product is not Available");
                   add.setEnabled(false);
           }
               else{
                   tfquantity.setEditable(true);
                   add.setEnabled(true); 
               }
               }
               else{
                 protfname.setText("");
                 pricetf.setText(""); 
                 tfquantity.setText(""); 
                 tfgst.setText("");
                 tfhsn.setText("");
                 tfsupp.setText("");
                 }
               
        }
           catch(SQLException s){
               JOptionPane.showMessageDialog(null,s);    
           }
        }
       if(e.getSource()==add){
           try{
               
           int rate = Integer.parseInt(pricetf.getText());
            int qt = Integer.parseInt(tfquantity.getText());
            int total = rate*qt;
           if(qt==0){
               JOptionPane.showMessageDialog(null, "There is  no enough stock of '"+protfname.getText()+"' to add");
               tfquantity .setEditable(false);
               add.setEnabled(false);
           }
           else{
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            model.addRow(new Object []{protfname.getText(),rate,qt,total});
            finaltotal = finaltotal + total;
            String finaltotal1 = String.valueOf(finaltotal);
            tftotal.setText(finaltotal1);
           }
           }
           catch(Exception f){
            JOptionPane.showMessageDialog(null,f); 
         }
           
        }
       if(e.getSource()== tfptotal){
           String paidamount = tfptotal.getText();
           int z= Integer.parseInt(paidamount);
           finaltotal = z - finaltotal;
           String finaltotal1=String.valueOf(finaltotal);
           if(finaltotal < 0){
             JOptionPane.showMessageDialog(null,"Invalid Return Value"); 
          
           }
           else{
           tfrtotal.setText(finaltotal1);
           
           tfrtotal.setEditable(false);
       }
       }
       if(e.getSource()==reset){
           tfrtotal.setText("");
           
            billing b = new billing();
            
            b.setVisible(true);
            setVisible(false);
       }
       if(e.getSource()==save){
         String name= tfname.getText();
         String surname=tfsurname.getText();
         String number =tfnumber.getText();
         String path="E:\\";
         com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
         try{
           PdfWriter.getInstance(doc,new FileOutputStream(path+""+name+" "+".pdf"));
           doc.open();
           Paragraph paragraph1 = new Paragraph("                                    Harsha Stationery\n                                   Contact No:9945201245");
           doc.add(paragraph1);
           Paragraph paragraph2= new Paragraph("\nDate and time :"+datetf.getText()+" "+timetf.getText()+"\n\nBuyer Details:\nName:"+name+" "+surname+"\nContact No :"+number+"\n\n");
           doc.add(paragraph2);
           PdfPTable tbl = new PdfPTable(4);
           tbl.addCell("Name");
           tbl.addCell("Rate");
          tbl.addCell("Quantity");
          tbl.addCell("Sub Total");
          for(int i =0;i<table.getRowCount();i++){
              String n=table.getValueAt(i, 0).toString();
              String r=table.getValueAt(i, 1).toString();
              String q=table.getValueAt(i, 2).toString();
              String t=table.getValueAt(i, 3).toString();
              tbl.addCell(n);
              tbl.addCell(r);
              tbl.addCell(q);
              tbl.addCell(t);
          }
          doc.add(tbl);
          Paragraph paragraph3= new Paragraph("\nTotal :"+tftotal.getText()+"\nPaid Amount :"+tfptotal.getText()+"\nReturn Amount :"+tfrtotal.getText()+"\n\n Thank You For Visiting!!Please Come Again");
          doc.add(paragraph3);
          JOptionPane.showMessageDialog(null,"Bill Generated");
          setVisible(true);
          new billing().setVisible(false);
          }
         catch(Exception s){
            JOptionPane.showMessageDialog(null,s); 
         }
         doc.close();
         
         //stoct updation
         String id = protfid.getText();
         int tqt = 0;
         int uqt=0;
         int qt = Integer.parseInt(tfquantity.getText());
          try{
        
        Connection con =ConnectionProvider.getCon();
        Statement st=con.createStatement();
        ResultSet rs= st.executeQuery("select P_Quantity from product_details where P_ID = '"+id+" '");
         if(rs.next()){
        tqt = rs.getInt(1);
        }
          uqt = (tqt-qt);
        st.executeUpdate("UPDATE  product_details SET P_Quantity=' "+uqt+" 'where P_ID='"+id+"' ");
          }
          catch(Exception t){
                    JOptionPane.showMessageDialog(null,t);
                }
          if (uqt == 0){
              JOptionPane.showMessageDialog(null, "There is  no  remaining stock of '"+protfname.getText()+"'");
          }
          //database entry
            String num = tftotal.getText();
            String date =  datetf.getText();
            try{
                 Connection con = ConnectionProvider.getCon();
                Statement st=con.createStatement();
                st.executeUpdate("insert into Sales values('"+date+"','"+num+"')");
               // JOptionPane.showMessageDialog(null,"Successfully Added");
                setVisible(false);
                //new Customer().setVisible(true);
            }
             catch(HeadlessException | SQLException s){
                JOptionPane.showMessageDialog(null,s);
            }
              
          
                
       }             
         
       if(e.getSource() == remove){
           int columnindex = 3;
           
           int selectedrow = table.getSelectedRow();
           Object valueToDelete = table.getValueAt(selectedrow,columnindex);
           Integer intvalueToDelete =(Integer)valueToDelete;
           int total = Integer.parseInt(tftotal.getText());
           finaltotal = total-intvalueToDelete;
           String displayval = String.valueOf (finaltotal);
           tftotal.setText(displayval);
           if(selectedrow == -1){
               JOptionPane.showMessageDialog(null, "No Row Selected");
               return;
           }
           tableModel.removeRow(selectedrow);
           JOptionPane.showMessageDialog(null, "Sucessfully Removed ");
              
           
         
          }
          }
           } 
       
       
       
        
            
      
       
    
    
   

   

