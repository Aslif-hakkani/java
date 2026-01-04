import java.util.ArrayList;
public class CarList {
    public static void main(String[] args) {
        ArrayList <String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("BYD");
        cars.add("Mazda");
        cars.add(0, "Toyaota");
        cars.set(0, "Camry");
        cars.remove(3);
        System.out.println(cars);
        System.out.println(cars.get(2));
        System.out.println(cars.size());
        System.out.println();

        for(int i= 0 ; i<cars.size() ; i++){
        String word = "Brand = ".concat(cars.get(i));
            System.out.println(word);
        }
    }
}
