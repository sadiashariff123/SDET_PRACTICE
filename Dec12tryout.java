package alljavaproject;

public class Dec12tryout {

	public static void main(String[] args) {
		try {
		      int[] a = null;
		      System.out.println(a[1]);
		} catch(NullPointerException e){
			System.out.println("Your array is null!");
		}
		      

	}

}
