package java_study.com.acon;
import java.time.*; //사용하기를 권장하는 시간관련 패키지


//thread 를 생성하는 타입 선언법 
//1.Thread class를 상속받고 run 함수 구현 
//2.Runnable interface의 run 함수를 구현 (권장) : 인터페이스로 구현하면 상속에 여유가 있기 때문
class Clock{
	boolean clock=true;
	public Clock(boolean clock) {
		this.clock=clock;
	}
}
//class ClockThread extends Clock,Thread{
class ClockThread extends Clock implements Runnable{
	public ClockThread(boolean clock) {
		super(clock);
	}

	@Override
	public void run() {
		while(this.clock) {
			System.out.println(LocalTime.now());
			try {
				Thread.sleep(1000);  //밀리세컨즈동안 멈출수 있는 함수
			} catch (InterruptedException e) { //sleep을 사용하면 스레드간 충돌이 발생할 수 있음
				e.printStackTrace();
			}
			//thread가 종료되는 시점  : 반복문이 종료될 때 
			//강제로 Interrupted 오류를 발생시켰을 때 
			//stop() : 사용하지 않음 
		}
	}
}

public class L63ThreadRunable {
	public static void main(String[] args) {
		//main thread 1개 존재함
		//System.out.println(LocalDate.now());
		//System.out.println(LocalTime.now());
		//System.out.println(LocalDateTime.now());
		ClockThread clockRun=new ClockThread(true);
		Thread clockThread=new Thread(clockRun);
		clockThread.start();
		try {
			Thread.sleep(10*1000);
			clockRun.clock=false; //권장하는 종료 방식!
			//clockThread.interrupt(); //인터럽 오류를 발생시켜서 종료하는 방법(내부에 예외처리가 있으면 종료안됨)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//clockThread.stop(); //종료되지만 사용을 권장하지 않음
		System.out.println("main thread가 종료될 때 실행됨");
	}
}
