
public class AnimalApp {
    public static void main(String[] args) {

        Animal a = new Animal();       // animal class constructor is executed at Runtime
        print(a.eat());
        print(a.sleep());
        print(a.mouseEating());     // mouse eating because Mouse Class Has_A relationship with Animal class

        Cat c = new Cat();          // First Parent class (Animal) constructor is executed then next Cat class constructor
        print(c.eat());             //  this method is overridden
        print(c.sleep());           //  this method is overridden
        print(c.purr());            //  this method belongs to the Cat class only not even for the parent class


        Bird b = new Bird();        // First Parent class (Animal) constructor is executed then next Bird class constructor
        print(b.eat());             // this method is overridden
        print(b.sleep());           // this method is overridden
        print(b.fly());             // this method belongs to the bird class only not even for the parent class

        Dog d = new Dog();
        print(d.sleep());           // parent method is called because of difference in signature
        print(d.eat());             // totally not found in Dog class but because of inheritance
        print(d.bark());            // barking is only dogs can do

        Mouse m = new Mouse();      // Mouse Has-A relation or Mouse can live without Animal class
        print(m.eat());


    }

    private static void print(String s) {
        System.out.println(s);
    }
}
