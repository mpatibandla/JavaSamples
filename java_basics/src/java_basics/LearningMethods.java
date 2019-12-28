package java_basics;



public class LearningMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("calling blah blah method");
		MyUtils.printBlahBlah("My name is Manasa");
//		MyUtils.printBlahBlah(35);  Doesnt work coz printBlahBlah for int has been made private in MyUtils class - see below
		MyUtils.testpvt(5);
		System.out.println(MyUtils.testpvt(98));
		MyUtils.sum2nums(10, 20);
		System.out.println(MyUtils.add10(55));
		

	}
	

}
