package good;

import java.time.LocalDate;
import java.time.Period;

public class Promotions {
	
	public static double addSalary(LocalDate startDate, double salary) {
		
		int diff = Period.between(startDate, LocalDate.now()).getYears();
		
		return ((diff * 0.1) * salary) + salary;
		
	}

}
