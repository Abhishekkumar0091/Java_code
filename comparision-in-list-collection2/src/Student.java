
public class Student 
{
    private String name;
    private String department;
    private int fee;
    public Student(String name, String department, int fee)
    {
    	this.name=name;
    	this.department = department;
    	this.fee=fee;
    }
    public String getName()
    {
    	return name;
    }
    public void setName(String name)
    {
    	this.name=name;
    }
    public String getDepartment()
    {
    	return department;
    }
    public void setDepartment(String department)
    {
    	this.department=department;
    }
    public int getFee()
    {
    	return fee;
    }
    public void setFee(int fee)
    {
    	this.fee=fee;
    }
	@Override
	public String toString() 
	{
		return "Student [name=" + name + ", department=" + department + ", fee=" + fee + "]";
	}
	
}
