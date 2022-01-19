/**
 * for문
 * 2022년 1월달 일자를 출력하시오(1~31) 반복해서 출력해보세요
 * @author smart00
 *
 */
public class Loop5 {

	public static void main(String[] args) {		
		
		for(int j = 1; j <= 12; j++) {
			int lastDayOfMonth = 0;
			switch (j) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				lastDayOfMonth = 31;
				break;
			case 2:
				lastDayOfMonth = 28;
				break;
			default:
				lastDayOfMonth = 30;
				break;
			}
			
			System.out.print(j+"월 ");
			for(int i = 1; i <= lastDayOfMonth; i++) {
				System.out.print(i+" "); //syso
			}
			System.out.println();
		}
	}

}



