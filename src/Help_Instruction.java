import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class Help_Instruction extends JPanel {

   JLabel pic;
   String[] list={
         "img/help_instruction.png"
   };
   
   public Help_Instruction() {
      
      ImageIcon ii = new ImageIcon("res/back.png");
      
      pic = new JLabel();
      pic.setBounds(0, 0, 1250,700);
      setLayout(null);
      setSize(1280,720);
      JButton btnNewButton = new JButton(ii);
      btnNewButton.setBounds(1021, 548, 200, 100);
      btnNewButton.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            RealFrame.Pane.removeAll();
            RealFrame.Pane.repaint();
            RealFrame.Pane.revalidate();
            
            RealFrame.Pane.add(RealFrame.p1);
            RealFrame.Pane.repaint();
            RealFrame.Pane.revalidate();
         }
      });
      add(btnNewButton);
      setImageSize(0);
      add(pic);
   }
   public void setImageSize(int i){
      ImageIcon icon = new ImageIcon(list[i]);
      Image img = icon.getImage();
      Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
      ImageIcon newImc = new ImageIcon(newImg);
      pic.setIcon(newImc);
   }
   

}