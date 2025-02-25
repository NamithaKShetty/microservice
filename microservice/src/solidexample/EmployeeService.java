package solidexample;

//EmployeeService.java
public class EmployeeService {
 private final EmployeeRepository repository;

 // Dependency Injection via constructor (DIP)
 public EmployeeService(EmployeeRepository repository) {
     this.repository = repository;
 }

 public void addEmployee(IEmployee employee) {
     repository.saveEmployee(employee);
 }

 public void performEmployeeDuties(IEmployee employee) {
     employee.performDuties();
 }
}
