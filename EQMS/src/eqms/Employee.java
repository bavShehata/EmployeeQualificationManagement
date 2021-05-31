package eqms;

import java.util.ArrayList;

enum Gender{
    male,
    female
}
public class Employee {
    private static int count = 0;
    private static ArrayList<Integer> removedIds = new ArrayList<Integer>();
    public int id;
    public long Ssn;
    public String name;
    public String address;
    public long phoneNumber;
    public Gender gender;
    public String employmentDate;
    public String dateOfBirth;
    public ArrayList<EmployeeSkill> employeeSkills;
    public ArrayList<Qualification> qualifications;
    public ArrayList<Achievement> achievements;
    public Insurance insurance;
    public JobTitle jobTitle;
    private static int incrementAndGetCount(){
        return ++count;
    }
    
    public Employee() {
        id = 0;
        Ssn = 0;
        name = "";
        address = "";
        phoneNumber = 0;
        gender = gender.male;
        employmentDate = "";
        dateOfBirth = "";
        employeeSkills = null;
        qualifications = null;
        achievements = null;
        insurance = null;
        jobTitle = null;

    }
    public Employee(long Ssn, String name, String address, long phoneNumber, String gender, String employmentDate, String dateOfBirth, ArrayList<EmployeeSkill> employeeSkills, ArrayList<Qualification> qualifications, ArrayList<Achievement> achievements, Insurance insurance, JobTitle jobTitle) {
        if(removedIds.isEmpty()){
            id = 100000 + incrementAndGetCount();
        }
        else{
            //If removedIds is not empty, the id is assigned to the last element in this list
            //because deleting the last element is faster than deleting the first element (constent time)
            id = removedIds.get(removedIds.size() - 1);
            removedIds.remove(removedIds.size() - 1);
        }
        this.Ssn = Ssn;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.gender = Gender.valueOf(gender);
        this.employmentDate = employmentDate;
        this.dateOfBirth = dateOfBirth;
        this.employeeSkills = employeeSkills;
        this.qualifications = qualifications;
        this.achievements = achievements;
        this.insurance = insurance;
        this.jobTitle = jobTitle;
    }
//This function checks if the employee ssn exists before int the employee arraylist or not. 
    public static boolean doesExist(int employeeSsn){
        for(int i = 0; i < EQMS.employees.size(); ++i){
            if(EQMS.employees.get(i).Ssn == employeeSsn)return true;
        }
        return false;
    }
    //This function checks the validity of the entered ssn.
    //This function was supposed to send the ssn to the civil registry system and get a return value of true or false
    //depending on whether this ssn exists in the system or not but for the sake of testing we made isValid function
    //check if the ssn consist of exactly 9 digits or not.
    public static boolean isValid(int employeeSsn){
        int numberOfDigits = 0;
        while(employeeSsn != 0){
            numberOfDigits++;
            employeeSsn/=10;
        }
        return numberOfDigits == 9;
    }
    //This function adds the employee to the arraylist of employees.
    public static void addEmployee(Employee employeeInfo){
        EQMS.employees.add(employeeInfo);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSsn() {
        return Ssn;
    }

    public void setSsn(long Ssn) {
        this.Ssn = Ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public JobTitle getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void addDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public ArrayList<EmployeeSkill> getEmployeeSkills() {
        return employeeSkills;
    }

    public void addEmployeeSkill(EmployeeSkill employeeSkill) {
        this.employeeSkills.add(employeeSkill);
    }

    public ArrayList<Qualification> getQualifications() {
        return qualifications;
    }

    public void addQualifications(Qualification qualifications) {
        this.qualifications.add(qualifications);
    }

    public ArrayList<Achievement> getAchievements() {
        return achievements;
    }

    public void addAchievement(Achievement achievements) {
        this.achievements.add(achievements);
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public String displayEmployee() {
        return "Employee{" + "id=" + id + ", Ssn=" + Ssn + ", name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", gender=" + gender + ", employmentDate=" + employmentDate + ", dateOfBirth=" + dateOfBirth + ", employeeSkills=" + employeeSkills + ", qualifications=" + qualifications + ", achievements=" + achievements + ", insurance=" + insurance + '}';
    }
   
}