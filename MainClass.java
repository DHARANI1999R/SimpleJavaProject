package simplejavaproject;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to java program");
		System.out.println("second message");
		//classname referencevariable=new classname();
		Student student;
		student=new Student();

		System.out.println(student);
		student.name="Dharani";
		student.age=23;
		System.out.println(student.name+" "+student.age+" "+student.roll_no);



		Student student1;
		student1=new Student();
		System.out.println(student1);
		student1.name="Hema";
		student1.age=24;
		System.out.println(student1.name+student1.age);

		Student student2;
		student2=new Student();

		System.out.println(student2.name+" "+student2.age+" "+student2.roll_no);





		//new is keyword which allocates the memory at runtime
	}

}
