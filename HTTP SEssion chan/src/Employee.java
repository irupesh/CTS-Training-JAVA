  
public class Employee {

	private String userName;
	private String password;
	private String email;
	private String name;
	private Integer salary;
	private Integer hra;
	private Integer pf;
	
	
	public Employee(String userName, String password, String email, String name,Integer salary,Integer hra,Integer pf){
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.name = name;
		this.salary = salary;
		this.hra = hra;
		this.pf = pf;
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getHra() {
		return hra;
	}

	public void setHra(Integer hra) {
		this.hra = hra;
	}

	public Integer getPf() {
		return pf;
	}

	public void setPf(Integer pf) {
		this.pf = pf;
	}

}

