
public class Employe_Detail {

	String EmployeeDetail,contact,department; 
	int age,salary;
	
	public Employe_Detail(String EmployeeDetail, String contact, String department,int age, int salary)
	{
		super();
		this.EmployeeDetail = EmployeeDetail;
		this.contact = contact;
		this.department = department;
		this.age = age;
		this.salary = salary;
	}
	
	public String getEmployeeDetails()
	{
		return EmployeeDetail;
	}
	
	public String getcontact()
	{
		return contact;
	}
	
	public String getdepartment()
	{
		return department;
	}
	
	public int getage()
	{
		return age;
	}
	
	public int salary()
	{
		return salary;
	}
}
