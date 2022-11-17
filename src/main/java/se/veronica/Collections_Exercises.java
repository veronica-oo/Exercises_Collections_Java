package se.veronica;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Collections_Exercises {


    public static void main(String[] args) {


        ex9();


    }

    /* Collection Exercises

    1. Create a new list and populate it with the days of the week. Lastly, print the out the list.
     */
    public static void ex1() {
        ArrayList<String> daysOfTheWeek = new ArrayList<>();
        daysOfTheWeek.add(0, "Sunday");
        daysOfTheWeek.add(1, "Monday");
        daysOfTheWeek.add(2, "Tuesday");
        daysOfTheWeek.add(3, "Wednesday");
        daysOfTheWeek.add(4, "Thursday");
        daysOfTheWeek.add(5, "Friday");
        daysOfTheWeek.add(6, "Saturday");

        System.out.println(daysOfTheWeek);

    }

    /* 2. Create a new list and populate it with the days of the week. 
    Lastly, iterate through the list and print out each element separately.
     */

    public static void ex2() {
        ArrayList<String> daysOfTheWeek = new ArrayList<>();
        daysOfTheWeek.add("Sunday");
        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");
        daysOfTheWeek.add("Thursday");
        daysOfTheWeek.add("Friday");
        daysOfTheWeek.add("Saturday");

        for (String elements : daysOfTheWeek) {
            System.out.println(elements);
        }

    }

    /* 3. Create a new list and populate it with the days of the week excluding THURSDAY.
    Lastly, insert the weekday THURSDAY into the right position in the list.
     */

    public static void ex3() {
        ArrayList<String> daysOfTheWeek = new ArrayList<>();
        daysOfTheWeek.add("Sunday");
        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");
        daysOfTheWeek.add("Friday");
        daysOfTheWeek.add("Saturday");

        daysOfTheWeek.add(4, "Thursday");
        System.out.println("----------------------------------");
        System.out.println(daysOfTheWeek);


    }

    /* 4. Create a new list and populate it with the days of the week.
    Then create a new list out of the first three elements of the first list using a subList.
     */
    public static void ex4() {
        List<String> daysOfTheWeek = new ArrayList<>();
        daysOfTheWeek.add("Sunday");
        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");
        daysOfTheWeek.add("Thursday");
        daysOfTheWeek.add("Friday");
        daysOfTheWeek.add("Saturday");

        List<String> subWeekList = daysOfTheWeek.subList(0, 3);
        System.out.println(subWeekList);


    }

    // exercise 4a

    public static void ex4a(){
        ArrayList<String> daysOfTheWeek = new ArrayList<>();
        daysOfTheWeek.add("Sunday");
        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");
        daysOfTheWeek.add("Thursday");
        daysOfTheWeek.add("Friday");
        daysOfTheWeek.add("Saturday");

        List<String> subWeekList = daysOfTheWeek.subList(0 , 3); //from indexStart inclusive to indexLast exclusive
        System.out.println(subWeekList);
    }

    /* 5. Create a new hashset and populate it with the days of the week. Lastly, print the set out and pay attention
    to the order of the elements.
     */

    public static void ex5(){
        Set<String> daysOfTheWeek = new HashSet<>();
        daysOfTheWeek.add("Sunday");
        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");
        daysOfTheWeek.add("Thursday");
        daysOfTheWeek.add("Friday");
        daysOfTheWeek.add("Saturday");

        System.out.println(daysOfTheWeek); //[Monday, Thursday, Friday, Sunday, Wednesday, Tuesday, Saturday]
    }

    /* 6. Create a new hashSet and populate it with the days of the week. Then convert the hashSet to an arrayList. */

    public static void ex6() {
        Set<String> daysOfTheWeek = new HashSet<>();
        daysOfTheWeek.add("Sunday");
        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");
        daysOfTheWeek.add("Thursday");
        daysOfTheWeek.add("Friday");
        daysOfTheWeek.add("Saturday");

        List<String> arrayDaysOfTheWeek = new ArrayList<>();
        arrayDaysOfTheWeek.addAll(daysOfTheWeek);

    }

    /* 7. Create a new hashSet and populate it with random names. Then convert the hashSet to an arrayList.
    Lastly, manually sort the list in alphabetical order and print it out.
     */

    public static void ex7(){
        Set<String> nameString = new HashSet<>();
        nameString.add("Vera");
        nameString.add("Chika");
        nameString.add("Kamara");
        nameString.add("Cajsa");
        nameString.add("Jas");

        List<String> arrayNames = new ArrayList<>();
        arrayNames.addAll(nameString);
        arrayNames.set(0 , "Cajsa");
        arrayNames.set(1 , "Chika");
        arrayNames.set(2 , "Jas");
        arrayNames.set(3 , "Kamara");
        arrayNames.set(4 , "Vera");

        System.out.println(arrayNames);


    }

    /* 8. Create a new hashSet and populate it with random names. Lastly, sort the names in alphabetical
    order using only a Set or a child of Set.
     */

    public static void ex8(){
        Set<String> nameString = new HashSet<>();
        nameString.add("Vera");
        nameString.add("Chika");
        nameString.add("Kamara");
        nameString.add("Cajsa");
        nameString.add("Jas");
        for (String names : nameString) {
            System.out.println(names);
        };

        List<String> listNames = new ArrayList<>();
        listNames.addAll(nameString);
        Collections.sort(listNames);
        System.out.println(listNames);
    }

    /* 9. Create a new hashMap of type <Integer,String> and populate it with elements containing an id(Integer) and
    a car brand(String). Lastly, print out the entire hashMap.
     */

    public static void ex9(){
        Map<Integer, String> carBrands = new HashMap<>();
        carBrands.put(1 , "Volvo");
        carBrands.put(2 , "BMW");
        carBrands.put(3 , "Benz");
        carBrands.put(4 , "Nissan");
        carBrands.put(5 , "Volvo");

        System.out.println(carBrands); //print as array list

        for (Map.Entry entry : carBrands.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue()); //print next line
        }





    }


}
