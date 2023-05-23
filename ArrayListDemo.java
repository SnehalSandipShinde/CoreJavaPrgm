import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo
{
	public static void main(String[] args) throws Exception
	{
		ArrayList al = new ArrayList();
		
		System.out.println(getCapacity(al));
		
		al.add(10);
		al.add("hello");
		al.add(10);
		al.add(10);
		
		System.out.println(al);
		
		System.out.println(al.size());
		
	}
	
	static<E> int getCapacity(List<E> al) throws Exception
	{
		Field field = ArrayList.class.getDeclaredField("elementData");
		field.setAccessible(true);
		return((Object[])field.get(al)).length;
	}
}