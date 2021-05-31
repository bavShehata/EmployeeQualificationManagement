/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eqms;

/**
 *
 * @author bavshehata
 */
public class EmployeeSkill extends Skill {
    private Course course;
    private boolean completed;
    public EmployeeSkill(Skill skill){
        super(skill.id, skill.title, skill.description, skill.bonus);
        this.course = null;
        this.completed = true;
    }
    public EmployeeSkill(Skill skill, Course course) {
        super(skill.id, skill.title, skill.description, skill.bonus);
        this.course = course;
        this.completed = false;
    }

    public Course getCourse() {
        return course;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String display() {
        return "EmployeeSkill{"  + "id=" + id + ", title=" + title + ", description=" + description + ", bonus=" + bonus + "course=" + course + ", completed=" + completed + '}';
    }
    
}
