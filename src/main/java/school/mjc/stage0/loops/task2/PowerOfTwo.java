package school.mjc.stage0.loops.task2;

public class PowerOfTwo 
{
    public void printPower(int power)
	{
		if (power < 0) 
		{
            System.out.println("too much power");
		}
		else
		{
			int i = 1;
			while(i <= power)
			{
				if (power % i == 0)
				{
					System.out.println(i);
				}
				i++;
			}
		}
	}
}
