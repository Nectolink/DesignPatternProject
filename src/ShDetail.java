
public class ShDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe_Detail empd1 = new Employe_Detail("C-Software House", "123456789", "C#", 22, 20000);
		Employe_Detail empd2 = new Employe_Detail("Java-Software House", "123456789", "Java", 25, 35000);

		Detail d = new Detail("Pakistan,Karachi,SF1,SF2", "C#-Expert", "Java-Expert", "26-july-1994");
		
	    SoftwareHouse SF1 = new SoftwareHouse("SOFTWARE HOUSE 1\n", Employee.createMember("Muhammad Umer", d, empd1,empd2), Employee.createMember("Mutahir", d, empd1,empd2), Employee.createMember("Talha Ali", d, empd1,empd2));
	    SoftwareHouse SF2 = new SoftwareHouse("SOFTWARE HOUSE 2\n", Employee.createMember("Ghary", d, empd1,empd2), Employee.createMember("Talha Ali", d, empd1,empd2), Employee.createMember("Muhammad Umer", d, empd1,empd2));
        

	}
}
