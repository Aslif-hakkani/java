class Employee
{
    private int E_id;
    private String E_name;
    private double Salary;

    // Constructor
    public Employee(int E_id, String E_name, double Salary)
    {
        this.E_id = E_id;
        this.E_name = E_name;
        this.Salary = Salary;
    }

    // Setter & Getter for E_id
    public void setE_id(int E_id)
    {
        this.E_id = E_id;
    }

    public int getE_id()
    {
        return E_id;
    }

    // Setter & Getter for E_name
    public void setE_name(String E_name)
    {
        this.E_name = E_name;
    }

    public String getE_name()
    {
        return E_name;
    }

    // Setter & Getter for Salary
    public void setSalary(double Salary)
    {
        this.Salary = Salary;
    }

    public double getSalary()
    {
        return Salary;
    }
}

class Main
{
    public static void main(String[] args)
    {
        Employee E1 = new Employee(1001, "John", 12000);

        Employee E2 = new Employee(1002, "Alice", 10000);

        System.out.println("1st Employee details");
        System.out.println("ID: " + E1.getE_id());
        System.out.println("Name: " + E1.getE_name());
        System.out.println("Salary: " + E1.getSalary());

        System.out.println();

        System.out.println("2nd Employee details");
        System.out.println("ID: " + E2.getE_id());
        System.out.println("Name: " + E2.getE_name());
        System.out.println("Salary: " + E2.getSalary());
    }
}