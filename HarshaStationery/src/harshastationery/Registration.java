 package harshastationery;

 import project.ConnectionProvider;
import java.sql.*;
import java.util.regex.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
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

public class Registration extends JFrame implements ActionListener{
    
    
    JButton btn1 = new JButton();
     JButton close ;
     JCheckBox checkbox1;
     JPasswordField password;
     JTextField username ;
     JButton arrow;
     JComboBox whoisit;
    
    Registration(){
        
        //image
        ImageIcon img = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\bground.png");
        Image image= img.getImage();
        Image temp_img = image.getScaledInstance(1400,700,Image.SCALE_SMOOTH);
        img= new ImageIcon(temp_img);
        
        ImageIcon usernamelogo = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\logo.png");
        
        ImageIcon Logo = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\cornerlogo.png");
        
        ImageIcon title = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\coollogo_com-10713976.png");
        
        ImageIcon logotitle = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\rtitle.png");
        
        ImageIcon passwordlogo = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\password.png");
        
        ImageIcon  loginicon = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\register.png");
        
        ImageIcon closelogo = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\close.png");
        
        ImageIcon arrowlogo = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\arrow 2.png");
        
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
        login.setBounds(480,190,460,390);
        login.setBackground(new Color(0,0,0));
        bg.add(login);
        
        //login logo on login panel
        JLabel logo=new JLabel();
        logo.setIcon(logotitle);
        logo.setLayout(null);
        logo.setBounds(50,0,370,140);
        login.add(logo);
        
        
        JLabel who=new JLabel("Designation :");
        who.setBounds(70,130,120,50);
        who.setFont(f1);
        who.setBackground(Color.black);
        who.setForeground(Color.white);
        login.add(who);
        
        JLabel wholabel = new JLabel();
        wholabel.setBounds(40,145,20,20);
        wholabel.setBackground(Color.WHITE);
        wholabel.setIcon(whoimg);
        login.add(wholabel);
        
        //username title
        JLabel un=new JLabel("Username  :");
        un.setBounds(70,175,120,50);
        un.setFont(f1);
        un.setBackground(Color.black);
        un.setForeground(Color.white);
        login.add(un);
        
        //username logo
        JLabel logolabel = new JLabel();
        logolabel.setBounds(40,191,20,20);
        logolabel.setBackground(Color.WHITE);
        logolabel.setIcon(usernamelogo);
        login.add(logolabel);
        
        //password title
        JLabel ps=new JLabel("Password  :");
        ps.setBounds(70,230,110,50);
        ps.setFont(f1);
        ps.setBackground(Color.black);
        ps.setForeground(Color.white);
        login.add(ps);
        
        //password logo
        JLabel passwordlabel = new JLabel();
        passwordlabel.setBounds(40,245,20,20);
        passwordlabel.setBackground(Color.WHITE);
        passwordlabel.setIcon(passwordlogo);
        login.add(passwordlabel);
        
        
        username = new JTextField();
        username.setBounds(190,190,180,25);
        login.add(username);
        
        password = new JPasswordField();
        password.setBounds(190,240,180,25);
        login.add(password);
        
        String[] desig={"Admin","Employee"};
        whoisit =new JComboBox(desig);
        whoisit.setBounds(190,140,100,25);
        whoisit.setBackground(Color.WHITE);
        login.add(whoisit);
        
        
        
        btn1.setText("Register ");
        btn1.setBounds(90,320,110,30);
        btn1.setFocusable(false);
        btn1.setIcon(loginicon);
        btn1.addActionListener(this);
        btn1.setBackground(Color.WHITE);
        login.add(btn1);
        
        close = new JButton("close");
        close.setBounds(260,320,90,30);
        close.setFocusable(false);
        close.addActionListener(this);
        close.setIcon(closelogo);
        close.setBackground(Color.WHITE);
        login.add(close);
        
        arrow = new JButton();
        arrow.setBounds(400,340,33,33);
        arrow.setFocusable(false);
        arrow.addActionListener(this);
        arrow.setBackground(Color.BLACK);
        arrow.setIcon(arrowlogo);
        arrow.setBorderPainted(false);
        login.add(arrow);
        
        checkbox1=new JCheckBox("Show password",false);
        checkbox1.setBounds(178,275,120,20);
        checkbox1.setBackground(new Color(0,0,0));
        checkbox1.setForeground(new Color(255,255,255));
        checkbox1.addActionListener(this);
        checkbox1.setFocusable(false);
        
        login.add(checkbox1);
        
        
        
        
         //frame initialization
        
        this.setBounds(0,0,1400,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(bg);
        this.setUndecorated(true);
        this.setVisible(true);
    }
      /*  public static void main(String args [])
        {
            Registration rs = new Registration();
        }*/
        
    
   public static boolean isvalidpass(String pass){
     String regex = "^(?=.*[0-9])"+ "(?=.*[a-z])(?=.*[A-Z])"+"(?=\\S+$).{8,20}$"; 
     Pattern p = Pattern.compile(regex);
     Matcher m = p.matcher(pass);
     if(m.matches()){
         return true;
     }
     else{
         return false;
     }
   }
     
        
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==arrow){
            login ln = new login();
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
        if(e.getSource()== btn1){
            if((username.getText().equals("")) || (password.getText().equals(""))){
              JOptionPane.showMessageDialog(null,"username or password is missing");  
            }
            
            else if(username.getText().length() < 20){ 
             if(isvalidpass(password.getText())){
                
               String name=username.getText();
               String pass= password.getText();
               String dg =(String)whoisit.getSelectedItem();
              
         try{
                Connection con = ConnectionProvider.getCon();
                Statement st=con.createStatement();
                st.executeUpdate("insert into registration values('"+name+"','"+pass+"','"+dg+"')");
                JOptionPane.showMessageDialog(null,"Successfully Registered");
                new login().setVisible(true);
                setVisible(false);
                
            }
            catch(HeadlessException | SQLException s){
                JOptionPane.showMessageDialog(null,s);
            }
            }
             else{
                    JOptionPane.showMessageDialog(null,"Please enter password of right format having atleast one Capital letter,one small letter ,one number and one Symbol");
                 
                }
            } 
        else{
            JOptionPane.showMessageDialog(null,"Username Cannot be So long");
            }      
        }
        }
        }
        
    

 
