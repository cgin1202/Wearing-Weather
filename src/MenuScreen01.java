/*
 * 
 * 프로그램 명 : 메뉴 스크린
 * 프로그램 작성자 : 고민재
 * 프로그램 작성일 : 2017/11/24
 * 프로그램 설명 : 인트로가 끝나고 나오는 화면으로
 * 날씨보기, 도움말, 제작자, 프로그램종료 버튼이 있는
 * 메뉴 화면이다
 */
 

import javax.swing.JPanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

//import WearingWeather.sunnyday.MyPanel;

public class MenuScreen01 extends JPanel {

	
	public MenuScreen01() {
		setLayout(null);
		ImageIcon i1 = new ImageIcon("res/LookWeather.png");
		ImageIcon i2 = new ImageIcon("res/help.png");
		ImageIcon i3 = new ImageIcon("res/Made.png");
		ImageIcon i4 = new ImageIcon("res/Exit.png");
		
		//날씨보기
		JButton btnNewButton = new JButton(i1);
		add(btnNewButton);
		btnNewButton.setLocation(350, 400);
		btnNewButton.setSize(150, 250);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				RealFrame.Pane.removeAll();
				RealFrame.Pane.repaint();
				RealFrame.Pane.revalidate();
				
				RealFrame.Pane.add(RealFrame.p0);
				RealFrame.Pane.repaint();
				RealFrame.Pane.revalidate();
			}
		});
		
		//도움말
		JButton btnNewButton_1 = new JButton(i2);
		add(btnNewButton_1);
		btnNewButton_1.setLocation(500, 400);
		btnNewButton_1.setSize(150, 250);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				RealFrame.Pane.removeAll();
				RealFrame.Pane.repaint();
				RealFrame.Pane.revalidate();
				RealFrame.Pane.add(RealFrame.tutoria);
				RealFrame.Pane.repaint();
				RealFrame.Pane.revalidate();
			}
		});
		
		//제작자
		JButton btnNewButton_2 = new JButton(i3);
		add(btnNewButton_2);
		btnNewButton_2.setLocation(650, 400);
		btnNewButton_2.setSize(150, 250);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				RealFrame.Pane.removeAll();
				RealFrame.Pane.repaint();
				RealFrame.Pane.revalidate();
				RealFrame.Pane.add(RealFrame.cred);
				RealFrame.Pane.repaint();
				RealFrame.Pane.revalidate();
			}
		});
		
		//나가기
		JButton btnNewButton_3 = new JButton(i4);
		add(btnNewButton_3);
		btnNewButton_3.setLocation(800, 400);
		btnNewButton_3.setSize(150, 250);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				System.exit(1);
			}
		});

		ImageIcon icon = new ImageIcon("res/logo.png");
		JLabel lblNewLabel = new JLabel(icon);
		lblNewLabel.setBounds(400, 80, 500, 300);
		add(lblNewLabel);
		ImageIcon icon1 = new ImageIcon("res/Main.gif");
		JLabel background = new JLabel(icon1);
		background.setBounds(0, 0, 1280, 720);
	    add(background); 
	}
}
