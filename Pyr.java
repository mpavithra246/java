
public class Pyr 
{


	public static void main(String[] args) 
	{
		int n=1;
        for(int i=0;i<5;i++)
          {
	           for(int j=0;j<5;j++)

              {
	            if(j<=i)
	                 {
	 	                System.out.print(" " +n+ " ");
	 	                
	                 }
	            else
	            {
	            	System.out.println("");
	            }
              }
	           n++;
          }
	}

}
