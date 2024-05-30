package week1.day3;

public class EdgeBrowser {
	
	public static void main(String[] args) {
		System.out.println("------Inside EdgeBrowser class------");
		Browser objBrowser=new Browser();
		String browsrName=objBrowser.lauchBrowser("Firefox");
		System.out.println("Browser is: "+browsrName);
		objBrowser.loadUrl();
	}

}
