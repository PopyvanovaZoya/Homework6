package ru.geekbrains.Homework6;

public class Cat extends Animal {
    public Cat (String name){
        super("Кот " + name);
        runLimit = 200;
    }

    public void swim (int distance) {
        System.out.println(name + " не плавает");
    }
}
