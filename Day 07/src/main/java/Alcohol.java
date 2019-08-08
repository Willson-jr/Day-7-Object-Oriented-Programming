import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
public class Alcohol {
    private String title;
    private Double strength;

    float calculatePerMil(int quantity, int weight, boolean male){
        float proMil = 0;
        if (male){
            proMil = (float) ((float) quantity / 0.7 / weight * strength);
        } else {
            proMil = (float) ((float) quantity / 0.6 / weight * strength);
        }
        return proMil;
    }
    float calculatePermilWithHours(int quantity, int weight, boolean male,double hours){
        float proMil = 0;
        if (male){
            proMil = (float) ((float) ((quantity  * strength ) - 11*hours)/ (0.7 * weight) );
        } else {
            proMil = (float) ((float) ((quantity  * strength ) - 11*hours)/ (0.6 * weight));
        }
        return proMil;
    }

    public static void main(String[] args) {
        char prom = 8240;
        List<Alcohol> booze = new ArrayList<>();
        booze.add(new Alcohol("Beer",  0.05));
        booze.add(new Alcohol("Vodka", 0.4));
        booze.add(new Alcohol("Wine",  0.112));
        booze.add(new Alcohol("Hooch", 0.56));

        for (Alcohol alcohol : booze) {

            System.out.print("Man (90 kg) will have ");
            System.out.printf("%.2f",alcohol.calculatePerMil(500 ,90, true));
            System.out.print(prom +" blood-alcohol content after drinking 100 ml of " + alcohol.title);
            System.out.println();

        }

        for (Alcohol alcohol : booze) {

            System.out.print("Man (90 kg) will have ");
            System.out.printf("%.2f",alcohol.calculatePermilWithHours(500 ,90, true,0));
            System.out.print(prom +" blood-alcohol content after drinking 500 ml of " + alcohol.title);
            System.out.println();

        }
    }
}
