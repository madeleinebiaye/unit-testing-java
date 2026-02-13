package esiea.td;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import esiea.td.sieve.Sieve;

public class SieveTest {

    @ParameterizedTest
    @ValueSource(ints = {30})
    public void GetAllPrimeNumbers(int upToNumber) {

        // Act
        List<Integer> primes = Sieve.GetAllPrimeNumbers(upToNumber);

        // Expected primes up to 30
        List<Integer> expected = List.of(
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29
        );

        // Assert
        assertEquals(expected.size(), primes.size());
        assertIterableEquals(expected, primes);
    }
}
