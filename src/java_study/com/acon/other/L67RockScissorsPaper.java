package java_study.com.acon.other;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.stream.IntStream;

class RockScissorsPaper extends JFrame{
	private JButton rockBtn;
	private JButton scissorsBtn;
	private JButton paperBtn;
	private JLabel comResult;
	private JLabel myResult;
	private JLabel resultLabel;
	private JButton startBtn;
	private JButton resetBtn;
	boolean gameStart = false;
	int resultNum1;
	int resultNum2;

	
	public RockScissorsPaper(String title) {
		super(title);
		this.setBounds(400, 200, 350, 200);
		this.setLayout(null);
		this.addWindowListener(new WindowHandler());
		startBtn=new JButton("Start");
		rockBtn = new JButton("Rock");
		scissorsBtn = new JButton("Scissors");
		paperBtn = new JButton("Paper");
		comResult = new JLabel("Com : ");
		comResult.setFont(new FontUIResource("Serif", Font.ITALIC, 20));
		myResult = new JLabel("My : ");
		myResult.setFont(new FontUIResource("Serif", Font.ITALIC, 20));
		resultLabel = new JLabel("Result");
		resultLabel.setFont(new FontUIResource("Serif", Font.ITALIC, 20));
		resetBtn = new JButton("Reset");

		GameHandler gameHandler = new GameHandler();
		startBtn.addActionListener(gameHandler);
		resetBtn.addActionListener((e)->{
			gameStart = false;
			myResult.setText("My : ");
			comResult.setText("Com : ");
			resultLabel.setText("Result");
		});
		rockBtn.addActionListener((e)->{
			gameStart = false;
			IntStream num2 = new Random().ints(1,0,1);
			resultNum2 = num2.toArray()[0]+1;
//			System.out.println("My : "+gameHandler.resultNum2);
			myResult.setText("My : Rock");
			if(resultNum1==0) {
				comResult.setText("Com : Scissors");
				resultLabel.setText("Win");
			}else if(resultNum1==1) {
				comResult.setText("Com : Rock");
				resultLabel.setText("Draw");
			}else if(resultNum1==2) {
				comResult.setText("Com : Paper");
				resultLabel.setText("Lose");
			}
		});
		scissorsBtn.addActionListener((e)->{
			gameStart = false;
			IntStream num2 = new Random().ints(1,0,1);
			resultNum2 = num2.toArray()[0];
//			System.out.println("My : "+gameHandler.resultNum2);
			myResult.setText("My : Scissors");
			if(resultNum1==0) {
				comResult.setText("Com : Scissors");
				resultLabel.setText("Draw");
			}else if(resultNum1==1) {
				comResult.setText("Com : Rock");
				resultLabel.setText("Lose");
			}else if(resultNum1==2) {
				comResult.setText("Com : Paper");
				resultLabel.setText("Win");
			}
		});
		paperBtn.addActionListener((e)->{
			resultNum2 =2;
			if(gameStart) {				
				gameStart = false;
	//			System.out.println("My : "+gameHandler.resultNum2);
				myResult.setText("My : Paper");
				if(resultNum1==0) {
					comResult.setText("Com : Scissors");
					resultLabel.setText("Lose");
				}else if(resultNum1==1) {
					comResult.setText("Com : Rock");
					resultLabel.setText("Win");
				}else if(resultNum1==2) {
					comResult.setText("Com : Paper");
					resultLabel.setText("Draw");
				}
			}
		});
		startBtn.setBounds(0, 100, 167, 50);
		resetBtn.setBounds(167, 100, 167, 50);
		rockBtn.setBounds(117, 0, 100, 50);
		scissorsBtn.setBounds(0, 0, 100, 50);
		paperBtn.setBounds(235, 0, 100, 50);
		comResult.setBounds(210, 50, 150, 50);
		myResult.setBounds(20, 50, 150, 50);
		resultLabel.setBounds(145, 50, 150, 50);
		this.add(rockBtn);
		this.add(scissorsBtn);
		this.add(paperBtn);
		this.add(comResult);
		this.add(myResult);
		this.add(resultLabel);
		this.add(startBtn);
		this.add(resetBtn);
		this.setVisible(true);
		this.getDefaultCloseOperation();
	}
	class GameHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(!gameStart) {
				myResult.setText("My : ");
				comResult.setText("Com : ");
				resultLabel.setText("Result");
				gameStart=true;
				new Thread(()->{
					while(gameStart) {
						IntStream num1 = new Random().ints(1,0,3);
						resultNum1 = num1.toArray()[0];
//						System.out.println("Com : "+resultNum1);
						if(resultNum1==0) {
							comResult.setText("Com : Scissors");
						}else if(resultNum1==1) {
							comResult.setText("Com : Rock");
						}else if(resultNum1==2) {
							comResult.setText("Com : Paper");
						}
						try {
							Thread.sleep(10);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					}
				}).start();
			}
		}
	}
	class WindowHandler extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			RockScissorsPaper.this.dispose();
		}
	}
}
public class L67RockScissorsPaper {
	public static void main(String[] args) {
		new RockScissorsPaper("가위 바위 보 게임");
		//���� : 0 ���� : 1 �� :2
//		System.out.println((int)(Math.random()*3));
//		new Random().ints(1,0,3).forEach((i)->{
//			System.out.println(i);
//		}); //������ ���� �����ų� �ߺ� ��� ������ �� ����
	}
}
