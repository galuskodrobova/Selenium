import java.util.ArrayList;

public class ArrayListPrimer {

    public static void main(String[] args) {
            ArrayList<String> cars = new ArrayList<>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            cars.set(0,"Tesla");
           cars.set(1,"Tesla");
        System.out.println(cars);
        System.out.println(cars.get(1));//Access an Item
        cars.clear();
        System.out.println(cars.size());

    }
}

