import java.util.HashMap;
import java.util.Scanner;

class Student2{
	String name;
	String department;
	String classnum;
	double averscore;
}

public class Chapter7_9 {

	public static void main(String[] args) {
		HashMap<String, Student2> dept = new HashMap<String, Student2>();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3;i++){
			Student2 st = new Student2();
			System.out.print("�̸��� �Է��Ͻÿ� : ");
			st.name = sc.next();
			System.out.print("�а��� �Է��Ͻÿ� : ");
			st.department = sc.next();
			System.out.print("�й��� �Է��Ͻÿ� : ");
			st.classnum = sc.next();
			System.out.print("��������� �Է��Ͻÿ� : ");
			st.averscore = sc.nextDouble();
			System.out.println();
			dept.put(st.classnum, st);
		}
		System.out.print("�й��� �Է��Ͻÿ� : ");
		Student2 st = dept.get(sc.next());
		System.out.println("�̸� : "+st.name);
		System.out.println("�а� : "+st.department);
		System.out.println("�й� : "+st.classnum);
		System.out.println("������� : "+st.averscore);
	}
}