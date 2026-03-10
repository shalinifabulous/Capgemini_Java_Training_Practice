package StreamAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class StreamApi {
    public static void main(String[] args) {
        List<String> immutableList = Stream.of("red", "green", null, null).toList();
        System.out.println(immutableList);
        //immutableList.add("yellow");
        System.out.println("-----------------      ");

        List<String> mutableList = Stream.of("red" ,"green", null, null).collect(Collectors.toList());
        System.out.println(mutableList);
        mutableList.add("orange");
        mutableList.set(2, "yellow");
        System.out.println(mutableList);
        System.out.println("-----------------      ");

      record Product(String name, String category, int price) {
      }

          Stream<Product> products = Stream.of(new Product("bat", "sportsitem", 4000),
                  new Product("bells", "sportsitem", 4000),
                  new Product("ball", "sportsitem", 2000),
                  new Product("mobile", "item", 14000),
                  new Product("banana", "fruit", 200),
                  new Product("apple", "fruit", 400));

        Map<String, List<Product>> categoryMap = products.collect(Collectors.groupingBy(Product::category));
        System.out.println(categoryMap);
      }


}
