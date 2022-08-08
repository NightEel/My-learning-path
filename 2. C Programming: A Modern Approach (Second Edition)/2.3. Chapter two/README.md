### Exercise one
If compiled in C89 I do get a warning message but if compiled in C99 I do not because the program returns 0 as default value if the output of `main` 
is declared as `int`. For it to work when compiled in C89, you should write `return 0;` just before the closing curly bracket of `main`.
