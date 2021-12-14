
public class Dec7Stringbuffer {

	public static void main(String[] args) {
		
		StringBuffer abc= new StringBuffer("Sadia");
		abc.append(" Shariff") ;
		
		abc.replace(0, 5, "Asma");
		
		abc.deleteCharAt(8);
		
		System.out.println(abc);
	}

}
