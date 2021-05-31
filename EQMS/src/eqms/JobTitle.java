package eqms;


public class JobTitle {
    private static int count = 0;
    private int id;
    private String title;
    private float salary;
    private String description;

    public static int incrementAndGetCount(){
        return ++count;
    }

    public JobTitle(String title, String description, float salary) {
        id = 300000 + incrementAndGetCount();
        this.title = title;
        this.description = description;
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        JobTitle.count = count;
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

    public String getJobTitle() {
        return "JobTitle{" + "id=" + id + ", title=" + title + ", description=" + description + '}';
    }
}
