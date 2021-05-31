package eqms;

import static eqms.Achievement.incrementAndGetCount;
import java.util.ArrayList;

public class Insurance {
    private static int count = 0;
    private int id;
    private String title;
    private String description;
    
    public static int incrementAndGetCount(){
        return ++count;
    }

    public Insurance(String title, String description) {
        id = 700000 + incrementAndGetCount();
        this.title = title;
        this.description = description;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Insurance.count = count;
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

    public String showPackage() {
        return "Insurance{" + "id=" + id + ", title=" + title + ", description=" + description + '}';
    }
}
