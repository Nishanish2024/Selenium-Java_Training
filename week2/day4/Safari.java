package week2.day4;

public class Safari extends Browser{
	
	public void readerMode() {
		System.out.println("readerMode from Safari class");
	}

	public void fullScreenMode() {
		System.out.println("fullScreenMode from Safari class");
	}
	

	public static void main(String[] args) {
		Safari ObjSafari= new Safari();
		
		System.out.println("------Safari-----");
		ObjSafari.readerMode();
		ObjSafari.fullScreenMode();
		ObjSafari.navigateBack();
	}

}
