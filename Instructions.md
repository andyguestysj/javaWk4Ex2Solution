1. Run the code to see what it does and how it works.
2. Imagine that your boss marches in and tells you that you must change your Character1 class to hold the character’s name in two separate parts

```java
public String firstName; 
public String surname;
```

  Make changes to your `Character1` class and adapt `Character1Run()` in `Main.java` so that it works with the new Character1.

3. Were lots of changes needed in `Character1Run()`? Would you be bothered if it was adding 200 characters to the ArrayList?

4. Lets start with a better version of the class, the one in `Character2.java`. What is different about this class?

5. Change line 7 in `Main.java` from 
```java
Character1Run();
```
to
```java
Character2Run();
```
   and run the code. Does it look any different running?

6. Now modify `Character2` to store the name in two parts.

```java
public String firstName; 
public String surname;
```
Leave getName() and setName() in the class: they should set and get (respectively) the whole name.  

*Hint: setName() will need to split the provided full name up into two parts. Look up the Java
`split()` method.*

Were the changes easier the second time round? Would they be as easy if there were 200 characters?

