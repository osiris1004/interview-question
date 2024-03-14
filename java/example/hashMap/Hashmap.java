package hashMap;

import java.util.HashMap;

public class Hashmap {//! a map is a collection of ket value pair
    public static void main(String[] args) {
        //! key will be of type string and the value will be of type Integer
        //! NB; in java Map is  an interface. then the hashMap is one of the implementation of the map interface
        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("john", 1);
        empIds.put("mary", 2);

        empIds.get("john"); //* return 1
        empIds.containsKey("test"); //* return false */
        empIds.containsValue("2"); //* return true */

        empIds.put("john", 10); //* update value 1 to 10 if the key exit else add*/
        empIds.remove("john"); //* remove the element with key john */
        empIds.clear(); //* empty the the map */
    }
    
}
