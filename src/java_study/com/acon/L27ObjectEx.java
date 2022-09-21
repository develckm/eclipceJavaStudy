package java_study.com.acon;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class L27ObjectEx {
	public static void main(String[]args) {
		//GUI 인 Frame 제작
		JFrame frame=new JFrame();
		JButton btn=new JButton("버튼");
		//frame.addWindowListener(new WindowHandler());
		//frame.addWindowListener(new WindowCloseHandler());
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				e.getWindow().dispose();
				System.exit(0);
			}
		});
		//람다식은 매개변수로 사용할 타입에 추상메소드가 1개일때 만 사용가능 
		//frame.addWindowListener((e)->{});
		//정수를 이용한 상수
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		btn.addActionListener((e)->{
//			System.out.println("버튼이 눌렸다!");
//		});
		ActionListener btnHandler=new BtnHandler();
		
		btn.addActionListener(btnHandler);
		frame.add(btn);
		frame.setSize(400, 500);
		frame.setVisible(true);
	}
}
class WindowHandler implements WindowListener{
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("프레임(윈도우) 등장!");
	}
	@Override
	public void windowClosing(WindowEvent e) {
		e.getWindow().dispose(); //해당 프레임 종료 =>시간이지나고 main 종료(실행중인 프로그램이 없어서 종료)
		//System.exit(0);	//실행중인 프로그램(main함수) 종료
	}
	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("종료될때 실행됩니다.");
	}
	@Override
	public void windowIconified(WindowEvent e) { System.out.println("최소화(아이콘화)");}
	@Override
	public void windowDeiconified(WindowEvent e) {System.out.println("다시 등장 !");}
	@Override
	public void windowActivated(WindowEvent e) { System.out.println("focus");}
	@Override
	public void windowDeactivated(WindowEvent e) {System.out.println("나를 두고 가지 마세요!");}
}
class WindowCloseHandler extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("윈도우가 종료됩니다.");
		e.getWindow().disable();
		System.exit(0);
	}
}
class BtnHandler implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
			System.out.println("매개변수는 객체만 사용가능");
	}
}
//javascript에서는 함수가 타입이라 매개변수로 사용될 수 있지만 
//java는 함수가 타입이 아니기 때문에 함수를 재정의한 객체를 매개변수로 사용해야 한다는 거죠?

//자바스크립트는 함수==타입 
//자바 class,interface,abstract class == 타입 
/* 	function Node(){
 * 		this.onclick=function(Event e){
 * 		}
 * 		this.addEventListener=function(String eventName, Function func ){
 * 			this[eventName]=func;
 * 		}
 * 	}
 * 	windw.document.node.onclick=function(e){
 * 		this.innerText="안녕";
 * 	} => 자바에서 불가능한 문법
 * 	node.addEvnetListener("click",function(e){}) 
 * 	=>자바에서 매개변수로 객체만 사용가능(함수는 객체가 X)=>특정함수를 포함하는 객체를 매개변수로 사용해야한다. 
 * 
 * */

















