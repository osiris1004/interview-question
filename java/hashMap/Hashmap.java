package hashMap;

import java.util.HashMap;

public class Hashmap {//! a map is a collection of ket value pair
    public static void main(String[] args) {
        //! key will be of type string and the value will be of type Integer
        //! NB; in java Map is  an interface. then the hashMap is one of the implementation of the map interface
        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("john", 1);
        empIds.put("mary", 2);
    }
    
}
