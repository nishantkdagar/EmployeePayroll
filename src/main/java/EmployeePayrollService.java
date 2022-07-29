import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollService {
    public enum IOService{
        CONSOLE_IO,FILE_IO
    }
    private ArrayList<EmployeePayrollData> employeePayrollList;
    public EmployeePayrollService(ArrayList<EmployeePayrollData> employeePayrollList){
        this.employeePayrollList=employeePayrollList;
    }
    public void readEmployeePayrollData(Scanner inputReader){
        System.out.print("Enter Employee ID: ");
        int id=inputReader.nextInt();
        System.out.print("Enter Employee name: ");
        String name=inputReader.next();
        System.out.print("Enter Employee salary: ");
        Double salary=inputReader.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id,name,salary));
    }
    public void writeEmployeePayrollData(){
        System.out.println("\nWriting Employee Payroll Roaster to Console\n"+employeePayrollList);
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollDataArrayList=new ArrayList<>();
        EmployeePayrollService employeePayrollService=new EmployeePayrollService(employeePayrollDataArrayList);
        Scanner inputReader=new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(inputReader);
        employeePayrollService.writeEmployeePayrollData();
    }
}