package eqms;

public class ManageEmployee {
    //This function checks if the employee ssn exists before int the employee arraylist or not. 
    public static boolean doesExist(long employeeSsn){
        for(int i = 0; i < EQMS.employees.size(); ++i){
            if(EQMS.employees.get(i).Ssn == employeeSsn)return false;
        }
        return true;
    }
    //This function checks the validity of the entered ssn.
    //This function was supposed to send the ssn to the civil registry system and get a return value of true or false
    //depending on whether this ssn exists in the system or not but for the sake of testing we made isValid function
    //check if the ssn consists of exactly 14 digits or not and the first digit represents the millennium and the next
    //2 digits represents the year, next 2 digits represents the month, next 2 digits represents the day.
    public static boolean isValid(Long employeeSsn, String date){
        long numberOfDigits = 0;
        long temp = employeeSsn;
        while(temp != 0){
            numberOfDigits++;
            temp/=10;
        }
        
        if(numberOfDigits != 14)return false;
        
        while(numberOfDigits > 7){
            employeeSsn/=10;
            numberOfDigits--;
        }
        System.out.println(employeeSsn);
        long []dateInfo = new long []{Integer.parseInt(date.substring(0, 2)), 
                                      Integer.parseInt(date.substring(3, 5)), 
                                      Integer.parseInt(date.substring(8, 10))};
        long millennium = Integer.parseInt(date.substring(6, 7)) + 1;
        
        for(int i = 0; i < 3; ++i){
            long check = employeeSsn%10;
            employeeSsn/=10;
            check+=(employeeSsn%10)*10;
            employeeSsn/=10;
            if(check != dateInfo[i])return false;
        }
        return employeeSsn == millennium;
    }
    //This function adds the employee to the arraylist of employees.
    public static void addEmployee(Employee employeeInfo){
        EQMS.employees.add(employeeInfo);
    }
    public static boolean sendEmployeeInfo(Employee employeeInfo){
        if(doesExist(employeeInfo.Ssn) && isValid(employeeInfo.Ssn, employeeInfo.dateOfBirth)){
            addEmployee(employeeInfo);
            return true;
        }
        else{
            return false;
        }
    }
}
  

