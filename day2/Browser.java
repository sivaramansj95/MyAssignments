package week1.day2;

public class Browser {
	
	
	public String  launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;
		
		
	}
	
	  void loadUrl() {
		 
		 System.out.println("Application URL Loaded successfully");
		return ;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser ls=new Browser();
		System.out.println("Browser name:" +ls.launchBrowser("Chrome"));
		ls.loadUrl();
		

	}

}
