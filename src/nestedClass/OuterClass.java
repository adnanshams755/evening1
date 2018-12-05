package nestedClass;

public class OuterClass {
	
	
	InnerClassA innerA = new InnerClassA();
	InnerClassB innerB = new InnerClassB();
	
	public void outerMethodA() {
		innerA.innerMethodA();
		innerB.innerMethodB();
	}
	
	public class InnerClassA {
		
		public void innerMethodA() {
			System.out.println("this is inner method A");
		}
		
	}
	
	public static class InnerClassB {
		
		
		private void innerMethodB() {
			System.out.println("this is inner method B");
		}
		
	}
}
