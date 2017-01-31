package ch03gui;

import javax.swing.JFrame;

public class RunProgram {

	public static void main(String[] args) {
		JFrame f = new JFrame();
//		JPanel p = new MainPage();
//		f.add(p);
		f.add(new MainPage());
		f.setSize(400, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
}
