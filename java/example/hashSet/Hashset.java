package hashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hashset {//! a Set is a collection that does not allow duplicate element and that does not maintain the order of the list 
    public static void main(String[] args) {
         //! NB; in java Set is an interface. then the hashSet is one of the implementation of the Set interface
        Set<String> namesHashSet = new HashSet<>();//! the hashedSet is way way faster that the TreeSet

        Set<String> namesTreeSet = new TreeSet<>();//! TreeSet order the element naturally that it order alphabetically compare to HashSet
  
    }
    
}
