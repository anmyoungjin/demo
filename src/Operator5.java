
public class Operator5 {

	public static void main(String[] args) {
		//대입연산자 (=, +=, -=, *=, /=, %= ...)
		int x = 1, y = 2;
		//x += y; //x = x + y;
		x -= y; //x = x - y;
		System.out.println(x);
		
		//삼항연산자 (조건문)?참:거짓;
		//시험성적이 60점 미만이면 재시험 아니면 패슈
		int score = 60;
		String str = (score < 60)?"재시험":"패슈";
		System.out.println(str);
	}

}





