import java.util.Comparator;
import java.util.List;

public class Annotate implements Comparator {

	public static void main(String[] args) {
		
		//Mechanism To instruct Something to Someone.
		/*
		1.Inbuilt Annotation
		2. Custom Annotation
		*/
		
		// Inbuilt Annotations .
		
		/*
		1.@Override
		2.@SupressWarnings
		3.@Deprecated.
		        etc
		*/
		
		
		
	}

	@Override
	public int compare(Object o1, Object o2)
	{
		// TODO Auto-generated method stub
		return 0;
	}
	//@Deprecated
	

	public void print(List i)
	{
		for (Object object:i)
		{
			System.out.println(object);
		}
	}
	
	int a;
	
}
