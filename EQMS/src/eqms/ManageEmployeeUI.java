package eqms;

import java.util.*;

public class ManageEmployeeUI {
    
    public static void inputEmployeeInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ssn of the employee\n");
        long ssn = input.nextLong();
        
        //Flushing the puffer or getting rid of \n char.
        input.nextLine();
        
        System.out.println("Enter name of the employee\n");
        String name = input.nextLine();

        System.out.println("Enter address of the employee\n");
        String address = input.nextLine();

        System.out.println("Enter phone number of the employee\n");
        int phoneNumber = input.nextInt();

        //Flushing the puffer or getting rid of \n char.
        input.nextLine();
        
        System.out.println("Enter gender of the employee\n");
        String gender = input.nextLine();

        System.out.println("Enter employee date of birth of the employee\n");
        String dateOfBirth = input.nextLine();

        System.out.println("Enter employment date of the employee\n");
        String employmentDate = input.nextLine();

        ArrayList<Achievement> employeeAchievements = new ArrayList<Achievement>();
        System.out.println("these are the available achievements, enter the number of the achievement or -1 to exit\n");
        for(int i = 0; i < EQMS.achievements.size(); ++i){
            System.out.println((i+1) + "- " + EQMS.achievements.get(i).getAchievement());
        }
        int achievementNumber = input.nextInt();
        while(achievementNumber != -1){
            employeeAchievements.add(EQMS.achievements.get(achievementNumber - 1));
            achievementNumber = input.nextInt();
        }


        ArrayList<Qualification> employeeQualifications = new ArrayList<Qualification>();
        System.out.println("these are the available qualifications, enter the number of the qualification or -1 to exit\n");
        for(int i = 0; i < EQMS.qualifications.size(); ++i){
            System.out.println((i+1) + "- " + EQMS.qualifications.get(i).showQualification());
        }
        int qualificationNumber = input.nextInt();
        while(qualificationNumber != -1){
            employeeQualifications.add(EQMS.qualifications.get(qualificationNumber - 1));
            qualificationNumber = input.nextInt();
        }

        ArrayList<EmployeeSkill> employeeSkills = new ArrayList<EmployeeSkill>();
        System.out.println("these are the available skills, enter the number of the skill or -1 to exit\n");
        for(int i = 0; i < EQMS.skills.size(); ++i){
            System.out.println((i+1) + "- " + EQMS.skills.get(i).ShowSkill());
        }
        int skillNumber = input.nextInt();
        while(skillNumber != -1){
            employeeSkills.add(new EmployeeSkill(EQMS.skills.get(skillNumber - 1)));
            skillNumber = input.nextInt();
        }
        
        System.out.println("these are the available insurance packages, enter the number of the package\n");
        for(int i = 0; i < EQMS.insurances.size(); ++i){
            System.out.println((i+1) + "- " + EQMS.insurances.get(i).showPackage());
        }
        int packageNumber = input.nextInt();
        
        System.out.println("these are the available job titles, enter the number of the desired job title\n");
        for(int i = 0; i < EQMS.jobTitles.size(); ++i){
            System.out.println((i+1) + "- " + EQMS.jobTitles.get(i).getJobTitle());
        }
        int jobTitleNumber = input.nextInt();
        
        Employee newEmployee = new Employee(ssn, name, address, phoneNumber, gender, employmentDate, dateOfBirth, employeeSkills, employeeQualifications, employeeAchievements, EQMS.insurances.get(packageNumber - 1),EQMS.jobTitles.get(jobTitleNumber - 1));

        while(ManageEmployee.sendEmployeeInfo(newEmployee) != true){
            System.out.println("Invalid ssn, please enter ssn again !");
            ssn = input.nextLong();
            newEmployee.setSsn(ssn);
        }
        System.out.println("Emplyee has been added successfully");
    }
    
}
