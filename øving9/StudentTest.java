package øving9;

public class StudentTest {

	public static void main(String[] args) {
		Student Student1= new Student("Per",0);
		Student Student2= new Student("Arne",0);
		System.out.println(Student1.getAntOppg());
		System.out.println(Student1.getNAvn());
		Student1.økAntOppg(1);
		System.out.println(Student1.toString());
		System.out.println(Student1.navnEqualsTo("Per"));
	}

}
