import java.util.ArrayList;
import java.util.List;

public class Test 
{
	public static void main(String[] args) 
	{
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Abhi", "java", 680000));
		list.add(new Student("Akash", "python", 400000));
		list.add(new Student("Ravi", "Ai", 8770000));
		list.add(new Student("Ansh", "Data Science", 900000));
		
		Student s = list.get(0);
		for(int i = 1; i < list.size(); i++)
		{
			if(list.get(i).getFee() > s.getFee())
			s=list.get(i);
		}
		System.out.println(s);
	}
}
