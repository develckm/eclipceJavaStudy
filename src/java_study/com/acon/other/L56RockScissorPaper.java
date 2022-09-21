package java_study.com.acon.other;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.*;

class RockScissorPaper extends JFrame {
	class GameButton extends JButton  {
		String txt;
		int num;
		public GameButton(String txt, int num) {
			super(txt);
			this.num = num;
		}
	}
	private JButton startBtn;
	private JButton resetBtn;
	private GameButton scissorBtn;
	private GameButton rockBtn;
	private GameButton paperBtn;
	private JLabel myLabel;
	private JLabel opponentLabel;
	private JLabel resultLabel;
	private boolean isStart = false;
	private int randomNum;
	private String [] random_arr = {"Scissor", "Rock", "Paper"};
		
	public RockScissorPaper (String title) {
		super(title);
		startBtn = new JButton("Start");
		resetBtn = new JButton("Reset");
		scissorBtn = new GameButton("Scissor", 0);
		rockBtn = new GameButton("Rock", 1);
		paperBtn = new GameButton("Paper", 2);
		myLabel = new JLabel();
		opponentLabel = new JLabel();
		resultLabel = new JLabel();
		GameButton [] btn_arr = {scissorBtn, rockBtn, paperBtn};
		JLabel [] label_arr = {myLabel, opponentLabel, resultLabel};
			
		startBtn.addActionListener(e -> {
			if (!isStart) {
				this.isStart = true;
				new Thread(() -> {
					while (this.isStart) {
						randomNum = (int)(Math.random() * 3);
						opponentLabel.setText("Com : " + random_arr[randomNum]);
						try {
							Thread.sleep(100);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					}
				}).start();
			} 
		});

		Arrays.asList(btn_arr).stream()
		.forEach(i -> i.addActionListener(e -> {
				isStart = false;
				if (i.num == this.randomNum) {
					myLabel.setText("Me : " + random_arr[i.num]);
					resultLabel.setText("Draw");
				} else if (i.num - this.randomNum == -1 || i.num - this.randomNum == 2) {
					myLabel.setText("Me : " + random_arr[i.num]);
					resultLabel.setText("Lose");
				} else if (i.num - this.randomNum == 1 || i.num - this.randomNum == -2) {
					myLabel.setText("Me : " + random_arr[i.num]);
					resultLabel.setText("Win");
				}				
		}));
		
		resetBtn.addActionListener(e -> {
			this.isStart = false;
			Arrays.asList(label_arr).stream()
				.forEach(l -> l.setText(null));
		});
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		startBtn.setBounds(100, 50, 100, 50);
		resetBtn.setBounds(280, 50, 100, 50);
		scissorBtn.setBounds(45, 330, 100, 50);
		rockBtn.setBounds(195, 330, 100, 50);
		paperBtn.setBounds(345, 330, 100, 50);
		myLabel.setBounds(20, 190, 200, 50);
		myLabel.setFont(new Font("Serif", Font.ITALIC, 32));
		opponentLabel.setBounds(300, 190, 200, 50);
		opponentLabel.setFont(new Font("Serif", Font.ITALIC, 32));
		resultLabel.setBounds(205, 190, 200, 50);
		resultLabel.setFont(new Font("Serif", Font.BOLD, 32));
		this.setBounds(400, 200, 500, 500);
		this.setLayout(null);
		this.add(startBtn);
		this.add(resetBtn);
		this.add(scissorBtn);
		this.add(rockBtn);
		this.add(paperBtn);
		this.add(myLabel);
		this.add(opponentLabel);
		this.add(resultLabel);
		this.setVisible(true);
	}	
}

public class L56RockScissorPaper {
	public static void main(String [] args) {
		new RockScissorPaper("Rock Scissor Paper");
	}
}
