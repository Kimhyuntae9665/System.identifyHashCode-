package identifyHashCode;

public class identifyHashCode {

	public static void main(String[] args) {
		String str1 = new String("kim"); //Heap �� ���� �ٸ� �޸𸮿� ���� 
		String str2 = new String("kim");//Heap �� ���� �ٸ� �޸𸮿� ���� 
		
		System.out.println(System.identityHashCode(str1));//1586600255//Heap �� ���� �ٸ� �޸𸮿� ���� 
		System.out.println(System.identityHashCode(str2));//474675244//Heap �� ���� �ٸ� �޸𸮿� ���� 
		
		String str3 = "kimmm";
		String str4 = "kimmm";
		System.out.println(System.identityHashCode(str3));//932583850,���� �޸� ���� ��� 
		System.out.println(System.identityHashCode(str4));//932583850,���� �޸� ���� ��� 

	}

}
