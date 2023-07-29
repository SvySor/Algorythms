package ru.geekbrains.lesson3;

public class Singleton {

    private static Singleton instance;

    private int setting1;
    private int setting2;
    private String setting3;

    public int getSetting1() {
        return setting1;
    }

    public void setSetting1(int setting1) {
        this.setting1 = setting1;
    }

    public static Singleton getInstance(){
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    private Singleton(){

    }

}
