package list_1;

import java.util.LinkedList;

public class LinkedListDemo2 {

    public static void main(String[] args) {

        LinkedList<String> countryNames = new LinkedList<String>();
        // () , here no size coz LinkeList start null but ArrayList start size

        countryNames.add("Bangladesh");
        countryNames.add("India");
        countryNames.add("Nepal");
        countryNames.add("Vhutan");

        for (String country : countryNames) {
            System.out.println(country);
        }

    }
}
