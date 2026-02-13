package esiea.td.sieve;

import java.util.ArrayList;
import java.util.List;

public class Sieve {

    public static List<Integer> GetAllPrimeNumbers(int upToNumber) {

        // Cas limite
        if (upToNumber < 2) {
            return new ArrayList<>();
        }

        // Tableau pour marquer les nombres premiers
        boolean[] isPrime = new boolean[upToNumber + 1];

        // Initialisation : on suppose que tous les nombres >= 2 sont premiers
        for (int i = 2; i <= upToNumber; i++) {
            isPrime[i] = true;
        }

        // Crible d’Ératosthène
        for (int i = 2; i * i <= upToNumber; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= upToNumber; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Construction de la liste résultat
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i <= upToNumber; i++) {
            if (isPrime[i]) {
                result.add(i);
            }
        }

        return result;
    }
}
