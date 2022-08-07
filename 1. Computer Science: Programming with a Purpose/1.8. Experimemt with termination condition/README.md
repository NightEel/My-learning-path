### Assignment
<b>1.3.28</b> Run quick experiments to determine the impact of using the termination condition `(factor <= n/factor)` instead of `(factor < n)` in Factors in Program 1.3.9. For each method, find the largest n such that when you type in an n-digit number the program is sure to finish within 10 seconds.
### Program 1.3.9
<pre>
public class Factors
{
  public static void main(String[] args)
  { // Print the prime factorization of n.
    long n = Long.parseLong(args[0]);
    for (long factor = 2; factor <= n/factor; factor++)
    { // Test potential factor.
    while (n % factor == 0)
    { // Cast out and print factor.
      n /= factor;
      System.out.print(factor + " ");
    } // Any factor of n must be greater than factor.
  }
  if (n > 1) System.out.print(n);
  System.out.println();
  }
}
</pre>
### Notes
- The wording seems to imply that I must write the numbers as input in the programs and time how long it takes. Instead, I've write two programs (one for each termination condition) that make the calculations for me.
- Instead of "within 10 seconds", the programs calculate "in 10 seconds or more" and, instead of "the largest n such that when you type in an n-digit number", the programs calculate the number itself.
- [originalTermination.java](https://github.com/NightEel/My-learning-path/tree/main/1.%20Computer%20Science:%20Programming%20with%20a%20Purpose/1.8.%20Experimemt%20with%20termination%20condition)
starts at 9999999999 and
[changingTheTerminationCondition.java](https://github.com/NightEel/My-learning-path/tree/main/1.%20Computer%20Science:%20Programming%20with%20a%20Purpose/1.8.%20Experimemt%20with%20termination%20condition)
at 999999999999999999 because it takes so long if it starts at two.
