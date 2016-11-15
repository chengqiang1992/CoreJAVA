import java.util.*;

/**
 * This program tests the employee class.
 * @version 1.11 2004-02-19
 * @author hasee
 */
public class EmployeeTest {

	public static void main(String[] args) {
		//fill the staff array with three Employee object
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Carl Cracker", 75000, 2014, 12, 15);
		staff[1] = new Employee("Harrt Hacker", 50000, 2015, 10, 1);
		staff[2] = new Employee("Tony Tester", 40000, 2016, 3, 15);
		
		// raise everyone's salary by 5%
		for(Employee e : staff){
			e.raiseSalary(10);
		}
		
		// print out information about all Employee objects
		for(Employee e : staff){
			System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
		}
	}

}
