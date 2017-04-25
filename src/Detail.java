
public class Detail {

	String SFhouses;
	String skill1;
	String skill2;
	String DateOfBirth;

	public Detail(String SFhouses,  String skill1, String skill2, String DateOfBirth) {
		
		this.SFhouses = SFhouses;
		
		this.skill1 = skill1;
		this.skill2 = skill2;
		this.DateOfBirth = DateOfBirth;
	}
	
	public String getSFhouse() {
		return SFhouses;
	}
	
	public String getSkill1() {
		return skill1;
	}
	public String getSkill2() {
		return skill2;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	
	
	
}
