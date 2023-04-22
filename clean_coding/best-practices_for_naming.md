1. Names should be descriptive , it should reveal to the user what is variable all about. Example instead of int count  use int countOfStudents for counting students in class.

2. Big NO to the number series naming , example int i1, i2, i3, c1, c2, c3, student1, student2 etc  

3. Do not club the name of data structures with the variable name , example int PriceArray[10].

4. For example , For a Hashmap use a name like ElementToFrequencyValues instead of ElementTofFrequencyMap.

5. Name should be Pronounceable , Don’t use unpronounceable name like cntLvs , instead use countLeaves

6. Use searchable Names , Like for counting number of points , use NumberOfPoints in the place of NP , NOP, N etc.

7. Use the Rule for length of names, i.e. length of name is directly proportional to scope of variable .

8. More the scope , more importance that variable will hold , hence more well defined names should be used.

9. Don’t Use hard coded numeric values or magic numbers. This leads to loss of information with time.

10. Explanatory names should be used , so that code readability increases for the users .

11. Example : pair<int,pair<bool,int>> p;

      Now , 

if(p.second.first) 

{
}

 The above piece of code is not explanatory , Hence we should do like this
```
bool  isPrime = p.second.first;

if(isPrime)

{
}
```

12. Example of Best practice Naming Code for checking if child value is greater than parent or not is

```
bool isChildValGreater( Node * parent , Node * child )
{
      return parent->value < child->value;
}
```