
public class EmployeeFound implements ICheck {

	String employeeName;
	public EmployeeFound(String employeeName) {
		
		this.employeeName = employeeName;
		
	}
	@Override
	public void Check() {

		System.out.println(employeeName + " Is Already Hired");
		
	}
	
}
