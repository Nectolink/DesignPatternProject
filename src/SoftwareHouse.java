import java.util.ArrayList;

public class SoftwareHouse {
	
	String Shname;
	ArrayList<ICheck> Members = new ArrayList<ICheck>();
	
	public SoftwareHouse(String Shname,ICheck...checks)
	{
		this.Shname = Shname;
		
		for(ICheck check : checks)
		{
			Members.add(check);
		}
		
		ShowMembers();
	}

	private void ShowMembers() {
		
		System.out.println("\nSoftware House Name: "+Shname);
		for(ICheck members : Members)
		{
			System.out.print("Member: ");
			members.Check();
		}
		
	}
}
