package src;

import javax.swing.JFrame;

public class ElectricFanTesting{
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		ElectricFan fan = new ElectricFan();
		frame.setVisible(true);
		frame.setSize(550,250);
		frame.setTitle("Ev fan");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(fan);
				
	}	

}


