package week1.day3;

public class Browser {

	public String lauchBrowser(String browserName)
	{
		System.out.println("Browser lauched successfully...");
		return browserName;	
	}
	
	public void loadUrl()
	{
		System.out.println("Application url loaded successfully...");
	}
	
	public static void main(String[] args) {
	
		Browser objBrowser= new Browser();
		System.out.println("------Inside Browser class------");
		String browsrName=objBrowser.lauchBrowser("google");
		System.out.println("Browser is: "+browsrName);
		objBrowser.loadUrl();
		
	}

}
