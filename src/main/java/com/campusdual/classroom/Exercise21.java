package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {
        Set<String> elements = new HashSet<>();


        elements.add("ELEMENT KPRBC");
        elements.add("ELEMENT YPBTM");
        elements.add("ELEMENT AADXU");
        elements.add("ELEMENT RXCGJ");
        elements.add("ELEMENT WYMVD");
        elements.add("ELEMENT WFGEJ");
        elements.add("ELEMENT TYGBS");
        elements.add("ELEMENT MAPTK");
        elements.add("ELEMENT GJXVE");
        elements.add("ELEMENT BAFGL");

        for (String element : elements){
        System.out.println(element);
        }
        return elements;
    }

    public static Set<String> createTreeSet() {
        Set<String> elementsAgain = new TreeSet<>();

                elementsAgain.add("ELEMENT KPRBC");
                elementsAgain.add("ELEMENT YPBTM");
                elementsAgain.add("ELEMENT AADXU");
                elementsAgain.add("ELEMENT RXCGJ");
                elementsAgain.add("ELEMENT WYMVD");
                elementsAgain.add("ELEMENT WFGEJ");
                elementsAgain.add("ELEMENT TYGBS");
                elementsAgain.add("ELEMENT MAPTK");
                elementsAgain.add("ELEMENT GJXVE");
                elementsAgain.add("ELEMENT BAFGL");

        for (String element : elementsAgain){
        System.out.println(element);
        }
        return elementsAgain;

    }

    private static void printSet(Set<String> customSet) {
        for (String element : customSet){
            System.out.println(element);
        }
    }


    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        return set.add(elementToAdd);
    }

    public static void main(String[] args) {
        Set<String> elements = createHashSet();
        Set<String> elementsAgain = createTreeSet();
        boolean hashSetAdded = addElementToSet(elements, "ELEMENT AAA");
        boolean treeSetAdded = addElementToSet(elementsAgain, "ELEMENT AAA");

        System.out.println("Elements in HashSet: ");
        printSet(elements);
        System.out.println("Elements in TreeSet:");
        System.out.println(elementsAgain);

    }

}
