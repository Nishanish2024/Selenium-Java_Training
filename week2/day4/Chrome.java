package week2.day4;

public class Chrome extends Browser {

	public void openIncognito() {
		System.out.println("openIncognito from Chrome class");
	}

	public void clearCache() {
		System.out.println("clearCache from Chrome class");
	}

	public static void main(String[] args) {
		Chrome ObjChrome = new Chrome();

		System.out.println("------Chrome-----");
		System.out.println("browserName= " + ObjChrome.browserName);
		System.out.println("browserVersion= " + ObjChrome.browserVersion);
		ObjChrome.openURL();
		ObjChrome.clearCache();

	}

}
