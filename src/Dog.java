public class Dog extends Animal{

    public Dog(){                        // dog's class default constructor to be executed on creation
        System.out.println("Here comes the D...o...g....!!!");
    }


    public String sleep (String str){       // dog method with different signature from parent method though with same name like overloading
        return "Dog takes longer naps.";
    }

    public String bark (){
        //Dogs bark but other animals can't so this method
        //is unique to the Dog class
        return "Dog barks!!!!";
    }
}
