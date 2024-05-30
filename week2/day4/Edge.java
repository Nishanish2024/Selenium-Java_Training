package week2.day4;

public class Edge extends Browser {

	public void takeSnap() {
		System.out.println("takeSnap from Edge class");
	}

	public void clearCookies() {
		System.out.println("clearCookies from Edge class");
	}

	public static void main(String[] args) {
		Edge ObjEdge = new Edge();

		System.out.println("------Edge-----");
		ObjEdge.closeBrowser();
		ObjEdge.takeSnap();
		ObjEdge.clearCookies();
	}

}
