public class ParentLauncher { 
	public static void main(String[] args) { 
		System.out.println("Hello from Parent project!");

		ChildALauncher.main(null);
		ChildBLauncher.main(null);
	}
}