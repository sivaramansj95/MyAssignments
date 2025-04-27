package week1.day2;

public class Edgebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser ls=new Browser();
		System.out.println("Browser Name:" +ls.launchBrowser("Edge"));
		ls.loadUrl();

	}

}
