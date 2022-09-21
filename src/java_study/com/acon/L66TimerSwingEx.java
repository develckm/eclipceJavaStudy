package java_study.com.acon;

import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;

class TimerFrame extends JFrame{
	//타이머 시작,멈춤,초기화 버튼 구현 
	//타이머를 출력하는 라벨 구현
	private JButton startBtn;
	private JButton stopBtn;
	private JButton resetBtn;
	private JLabel timerLabel;
	private int time=10*1000;
	public TimerFrame(){
		startBtn=new JButton("시작");
		stopBtn=new JButton("멈춤");
		resetBtn=new JButton("초기화");
		timerLabel=new JLabel((double)time/1000+"");
		
		startBtn.setBounds(0,0,100,50);
		stopBtn.setBounds(100,0,100,50);
		resetBtn.setBounds(200,0,100,50);
		timerLabel.setBounds(80,60,200,50);
		timerLabel.setFont(new Font("Serif", Font.BOLD, 50));
		this.setLayout(null);		
		this.add(startBtn);
		this.add(stopBtn);
		this.add(resetBtn);
		this.add(timerLabel);
		this.setBounds(300,100,300,150);
		this.setVisible(true);
	}
}
public class L66TimerSwingEx {
	public static void main(String[] args) {
		new TimerFrame();
	}
}
