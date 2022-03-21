package hackerrank.mathematics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MovingTiles {

    public static List<Double> movingTiles(int l, int s1, int s2, List<Integer> queries) {
        var result = new ArrayList<Double>();

        for (Integer query : queries) {
            result.add(calc(l, s1, s2, query));
        }

        return result;
    }

    public static Double calc(int l, int s1, int s2, int query) {
        double edge = Math.abs(query);
        double diagonal = Math.abs(edge * edge * 2);
        return diagonal;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int l = Integer.parseInt(firstMultipleInput[0]);

        int s1 = Integer.parseInt(firstMultipleInput[1]);

        int s2 = Integer.parseInt(firstMultipleInput[2]);

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Double> result = movingTiles(l, s1, s2, queries);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
