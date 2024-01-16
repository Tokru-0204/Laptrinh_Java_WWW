package org.example.autosrping;

public class Facutly {
    private String f_name;

    public Facutly(String f_name) {
        this.f_name = f_name;
    }

    public Facutly() {
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    @Override
    public String toString() {
        return "Facutly{" +
                "f_name='" + f_name + '\'' +
                '}';
    }
}
