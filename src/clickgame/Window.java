package clickgame;

import javax.swing.JFrame;

public class Window extends JFrame {
	
	
	//Default constructor
	public Window() {
		setTitle("Click game");
		initUI();
	}
	
	//constructor
	
	public Window(String title) {
		super(title);
		initUI();
		
	}
	
	private void initUI() {
		this.setSize(400, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
}
