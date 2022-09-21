package java_study.com.acon;
class Timer implements Runnable{
	int num=10000;
	@Override
	public void run() {
		while(this.num!=0){
			//9.001003 ->"9.001003"=>"9.001"
			//9.001003*1000->9001.003->9001->9001/1000
			--num;
			double printNum=(double)num/1000;
			System.out.println(num+"/"+printNum);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class L65TimerEx {
	public static void main(String[] args) {
		int  num=10;
		//화살표함수는 필드를 정의할 수 없다. 
//		Thread timer=new Thread(()->{
//			while(num!=0) {
//				//num=num-1;  //화살표 함수에서 지역변수를 참조할 때는 상수이기를 기대한다.
//			}
//		});
//		timer.start();
		new Thread(new Timer()).start();
	}

}
