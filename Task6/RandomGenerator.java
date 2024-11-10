package Task6;

public class RandomGenerator implements ContinuousGenerator {
    // The multiplier
    private final long a = 742938285;
    // The modulus
    private final long m = 2147483647;
    // The last computed random number
    private long seed;
    
    public RandomGenerator () { reseed(); }
    public RandomGenerator (long seed) { setSeed(seed); }
    
    // ----- implements ContinuousGenerator { -----
    public double sample() { 
	return ((double)nextLong()) / m;
    }
    // ----- } implements ContinuousGenerator -----

    /**
     * @return The next long random number in the sequence
     */
    public long nextLong() {
	return seed = (a * seed) % m;
    }
    
    // ----- implements Seedable { -----
    public void setSeed(long seed) { this.seed = seed; }
    public long getSeed() { return seed; }
    public void reseed() { this.seed = SeedGenerator.getDefaultSeedGenerator().sample(); }
    // ----- } implements Seedable -----
}
