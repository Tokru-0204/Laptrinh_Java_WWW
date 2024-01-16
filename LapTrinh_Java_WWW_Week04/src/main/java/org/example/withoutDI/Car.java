package org.example.withoutDI;

public class Car {
    private ICEngine engine;

    public Car(ICEngine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }


}
