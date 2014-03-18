package Driver;

import javax.swing.JFrame;

public class Game {
	public static void main(String[] args) {
		// Title and game frame.
		JFrame window = new JFrame("Platform Boy V1.0");
		window.setContentPane(new GamePanel());
		window.setResizable(false);
		window.pack();
		window.setVisible(true);
	}
}
