/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eqms;
import java.util.ArrayList;
/**
 *
 * @author mosta
 */

public class Skill {
 protected int id;
 protected String title;
 protected String description;
 protected float bonus;
 protected ArrayList<Course> courses;
 private static int count=0;
 public Skill() {
     id = -1;
     title = "";
     description = "";
     bonus = -1;
     courses = new ArrayList<Course>();
   
    }
    public Skill(String title, String description, float bonus) {
        this.id = 400000 + incrementAndGetCount();
        this.title = title;
        this.description = description;
        this.bonus = bonus;
        courses = new ArrayList<Course>();

    }
    public Skill(int id, String title, String description, float bonus) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.bonus = bonus;
    }
     public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public void addCourse(Course course){
        courses.add(course);
    }
    public ArrayList<Course> getCourses(){
        return courses;
    }
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public float getBonus() {
        return bonus;
    }
    public static int incrementAndGetCount() {
      return ++count;
    }
    public String ShowSkill() {
        return "Skill{" + "id=" + id + ", title=" + title + ", description=" + description + ", bonus=" + bonus + '}';
    }
}