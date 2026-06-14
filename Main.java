class Employee
{
	private int E_id;
	private String E_name;
	private double Salary;
	
	
	//Setter & getter for E_id
	public void setE_id(int E_id)
	{
		this.E_id = E_id;
	}
	public int getE_id()
	{
		return E_id;
	}
	
	//Setter & getter for E_name
	public void setE_name(String E_name)
	{
		this.E_name = E_name;
	}
	public String getE_name()
	{
		return E_name;
	}
	
	//Setter & getter for salary
	public void setSalary(double Salary)
	{
		this.Salary = Salary;
	}
	public double getSalary()
	{
		return Salary;
	}
}

public class Main
{
	public static void main (String [] args)
	{
		Employee E1 = new Employee();
		
		E1.setE_id(1001);
		E1.setE_name("John");
		E1.setSalary(12000);
		
		Employee E2 = new Employee();
		
		E2.setE_id(1002);
		E2.setE_name("Alice");
		E2.setSalary(100000);
		
		System.out.println("1st Employee details");
		System.out.println("E_id=" + E1.getE_id() );
		System.out.println("E_name=" + E1.getE_name() );
		System.out.println("Salary=" + E1.getSalary() );
		
		System.out.println(" ");
		
		System.out.println("2nd Employee details");
		System.out.println("E_id=" + E2.getE_id() );
		System.out.println("E_name=" + E2.getE_name() );
		System.out.println("Salary=" + E2.getSalary() );
		
	}
}