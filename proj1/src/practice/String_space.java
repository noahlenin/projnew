package practice;

public class String_space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="GoodNoonMadam";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				System.out.print(" "+str.charAt(i));
			}
			else
			{
				System.out.print(str.charAt(i));
			}
		}		
	}

}
