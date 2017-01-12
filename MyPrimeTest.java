import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class MyPrimeTest {
	@Test
	public void isPrimeShouldReturnTrueForPrimes() {
		System.out.println("MyPrimeTest for primes");
		assertEquals("3 is prime",true,MyPrime.isPrime(3));
		assertEquals("2 is prime",true,MyPrime.isPrime(2));
		assertEquals("13 is prime",true,MyPrime.isPrime(13));
	}

	@Test
	public void isPrimeShouldReturnFalseForNonPrimes() {
		System.out.println("MyPrimeTest for non-primes");
		assertEquals("4 is not prime",false,MyPrime.isPrime(4));
		assertEquals("0 is not prime",false,MyPrime.isPrime(0));
		assertEquals("6 is not prime",false,MyPrime.isPrime(6));
	}

	@Test(expected = IllegalArgumentException.class)
	public void primesShouldThrowExceptionFor0() {
		MyPrime.primes(0);
	}
}
