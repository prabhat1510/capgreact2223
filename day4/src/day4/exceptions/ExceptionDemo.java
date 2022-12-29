package day4.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		divide(15,10);
		divide(15,0);
	}

	public static void divide(int x,int y)
	{
	int ans=1;
		try{
			ans=x/y;
		}catch(ArithmeticException e) {
			e.printStackTrace();
			ans=0; 
			//throw e;
		}catch(NullPointerException npe) {
			ans=-1;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			System.out.println(ans); // This is always executed }
		}
	}
}
