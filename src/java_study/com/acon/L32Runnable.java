package java_study.com.acon;

class ArrayPrintThread implements Runnable{
	int [] array;
	String objName;
	public ArrayPrintThread(int [] array ,String objName) {
		this.array=array;
		this.objName=objName;
	}
	
	@Override
	public void run() {
		for(int i=0; i<this.array.length; i++) {
			System.out.println(objName+" "+i+" 번째 :" +array[i]);
		}		
	}
}
public class L32Runnable {
	public static void main(String[] args) {
		int [] nums= {10,20,30,40,50,60,70,80,90};
		int [] nums2= {110,120,130,140,150,160,170,180,190};
		
		new Thread(new ArrayPrintThread(nums, "첫번째 쓰레드")).start(); 
		new Thread(new ArrayPrintThread(nums2, "두번째 쓰레드")).start(); 
//		for(int i=0;i<nums.length; i++) {
//			System.out.println("첫번째 반복문 "+i+" 번째 :" +nums[i]);
//		}
//		for(int i=0;i<nums2.length; i++) {
//			System.out.println("두번째 반복문 "+i+" 번째 :" +nums2[i]);
//		}
	}
}
