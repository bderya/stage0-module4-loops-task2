package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
		int i = 0;
        int limit = multiplyByAndToInclusive < 0 ? -multiplyByAndToInclusive : multiplyByAndToInclusive;
        while (i <= limit) 
		{
            if (limit == 0)
			{
                break;
            }
            System.out.println((i++) * multiplyByAndToInclusive);
        }
    }
}
