package esiea.td;
import esiea.td.sieve.Sieve;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.fail;


public class SieveTest {
    @ParameterizedTest
    @ValueSource(ints = {30})
    public void GetAllPrimeNumbers(int upToNumber){
        List<Integer> primes = Sieve.GetAllPrimeNumbers(upToNumber);
        fail("Not yet implemented");
    }
}
