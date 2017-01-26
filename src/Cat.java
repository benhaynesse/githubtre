/**
 * Created by Ben on 26/01/2017.
 */
public class Cat extends Animal {


    public Cat(String type) {
        super(type);
    }

    @Override
    public String speak() {
        return "MEOW";
    }
}
