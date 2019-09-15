/*
 * 프로그램 명 : 리얼 크레딧
 * 프로그램 작성자 : 고민재, 박경민
 * 프로그램 작성일 : 2017/11/24
 * 프로그램 설명 : 온도에 따라
 * 그날의 추천 옷차림을 보여주는
 * 화면이다
 */


import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class RealClothes extends JPanel {
	
	
   /**
    * Create the panel.
    */
   public RealClothes() {
	   float ondo = 0;
	   ondo = Float.parseFloat(RealFrame.xml.getTemp()[0]);
	   setBackground(Color.white);
      setLayout(null);
      if (ondo <= 9 && ondo >= 6) {
         ImageIcon i1 = new ImageIcon("clothesImg/ninetosix1.png");
         ImageIcon i2 = new ImageIcon("clothesImg/ninetosix2.png");
         ImageIcon i3 = new ImageIcon("clothesImg/back.png");
         ImageIcon i4 = new ImageIcon("clothesImg/ninetosix88.png");
         ImageIcon i5 = new ImageIcon("clothesImg/ninetosix77.png");
         ImageIcon i6 = new ImageIcon("clothesImg/white.png");
         ImageIcon i0 =new ImageIcon("clothesImg/todaycodi.png");
      JLabel lblNewLabel = new JLabel(i0);
      lblNewLabel.setBounds(0, 0, 1262, 150);
      add(lblNewLabel);
      
      JLabel lblNewLabel_1 = new JLabel(i4);
      lblNewLabel_1.setBounds(0, 150, 191, 423);
      add(lblNewLabel_1);
      
      JLabel lblNewLabel_2 = new JLabel(i5);
      lblNewLabel_2.setBounds(1071, 150, 191, 423);
      add(lblNewLabel_2);
      
      JLabel lblNewLabel_3 = new JLabel(i2);
      lblNewLabel_3.setBounds(191, 150, 440, 423);
      add(lblNewLabel_3);
      
      JLabel lblNewLabel_4 = new JLabel(i1);
      lblNewLabel_4.setBounds(631, 150, 440, 423);
      add(lblNewLabel_4);
      
      JButton btnNewButton = new JButton(i3);
      btnNewButton.setBounds(1062, 573, 200, 100);
      add(btnNewButton);
      btnNewButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				RealFrame.Pane.removeAll();
				RealFrame.Pane.repaint();
				RealFrame.Pane.revalidate();
				RealFrame.Pane.add(RealFrame.p0);
				RealFrame.Pane.repaint();
				RealFrame.Pane.revalidate();
			}
		});
      }
       else if (ondo<=5) {
         ImageIcon i1 = new ImageIcon("clothesImg/five1.png");
         ImageIcon i2 = new ImageIcon("clothesImg/five2.png");
         ImageIcon i3 = new ImageIcon("clothesImg/back.png");
         ImageIcon i4 = new ImageIcon("clothesImg/ninetosix55.png");
         ImageIcon i5 = new ImageIcon("clothesImg/ninetosix66.png");
         ImageIcon i6 = new ImageIcon("clothesImg/white.png");
         ImageIcon i0 =new ImageIcon("clothesImg/todaycodi.png");
      JLabel lblNewLabel = new JLabel(i0);
      lblNewLabel.setBounds(0, 0, 1262, 150);
      add(lblNewLabel);
      
      JLabel lblNewLabel_1 = new JLabel(i4);
      lblNewLabel_1.setBounds(0, 150, 191, 423);
      add(lblNewLabel_1);
      
      JLabel lblNewLabel_2 = new JLabel(i5);
      lblNewLabel_2.setBounds(1071, 150, 191, 423);
      add(lblNewLabel_2);
      
      JLabel lblNewLabel_3 = new JLabel(i2);
      lblNewLabel_3.setBounds(191, 150, 440, 423);
      add(lblNewLabel_3);
      
      JLabel lblNewLabel_4 = new JLabel(i1);
      lblNewLabel_4.setBounds(631, 150, 440, 423);
      add(lblNewLabel_4);
      
      JButton btnNewButton = new JButton(i3);
      btnNewButton.setBounds(1062, 573, 200, 100);
      add(btnNewButton);
      btnNewButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				RealFrame.Pane.removeAll();
				RealFrame.Pane.repaint();
				RealFrame.Pane.revalidate();
				RealFrame.Pane.add(RealFrame.p0);
				RealFrame.Pane.repaint();
				RealFrame.Pane.revalidate();
			}
		});
    
      }
       else if (ondo>=10&&ondo<=12) {
         ImageIcon i1 = new ImageIcon("clothesImg/1012.1.png");
         ImageIcon i2 = new ImageIcon("clothesImg/1012.2.png");
         ImageIcon i3 = new ImageIcon("clothesImg/back.png");
         ImageIcon i4 = new ImageIcon("clothesImg/ninetosix11.png");
         ImageIcon i5 = new ImageIcon("clothesImg/ninetosix22.png");
         ImageIcon i6 = new ImageIcon("clothesImg/white.png");
         ImageIcon i0 =new ImageIcon("clothesImg/todaycodi.png");
      JLabel lblNewLabel = new JLabel(i0);
      lblNewLabel.setBounds(0, 0, 1262, 150);
      add(lblNewLabel);
      
      JLabel lblNewLabel_1 = new JLabel(i4);
      lblNewLabel_1.setBounds(0, 150, 191, 423);
      add(lblNewLabel_1);
      
      JLabel lblNewLabel_2 = new JLabel(i5);
      lblNewLabel_2.setBounds(1071, 150, 191, 423);
      add(lblNewLabel_2);
      
      JLabel lblNewLabel_3 = new JLabel(i2);
      lblNewLabel_3.setBounds(191, 150, 440, 423);
      add(lblNewLabel_3);
      
      JLabel lblNewLabel_4 = new JLabel(i1);
      lblNewLabel_4.setBounds(631, 150, 440, 423);
      add(lblNewLabel_4);
      
      JButton btnNewButton = new JButton(i3);
      btnNewButton.setBounds(1062, 573, 200, 100);
      add(btnNewButton);
      btnNewButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				RealFrame.Pane.removeAll();
				RealFrame.Pane.repaint();
				RealFrame.Pane.revalidate();
				RealFrame.Pane.add(RealFrame.p0);
				RealFrame.Pane.repaint();
				RealFrame.Pane.revalidate();
			}
		});
      }
       else if (ondo<=16&&ondo>=13) {
         ImageIcon i1 = new ImageIcon("clothesImg/1316.1.png");
         ImageIcon i2 = new ImageIcon("clothesImg/1316.2.png");
         ImageIcon i3 = new ImageIcon("clothesImg/back.png");
         ImageIcon i4 = new ImageIcon("clothesImg/ninetosix33.png");
         ImageIcon i5 = new ImageIcon("clothesImg/ninetosix44.png");
         ImageIcon i6 = new ImageIcon("clothesImg/white.png");
         ImageIcon i0 =new ImageIcon("clothesImg/todaycodi.png");
      JLabel lblNewLabel = new JLabel(i0);
      lblNewLabel.setBounds(0, 0, 1262, 150);
      add(lblNewLabel);
      
      JLabel lblNewLabel_1 = new JLabel(i4);
      lblNewLabel_1.setBounds(0, 150, 191, 423);
      add(lblNewLabel_1);
      
      JLabel lblNewLabel_2 = new JLabel(i5);
      lblNewLabel_2.setBounds(1071, 150, 191, 423);
      add(lblNewLabel_2);
      
      JLabel lblNewLabel_3 = new JLabel(i2);
      lblNewLabel_3.setBounds(191, 150, 440, 423);
      add(lblNewLabel_3);
      
      JLabel lblNewLabel_4 = new JLabel(i1);
      lblNewLabel_4.setBounds(631, 150, 440, 423);
      add(lblNewLabel_4);
      
      JButton btnNewButton = new JButton(i3);
      btnNewButton.setBounds(1062, 573, 200, 100);
      add(btnNewButton);
      btnNewButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				RealFrame.Pane.removeAll();
				RealFrame.Pane.repaint();
				RealFrame.Pane.revalidate();
				RealFrame.Pane.add(RealFrame.p0);
				RealFrame.Pane.repaint();
				RealFrame.Pane.revalidate();
			}
		});
      
      }
     
   }

}