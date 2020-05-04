#OOP concepts with example.
##Animal class is parent class
The other classes like Cat, Bird inherit from the Animal Class by using keyword
extends.
* So accordingly Cat Class and Bird Class each extend Animal Class
* so both Cat and Bird class override the methods sleep() and eat() in the way that fits their nature.
* constructors have same name with the class name
* during overridding the same method name to the method in the parent is used. The 
     differece is the implementation.
* In the Animal Application class the three objects are created during java 
    Runtime and each time the new class is created parent's class constructor is
    executed.
* overriding is Runtime polymorphism
* child class can have their own method which is not available which can not 
    be accessed by parent reference.
* encapsulation is data hiding plus abstraction. Data hiding is made by assigning
    instance variables private but in our example i didn't see instance variables.