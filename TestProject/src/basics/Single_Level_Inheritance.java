package basics;

class BasicCalculator //parent class
{
	int a = 10;
	int b = 20;
	int sum;
	int sub;
	public void addition() {
		sum = a + b;
		System.out.println("addition is :" + sum);
	}

	public void subtraction() {
		sub = b - a;
		System.out.println("subtraction is :" + sub);
	}
}

class ScientificCal extends BasicCalculator //child class
{
	public void SinValue() {

		System.out.println("Sin0 is 0");
	}
}

public class Single_Level_Inheritance
{

	public static void main(String[] args) {
		ScientificCal obj=new ScientificCal();//object created for parent class
		obj.addition();// calling method from parent class
		obj.subtraction();// calling method from parent class
		obj.SinValue();// calling method from child class

	}

}

