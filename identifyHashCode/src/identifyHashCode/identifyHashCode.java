package identifyHashCode;

public class identifyHashCode {

	public static void main(String[] args) {
		String str1 = new String("kim"); //Heap 에 서로 다른 메모리에 저장 
		String str2 = new String("kim");
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		String str3 = "kimmm";
		String str4 = "kimmm";
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));

	}

}
