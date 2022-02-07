package practice;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="good";
		char[] ch=str.toCharArray();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		System.out.println(rev);
		

	}

}
