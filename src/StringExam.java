/**
 * 문자열 String 클래스
 * @author smart00
 *
 */
public class StringExam {

	public static void main(String[] args) {
		String str = new String("ABC");
		String str2 = new String("ABC");
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		System.out.println(str);
		System.out.println(str2);
	}

}
