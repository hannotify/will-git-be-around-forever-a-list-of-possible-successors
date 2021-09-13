import java.util.Random;

public class MyRandom {
    static Random random = new Random();

    public static void main(String... args) {
        System.out.println(randomClass());
    }

	private static int randomDice() {
        // Chosen by fair dice roll; guaranteed to be random!
		return 4;
    }
    
    private static int randomMath() {
        return 1 + (int) (Math.random() * 6);
    }

    private static int randomClass() {
        return 1 + random.nextInt(6);
    }

    private static int randomThreadLocalRandom() {
        return ThreadLocalRandom.current().nextInt(1, 7);
    }
}