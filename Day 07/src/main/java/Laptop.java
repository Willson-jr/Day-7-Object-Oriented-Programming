import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
public class Laptop {
    private String model;
    private Integer mark;


    void introduce(){
        System.out.println("Hi, I'm" + model + " and I'm a" + Rating.getRating(mark));
    }

    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("ASUS NOVAGO TP370QL",2));
        laptops.add(new Laptop("ACER PREDATOR 21 X",38));
        laptops.add(new Laptop("DELL LATITUDE 7390",15));
        laptops.add(new Laptop("ALIENWARE 15 R3",39));

        for (Laptop laptop : laptops) {
            laptop.introduce();
        }

        for (Laptop laptop2 : laptops) {
            if (laptop2.mark > 20) {
                System.out.println(laptop2.model + "is rated " + laptop2.mark);
            }
        }
    }
}
