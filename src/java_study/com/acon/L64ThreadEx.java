package java_study.com.acon;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalTime;

import javax.swing.*;
class ClockFrame extends JFrame{
	private JButton startBtn;
	private JButton endBtn;
	private JLabel clockLabel;
	public ClockFrame(String title) {
		super(title);
		this.addWindowListener(this.new WindowHandler());
		this.setBounds(400, 200, 300, 200);
		startBtn=new JButton("시계 시작");
		endBtn=new JButton("시계 종료");
		clockLabel=new JLabel(LocalTime.now().toString());
		clockLabel.setFont(new Font("Serif", Font.ITALIC, 35));
		//frame에서 이벤트가 발생되는 것을 검사하는 객체가 있는데 이벤트가 발생하면 addActionListener에 정의 된 것을 실행시켜 준다. 
		//정의된 것이 종료가 되어야 frame은 다음 코드를 실행할 수 있다.
		//이는 addActionListener는 매번 thread를 생성하지 않고 1thread가 검사하고 있다. 멀티스레드인 것 처럼 동작하고 있긴 하다.)
		StartBtnHandler startBtnHandler=new StartBtnHandler();
		startBtn.addActionListener(startBtnHandler);
		endBtn.addActionListener((e)->{
			startBtnHandler.isClock=false;
		});
		this.setLayout(null); //frame 내부에서 setBounds로 JButton(Component)를 정렬하려면 기본 레이아웃을 삭제해야 함 
		startBtn.setBounds(0, 0, 100, 50);
		endBtn.setBounds(200, 0, 100, 50);
		clockLabel.setBounds(20, 60, 260, 100);
		this.add(startBtn);
		this.add(endBtn);
		this.add(clockLabel);
		this.setVisible(true);
	}
	class StartBtnHandler implements ActionListener{
		boolean isClock=true;
		@Override
		public void actionPerformed(ActionEvent e) {
			isClock=true;
			new Thread(()->{
				while(isClock){
					ClockFrame.this.clockLabel.setText(LocalTime.now().toString());
					try {Thread.sleep(1000);} catch (InterruptedException e1) {e1.printStackTrace();}
				}
			}).start();
		}
	}
	
	class WindowHandler extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			//((JFrame)e.getSource()).dispose();
			ClockFrame.this.dispose();
		}
	}
}
public class L64ThreadEx {
	public static void main(String[] args) {
		new ClockFrame("디지털 시계");
	}
}
