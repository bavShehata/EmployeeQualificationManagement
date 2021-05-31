/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eqms;

import java.util.ArrayList;


public class Achievement {
    private static int count = 0;
    private int id;
    private String title;
    private String description;
    private float bonusValue;

    public static int incrementAndGetCount(){
        return ++count;
    }
    
    public Achievement(String title, String description, float bonusValue) {
        id = 600000 + incrementAndGetCount(); 
        this.title = title;
        this.description = description;
        this.bonusValue = bonusValue;
    }
    
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Achievement.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getBonusValue() {
        return bonusValue;
    }

    public void setBonusValue(float bonusValue) {
        this.bonusValue = bonusValue;
    }

    public String getAchievement() {
        return "Achievement{" + "id=" + id + ", title=" + title + ", description=" + description + ", bonusValue=" + bonusValue + '}';
    }
}

