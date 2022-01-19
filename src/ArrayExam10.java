
public class ArrayExam10 {

	public static void main(String[] args) {

		int [] i = new int[2];
		int [] j = null;
		j = i;
		i[0] = 1;
		j[0] = 2;
		i = null;
		System.gc();
		//System.out.println(i[0]);
		System.out.println(j[0]);
	}

}



