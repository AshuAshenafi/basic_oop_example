/*
 * All Birds are Animals but all Animals are not Birds
 */

public class Bird extends Animal {
    public Bird() {
        //super();
        System.out.println("A bird is hatched...");
    }


    @Override
    public String sleep() {             // this method overrides parent method with the same signature
        return "A bird sleeps soundly...";
    }

    @Override
    public String eat() {             // this method overrides parent method with the same signature
        return "A bird eats...";
    }


    public String fly() {             // this method newly created specificaly to cat class and parent class can't inherit it back
        //Birds can fly but other animals can't so this method
        //is unique to the Bird class
        return "A bird flies...";
    }

}
