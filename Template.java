import java.util.List;
import java.util.*;
interface SomeSpecialNumber<T> 
{
	public boolean match(T t);
}

class PrimeNumber implements SomeSpecialNumber<Integer> 
{
	public boolean match(Integer t)
	{
		for (int i = 2; i < t; ++i)
		{
			if (t % i == 0) {
			return false;
			}
		}
		return true;
	}
}
class EvenNumber implements SomeSpecialNumber<Integer>
{
	public boolean match(Integer t)
	{
		return (t % 2 == 0);
	}
}


class Algorithm 
{
	public <T> int count(List<T> list, SomeSpecialNumber<T> s)
	{
		int count = 0;
		for (T type : list)
		{
			if (s.match(type))
			{
				++count;
			}
		}
		return count;
	}
}

 class Template
{
	public void testSpecificElement() 
	{
		List<Integer> list = Arrays.asList(1, 4, 5, 7, 8, 9, 13, 11);
		PrimeNumber pn = new PrimeNumber();
		EvenNumber en = new EvenNumber();
		Algorithm a = new Algorithm();
		System.out.println(" Count of prime numbers: " + a.count(list, pn));
		System.out.println(" Count of even numbers: " + a.count(list, en));
	}
	
	public static void main(String[] args)
	{
		Template tq = new Template();
		tq.testSpecificElement();
	}

}
