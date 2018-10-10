import java.lang.reflect.Array;

public class ReflectionArray {

	public static void main(String[] args){
		Class<?> cls = null;
		try{
			cls = Class.forName("java.lang.String");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Object array = Array.newInstance(cls, 10);
		Array.set(array, 0, "hello");
		Array.set(array, 1, "world");
		Array.set(array, 2, "number two");
		Array.set(array, 3, "3");
		Array.set(array, 4, "4");
		
		System.out.println(Array.get(array, 2));
	}
}
