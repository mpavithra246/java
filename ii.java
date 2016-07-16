
public class ii {

	
	public static void main(String[] args) {
		int c,fact=1;
		
		int n=Integer.parseInt(args[0]);
		System.out.println("enter the number" +n);
		c=n;
		do
		{
			fact=fact*n;
			--n;
		}while(n>0);
		if((c==0)||(c==1))
		{
			fact=1;
		}
			System.out.println(fact);
		
		
		
		
		
		
		
		
		
	}

}
