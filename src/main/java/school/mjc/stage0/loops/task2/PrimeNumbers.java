package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
		int i = 2;
		while (i <= printToInclusive)
		{
            boolean isPrime = true;
            int counter = 2;
            while (counter < i) 
			{
                if (i % counter == 0) 
				{
                    isPrime = false;
                    break;
                }
                counter++;
            }
            if (isPrime)
			{
                System.out.println(i);
            }
            i++;
        }
    }
}
