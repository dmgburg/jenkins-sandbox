import org.apache.commons.math3.primes.Primes
import org.slf4j.LoggerFactory

@Grapes(
        @Grab(group='org.apache.commons', module='commons-math3', version='3.2')
)
class LibClass {
    public boolean isPrime(int number) {
        return Primes.isPrime(number)
    }
}
