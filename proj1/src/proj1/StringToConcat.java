package proj1;

public class StringToConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="Good";
		String str2="Noon";
		String str3="Good";
		String res1 = str1.concat(str2);
		System.out.println(res1);
		
		/**
		 *String comparision using equals 
		 *
		 */
		
		Boolean res2=str1.equals(str3);
		System.out.println(res2);
		
		Boolean res3=str1.equals(str2);
		System.out.println(res3);
			
		
	}

}
