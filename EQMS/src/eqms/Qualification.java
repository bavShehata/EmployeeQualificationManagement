package eqms;

import java.util.ArrayList;

enum Degree{
    diploma, bachelor, masters, phd;
}

public class Qualification {
    private static int count = 0;
    private int id;
    private Degree degree;
    private String field;

    public static int incrementAndGetCount(){
        return ++count;
    }
    
    public Qualification(String degree, String field) {
        id = 200000 + incrementAndGetCount(); 
        this.degree = Degree.valueOf(degree);
        this.field = field;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Qualification.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String showQualification() {
        return "Qualification{" + "id=" + id + ", degree=" + degree + ", field=" + field + '}';
    }
}