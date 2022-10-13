package assigment.employeepayroll.io;

//EmployeePayrollIO Class
public class EmployeePayrollIO {
	public int ID;
	public String Name;
	public double Salary;
	
	//EmployeePayrollIO Constructor
	public EmployeePayrollIO(int ID, String Name, double Salary) {
		this.ID = ID;
		this.Name = Name;
		this.Salary = Salary;
	}
	
	//EmployeePayrollIO Override function to display
	@Override
	public String toString() {
		return "ID ->" + ID + ",NAME ->" + Name + ",SALARY ->" + Salary;
	}
}
