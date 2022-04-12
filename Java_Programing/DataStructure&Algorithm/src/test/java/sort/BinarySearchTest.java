package sort;

import ch06.BinarySearch;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest extends BaseSortTest{

    BinarySearch bs = new BinarySearch();

    @Test
    void search() {
        Random random = new Random();
        List<Integer> randomList = Arrays.stream(this.createRandomArray(100))
                .boxed().sorted().collect(Collectors.toList());
        int[] randomArr = randomList.stream().mapToInt(Integer::intValue).toArray();

        int target = random.nextInt(randomList.size());
        assertEquals(randomList.indexOf(target), bs.search(randomArr, target));

        target = random.nextInt(randomList.size());
        assertEquals(randomList.indexOf(target), bs.search(randomArr, target));

        target = random.nextInt(randomList.size());
        assertEquals(randomList.indexOf(target), bs.search(randomArr, target));

        target = random.nextInt(randomList.size());
        assertEquals(randomList.indexOf(target), bs.search(randomArr, target));

        target = random.nextInt(randomList.size());
        assertEquals(randomList.indexOf(target), bs.search(randomArr, target));

        target = random.nextInt(randomList.size());
        assertEquals(randomList.indexOf(target), bs.search(randomArr, target));
    }
}
