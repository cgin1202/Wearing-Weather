

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.xml.sax.SAXException;

import java.awt.image.*;
import java.io.IOException;
import java.util.TimerTask;
import java.awt.event.*;

import javax.swing.*;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class Select_Area extends JPanel {
	
	JLabel pic;
	JLabel pic2;
	JLabel pic3;
	
	JLabel pic5;
	
	//Timer tm;
	int x=0;
	int y=0;
	
	String[] list={
			"img/Select_Area2.png"
	};
	String[] dot ={
			"img/Red_Dot2.png"
	};
	String[] ground={
			"img/Ground.PNG"
	};
	String[] famous={
			"img/11.jpg",
			"img/41.jpg",
			"img/13.jpg",
			"img/14.jpg",
			"img/15.jpg",
			"img/16.jpg",
			"img/44.jpg",
			"img/18.jpg",
			"img/19.jpg",
			"img/20.jpg",
			"img/21.jpg",
			"img/22.jpg",
			"img/23.jpg"
	};
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Select_Area() {
		//super("");
		setBackground(Color.BLUE);
		setLayout(null);
		
		pic5= new JLabel();
		pic5.setBounds(692, 212, 240, 183);
		add(pic5);
		
		pic2= new JLabel();
		pic2.setBounds(0, 0, 0, 0);
		add(pic2);
		
		
		JCheckBox checkBox = new JCheckBox("\uC11C\uC6B8\uD2B9\uBCC4\uC2DC");
		checkBox.setBounds(940, 60, 115, 23);
		add(checkBox);
		JCheckBox checkBox_1 = new JCheckBox("\uD3C9\uCC3D");
		checkBox_1.setBounds(940, 87, 115, 23);
		add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("\uC778\uCC9C\uAD11\uC5ED\uC2DC");
		checkBox_2.setBounds(940, 112, 115, 23);
		add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("\uCCAD\uC8FC");
		checkBox_3.setBounds(940, 137, 115, 23);
		add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("\uB300\uC804");
		checkBox_4.setBounds(940, 162, 115, 23);
		add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("\uCC9C\uC548");
		checkBox_5.setBounds(940, 187, 115, 23);
		add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("\uD3EC\uD56D");
		checkBox_6.setBounds(940, 212, 115, 23);
		add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("\uB300\uAD6C");
		checkBox_7.setBounds(940, 237, 115, 23);
		add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("\uBD80\uC0B0\uAD11\uC5ED\uC2DC");
		checkBox_8.setBounds(940, 262, 115, 23);
		add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("\uC804\uC8FC");
		checkBox_9.setBounds(940, 287, 115, 23);
		add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("\uAD11\uC8FC\uAD11\uC5ED\uC2DC");
		checkBox_10.setBounds(940, 311, 115, 23);
		add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("\uC81C\uC8FC\uB3C4");
		checkBox_11.setBounds(940, 335, 115, 23);
		add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("\uC744\uB989\uB3C4");
		checkBox_12.setBounds(940, 360, 115, 23);
		add(checkBox_12);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(checkBox_1);
		bg.add(checkBox_2);
		bg.add(checkBox_3);
		bg.add(checkBox_4);
		bg.add(checkBox_5);
		bg.add(checkBox_6);
		bg.add(checkBox_7);
		bg.add(checkBox_8);
		bg.add(checkBox_9);
		bg.add(checkBox_10);
		bg.add(checkBox_11);
		bg.add(checkBox_12);
		bg.add(checkBox);
		
		JButton btnNewButton = new JButton("»Æ ¿Œ");
		btnNewButton.setBounds(940, 389, 115, 32);
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				RealFrame.xml.SetLocation(RealFrame.locationNum);
				RealFrame.p0.locationLabel.setText(RealFrame.xml.locationName);
				RealFrame.p0.Temperate.setText(RealFrame.xml.temp[0]);
				RealFrame.p0.NALSI.setText(RealFrame.xml.wfKor[0]);
	            if(RealFrame.xml.wfEn[0].equals("Cloudy"))
	               RealFrame.p0.today = new ImageIcon("res/cloudy.gif");
	            else if(RealFrame.xml.wfEn[0].equals("Clearly"))
	               RealFrame.p0.today = new ImageIcon("res/clearly.gif");
	            else if(RealFrame.xml.wfEn[0].equals("Rainy"))
	               RealFrame.p0.today = new ImageIcon("res/Rain.gif");
	            else if(RealFrame.xml.wfEn[0].equals("Snow"))
	               RealFrame.p0.today = new ImageIcon("res/snow.gif");
	            else if(RealFrame.xml.wfEn[0].equals("Mostly Cloudy"))
	               RealFrame.p0.today = new ImageIcon("res/mostlycloudy.gif");
	            else if(RealFrame.xml.wfEn[0].equals("Partly Cloudy"))
	            	RealFrame.p0.today = new ImageIcon("res/PartlyCloudy.gif");
	            else if(RealFrame.xml.wfEn[0].equals("Snow/Rain"))
	            	RealFrame.p0.today = new ImageIcon("res/snow.gif");
	            else
	               RealFrame.p0.today = new ImageIcon("res/clearly.gif");
	            RealFrame.p0.todayButton.setIcon(RealFrame.p0.today);
				RealFrame.Pane.removeAll();
				RealFrame.Pane.repaint();
				RealFrame.Pane.revalidate();
				RealFrame.Pane.add(RealFrame.p0);
				RealFrame.Pane.repaint();
				RealFrame.Pane.revalidate();
			}
		});
		
		checkBox.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange()==ItemEvent.SELECTED){
					pic2.setBounds(290,115, 10, 10);
					setImageSize2(0);
					
					pic5.setBounds(570, 300, 320, 200);
					setImageSize5(0);
					
					RealFrame.locationNum = 1;
					RealFrame.xml.CreateData();
					RealFrame.p0.todayTemp=RealFrame.xml.temp;
				}
					
			}
		});
		
		checkBox_1.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange()==ItemEvent.SELECTED){
					pic2.setBounds(405, 125, 10, 10);
					setImageSize2(0);
					
					pic5.setBounds(570, 300, 320, 200);
					setImageSize5(1);
					
					RealFrame.locationNum = 2;
					RealFrame.xml.CreateData();
					RealFrame.p0.todayTemp=RealFrame.xml.temp;
				}
					
			}
		});
		
		checkBox_2.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange()==ItemEvent.SELECTED){
					pic2.setBounds(265, 115, 10, 10);
					setImageSize2(0);
					
					pic5.setBounds(570, 300, 320, 200);
					setImageSize5(2);
					
					RealFrame.locationNum = 3;
					RealFrame.xml.CreateData();
					RealFrame.p0.todayTemp=RealFrame.xml.temp;
				}
					
			}
		});
		
		checkBox_3.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange()==ItemEvent.SELECTED){
					pic2.setBounds(335, 220, 10, 10);
					setImageSize2(0);
					
					pic5.setBounds(570, 300, 320, 200);
					setImageSize5(3);
					
					RealFrame.locationNum = 0;
					RealFrame.xml.CreateData();
					RealFrame.p0.todayTemp=RealFrame.xml.temp;
				}
					
			}
		});
		
		checkBox_4.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange()==ItemEvent.SELECTED){
					pic2.setBounds(320, 250, 10, 10);
					setImageSize2(0);
					
					pic5.setBounds(570, 300, 320, 200);
					setImageSize5(4);
					
					RealFrame.locationNum = 4;
					RealFrame.xml.CreateData();
					RealFrame.p0.todayTemp=RealFrame.xml.temp;
				}
					
			}
		});
		
		checkBox_5.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange()==ItemEvent.SELECTED){
					pic2.setBounds(300, 195, 10, 10);
					setImageSize2(0);
					
					pic5.setBounds(570, 300, 320, 200);
					setImageSize5(5);
					
					RealFrame.locationNum = 5;
					RealFrame.xml.CreateData();
					RealFrame.p0.todayTemp=RealFrame.xml.temp;
				}
					
			}
		});
		
		checkBox_6.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange()==ItemEvent.SELECTED){
					pic2.setBounds(480, 270, 10, 10);
					setImageSize2(0);
					
					pic5.setBounds(570, 300, 320, 200);
					setImageSize5(6);
					
					RealFrame.locationNum = 6;
					RealFrame.xml.CreateData();
					RealFrame.p0.todayTemp=RealFrame.xml.temp;
				}
					
			}
		});
		
		checkBox_7.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange()==ItemEvent.SELECTED){
					pic2.setBounds(420, 310, 10, 10);
					setImageSize2(0);
					
					pic5.setBounds(570, 300, 320, 200);
					setImageSize5(7);
					
					RealFrame.locationNum = 7;
					RealFrame.xml.CreateData();
					RealFrame.p0.todayTemp=RealFrame.xml.temp;
				}
					
			}
		});
		
		checkBox_8.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange()==ItemEvent.SELECTED){
					pic2.setBounds(460, 370, 10, 10);
					setImageSize2(0);
					
					pic5.setBounds(570, 300, 320, 200);
					setImageSize5(8);
					
					RealFrame.locationNum = 8;
					RealFrame.xml.CreateData();
					RealFrame.p0.todayTemp=RealFrame.xml.temp;
				}
					
			}
		});
		
		checkBox_9.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange()==ItemEvent.SELECTED){
					pic2.setBounds(290, 310, 10, 10);
					setImageSize2(0);
					
					pic5.setBounds(570, 300, 320, 200);
					setImageSize5(9);
					
					RealFrame.locationNum = 9;
					RealFrame.xml.CreateData();
					RealFrame.p0.todayTemp=RealFrame.xml.temp;
					System.out.printf("%d %s",RealFrame.locationNum,RealFrame.xml.temp[0]);
				}
					
			}
		});
		
		checkBox_10.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange()==ItemEvent.SELECTED){
					pic2.setBounds(260, 375, 10, 10);
					setImageSize2(0);
					
					pic5.setBounds(570, 300, 320, 200);
					setImageSize5(10);
					
					RealFrame.locationNum = 10;
					RealFrame.xml.CreateData();
					RealFrame.p0.todayTemp=RealFrame.xml.temp;
					System.out.printf("%d %s",RealFrame.locationNum,RealFrame.xml.temp[0]);
				}
					
			}
		});
		
		checkBox_11.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange()==ItemEvent.SELECTED){
					pic2.setBounds(245, 575, 10, 10);
					setImageSize2(0);
					
					pic5.setBounds(570, 300, 320, 200);
					setImageSize5(11);
					
					RealFrame.locationNum = 11;
					RealFrame.xml.CreateData();
					RealFrame.p0.todayTemp=RealFrame.xml.temp;
				}
					
			}
		});
		
		checkBox_12.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange()==ItemEvent.SELECTED){
					pic2.setBounds(555, 110, 10, 10);
					setImageSize2(0);
					
					pic5.setBounds(570, 300, 320, 200);
					setImageSize5(12);
					
					RealFrame.locationNum = 12;
					RealFrame.xml.CreateData();
					RealFrame.p0.todayTemp=RealFrame.xml.temp;
				}
					
			}
		});
		
		
		pic = new JLabel();
		pic.setBounds(220, 0, 373, 600);
		setImageSize(0);
		add(pic);
		add(btnNewButton);
		
		pic3= new JLabel();
		pic3.setBounds(0, 0, 1280, 720);
		setImageSize3(0);
		add(pic3);
		
		setSize(1280,720);
		//getContentPane().setBackground(c);
		//setLocationRelativeTo(null);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setVisible(true);
	}
	public void setImageSize(int i){
		ImageIcon icon = new ImageIcon(list[i]);
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		pic.setIcon(newImc);
	}
	public void setImageSize2(int i){
		ImageIcon icon = new ImageIcon(dot[i]);
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(pic2.getWidth(), pic2.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		pic2.setIcon(newImc);
	}
	public void setImageSize3(int i){
		ImageIcon icon = new ImageIcon(ground[i]);
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(pic3.getWidth(), pic3.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		pic3.setIcon(newImc);
	}
	public void setImageSize5(int i){
		ImageIcon icon = new ImageIcon(famous[i]);
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(pic5.getWidth(),pic5.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		pic5.setIcon(newImc);
	}
	
}
