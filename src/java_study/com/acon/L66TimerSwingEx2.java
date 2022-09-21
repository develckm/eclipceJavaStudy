package java_study.com.acon;

import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;
import java.util.Random;

class RockSissorPaper extends JFrame{
	private JButton rockBtn;
	private JButton sissorBtn;
	private JButton paperBtn;
	private JLabel enemyLabel;
	private JLabel resultLabel;
	private JButton startBtn;
	private boolean isStart=false;
	public RockSissorPaper(String title){
		super(title);
		rockBtn=new JButton("바위");
		sissorBtn=new JButton("가위");
		paperBtn=new JButton("보");
		enemyLabel=new JLabel("가위");
		resultLabel=new JLabel("가위 VS 바위 패배");
		startBtn=new JButton("게임 시작");

		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
		rockBtn.setBounds(0,0,100,50);
		sissorBtn.setBounds(100,0,100,50);
		paperBtn.setBounds(200,0,100,50);
		enemyLabel.setBounds(100,60,200,50);
		enemyLabel.setFont(new Font("Serif", Font.BOLD, 50));
		
		resultLabel.setBounds(0,130,300,50);
		resultLabel.setFont(new Font("Serif", Font.BOLD, 35));
		startBtn.setBounds(0,200,300,50);
		
		this.setLayout(null);		
		this.add(rockBtn);
		this.add(sissorBtn);
		this.add(paperBtn);
		this.add(enemyLabel);
		this.add(resultLabel);
		this.add(startBtn);
		this.setBounds(300,100,300,300);
		this.setVisible(true);
	}
}
public class L66TimerSwingEx2 {
	public static void main(String[] args) {
		new RockSissorPaper("가위 바위 보 게임"); //가위:0 바위:1 보:2
		//System.out.println( (int)(Math.random()*3));
		
		new Random().ints(1,0,3).forEach((i)->{
			System.out.println(i);
		});
		
	}
}
