package eqms;

public class Course {

protected int id;
private String title;
private String description;
private float price;
private static int count=0;
    public Course() {
        id = -1;
        title = "";
        description = "";
        price = -1;
                
    }

    public Course(String title, String description, float price) {
        this.id = 500000 + incrementAndGetCount();
        this.title = title;
        this.description = description;
        this.price = price;
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

    public void setPrice(int price) {
        this.price = price;
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

    public float getPrice() {
        return price;
    }
   public static int incrementAndGetCount() {
     return ++count;
   }
    public String displayCourse() {
        return "Course{" + "id=" + id + ", title=" + title + ", description=" + description + ", price=" + price + '}';
    }
    
}