  import java.util.ArrayList;
import java.util.List;


public class EmployeeBO {
	
	public List<Employee> getEmployeeList(){
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("thana", "thana211", "thana@gmail.com", "Thanarathanam", 520000, 240000, 50400));
		employeeList.add(new Employee("amar", "amar123", "amar@yahoo.com", "Amarnath", 590000, 250000, 60400));
		employeeList.add(new Employee("madhan", "madhan007", "madhan@gmail.com", "Madhan Kumar", 680000, 340000, 60600));
		employeeList.add(new Employee("jimesh", "jimmy25", "jimesh@gmail.com", "Jimesh",670000, 260000, 50800));
		employeeList.add(new Employee("sasi", "sasi18", "sasi@a.com", "Sasidharan", 690000, 270000, 50600));
		return employeeList;
	}
	
	public Employee validateLogin(String username,String password) {
		List<Employee> employeeList = getEmployeeList();
		for(Employee u :employeeList){
			if(u.getUserName().equals(username)&&u.getPassword().equals(password)){
				return u;
			}
		}
		return null;
	}
}

