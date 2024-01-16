package org.example.autosrping;

public class Department {
    private String d_name;
    private Facutly facutly;

    public Department() {
    }

    public Department(Facutly facutly){
        this.facutly = facutly;
    }

    public Department(String d_name, Facutly facutly) {
        this.d_name = d_name;
        this.facutly = facutly;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public Facutly getFacutly() {
        return facutly;
    }

    public void setFacutly(Facutly facutly) {
        this.facutly = facutly;
    }

    @Override
    public String toString() {
        return "Department{" +
                "d_name='" + d_name + '\'' +
                ", facutly=" + facutly +
                '}';
    }
}
