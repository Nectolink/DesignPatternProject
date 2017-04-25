import java.util.ArrayList;

public class Employee implements ICheck {

	Detail Empdetail;
	
	ArrayList<Employe_Detail> EmpDet = new ArrayList<Employe_Detail>();
	
	static ArrayList<Employee> employees = new ArrayList<Employee>();
	
	String EmployeeName;
	
	private Employee(String employeeName, Detail det, Employe_Detail...details)
	{
		this.EmployeeName = employeeName;
		this.Empdetail = det;
		
		for(Employe_Detail EmpDet : details)
		{
			this.EmpDet.add(EmpDet);
		}
	}
	
	public static ICheck createMember(String employee, Detail det,Employe_Detail...employeedetails) {
		if (findemployee(employee)) {
			employees.add(new Employee(employee, det, employeedetails));
			return getEmployee(employee);
		}
		return new EmployeeFound(employee);
	}
	
	public static Employee getEmployee(String employeeName) {
		for (Employee employee : employees) {
			if (employee.EmployeeName.equalsIgnoreCase(employeeName)) {
				return employee;
			}
		}
		return null;
	}
	
	private static boolean findemployee(String employeeName) {
		for (Employee employee : employees) {
			if (employee.EmployeeName.equalsIgnoreCase(employeeName)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void Check() {
		
		System.out.println(EmployeeName + " Is Hired");
		
	}
	
}
