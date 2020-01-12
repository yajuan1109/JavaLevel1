public class CountTest {
	
	public static void main(String[] args) {
		System.out.println("Program developed by Yajuan Wang");
		
		Count count = new Count();
				
		do {
			count.displayMenu();
		}while(count.processMenu());		
		
	}

}
