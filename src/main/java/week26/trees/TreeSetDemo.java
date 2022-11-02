package week26.trees;

import java.util.HashSet;
import java.util.TreeSet;

class TreeSetDemo {
    public static void main(String[] args){
        TreeSet<String> treeset = new TreeSet<String>();
        treeset.add("One");
        treeset.add("Two");
        treeset.add("Three");
        treeset.add("Four");

        //Add Duplicate Element
        treeset.add("Three");
        System.out.println("TreeSet : ");
        for (String temp : treeset) {
            System.out.println(temp);
        }

        //compare to HashSet
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Three");
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Four");

        //Add Duplicate Element
        hashSet.add("Three");
        System.out.println("HashSet: ");
        for (String temp : hashSet) {
            System.out.println(temp);
        }
    }
}