/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eqms;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Farah
 */
public class ManageCourseUI {

    Scanner input = new Scanner(System.in);

    public ManageCourseUI() {
        System.out.println("ManageCourseUI Initialized.");
    }

    ;
    public void inputSkills() {
        int SID;
        ArrayList<Integer> SIDs = new ArrayList<Integer>();
        System.out.println("Please enter the skill IDs (Enter -1 to exit): ");
        do {
            SID = input.nextInt();
            if (SID == -1) {
                break;
            }
            SIDs.add(SID);
        } while (true);
        sendSkills(SIDs);

    }

    public void sendSkills(ArrayList<Integer> skillList) {
        ArrayList<Course> relevantCourses = new ArrayList<Course>();    //ArrayList to store courses suitable for each skill
        ArrayList<Course> selectedCourses = new ArrayList<Course>();    //ArrayList to store courses selected by HR

        Course selectedCourse;  //the course selected for a certian skill
        //loop to go through every skill to match with a certain course
        while (skillList.size() > 0) {
            int currentID = skillList.get(0);   //stores the ID the loop currenty stopped at
            System.out.println("Skill ID: " + currentID);
            if (ManageCourse.doesExist(currentID)) {
                relevantCourses = ManageCourse.pullOutSkill(skillList);     //store the course of the certain skill in the arraylist of courses
                if (relevantCourses.size() > 0) {
                    selectedCourse = selectCourse(relevantCourses);     //store the course selected
                    selectedCourses.add(selectedCourse);
                    sendCourse(currentID, selectedCourse);      //send the selected course and the skill ID
                } else {
                    System.out.println("No courses were found for this skill");
                    continue;
                }
            } else {
                do {
                    System.out.println("ID " + currentID + " DOESN'T EXIST!\n(1)Replace (2)Continue");
                    int choice = input.nextInt();
                    if (choice == 1) {
                        System.out.println("Enter new ID");
                        currentID = input.nextInt();
                        skillList.set(0, currentID);
                    } else {
                        skillList.remove(0);
                        break;
                    }
                } while (!ManageCourse.doesExist(currentID));
            }
        }
        if (selectedCourses.size() == 0) {
            System.out.println("No courses to assign");
        } else {
            System.out.println("Courses were sent successfully!");
            int NumofCourses = ManageCourse.assignCourses();    // number of Assigned courses
            System.out.print(NumofCourses + " courses were assigned successfully!\nThe chosen courses are: \n");
            //Loop to print all course that were assigned
            for (int i = 0; i < selectedCourses.size(); i++) {
                System.out.print(i + 1 + ". ");
                System.out.println(selectedCourses.get(i).getTitle());
            }
            System.out.println("\n");
        }
    }

    public Course selectCourse(ArrayList<Course> relevantCourses) {
        displayRelevantCourses(relevantCourses);
        // After diplaying the list of relevant courses, provide the choice to select a certain course.
        int x = input.nextInt();
        return relevantCourses.get(x - 1);
    }

    public void displayRelevantCourses(ArrayList<Course> relevantCourses) {
        //Displays all relevant courses
        System.out.println("Please choose one of the following courses: ");
        for (int i = 0; i < relevantCourses.size(); i++) {
            System.out.println(i + 1 + ". " + relevantCourses.get(i).displayCourse());
        }
    }

    public void sendCourse(int skillId, Course c) {
        //sends the courses to the the list with the matching skill ID
        ManageCourse.addToList(skillId, c);
    }
}
