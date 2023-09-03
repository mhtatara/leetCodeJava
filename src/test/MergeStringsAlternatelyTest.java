package test;

import easy.MergeStringsAlternately;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeStringsAlternatelyTest {
    MergeStringsAlternately mergeStringsAlternately = new MergeStringsAlternately();
    @Test
    void mergeStringsTest() {
        String word1 = "abc";
        String word2 = "pqr";
        String combo = MergeStringsAlternately.mergeString(word1, word2);
        String combined = "apbqcr";
        assertEquals(combo, combined);
    }
}

