# Learning DSA (Data structure and algorithm)

Hi, 😊 I am Tumsifu Lema. Welcome to my repository

This repository has some of what i learnt when studing Data structures and algorithm.
It doesnt cover much but since you visited this repository have a look.

## To compile
*(Tested on Linux) - I dont know about you Windows folks.* 🤣

`./compile` to convert your application to jar file

## To Run the script
`./run` runs the script

But make sure you allow the excecutable permissions to this two using command

`sudo chmod u+x compile run`

## Algorithm and Data Structure
- An algorithm is a high level, language independent description of a step by step process of performing a task.

An algorithm is a finite set of precise instructions for performing a computation or for solving a problem

Characteristic of a good algorithm:
1. Finiteness: The algorithm must terminate after finite number of steps
2. Definiteness: Each step must be precisely defined
3. Input: The algorithm must have zero or more inputs
4. Output: The algorithm must produce one at least one Output
5. Effectiveness: Each step of algorithm must be basic enough to be carried out, ideally by a person using only paper and pencil.

Steps to create an algorithm
1. Define the problem
2. Determine input and outputs
3. Outline the steps
4. Ensure Finiteness
5. Test the algorithm

To represent algorithm we use pseudocode or flowchart

Pseudocode
Is a method of writing algorithm using plain language that mimics the structure of programming code
but is not bound by the syntax of any specific programming language.

Why pseudocode?
1. Clarity - understanding the logic of algorithm without being limited by syntax
2. Communication - Its useful for discussing algorithm with others who may not be familiar with the programming language
3. Planning

How to write?
1. use plain language
2. Structure it like code
3. Use indentation in code

basic elements of pseudocode
- Variables : use simple names to represent data
- Assignments : Use '='
- Input/Output : Use statements like 'READ', 'WRITE', 'PRINT'
- Control Structure :
a. if-then-else: for conditional excecution
b. while: loops that excecutes when condition is true
c. for: loops that excecutes after a fixed number of times

Example of an algorithm to find maximum number element in a list

1. Start
2. Set max to the first element of the list
3. For each element in the list starting with the second element, do:
    a. If the element is greater than max, then
        i. Set max to this element
4. End For
5. Output max
6. Stop


Example of algorithm to find factorial of a number

1. Start
2. READ n
3. if n < 0
    a. PRINT "their is no factorial of negative number"
    b. Stop
4. Set result to 1
5. For i from 1 to n, do:
    a. Set result = result * i
6. End For
7. PRINT result
8. Stop



- A Data structure is a specific family of algorithms for implementing an abstract data type.

- Abstract data type is a mathematical description of an object with set of operations on the object.

### Abstract Data type
Is a data declaration packaged together with operations that are meaningful for the data type.

It encapsulates the data and operations on the data, and then hidden from the user.

Since it uses abstraction under the hood.
This means
- We know what a data type can do.
- How it is done is hidden for the user

With an ADT users are not concerned with how a task is done but rather with what it can do.

Examples of ADT
- Lists [see more](./tz/ac/udsm/dsa/lists/about.md)
- Stacks [see more](./tz/ac/udsm/dsa/stacks/about.md)
- Queues [see more](./tz/ac/udsm/dsa/queues/about.md)
- Trees
- Heaps
- Graphs

There are two ways we can use to implement an ADT list
- Arrays
- Linked List