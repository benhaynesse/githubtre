/**
 * Created by Ben on 26/01/2017.
 */
public class Dog extends Animal {

    public Dog(String type) {
        super(type);
    }

    @Override
    public String speak() {
        return "WOOF";
    }

}
