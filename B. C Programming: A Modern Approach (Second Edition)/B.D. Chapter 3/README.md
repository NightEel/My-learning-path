### Exercise three
 `scanf` reads white spaces until it encounters a non-white character, matches them with a white character of the input and puts back the non-white characters.
 If the character is not white, `scanf` compares it with the next input character and, if they match, discards or saves it and proceeds but, if they don't, `scanf` put it back
 and terminates the operation.\
(a) They are equivalent because if there are white-space characters after the integer in input, `scanf` matches them but, if there aren't, `scanf` just ignores
them which have no efect on the storage of the integer.\
(b) They aren't equivalent because if there are a white space (or several) between the first integer and the next en dash in input, in the first example they don't match so `scanf` put the back.
In the second one, it would work.\
(c) They aren't equivalent because for the second example to stop asking for input you have to type a non-white character, which is put back. This is why I've
write a `.`the first %f in (d).\
(d) They are equivalent because `scanf` ignores white spaces when looking for the beginning of a number.

### Exercise four
<pre>
i = 10
x = 0.3
j = 5
