
public class User {
	
	@Role("Admin") 
	@Role("Teacher")
	@Role("Student")
	public void login(){}
	
	@Role("Student")
	@Role("Admin") 
	@Role("Teacher")
	public void logout(){}
	
	@Role("Student")
	public void takeTest(){}
	
	@Role("Teacher")
	public void postResults(){}
	
	@Role("Teacher")
	public void attendanceReport(){}
	
	@Role("Admin") 
	public void resetPassword(){}
	
	@Role("Admin") 
	public void createUser(){}
	
	

	
}
