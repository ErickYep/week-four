package day3.Task1;

public class Dog extends Animals {
    @Override
    protected void voice() {
        System.out.println("Dog-voice");
    }

    @Override
    protected void eat() {
        System.out.println("Dog-Eat");
    }
}
