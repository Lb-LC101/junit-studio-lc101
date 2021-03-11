package test;

import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BonusBinarySearchTest {

    @Test
    public void IntInArrayReturnsIndex() {
        int[] sortedArray = {1,5,7,23,45};
        assertEquals (3, BonusBinarySearch.binarySearch(sortedArray,23));
    }

    @Test
    public void FirstIntInArrayReturnsIndex() {
        int[] sortedArray = {1,5,7,23,45};
        assertEquals (0, BonusBinarySearch.binarySearch(sortedArray,1));
    }

    @Test
    public void LastIntInArrayReturnsIndex() {
        int[] sortedArray = {1,5,7,23,45};
        assertEquals (4, BonusBinarySearch.binarySearch(sortedArray,45));
    }
}
