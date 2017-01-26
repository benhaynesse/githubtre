import java.util.ArrayList;

/**
 * Created by Ben on 26/01/2017.
 */
public class main {

    public static void main(String[] args){

        Animal c = new Cat("cat");
        Animal d = new Dog("dog");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(c);
        animals.add(d);

        for (Animal a : animals) {
            System.out.println("The " + a.type + " says " + a.speak());

        }

    }

}
