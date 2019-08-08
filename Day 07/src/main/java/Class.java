import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data

public class Class {
    private List<String> list;

    void addStudent (String name){
         list.add(name);
    }

    void displayStudents(){
        System.out.print("Students: ");
        for (int i = 0; i < list.size(); i++) {
            if(i== list.size()-1) {
                System.out.println(list.get(i)+".");
            } else {
                System.out.print(list.get(i)+", ");
            }
        }


//        for (String names : list  ) {
//            System.out.print(names+ " ");
//        }
//        System.out.println();

    }

    int getGirlsCount(){
        int girls = 0;
        for (String names : list) {
            if (names.endsWith("a")){
                girls++;
            }
        } return girls;
    }

    public static void main(String[] args) {
        List<String> klass = new ArrayList<>();
        klass.add("Jacek");
        klass.add("Ania");
        klass.add("Marek");
        klass.add("Grzesiek");
        klass.add("Kasia");

        Class newClass = new Class(klass);

        newClass.addStudent("Zosia");
        newClass.displayStudents();
        System.out.println("This class has "+ newClass.getGirlsCount()+ " girls");

    }
}
