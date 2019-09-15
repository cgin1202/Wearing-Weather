/*
 * 
 * 프로그램 명 : 인트로
 * 프로그램 작성자 : 최승진
 * 프로그램 작성일 : 2017/11/24
 * 프로그램 설명 : 제작팀의 로고가
 * 페이드인, 페이드아웃 되는 화면이다
 */
 


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.image.*;
import java.util.TimerTask;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Intro extends JPanel {

	JLabel pic;
	JPanel contentPane;
	Timer tm;
	int x=0;
	int y=0;
	
	String[] list={
			"img/logo_a1.png",//0 
			"img/logo_a2.png",//1
			"img/logo_a3.png",//2
			"img/logo_a4.png",//3
			"img/logo_a5.png",//4
			"img/logo_a6.png",//5
			"img/logo_a7.png",//6
			"img/logo_a8.png",//7
			"img/logo_a9.png",//8
			"img/logo_a91.png",//9
			"img/logo_a92.png",//10
			"img/logo_a93.png"//11
	};
	public Intro() {
		pic = new JLabel();
		pic.setBounds(0, 0, 1280, 720);
		setImageSize(0);
		tm = new Timer(100,new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try{
					
					setImageSize(x);
					if(x<12 && y==0)
						x=x+1;
					
					if(x==12 && y==0) {
						Thread.sleep(2000);
						y=1;
					}
					
					if(x<=12 && y==1 && x>0){
						x=x-1;
						
					}
					else if(x<= 0 && y==1) {
						setImageSize(0);
						
						//Thread.sleep(1000);
						RealFrame.Pane.removeAll();
						RealFrame.Pane.repaint();
						RealFrame.Pane.revalidate();
						RealFrame.Pane.add(RealFrame.p1);
						RealFrame.Pane.repaint();
						RealFrame.Pane.revalidate();
						tm.stop();
					}
				}catch(Exception e){
					e.printStackTrace();
				}
				
			}
			
		});
		
		add(pic);
		tm.start();
		setLayout(null);
		setSize(1280,720);
		//getContentPane().setBackground(c);
		//setLocationRelativeTo(null);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void setImageSize(int i){
		ImageIcon icon = new ImageIcon(list[i]);
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		pic.setIcon(newImc);
	}
}
