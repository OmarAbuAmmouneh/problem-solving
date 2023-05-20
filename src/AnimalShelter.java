import java.util.LinkedList;
import java.util.regex.Pattern;

abstract class AnimalItem {
    private int order;
    protected String name;
    public AnimalItem(String name) {
        this.name = name;
    }
    public void setOrder(int order) {
        this.order = order;
    }
    public int getOrder () {
        return this.order;
    }
}
class Cat extends AnimalItem {

    public Cat(String name) {
        super(name);
    }
}

class Dog extends AnimalItem {
    public Dog(String name) {
        super(name);
    }
}


public class AnimalShelter {
    LinkedList<Cat> cats = new LinkedList<>();
    LinkedList<Dog> dogs = new LinkedList<>();
    private int order = 0;

    public void enqueue (AnimalItem x) {
        x.setOrder(order++);
        if (x instanceof Dog) dogs.addLast((Dog)x);
        else if (x instanceof Cat) cats.addLast((Cat) x);
    }
    public AnimalItem dequeueAny() {
        if (cats.getLast().getOrder() > dogs.getLast().getOrder()) {
            return cats.poll();
        } else {
           return dogs.poll();
        }
    }
    public AnimalItem dequeueCat() {
        return cats.poll();
    }
    public AnimalItem dequeueDog() {
        return dogs.poll();
    }
}
