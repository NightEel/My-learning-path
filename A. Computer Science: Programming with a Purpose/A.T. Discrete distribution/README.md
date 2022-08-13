### Assignment
<b>Discrete distribution.</b> Write a program `DiscreteDistribution.java` that takes an integer command-line argument m, followed by a sequence of positive
integer command-line arguments a1,a2,…,an, and prints m random indices (separated by whitespace), choosing each index i with probability proportional
to ai.\
 To generate a random index i with probability proportional to ai:
 - Define the cumulative sums Si=a1+a2+…+ai, with S0=0.
 - Pick a random integer r uniformly between 0 and Sn−1.
 - Find the unique index i between 1 and n such that Si−1≤r<Si.
