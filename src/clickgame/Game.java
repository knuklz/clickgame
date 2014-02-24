package clickgame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Game {

	static int score = 0;
	
	
	static JButton pntBtn = new JButton("Add a point!");
	static JLabel scrLbl = new JLabel();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Define score variables
		
		
		//create objects for the games.
		
		scrLbl.setText("Score :" + score);
		scrLbl.setHorizontalAlignment(SwingConstants.CENTER);
		
	
		
		
		//Create a basic window
		
		final Window thingy = new Window();
			//objects that make up said game window
		
		//places the objects on the Jframe, positions them using a Border layout
		thingy.add(scrLbl, BorderLayout.CENTER);
		thingy.add(pntBtn, BorderLayout.SOUTH);
		
		
		
		
		
			
		//gameloop
		
		
	pntBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				addPnt();
				updateScore();
				if(currentScore()){
					JOptionPane.showMessageDialog(thingy, "You won the game!");
					resetGame();
				}
			}
		});
		
		
		
	}

	private static void addPnt() {
		score = score + 1;
		
	}
	
	
	private static void updateScore() {
		scrLbl.setText("Score :" + score);
		
		
	}
	
	private static void resetGame() {
		score = 0;
		scrLbl.setText("Score :0");
				
	}

	
	public static boolean currentScore() {
		if(score >=10){				
		return true;
		}
		else{
			return false;
		}
		
	}
	
	
	
}
