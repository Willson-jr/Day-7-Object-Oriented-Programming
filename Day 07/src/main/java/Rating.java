import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Rating {
    private int maximum;
    private int minimum;
    private String mark;

    private static List<Rating> ratingList = new ArrayList<>();
    //do inicjalizowania zmienny statycznych sluzy blok statyczny
    //blok statyczny jaest przed konstruktorem na początku tworzenia klasy
    //blok statyczny stosujemy wtedy kiedy chcemy zainicjalizowac zmienną, zmienne statyczne


    static {
        ratingList.add(new Rating(0, 9, "very slow laptop."));
        ratingList.add(new Rating(10, 24, "quiet decent laptop."));
        ratingList.add(new Rating(25, 50, "gaming machine."));
    }

    public static Rating getRating(int mark) {
        for (Rating rating : ratingList) {
            if (rating.minimum <= mark && mark <= rating.maximum)
                return rating;
        }
        return null;
    }
}
