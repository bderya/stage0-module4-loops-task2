package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) 
	{
		int i = 1;
        int result = 1;
        if (printToInclusive >= 0)
		{
            System.out.println(1);
        }
        while (i <= printToInclusive)
		{
            result *= i++;
            System.out.println(result);
        }
    }
}
