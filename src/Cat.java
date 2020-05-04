
public class Cat extends Animal {
    public Cat() {
        super();
        System.out.println("Now I am a Cat!");
    }

    @Override
    public String sleep() {             // this method overrides parent method with the same signature
        return "A cat sleeps...";
    }

    @Override
    public String eat() {             // this method overrides parent method with the same signature
        return "A cat eats...";
    }

    public String purr() {             // this method newly created specificaly to cat class and parent class can't inherit it back
        return "purrr...";
    }

}
