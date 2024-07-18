package harshastationery;

//import harshastationery.images.stock;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.FlowLayout;
//import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JWindow;
import project.ConnectionProvider;



public class homepage extends JFrame implements ActionListener{ 
    
    JButton customer;
    JButton product;
    JButton supplier;
    JButton employee;
    JButton stock;
    JButton sales;
    JButton invoice;
    JButton myprofile;
   
    JButton closebtn ;
    JButton logout;
    //JFrame frame = new JFrame();
   
    
    
    
    homepage(){
      
        Font lf = new Font("alegreya black",Font.BOLD,15);
        
        
        ImageIcon img = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\homepagebg.png");
        Image image= img.getImage();
        Image temp_img = image.getScaledInstance(1400,700,Image.SCALE_SMOOTH);
        img= new ImageIcon(temp_img);
        
        ImageIcon logobg = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\logoimage.png");
       
     //setting of background image
      JLabel bglabel=new JLabel("",img,JLabel.CENTER);
      bglabel.setBounds(0,0,1400,700);
      bglabel.setIcon(img);
       
       
      //setting of logo on background 
     JLabel cbg = new JLabel();
     cbg.setBounds(460,100,500,500);
     cbg.setIcon(logobg);
     bglabel.add(cbg);
     
     //horizontal option panel
     JPanel oppanel=new JPanel ();
     oppanel.setLayout(new FlowLayout(FlowLayout.LEADING,30,15));
     oppanel.setBounds(220,0,800,90);
     oppanel.setBackground( new Color(0,0,0));
     bglabel.add(oppanel);
     
     
     
     
     //options
     customer = new JButton();
     customer .setPreferredSize(new Dimension (70,70));
    // customer.addMouseListener(this);
     customer.addActionListener(this);
     customer.setBackground(Color.WHITE);
     customer.setIcon(new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\customer2.png"));
     customer.setFocusable(false);
     
     
     
     product = new JButton();
     product.addActionListener(this);
     product.setPreferredSize(new Dimension(70,70));
     product.setBackground(Color.WHITE);
     product.setIcon(new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\product2.png"));
     product.setFocusable(false);
     
     supplier = new JButton();
     supplier.addActionListener(this);
     supplier.setPreferredSize(new Dimension(70,70));
     supplier.setBackground(Color.WHITE);
     supplier.setIcon(new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\supplier.png"));
     supplier.setFocusable(false);
     
     employee = new JButton();
     employee.addActionListener(this);
     employee.setPreferredSize(new Dimension(70,70));
     employee.setBackground(Color.WHITE);
     employee.setIcon(new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\business.png"));
     employee.setFocusable(false);
     
     stock = new JButton();
     stock.addActionListener(this);
     stock.setPreferredSize(new Dimension(70,70));
     stock.setBackground(Color.WHITE);
     stock.setIcon(new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\stock.png"));
     stock.setFocusable(false);
     
     sales = new JButton();
     sales.addActionListener(this);
     sales.setPreferredSize(new Dimension(70,70));
     sales.setBackground(Color.WHITE);
     sales.setIcon(new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\sales.png"));
     sales.setFocusable(false);
     
     invoice = new JButton();
     invoice.addActionListener(this);
     invoice.setPreferredSize(new Dimension(70,70));
     invoice.setBackground(Color.WHITE);
     invoice.setIcon(new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\invoice.png"));
     invoice.setFocusable(false);
     
     myprofile = new JButton();
     myprofile.addActionListener(this);
     myprofile.setPreferredSize(new Dimension(70,70));
     myprofile.setBackground(Color.WHITE);
     myprofile.setIcon(new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\myprofile.png"));
     myprofile.setFocusable(false);
     
    
     
     oppanel.add(customer);
     oppanel.add(product);
     oppanel.add(supplier);
     oppanel.add(employee);
     oppanel.add(stock);
     oppanel.add(sales);
     oppanel.add(invoice);
     oppanel.add(myprofile);
    
     
      //horizontal panel
     JPanel hoppanel = new JPanel();
     hoppanel.setBounds(1020,0,80,120);
     hoppanel.setBackground(new Color(0,0,0));
     hoppanel.setLayout(new FlowLayout(FlowLayout.CENTER));
     bglabel.add(hoppanel);
     
     
     //horizontal options
     
     closebtn = new JButton();
     closebtn.setPreferredSize(new Dimension(40,40));
     closebtn.setBackground(Color.WHITE);
     closebtn.setIcon(new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\close1.png"));
     closebtn.addActionListener(this);
     closebtn.setFocusable(false);
     hoppanel.add(closebtn); 
     
     
     
     logout = new JButton();
     logout.setPreferredSize(new Dimension(40,40));
     logout.setBackground(Color.WHITE);
     logout.setIcon(new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\logout.png"));
     logout.setFocusable(false);
     logout.addActionListener( this);
     hoppanel.add(logout);
     
     //menunamepanel
     JPanel labelpanel = new JPanel();
     labelpanel.setBounds(220,90,850,30);
     labelpanel.setBackground(Color.black);
     labelpanel.setForeground(Color.white);
     labelpanel.setLayout(new FlowLayout( FlowLayout.LEADING,26,0));
     bglabel.add(labelpanel);
     
     
     //menunames
     JLabel Customer=new JLabel("Customer");
     Customer.setFont(lf);
     Customer.setForeground(Color.WHITE);
     //Customer.setBounds(10,10,10,10);
     
    Customer.setPreferredSize(new Dimension(70,15));
     JLabel Product=new JLabel("   Product");
     Product.setFont(lf);
     Product.setForeground(Color.WHITE);
     JLabel Supplier=new JLabel("    Supplier");
     Supplier.setFont(lf);
     Supplier.setForeground(Color.WHITE);
     JLabel Employee=new JLabel("    Employee");
     Employee.setFont(lf);
     Employee.setForeground(Color.WHITE);
     
     JLabel Stock=new JLabel("    Stock");
     Stock.setFont(lf);
     Stock.setForeground(Color.WHITE);
     JLabel Sells=new JLabel("        Sales");
     Sells.setFont(lf);
     Sells.setForeground(Color.WHITE);
     JLabel Invoice=new JLabel("        Invoice");
     Invoice.setFont(lf);
     Invoice.setForeground(Color.WHITE);
     JLabel Myprofile=new JLabel("  My Profile");
     Myprofile.setFont(lf);
     Myprofile.setForeground(Color.WHITE);
     
     
     labelpanel.add(Customer);
     labelpanel.add(Product);
     labelpanel.add(Supplier);
     labelpanel.add(Employee);
     labelpanel.add(Stock);
     labelpanel.add(Sells);
     labelpanel.add(Invoice);
     labelpanel.add(Myprofile);

     
     
     
     //frame initialization
    this .setLayout(null);
    this.setBounds(0,0,1400,700);
    //this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
     
    this.add(bglabel); 
    this.setUndecorated(true);
    this.setVisible(true);
     
    
}
    
    public static void main(String [] args){
        new homepage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==logout){
            int a = JOptionPane.showConfirmDialog(null,"do you really want to logout","Select",JOptionPane.YES_NO_OPTION);
            if(a==0){
                
                login lp = new login();
                setVisible(false);
                lp.setVisible(true);
            }
        }
        
        if(e.getSource()==closebtn){
            int a = JOptionPane.showConfirmDialog(null,"Do you really want to Exit ?","Select",JOptionPane.YES_NO_OPTION);
            if(a==0){
                System.exit(0);
            }
        }
        
        if (e.getSource()==customer){
            //this.dispose();
            Customer c = new Customer();
            c.setVisible(true);
        }
        
        if (e.getSource()==employee){
            //this.dispose();
             if(login.globaldg =="Employee"){
            JOptionPane.showMessageDialog(null, "This module is not available for Employees");}
            else{
            Employee emp = new Employee();
            emp.setVisible(true);
             }
        }
        if (e.getSource()==product){
            //this.dispose();
            Product p = new Product();
            p.setVisible(true);
        }
        if (e.getSource()==supplier){
            //this.dispose();
            if(login.globaldg =="Employee"){
            JOptionPane.showMessageDialog(null, "This module is not available for Employees");}
            else{
           Supplier sup = new Supplier();
            sup.setVisible(true);
            }
        }
        if (e.getSource()==invoice){
            //this.dispose();
           billing bill = new billing();
            bill.setVisible(true);
        
        }
         if(e.getSource()==sales){
           Sales sl = new Sales();
            sl.setVisible (true);
        }
         
        if (e.getSource()==stock){
            Stock1 sk = new Stock1();
            sk.setVisible(true);
        
        }
        
        if(e.getSource()==myprofile){
             
            Myprofile myp = new Myprofile();
            myp.setVisible(true);
        }
        
    }

   
    }
         

