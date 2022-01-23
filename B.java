package Ashish.assignment.singleton;
public class second{
	String str;
		second(String otherStr){
		str=otherStr;
	}
	
	public static second_method(String s) {
		//static methods can only access static variables;
		str=s;
		second sc = new B(s);
		return sc;
	}
	public void print() {
		System.out.println(str);
	}

	public static void main(String[] args)
	{
	string str = "ABCD";
	second obj = new B(str);
	obj.second_method(str);
	obj.pritn();
	}

}
