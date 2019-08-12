package good;

import java.time.LocalDate;

public class Employee {
	
	private String empId;
	private String name;
	private LocalDate startDate;
	private double salary;
	

	Employee(String empId, String name, LocalDate StartDate, double salary){
		this.setEmpId(empId);
		this.setName(name);
		this.setStartDate(StartDate);
		this.setSalary(salary);
	}
	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", startDate=" + startDate + ", salary=" + salary + "]";
	}


	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	

}
