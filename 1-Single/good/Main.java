package good;
import java.time.LocalDate;
import java.time.Month;


public class Main {

	 public static void main(String[] args) {
	        
		 LocalDate start = LocalDate.of(2014, Month.JANUARY, 1);
		 
		 Employee employee = new Employee("LC12", "José", start, 1000);
		 
		 double newSalary = 
				 Promotions.addSalary(employee.getStartDate(), employee.getSalary());
		 
		 System.out.println(employee.toString());
		 System.out.println("Novo salário: " + newSalary);
		
	    }
}
