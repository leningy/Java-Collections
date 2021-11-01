# Java-tricky-grammar

- When adding characters together, the value of char are added and thus an int would be returned. To concat, declare a string and add each char to the string.
- Do not use == to compare objects as it would compare references to objects, not the value of the objects.
- Be careful when declaring variables inside conditionals, especially when the variables are use in later operations outside the conditionals.
- Constructors have no return type.
- <Java: Identifier expected> declare variable outside of try block.
- <error: class, interface, or enum expected> typically occurs when there is an additional curly brace at the end of the program.
- In 2d arrays, arrayName.length refers to # of rows, and arrayName.length[0] refers to # of columns in row 0.
- Out of bound: notice that i++ has updated the status of i (since using i outside of the loop, i needs to be initialized outside the loop).
- PrintWriter no output? Do close it!
- NoSuchElementException: pass value to next() before using hasNext() to check if there are more tokens.
