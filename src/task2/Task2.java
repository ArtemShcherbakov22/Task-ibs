package task2;
import java.io.*;
import java.util.*;

public class Task2 {
        public static void main(String[] args) throws FileNotFoundException {

                File text = new File("C:\\Users\\МОЯ РАБОТА\\Downloads\\Task-ibs\\src\\Resources\\задание.txt");
                Scanner scanner = new Scanner(text);
                HashMap<String, Integer> wordToCount = new HashMap<>();
                while (scanner.hasNextLine()) {
                        String string = scanner.nextLine();
                        String[] words = string.split("( \\t,\\n,\\W:.;)");
                        for (String word : words) {
                                if (!wordToCount.containsKey(word)) {
                                        wordToCount.put(word, 0);
                                }
                                wordToCount.put(word, wordToCount.get(word) + 1);
                        }
                }
                sortAndPrint(wordToCount.keySet());
                sortAndPrintStatistic(wordToCount.entrySet());
        }
        private static void sortAndPrint(Set<String> keySet) {

                TreeSet<String> treeSet = new TreeSet<>(keySet);

                treeSet.forEach((str)->{
                        System.out.println(str);
                });
                System.out.println("");

                keySet.forEach((str)->{
                        System.out.println(str);
                });

        }
        private static void sortAndPrintStatistic(Set<Map.Entry<String,Integer>> keySet) {

                keySet.stream().sorted(
                        (a,b)->{
                                if (a.getValue().equals(b.getValue()))
                                        return 0;

                                if (a.getValue()>b.getValue())
                                        return -1;

                                return 1;
                        }
                ).forEachOrdered(
                        (a)->{
                                System.out.println(a.getKey()+" : " + a.getValue());
                        }
                );

        }
}
