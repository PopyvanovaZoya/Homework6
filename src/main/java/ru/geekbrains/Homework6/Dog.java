package ru.geekbrains.Homework6;

public class Dog extends Animal {
    public Dog (String name){
        super("Собака: " + name);
        runLimit = 500;
        swimLimit = 10;
    }
}
