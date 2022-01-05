package ru.geekbrains.Homework6;

public abstract class Animal {
    protected String name;
    protected int runLimit = 0;
    protected int swimLimit = 0;

    public Animal (){
        this.name = "Животное";
    }
    public Animal (String name) {
        this.name = name;
    }

    public void run (int distance){
        if(runLimit >0 && runLimit>= distance)
        System.out.println(name + " пробежал " + distance + "м");
        else{
            System.out.println(name + " не может столько пробежать");
        }
    }

    public void swim (int distance){
        if(swimLimit >0 && swimLimit>= distance)
        System.out.println(name + " проплыл " + distance + "м");
        else{
            System.out.println(name + " не может столько проплыть ");
        }
    }
}
