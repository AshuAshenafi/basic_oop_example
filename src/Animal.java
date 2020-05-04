/*
 * This is the parent class. Also called the super class
 */

public class Animal {
    public Animal() {
        System.out.println("A new animal has been created!");
    }
    public String sleep() {                 // parent class method which can be inherited, overridden by child classes
        return "An animal sleeps...";
    }
    public String eat() {                   // parent class method which can be inherited, overridden by child classes
        return "An animal eats...";
    }

    public String mouseEating(){
        Mouse m = new Mouse();              // Mouse Has-A relation or Mouse can live without Animal class
        return m.eat();
    }


}
