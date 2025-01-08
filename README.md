# Farid Karimli

# Week05
## Task 1
### The output is "In constructor X." followed by "In constructor Y." This is because when an instance of class Y is created, its constructor implicitly invokes the constructor of its superclass X before executing its own constructor code.

## Task 2
### The output is "In static init block of A", "In static init block of B", "In instance init block of A", "In constructor A.", "In instance init block of B", "In constructor B.". This happens because static initialization blocks run when the class is loaded, while instance initialization blocks run when an instance is created, being sure about their execution orders.

## Task 3
### The output is "Super 10" and "Subclass 30". Because when `calcValue(5)` is called, it invokes the method from the `Parent` class, while `calcValue(5, 10)` invokes the method from the `Child` class. This causes overloading.

## Task 4
### The output is "AS", "GTS", "5 AC", "GT", and "GTC". Because static initializers run when the class is loaded, then instance initializers and constructors when an instance is created.

## Task 5
### 1. Single Inheritance: A class extends only one other class.
### 2. Multilevel Inheritance: A generated class extends another generated class which forms a chain of inheritance
### 3. Hierarchical Inheritance: Multiple classes generated from a single main class.
### 4. Multiple Inheritance: A class gets properties from more than one superclass.
### 5. Hybrid Inheritance: Contains multiple types of inheritance within a single system.

## Task 6
### In the provided code, methods `methodOne(int i)` and `methodThree(int i)` in `ClassB` hide the respective methods in `ClassA` due to static method declaration, while `methodTwo(int i)` in `ClassB` overrides the method with the same signature in `ClassA`. Both `methodFour(int i)` in `ClassA` and `methodFour(int i)` in `ClassB` are static and independent, thus hiding each other.

## Task 7
### Defining these methods as static allows for direct invocation without needing to instantiate the class.

# Week06
## Task 4
### a. The `clone()` method in the `Object` class is protected to prevent unrestricted copying of objects. This prevents unauthorized external code from cloning objects without permissions.

### b. Keeping the `clone()` method protected in the extending class provides a level of control over how objects are cloned. It allows subclasses to override the `clone()` method to provide custom cloning behavior. You might use `public` instead of `protected` when you want to allow unrestricted access to the `clone()` method from any class, including external classes. But it is not good choice, because of unauthorized cloning.

## Task 5
### a. The implementation of the clone() method provided above is a deep clone. This means that when a Point or Segment object is cloned, a new Point or Segment object is created with the same values as the original object. However, the cloned objects are independent of the original objects, meaning changes made to the cloned objects will not affect the original ones.

### b. If we wanted to implement a shallow clone, we could simply call the superclass's clone() method and cast it to the appropriate type. However, since Point and Segment do not extend any other class, a shallow clone wouldn't differ much from the deep clone implementation shown above.

# Week07
## Task 1
### a. The code prompts the user to enter a word, then counts the occurrences of each letter in the word. This part seems to work fine.
### b. When entering text with spaces, punctuation marks, or digits, the code will produce incorrect results because it assumes that all characters entered are English letters.
### c. To enhance the code with exception handling to ignore words containing non-alphabetic characters, we can use regular expressions to check if the input word contains only alphabetic characters.

## Task 2
### b. When I entered a negative number code is not working correctly. Because factorial can not be calculated for negative numbers.
### c. I added IllegalArguementException to code, now if negative number will be entered, it will throw this exception.
### d. The compiler won't necessarily impose handling of this exception in `main` unless you specify it. You could handle this exception in the `main` method or in a calling method.

## Task 5
### In the code that I provided, I've added a check for the `roles` parameter in the `createUser` method. If `roles` is null or has a length of 0, it throws an `InvalidRoleException`. This ensures that the provided role list is neither null nor empty.

## Task 6
### b. If you provide an input string that contains letters or non-numeric characters, the program will throw a `NumberFormatException` when attempting to parse these non-numeric inputs into integers. This will result in incorrect results and potentially terminate the program prematurely.
### c. To handle non-number inputs and ignore them, you can add a check to verify if the current token is a valid integer before parsing it.
### d. To handle the case where no valid input is provided, you can add an additional check after closing the scanner to see if the count remains zero. If the count is zero, it means no valid input was provided, and you can print the appropriate message. 

# Week08
## Task 2
### I created a new file "ListsInActionSort.java" for this task. I copied code from first task and made changes on it in this file.

# Week11
## Task 6
### The EOF (End-Of-File) indicator in this context is handled by the ObjectInputStream when it reaches the end of the serialized data in the file.
