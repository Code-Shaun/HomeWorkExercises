package maven.project;

/**
 * Created by shaun on 2016/03/03.
 */
public class TestObject2
{
    String name;
    String empID;
    double salary;

    public TestObject2(String name, String empID, double salary)
    {
        this.name = name;
        this.empID = empID;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmpID()
    {
        return empID;
    }

    public void setEmpID(String empID)
    {
        this.empID = empID;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return "TestObject2{" +
                "empID='" + empID + '\'' +
                ", salary=" + salary +
                '}';
    }
}
