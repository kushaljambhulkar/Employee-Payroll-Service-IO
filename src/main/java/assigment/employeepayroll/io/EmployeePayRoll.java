package assigment.employeepayroll.io;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRoll {
	private final List<EmployeePayrollIO> employeepayrollList;
	
	public EmployeePayRoll(List<EmployeePayrollIO> employeepayrollList) {
		this.employeepayrollList = employeepayrollList;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<EmployeePayrollIO> employeePayrollList = new ArrayList();
		EmployeePayRoll employeepayroll = new EmployeePayRoll(employeePayrollList);
		employeepayroll.readEmployeePayrollIO(scan);
		employeepayroll.writeEmployeePayrollIO();
	}

	private void writeEmployeePayrollIO() {
		// TODO Auto-generated method stub
		System.out.println("\n: Employee Payroll :\n"+employeepayrollList);
		
	}

	private void readEmployeePayrollIO(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee ID: ");
		int ID = scan.nextInt();
		System.out.println("Enter Employee Name: ");
		String Name = scan.next();
		System.out.println("Enter Employee Salary : ");
		double Salary = scan.nextDouble();
		employeepayrollList.add(new EmployeePayrollIO(ID,Name,Salary));
		
	} 
}
