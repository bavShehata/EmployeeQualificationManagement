/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eqms;

import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class

/**
 *
 * @author bavshehata
 */
public class EQMS {

    static ArrayList<Skill> skills = new ArrayList<Skill>();
    public static ArrayList<Course> courses = new ArrayList<Course>();
    public static ArrayList<Achievement> achievements = new ArrayList<Achievement>();
    public static ArrayList<Qualification> qualifications = new ArrayList<Qualification>();
    public static ArrayList<JobTitle> jobTitles = new ArrayList<JobTitle>();
    public static ArrayList<Insurance> insurances = new ArrayList<Insurance>();
    public static ArrayList<EmployeeSkill> employeeSkills = new ArrayList<EmployeeSkill>();
    public static ArrayList<Employee> employees = new ArrayList<Employee>();

    public static void initializeSkills() {
        skills.add(new Skill("Business Analysis", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ", 1500));
        skills.add(new Skill("Data Science", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Lacus vel facilisis volutpat est velit egestas", 3000));
        skills.add(new Skill("Programming Language c++", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Et ligula ullamcorper malesuada proin libero nunc consequat interdum varius", 1800));
        skills.add(new Skill("Artificial Intelligence", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ornare quam viverra orci sagittis eu volutpat", 2500));
        skills.add(new Skill("Software Development", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Aliquet nibh praesent tristique magna sit amet purus gravida", 2000));
    }

    public static void initializeCourses() {
        courses.add(new Course("An Introduction to Artificial Intelligence", "Deduce how to gain strategic advantage through the use of different kinds of intelligence.", 1000));
        courses.add(new Course("Machine Learning in Business", "Evaluate the appropriateness of a business application for machine learning", 1500));
        courses.add(new Course("Natural Language Processing in Business", "Evaluate the appropriateness of a business application for natural language processing", 2000));
        courses.add(new Course("Introduction to Probability and Data with R", "his course introduces you to sampling and exploring data, as well as basic probability theory and Bayes' rule", 1700));
        courses.add(new Course("Bayesian Statistics: Techniques and Models", "This is the second of a two-course sequence introducing the fundamentals of Bayesian statistics.", 1100));
        courses.add(new Course("The Business Intelligence Analyst Course ", "It is truly comprehensive. The Business Intelligence Analyst Course comprises of several modules", 1800));
    }

    public static void addCourseToSkill() {
        skills.get(0).addCourse(courses.get(0));
        skills.get(0).addCourse(courses.get(1));
        skills.get(1).addCourse(courses.get(2));
        skills.get(2).addCourse(courses.get(3));
        skills.get(3).addCourse(courses.get(4));
    }
    public static void initializeAchievements() {
        achievements.add(new Achievement("Lorem ipsum", "risus commodo viverra maecenas. Lacinia at quis risus sed vulputate. Lorem ipsum dolor sit amet consectetur adipiscing elit ut aliquam ", 1500));
        achievements.add(new Achievement("dolor sit amet", "Aliquet nibh praesent tristique magna sit amet purus gravida quis. Id volutpat lacus laoreet non curabitur gravida arcu ac tortor ", 2000));
        achievements.add(new Achievement("augue interdum", "", 2500));
        achievements.add(new Achievement("tortor posuere", "eget mi proin. Penatibus et magnis dis parturient. Nec feugiat nisl pretium fusce id velit ut tortor pretium. Luctus accumsan", 3000));
        achievements.add(new Achievement("potenti nullam", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Sed faucibus turpis", 4000));
    }

    public static void initializeQualifications() {
        qualifications.add(new Qualification("phd", "Web Development "));
        qualifications.add(new Qualification("diploma", "Data Science "));
        qualifications.add(new Qualification("bachelor", "Information Security Analysis "));
        qualifications.add(new Qualification("masters", "  Network and Systems Administration "));
        qualifications.add(new Qualification("diploma", "Sales Mangement "));
    }

    public static void initializeJobTitles() {
        // JobTitle intilizations      
        jobTitles.add(new JobTitle("software engineer ", "sociis natoque penatibus et magnis dis. Vel eros donec ac odio tempor orci dapibus ultrices. Commodo ullamcorper a lacus vestibulum sed arcu non ", 30000));
        jobTitles.add(new JobTitle("Data Scientist", "Sollicitudin nibh sit amet commodo nulla facilisi nullam vehicula. Augue interdum velit euismod in pellentesque massa placerat duis ", 35000));
        jobTitles.add(new JobTitle("Information Security Analyst", "eu mi bibendum neque egestas congue. Pretium viverra suspendisse potenti nullam. Scelerisque viverra mauris in aliquam ", 25000));
        jobTitles.add(new JobTitle("Web Developer", "bibendum neque egestas congue quisque. Leo integer malesuada nunc vel risus commodo viverra maecenas. Lacinia at quis risus sed vulputate ", 20000));
        jobTitles.add(new JobTitle("Computer Research Scientist", "Lorem ipsum dolor sit amet consectetur adipiscing elit ut aliquam. Aliquet nibh praesent tristique magna sit amet purus gravida quis ", 32000));
    }

    public static void initializeInsurances() {
        insurances.add(new Insurance("A", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua"));
        insurances.add(new Insurance("B", "Lobortis scelerisque fermentum dui faucibus in ornare quam viverra orci. Ut eu sem integer vitae. Iaculis at erat pellentesque adipiscing commodo"));
        insurances.add(new Insurance("C", "nulla porttitor massa. Mollis nunc sed id semper risus in hendrerit gravida. Massa vitae tortor condimentum lacinia quis vel eros donec ac"));
        insurances.add(new Insurance("D", "pretium lectus. Enim nec dui nunc mattis. Sed id semper risus in hendrerit gravida rutrum. Ac tortor vitae purus faucibus ornare suspendisse"));
        insurances.add(new Insurance("E", "Amet cursus sit amet dictum sit amet. Proin fermentum leo vel orci porta non pulvinar neque. Quis commodo odio aenean sed. Vulputate eu scelerisque "));
    }
    public static void initializeEmployeeSkills(){
        employeeSkills.add(new EmployeeSkill(skills.get(0)));
        employeeSkills.add(new EmployeeSkill(skills.get(1)));
        employeeSkills.add(new EmployeeSkill(skills.get(2)));
        employeeSkills.add(new EmployeeSkill(skills.get(3)));

    }
    public static void initializeEmployees() {
        employees.add(new Employee(30010101458763L, "Farah Aymen ", "Cairo ", 01051234123L, "female", "26/2/2019", "1/1/2001",new ArrayList<EmployeeSkill>(employeeSkills.subList(0,2)),new ArrayList<Qualification>(qualifications.subList(0,2)),new ArrayList<Achievement>(achievements.subList(0,2)),insurances.get(0),jobTitles.get(0)));
        employees.add(new Employee(30023111574178L, "Bavly Shehata ", "Alshorouk ", 01282084971L, "male", "23/11/2018", "23/11/2000",new ArrayList<EmployeeSkill>(employeeSkills.subList(1,3)),new ArrayList<Qualification>(qualifications.subList(1,3)),new ArrayList<Achievement>(achievements.subList(1,3)),insurances.get(0),jobTitles.get(0)));
        employees.add(new Employee(30011164851780L, "Yousef Yasser ", "Fifth settlement ", 01582723465L, "male", "16/1/2021", "16/11/2000",new ArrayList<EmployeeSkill>(employeeSkills.subList(2,4)),new ArrayList<Qualification>(qualifications.subList(2,4)),new ArrayList<Achievement>(achievements.subList(2,4)),insurances.get(0),jobTitles.get(0)));
        employees.add(new Employee(30201184459855L, "Amro Alsharif ", "Alshorouk ", 01061082674L, "male", "6/12/2020", "18/1/2002",new ArrayList<EmployeeSkill>(employeeSkills.subList(1,2)),new ArrayList<Qualification>(qualifications.subList(1,2)),new ArrayList<Achievement>(achievements.subList(1,2)),insurances.get(0),jobTitles.get(0)));
        employees.add(new Employee(30109235287410L, "Mostafa Nassar", "Giza ", 01161235123L, "male", "11/3/2021", "23/9/2001",new ArrayList<EmployeeSkill>(employeeSkills.subList(3,4)),new ArrayList<Qualification>(qualifications.subList(3,4)),new ArrayList<Achievement>(achievements.subList(3,4)),insurances.get(0),jobTitles.get(0)));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initilizations
        initializeSkills();
        initializeCourses();
        addCourseToSkill();
        initializeAchievements();
        initializeQualifications();
        initializeJobTitles();
        initializeInsurances();
        initializeEmployeeSkills();
        initializeEmployees();
        ManageCourseUI manageCourseUI = new ManageCourseUI();
        manageCourseUI.inputSkills();
    }

}
