/*


*Given an array of integers, find the one that appears an odd number of times.

*There will always be only one integer that appears an odd number of times.

*Examples
*[7] should return 7, because it occurs 1 time (which is odd).
*[0] should return 0, because it occurs 1 time (which is odd).
*[1,1,2] should return 2, because it occurs 1 time (which is odd).
*[0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
*[1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).

*
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindOdd {

    public static int findIt(int[] a) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : a) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int num : a) {
            if (countMap.get(num) % 2 != 0) {
                return num;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        findIt(new int[] { 20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5 });

    }

}
