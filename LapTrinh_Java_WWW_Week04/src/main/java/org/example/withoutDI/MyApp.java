package org.example.withoutDI;

public class MyApp {
    public static void main(String[] args) {
        ICEngine engine = new ICEngine();
        Car c =new Car(engine);
        c.start();
    }
}
