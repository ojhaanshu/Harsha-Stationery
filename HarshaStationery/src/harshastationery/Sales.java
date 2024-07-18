
package harshastationery;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import project.ConnectionProvider;

public class Sales extends JFrame implements ActionListener {
    //JButton close;
   public Sales(){
      // ImageIcon Iclose = new ImageIcon("C:\\Users\\Jay Tiwari\\Downloads\\hs images\\close.png");
      
       
      /* JLabel bg=new JLabel();
        bg.setBounds(0,0,1400,700);
       // bg.setIcon(img);
        
        JPanel cbg = new JPanel();
        cbg .setLayout(null);
        cbg.setBounds(0,0,1400,700);
        cbg.setBackground(new Color(234, 221, 202));
        bg.add(cbg);
       
       //upper close panel
    JPanel closepanel = new JPanel();
    closepanel.setLayout(null);
    closepanel.setBounds(0,0,880,30);
    closepanel.setBackground(new Color(0,0,0));
    cbg.add(closepanel);
       
     close = new JButton();
    close.setBounds(850,0,30,30);
    close.setIcon(Iclose);
    close.setFocusable(false);
    close.addActionListener(this);
    closepanel.add(close);*/
    
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
         try{
               Connection con = ConnectionProvider.getCon();
               
              String query = "SELECT Date, SUM(Sales) AS total_sales FROM sales GROUP BY Date ORDER BY Date DESC LIMIT 7 ";
               PreparedStatement statement = con.prepareStatement(query);
                ResultSet rs = statement.executeQuery();
                 while (rs.next()) {
                String date = rs.getString("Date");
                int sales = rs.getInt("total_sales");
                dataset.addValue(sales, "Sales", date);
               // rs.close();
            //statement.close();
           // con.close();
            }
        }
           catch(SQLException s){
               JOptionPane.showMessageDialog(null,s);    
           }
          JFreeChart barChart = ChartFactory.createBarChart(
                " Sales Report", // Chart title
                "Date", // X-axis label
                "Sales", // Y-axis label
                dataset); // Dataset
           
        // Display the chart in a JFrame
        //JFrame frame = new JFrame("Sales Bar Graph");
      //  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(700, 500));
        chartPanel.setBackground(Color.YELLOW);
        setLocation(300,150);
      // this .setLayout(null);
        this.add(chartPanel);
        //this.add(bg);
        
        
      // this.setBounds(0 ,0,1400,700);
        this.pack();
        //this.setVisible(true);
      //  this .setLayout(null);
       // this.setUndecorated(true);
        this.setVisible(true);
    
    //this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    //this.setLocation(330,120);
    //this.add(jp);
    
    
        }
  /* public static void main(String args[]){
       Sales sl = new Sales();
   }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
    }


    

