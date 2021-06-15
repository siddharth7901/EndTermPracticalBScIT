public class Employee   
{
public static void main(String[] args)
{
Employee employee = new Employee();
employee.employee_name="Aditya Rawat";
employee.employee_id="105";
employee.employee_salary="7000";
employee.showDetails();
}
}

class Employee
{
String Employee_name;
int Employee_id;
double Employee_salary;
void showDetails()
{
System.out.println("Employee Name"+employee_name);
System.out.println("Employee Id"+employee_id);
System.out.println("Employee Salary"+employee_salary);
}
}