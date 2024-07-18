 package harshastationery;

 import project.ConnectionProvider;
import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class login  extends JFrame implements ActionListener,MouseListener{

    static String globaldg;
    
    
    JButton btn1 = new JButton();
     JButton close ;
    JCheckBox checkbox1;
    JPasswordField password;
    JTextField username;
    JLabel register;
     JComboBox whoisit;
    
    login(){
        
        //image
        ImageIcon img = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\bground.png");
        Image image= img.getImage();
        Image temp_img = image.getScaledInstance(1400,700,Image.SCALE_SMOOTH);
        img= new ImageIcon(temp_img);
        
        ImageIcon usernamelogo = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\logo.png");
        
        ImageIcon Logo = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\cornerlogo.png");
        
        ImageIcon title = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\coollogo_com-10713976.png");
        
        ImageIcon logotitle = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\coollogo_com-6463727.png");
        
        ImageIcon passwordlogo = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\password.png");
        
        ImageIcon  loginlogo = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\logo of login.png");
        
        ImageIcon closelogo = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\close.png");
        
        ImageIcon whoimg = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\question.png");
        
        
        
         //font
        //Font f = new Font("alegreya black",Font.BOLD,55);
        Font f1 = new Font("alegreya black",Font.BOLD,18);
        
        
        
        //background image on label
        JLabel bg=new JLabel("",img,JLabel.CENTER);
        bg.setBounds(0,0,1400,700);
        bg.setIcon(img);
        
        
        // heading panel
        JPanel heading = new JPanel();
        heading .setLayout(null);
        heading.setBounds(0,0,1400,100);
        heading.setBackground(new Color(0,0,0,98));
        bg.add(heading);
        
       
       
        //text on heading
        JLabel text = new JLabel();
        text.setIcon(title);
        text.setLayout(null);
        text.setBounds(340,5,870,100);
        heading.add(text);
        //text.setFont(f);
        //text.setForeground(new Color(255,255,255));
        
        
        //corner logo
        JLabel logoLabel = new JLabel();
        logoLabel.setIcon(Logo);
        logoLabel.setLayout(null);
        logoLabel.setBounds(20,0,100,100);
        heading.add(logoLabel);
        
        //Login panel
        JPanel login = new JPanel();
        login.setLayout(null);
        login.setBounds(510,190,380,390);
        login.setBackground(new Color(0,0,0));
        bg.add(login);
        
        //login logo on login panel
        JLabel logo=new JLabel();
        logo.setIcon(logotitle);
        logo.setLayout(null);
        logo.setBounds(50,10,280,120);
        login.add(logo);
        
        JLabel who=new JLabel("Designation :");
        who.setBounds(50,130,120,50);
        who.setFont(f1);
        who.setBackground(Color.black);
        who.setForeground(Color.white);
        login.add(who);
        
        JLabel wholabel = new JLabel();
        wholabel.setBounds(27,145,20,20);
        wholabel.setBackground(Color.WHITE);
        wholabel.setIcon(whoimg);
        login.add(wholabel);
        
        //username title
        JLabel un=new JLabel("Username :");
        un.setBounds(50,180,120,50);
        un.setFont(f1);
        un.setBackground(Color.black);
        un.setForeground(Color.white);
        login.add(un);
        
        //username logo
        JLabel logolabel = new JLabel();
        logolabel.setBounds(27,195,20,20);
        logolabel.setBackground(Color.WHITE);
        logolabel.setIcon(usernamelogo);
        login.add(logolabel);
        
        //password title
        JLabel ps=new JLabel("Password :");
        ps.setBounds(50,228,100,50);
        ps.setFont(f1);
        ps.setBackground(Color.black);
        ps.setForeground(Color.white);
        login.add(ps);
        
        //password logo
        JLabel passwordlabel = new JLabel();
        passwordlabel.setBounds(27,240,20,20);
        passwordlabel.setBackground(Color.WHITE);
        passwordlabel.setIcon(passwordlogo);
        login.add(passwordlabel);
        
         String[] desig={"Admin","Employee"};
        whoisit =new JComboBox(desig);
        whoisit.setBounds(170,140,100,25);
        whoisit.setBackground(Color.WHITE);
        login.add(whoisit);
        
        
        username = new JTextField();
        username.setBounds(165,190,180,25);
        login.add(username);
        
        password = new JPasswordField();
        password.setBounds(165,240,180,25);
        password.addActionListener(this);
        login.add(password);
        
        
        btn1.setText("Login");
        btn1.setBounds(90,300,90,30);
        btn1.setFocusable(false);
        btn1.setIcon(loginlogo);
        btn1.addActionListener(this);
        login.add(btn1);
        
        close = new JButton("close");
        close.setBounds(200,300,90,30);
        close.setFocusable(false);
        close.addActionListener(this);
        close.setIcon(closelogo);
        login.add(close);
        
        checkbox1=new JCheckBox("Show password",false);
        checkbox1.setBounds(165,270,120,20);
        checkbox1.setBackground(new Color(0,0,0));
        checkbox1.setForeground(new Color(255,255,255));
        checkbox1.addActionListener(this);
        checkbox1.setFocusable(false);
        login.add(checkbox1);
        
        register = new JLabel("To Register ,CLICK HERE");
        register.setBounds(130,360,150,15);
        register.setForeground( Color.WHITE);
        register.addMouseListener(this);
        login.add(register);
        
        
        
        
         //frame initialization
        
        this.setBounds(0,0,1400,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(bg);
        this.setUndecorated(true);
        this.setVisible(true);
       
        
    } 
   
     
        
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn1){
             if((username.getText().equals("")) || (password.getText().equals(""))){
              JOptionPane.showMessageDialog(null,"username or password is missing");  
            }
             else{
           String name=username.getText();
         String pass= password.getText();
         String dg = (String)whoisit.getSelectedItem();

           try {
        // Creating Connection Object
        Connection con = ConnectionProvider.getCon();
        PreparedStatement Pstatement = con.prepareStatement("SELECT Name, password,designation FROM registration WHERE Name = ? AND password = ? AND designation=? ");
        Pstatement.setString(1, name);
        Pstatement.setString(2, pass);
        Pstatement.setString(3,dg);
        ResultSet result = Pstatement.executeQuery();
        if (result.next()) {
             homepage hm =new homepage();
             JOptionPane.showMessageDialog(null, "Login Successfully");
           globaldg = dg; 
           
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid Username OR Password OR Designation");
            username.setText("");
            password.setText("");
        }
        
        } catch (SQLException s) {
           // Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,s);
        }
          
             }
    }

            
        
        
        if(e.getSource()== close){int a = JOptionPane.showConfirmDialog(null,"do you really want to Exit","Select",JOptionPane.YES_NO_OPTION);
            if(a==0){
                System.exit(0);
            }
            
        }
        if (e.getSource()== checkbox1){
            if (checkbox1.isSelected()) {
      password.setEchoChar((char)0); //password = JPasswordField
   } else {
      password.setEchoChar('*');
   }
}
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    if (e.getSource()==register){
        Registration rg= new Registration();
        this.setVisible(false);
    }   
    }

    @Override
    public void mousePressed(MouseEvent e) {
         }
    

    @Override
    public void mouseReleased(MouseEvent e) {
        }

    @Override
    public void mouseEntered(MouseEvent e) {
        register.setForeground(Color.BLUE);
         }

    @Override
    public void mouseExited(MouseEvent e) {
        register.setForeground(Color.WHITE);
        }

}  
