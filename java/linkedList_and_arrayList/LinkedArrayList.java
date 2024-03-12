package linkedList_and_arrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedArrayList {
    public static void main(String[] args) {
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("john");
        namesLinkedList.add("james");
        namesLinkedList.add(1, "marry");
        //! efficient for adding and removing element cuz it make use of pointer reference 
        //! bad for getting an element especially for large one cuz it will iterate one by one untie it find the element that is need



        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("john");
        namesArrayList.add("james");
        namesArrayList.add(1, "marry");
        // !efficient for getting element
         //! bad for adding and removing element cuz it need to shift all the element in order to performs and addition or subtraction of element
    }
    
}
