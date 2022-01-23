package Ashish.assingment.main;
import Ashish.assignment.data.first;
import Ashish.assignment.singleton.second;

public class MainClass {

	public static void main(String[] args) {
		first obj =new first();
		//global variables which can get default values.
		obj.disp();
		//local variables which are not initialized but does not get any default values.
		obj.show();
		//static methods can only access static variables.
		second obj1 = new second("str");
		obj1.second_method("str");
		obj1.print();
		
	}

}
