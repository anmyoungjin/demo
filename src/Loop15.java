/**
 * for문
 * 50번까지 반복하세요.
 * 삼육구를 출력하세요.
 * 3의 배수일때는 짝이라고 출력하세요
 * System.out.println("짝");
 * @author smart00
 *
 */
public class Loop15 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 50; i++ ) {
			if(i%3 == 0) {
				System.out.println("짝");
				continue;
			}
			System.out.println(i);		
			
		}
	}

}



