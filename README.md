# Java-past-mistakes

- When adding characters together, the value of char are added and thus an int would be returned. To concat, declare a string and add each char to the string.
- Do not use == to compare objects as it would compare references to objects, not the value of the objects.
- Be careful when declaring variables inside conditionals, especially when the variables are use in later operations outside the conditionals.
- Constructors have no return type.
- PrintWriter no output? Do close it!

## Error handling
- <Java: Identifier expected> declare variable outside of try block.
- <error: class, interface, or enum expected> typically occurs when there is an additional curly brace at the end of the program.
- IllegalStateException: thrown when method invoked inappropriately.
- NoSuchElementException: pass value to next() before using hasNext() to check if there are more tokens.

## Arrays related
- OUT OF BOUND: make sure the sequence of conditions inside a for loop are taken into consideration, such as condition before and after ||.
- In 2d arrays, arrayName.length refers to # of rows, and arrayName.length[0] refers to # of columns in row 0.
- Out of bound: notice that i++ has updated the status of i (since using i outside of the loop, i needs to be initialized outside the loop).
- ArrayList can efficiently access elements at any valid index but inserts are expensive, whereas a LinkedList supports efficient inserts but access requires iterating through elements. So a program that will do many accesses and few inserts might use an ArrayList.

## Interacting classes
- Unified Modeling Language (UML): 0..* --> zero or more instances; 1..1 --> exactly one instance
- In a class's method that attempts to modify another class's object, use conditions to check if the object is null; if null then nothing can be modified.
