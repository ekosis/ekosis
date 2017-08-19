import java.util.Scanner;
public class gugudan {
	public static void main(String[] args) {
		
		System.out.println("구구단 중 출력할 단은? : ");

		Scanner scanner = new Scanner(System.in);
	        int number = scanner.nextInt();
	        
	 	 	System.out.println(number + "단을 출력해볼까요?"); 	        	
 	        
	        if (number < 2) {
	        	System.out.println("2단 보다 작은 단은 하기 싫어요");
	        }else if (number > 9) {
	        	System.out.println("9단 보다 큰 단은 하기 싫어요");
	        }else 
	        	
//		 	 	System.out.println(number + "단을 출력합니다."); 
	        
	 for(int i= 1; i<10; i++) 
		 System.out.println(number * i);
	 }
}
	  