/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jay Tiwari
 */

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class tsble {
   public static void main(String[] argv) throws Exception {
      DefaultTableModel tableModel = new DefaultTableModel();
      JTable table = new JTable(tableModel);
      tableModel.addColumn("Languages");
      tableModel.insertRow(0, new Object[] { "CSS" });
      tableModel.insertRow(0, new Object[] { "HTML5" });
      tableModel.insertRow(0, new Object[] { "JavaScript" });
      tableModel.insertRow(0, new Object[] { "jQuery" });
      tableModel.insertRow(0, new Object[] { "AngularJS" });
      tableModel.insertRow(tableModel.getRowCount(), new Object[] { "ExpressJS" });
      JFrame f = new JFrame();
      f.setSize(550, 350);
      f.add(new JScrollPane(table));
      f.setVisible(true);
   }
}