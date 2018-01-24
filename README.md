# ProblemAdvantageFSE
#### Assignment of the Advantage FSE Academy 2018.
The issue of the assignment is to implement a function in Java, which accepts a list of non-negative integers and returns their largest possible combined number, as a string.
###### Implemented by Kosmidou Maria.
### Description of branches
This program includes two branches, each for one solution of the problem. 

In the <strong>master</strong> branch there is the *approach (A)*:

The main idea of this approach is to sort the list of non-negative integers according to user defined criteria. More specifically,
1.	It makes use of the sort () method, implemented by the MyComparator class.
    - MyComparator class implements an alternate compare () method and it inherits the Comparator class.
    - compare () method concatenates two integers of the list, so as to make two combinations of these integers.
    - The two combinations are ab, ba. It compares ab and ba and if ab is larger than ba then the a should come before b in output, else b should come before.
2.	It converts the sorted list to a string, by calling the convertIntListToString () method.
3.	The result is the above string, which represents the maximum possible combined number.

In the **alternative** branch there is the *approach (B)*:

The steps of this approach are:
1.	Find the maximum digits of the largest integer of the list (maxDigits).
2.	Pad the integers to the same size by repeating the digits (size = maxDigits +1).
    - size is (maxDigits +1), so as to guarantee the uniqueness of the integers and to have a valid sort.
3.	Make a list of pairs. 
    - Each pair has a key: padded integers and a value: original integers.
4.	Sort the whole list of pairs using these padded integers as a sort key.
    - This approach makes use of the sort () method, implemented by the MyComparator class.
    - It sorts, in descending order, the whole list of pairs, using the padded numbers as a sort key.
5.	It converts only the sorted value-list to a string, by calling the convertIntListToString () method.
6.	The result is the above string, which represents the maximum possible combined number.

### Description of how to compile and run the program
-	Clone the repository git@github.com:kosmidu/ProblemAdvantageFSE.git to your file.
-	Go to the file and compile the main program and the unit test.
```
javac -d ./src/com/company/ -cp ./hamcrest-core-1.3.jar:./junit-4.12.jar:./src/com/company ./src/com/company/*.java
```
-	Run the unit test.
```
java -cp ./hamcrest-core-1.3.jar:./junit-4.12.jar:./src/com/company org.junit.runner.JUnitCore com.company.MainTest
```
-	Run the main program.
```
java -cp ./src/com/company com.company.ProblemAdvantageFSE
```

