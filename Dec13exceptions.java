package alljavaproject;

public class Dec13exceptions {

	public static void main(String[] args) {
		try {
		      int a = 5 / 0 ;
		} catch(Exception e){
		      System.out.println(e);
		} finally {
			System.out.println("This is an exception !");
			
			
		}

	}

}
