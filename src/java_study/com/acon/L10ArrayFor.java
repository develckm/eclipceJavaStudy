package java_study.com.acon;

public class L10ArrayFor {

	public static void main(String[] args) {
		char [] c_arr= {'안','녕','하','세','요'};
		String msg="";
		for(int i=0; i<c_arr.length; i++) {
			//msg=msg+c_arr[i];
			msg+=c_arr[i];
		}
		System.out.println(msg);
		String msg2="";
		//js for of : for(let c of c_arr){}
		//java for of(향상된 for) (java 1.5)
		for(char c : c_arr) {
			msg2+=c;
		}
		System.out.println(msg2);
		String [][] s_arr= {{"안","녕"},{"잘","자"},{"잘","가","세","요"}};
		for(int i=0; i<s_arr.length; i++) {
			String msg3="";
			for(int j=0; j<s_arr[i].length; j++) {
				msg3+=s_arr[i][j];
			}
			System.out.println(msg3);
		}
		for(String[] arr : s_arr) {
			String msg3="";
			for(String s : arr) {
				msg3+=s;
			}
			System.out.println(msg3);
		}
	}
}
