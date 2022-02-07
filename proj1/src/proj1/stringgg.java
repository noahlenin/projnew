package proj1;

public class stringgg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//printing noah
		String str="noah";
		System.out.println(str);
		//erasing noah and adding lenin in same memory
		str="lenin";
		System.out.println(str);
		//we cannot concate it because it is immutable
		str.concat("s");
		System.out.println(str);
		//so we using string buffer to concat the string
		StringBuffer str1=new StringBuffer(str);
		str1.append("s");
		System.out.println(str1);
	
	}

}
