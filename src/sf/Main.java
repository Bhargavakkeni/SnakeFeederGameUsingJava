package sf;

import javax.swing.JFrame;
import java.awt.Color;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame obj = new JFrame();
		GamePlay gameplay = new GamePlay();
		obj.setBounds(10,10,900,700);
		obj.setBackground(Color.DARK_GRAY);
		obj.setResizable(true);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gameplay);
	}

}
