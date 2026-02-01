package esiea.td.sieve;
import java.util.ArrayList;
import java.util.List;

public class Sieve {

    public static List<Integer> GetAllPrimeNumbers(int upToNumber){
        List<Integer> workingList = new ArrayList<>();
        for (int i = 2; i < upToNumber + 2; i++) {
        workingList.add(i);
        }

        int marked = 0;
        int currentPrime = 1;
        while (marked < workingList.size() - 1){
            for (int number = 2; number < workingList.size(); number++)
            {
                if (workingList.contains(currentPrime * number))
                {
                    workingList.remove(currentPrime * number);
                }
            }

            marked++;
            currentPrime = workingList.get(marked);
        }

        return workingList;
    }
}
