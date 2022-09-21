package java_study.com.acon;
import java.util.*;
public class L13WhileEx {
	public static void main(String[]args) {
		boolean score_status=true;
		while(score_status) {
			System.out.println("성적 4개를 입력받고 평균을 계산하는 프로그램입니다.");
			//성적 (score) 를 4개 입력받고 성적의 평균을 구하는 프로그램 작성 
			int [] score_arr= new int[4];
			int avg=0;
			Scanner scan=new Scanner(System.in);
			//score_arr[0]=Integer.parseInt(scan.nextLine());
			int i=0;
			while(i<4) {
				try {
					System.out.print(i+"번째 성적입력 :");
					score_arr[i]=Integer.parseInt(scan.nextLine());
					++i;					
				}catch (NumberFormatException e) {
					System.out.println(i+"번째에 수만 입력하세요!");
					//break;
				}
			}
			//while 반복문을 사용하새 4번 입력받고 종료되면서 평균을 구하세요!
			for(int s: score_arr) {
				avg+=s;
			}
			avg/=score_arr.length;
			System.out.println("당신의 평균 성적은 : "+avg);	
			System.out.print("종료하시겠습니까?(y/n) :");
			//String exit=scan.nextLine();
			char exit=scan.nextLine().charAt(0);
			if(exit=='y') {
				score_status=false;
				System.out.println("프로그램 종료");
			}
		}
	}
}
