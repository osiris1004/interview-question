package generics;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class Generics {

    static <T, G> List<G> fromArrayToList(T[] a, Function<T, G> mapperFunction) {
        return Arrays.stream(a)
                .map(mapperFunction)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Function<Integer, String> mapper = Object::toString;
        List<String> stringList = fromArrayToList(intArray, mapper);
        System.out.println(stringList+","+stringList.getClass());

        String[] stringArray = { "1", "2", "3"};
        Function<String, Integer> mapper_ = obj -> Integer.valueOf(obj);
        List<Integer> integerList = fromArrayToList(stringArray, mapper_);
        System.out.println(integerList+","+integerList.getClass());
    }
}