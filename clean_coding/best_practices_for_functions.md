1. Try to make a small and single responsible function.

2. Reorganization should be there , different functions can club into classes , different classes can club into packages , different packages can club into Modules.

3. Descriptive Names (Preferably Verbs ) should be used to declare functions

( return type verb (Noun, Noun,.. ) 

{ 

 

}  

)  

Example FindMax(Node * parent, Node * child)

4. Long Descriptive Names are better than short undescriptive names.

5. Stick to one prefix policy , Example getData() , getMarks() , getUser()  are better than getData(), fetchMarks() , retriveUser().

6. It is Better to have write functions as void and read Functions as non-void

Examples of read Functions are getData() , getMarks(), getUser() .

Examples of write Functions are updateData() , updateMarks(), deleteUser() .

7. Try to avoid if-else statements as much as possible because these statements can change very frequently with time .

Example  

 
```
void  processOrder(int id, bool isCovidEssential)

{

    if(isCovidEssential)

    {

           ___________
    }

     else  

     { 

           __________

     }

}
```
Instead of the above format , we can declare two different functions for them.

→ processCovidEssentialOrder()

→ processGeneralOrder()

Try to avoid or delay conditional statements as much as possible.

8. Having switch / Enums statements are as bad as if-else statements.

9. If in the worst case we have to use if-else or conditional statements then we will keep no more than 2 levels of indentation in our code.

10. Number of arguments passed should be low , it increases code clarity , readability , understandability and ease of testing.

11. Operations like reading files etc should be done in separate functions.

Example
```
Marks getMarks()

{

   String dataFromFile= readFromFile(fileName);

   ….

   ….

}

String readFromFile(fileName)

{

     Open the file 

     Read Data

     Close the file

     Return Data

}
```

12. These types of functions “ readFromFile(fileName) “ are called side effect functions.

13. You should always undo the system changes after performing operations of these side effect functions. Example: close the File after reading the file. Client will not be responsible for closing the file separately.

14. These functions come in pair of operation Example open - close , malloc - free etc

15. Function should not be read and write, both at the same time .
16. Always Follow DRY principle (Do not Repeat Yourself). Always make separate functions for frequently used code segments. 