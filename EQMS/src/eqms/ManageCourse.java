/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eqms;

import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class
import java.util.HashMap; // import the HashMap class

/**
 *
 * @author bavshehata
 */
public class ManageCourse {

    Scanner input = new Scanner(System.in);
    private static HashMap<Integer, Course> skillCourseList = new HashMap<Integer, Course>();
    private static ArrayList<Integer> skillIds = new ArrayList<Integer>();
    
    public static boolean doesExist(int skillId) {
        // Access to skill entities
        ArrayList<Skill> skills = EQMS.skills;
        for (int i = 0; i < skills.size(); i++) {   
            if (skills.get(i).getId() == skillId) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Course> retrieveRelevantCourses(int skillId) {
        // The array list that will be returned
        ArrayList<Course> relevantCourses = new ArrayList<Course>();
        // Access to skill entities
        ArrayList<Skill> skills = EQMS.skills;

        // Looping through all skills to find the required skill and it's courses
        for (int i = 0; i < skills.size(); i++) {
            if (skills.get(i).getId() == skillId) {
                relevantCourses = skills.get(i).getCourses();
                break;
            }

        }
        return relevantCourses;

    }

    public static ArrayList<Course> pullOutSkill(ArrayList<Integer> requiredSkills) {
        // Get the first skill in the list and remove it from the list.
        int skillId = requiredSkills.get(0);
        skillIds.add(skillId);
        requiredSkills.remove(0);
        // Retrieve courses that match this skill by their IDs
        ArrayList<Course> relevantCourses = retrieveRelevantCourses(skillId);
        return relevantCourses;
    }

    public static void addToList(int skillId, Course course) {
        skillCourseList.put(skillId, course);
    }

    public static int assignCourses() {
        int numberOfAssignedCourses = 0;
        ArrayList<Employee> employees = EQMS.employees;
        // Loop through all required Skills
        for (int i = 0; i < skillIds.size(); i++) {
            int skillId = skillIds.get(i);
            Skill skill = new Skill();
            // Retrieve skill using skill id
            for (int j = 0; j < EQMS.skills.size(); j++) {
                if (EQMS.skills.get(j).getId() == skillId) {
                    skill = EQMS.skills.get(j);
                    break;
                }
            }
            System.out.println("Skill ID: " + skillId);
            // loop through employees
            for (int j = 0; j < employees.size(); j++) {
                System.out.println("Employee ID: " + employees.get(j).getId());
                boolean exists = false;
                ArrayList<EmployeeSkill> employeeSkills = employees.get(j).getEmployeeSkills();
                // Find employees that lack the skill
                for (int k = 0; k < employeeSkills.size(); k++) {
                    System.out.println("Employee's skill id: " + employeeSkills.get(k).getId());
                    if (employeeSkills.get(k).getId() == skillId) {
                        exists = true;
                        System.out.println("Match Found");
                        break;
                    }
                }
                // Assign the specific course to the employee and increment the number of assigned courses
                if (!exists) {
                    employees.get(j).addEmployeeSkill(new EmployeeSkill(skill, skillCourseList.get(skillId)));
                    numberOfAssignedCourses++;
                }
            }
        }
        return numberOfAssignedCourses;
    }
}
