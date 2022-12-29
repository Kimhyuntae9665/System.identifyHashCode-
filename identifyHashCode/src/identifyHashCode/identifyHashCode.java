package identifyHashCode;

public class identifyHashCode {

	public static void main(String[] args) {
		String str1 = new String("kim"); //Heap 에 서로 다른 메모리에 저장 
		String str2 = new String("kim");//Heap 에 서로 다른 메모리에 저장 
		
		System.out.println(System.identityHashCode(str1));//1586600255//Heap 에 서로 다른 메모리에 저장 
		System.out.println(System.identityHashCode(str2));//474675244//Heap 에 서로 다른 메모리에 저장 
		
		String str3 = "kimmm";
		String str4 = "kimmm";
		System.out.println(System.identityHashCode(str3));//932583850,같은 메모리 공간 사용 
		System.out.println(System.identityHashCode(str4));//932583850,같은 메모리 공간 사용 

	}

}
