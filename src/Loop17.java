/**
 * for문 
 * 1부터 10까지의 정수 중에서 
 * 3의 배수의 총합을 구하는 코드를 작성하세요.
 * 출력결과 : 3+6+9+=18를 3+6+9=18
 * @author smart00
 *
 */
public class Loop17 {

	public static void main(String[] args) {
		int sum = 0;
		int max = 30;
		for(int i = 1; i <= max; i++) {
			if(i%3 == 0){
				sum += i;//sum = sum + i;
				System.out.print(i);
				if(i != (max-(max%3))) {
					System.out.print("+");
				}
			}			
		}
		System.out.print("="+sum);
		
	}

}



