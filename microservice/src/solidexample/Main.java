package solidexample;


public class Main {
 public static void main(String[] args) {
     // Create the repository and service instances (in real apps, use a DI framework)
     EmployeeRepository repository = new MySQLEmployeeRepository();
     EmployeeService employeeService = new EmployeeService(repository);

     // Create employees using our defined classes (SRP, LSP, ISP)
     IEmployee developer = new Developer("Alice");
     IEmployee manager = new Manager("Bob");
     IEmployee securityGuard = new SecurityGuard("Charlie");

     // Add employees to the system
     employeeService.addEmployee(developer);
     employeeService.addEmployee(manager);
     employeeService.addEmployee(securityGuard);

     // Demonstrate each employee performing their specific duties
     employeeService.performEmployeeDuties(developer);
     employeeService.performEmployeeDuties(manager);
     employeeService.performEmployeeDuties(securityGuard);
 }
}
