package seminar_2;

public class Cat extends Animal{
    
    String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void makeSound() {
        System.out.println("Мяу-мяу!");

    }

    public void purr(){
        System.out.println("Муррр");
    }
}
