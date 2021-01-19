// Jordan Wang
// Prime Factors Object
// Spec: Write a program to identify the following for a given number:
//			- Whether or not it is prime
//			- All of the prime numbers up to (and including) that number
//			- The prime factors of that number (numbers that are both prime and a factor of that number)

public class PrimeFactors
{
	private int value;

	public PrimeFactors()
	{
		value=0;
	}

	public PrimeFactors(int val)
	{
		value=val;
	}

	public void setValue(int val)
	{
		value=val;
	}

	/** @returns true if n is prime, false otherwise
	* Note: we are sending value as a parameter so that
	*		we can also use it as a helper method in getPrimeFactorsOf()
	*/
	public boolean isPrime(int n)
	{
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

	/** @returns a String with all the primes up to the value */
	public String getPrimesUpTo()
	{
		String primesUpTo="";
		for(int i=2; i<value; i++)
		{
			if(isPrime(i))
			{
				primesUpTo+=i + " ";
			}
		}
		return primesUpTo;
	}

	/** @returns a String with all the prime factors of a value */
	public String getPrimeFactorsOf()
	{
		String primeFactors="";
		for(int i=2; i<value; i++)
		{
			if(isPrime(i) && value%i==0)
			{
				primeFactors+=i + " ";
			}
		}
		if(isPrime(value))
		{
			primeFactors+=value;
		}
		return primeFactors;
	}

	/** @returns a String with:
	*		- The number
	*		- Whether or not it is prime
	*		- All the Prime Numbers up to the number
	*		- The Prime Factors of the number
	*		(each on their own line)
	*/
	public String toString()
	{
		String result="";
		result+="Your number: " + value + "\n";
		result+="Prime?: ";
		if(isPrime(value))
		{
			result+="true\n";
		}
		else
		{
			result+="false\n";
		}
		result+="Prime numbers up to the number entered: " + getPrimesUpTo() + "\n";
		result+="The prime factors of the value is/are: " + getPrimeFactorsOf() + "\n";
		return result;
	}
}