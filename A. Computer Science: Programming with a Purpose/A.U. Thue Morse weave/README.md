### Assignment
<b>Thue–Morse weave.</b> Write a program `ThueMorse.java` that takes an integer command-line argument n and prints an n-by-n pattern like the ones below. 
Include two space characters between each + and - character.\
The Thue–Morse sequence is an infinite sequence of 0s and 1s that is constructed by starting with 0 and successively appending the bitwise negation 
(interchange 0s and 1s) of the existing sequence. Here are the first few steps of this construction: \
0\
0 1\
0 1 1 0\
0 1 1 0 1 0 0 1\
0 1 1 0 1 0 0 1 1 0 0 1 0 1 1 0\
To visualize the Thue–Morse sequence, create an n-by-n pattern by printing a + (plus sign) in row i and column j if bits i and j in the sequence are equal, 
and a - (minus sign) if they are different. \
<i>Note:</i> you may assume that n is a positive integer (but it need not be a power of 2). 
