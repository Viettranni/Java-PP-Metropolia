import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class AgeDistributionSimulation {
    public static void main(String[] args) {
        int[][] ageDistribution = {
                {16, 20}, 
                {34, 21}, 
                {52, 22}, 
                {68, 23},
                {82, 24}, 
                {89, 25}, 
                {94, 26}, 
                {96, 28},
                {98, 30}, 
                {100, 99} 
        };
        
        // Store frequency of each age drawn
        Map<Integer, Integer> ageFrequency = new HashMap<>();
        for (int[] ageGroup : ageDistribution) {
            ageFrequency.put(ageGroup[1], 0);
        }
        
        Random random = new Random();
        int totalDraws = 1000;

        // Draw ages based on random values and distribution
        for (int i = 0; i < totalDraws; i++) {
            int randomPercentage = random.nextInt(100) + 1;
            int age = getAgeFromDistribution(randomPercentage, ageDistribution);
            ageFrequency.put(age, ageFrequency.get(age) + 1);
        }
        
        // Print results
        System.out.println("Age Distribution after " + totalDraws + " draws:");
        for (Map.Entry<Integer, Integer> entry : ageFrequency.entrySet()) {
            System.out.printf("Age %d: %d times\n", entry.getKey(), entry.getValue());
        }
    }

    // Determines age based on random percentage and predefined age distribution
    public static int getAgeFromDistribution(int percentage, int[][] distribution) {
        for (int[] ageGroup : distribution) {
            if (percentage <= ageGroup[0]) {
                return ageGroup[1];
            }
        }
        return 99;  
    }
}
