package ru.geekbrains.Homework6;

public class Test {
    public static void main(String[] args) {
        int counter = 0;
        int catCounter = 0;
        int dogCounter = 0;
        Animal[] arr = new Animal[5];
        arr[0] = new Cat("Рыжик");
        arr[1] = new Dog("Зак");
        arr[2] = new Dog("Шарик");
        arr[3] = new Cat("Мурка");
        arr[4] = new Cat("Котангенс");

        for (int i = 0; i <arr.length; i++ ) {
            if (arr[i].getClass().getName() == Cat.class.getName()) {
                catCounter++;
            }
            if (arr[i].getClass().getName() == Dog.class.getName()) {
                dogCounter++;
            }

            counter++;

            arr[i].run(100);
            arr[i].swim(5);

        }
        System.out.println("Котов: " + catCounter + "\n" + "Собак: " + dogCounter + "\n" + "Всего животных: " + counter);

    }
}
