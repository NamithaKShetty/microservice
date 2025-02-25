package solidexample;

public class MySQLEmployeeRepository implements EmployeeRepository {
    @Override
    public void saveEmployee(IEmployee employee) {
        // In a real application, this would involve JDBC/JPA operations.
        System.out.println("Saving " + employee.getName() + " to the MySQL database.");
    }
}