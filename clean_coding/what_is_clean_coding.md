1. Most important reason for Learning Low Level Design is to Learn How to Clean Code.

2. For whom do you want to write clean code ? Machine or Human . The answer is Human , Machine does not care about how clean or dirty your code is or how unintended your code is. But humans do care about clarity.

3. Clean Code becomes a necessity when the size of a team or organization increases. As there are multiple developers working on some project , Hence clean code makes it easier for them to understand the logic behind the code.

4. Dirty Code Leads to Confusion , Errors , Difficulties , Frustration and lesser productivity.

5. Wrong Code which is understandable and clean is much better than correct code but non understandable and dirty.

6. If at any point there is a bug in the code then it will be much difficult for developers to debug it.

7. Code Modularity is Important and a developer should take care of following points

Same Code Segment Should Not repeat multiple times in the same code. Instead make a separate function for this part of the code.
Passing More Variables to a Function is Not a Good practice.
Keep Single Responsible function , which will do single work instead of multiple work.
Try to keep small different functions rather than one single big function.
There should not be too many indentation levels.

8. Let’s see an Example of Clean and Dirty Code.

→  Dirty Code


```
 public class MyClass {
public static void main(String args[]) {

int []nums=new int []{5,3,7,9,12,4,7};
int c1=0,c2=0;
for(int i=0;i<nums.length-1;i++)
       {
if(i<nums.length-1)
           {
if((nums[i]+nums[i+1])%3==0)
               {
                   c1++;
               }
if((nums[i]+nums[i+1])%5==0)
               {
                   c2++;
               }

           }
       }
       System.out.println(c1 + " " + c1);

   }
}
```
 
→Clean Code

```
public class MyClass {

public static boolean isSumDivisibleByVal(int sum,int val)
   {
return sum%val==0;
   }

public static void main(String args[]) {

int []nums=new int []{5,3,7,9,12,4,7};
int []divisors = new int[]{3,5};
int []countOfDivisibleAdjPairs=new int []{0,0};

for(int i=0;i<nums.length-1;i++)
       {
int adjPairSum=nums[i]+nums[i+1];
for(int j=0;j<divisors.length;j++)
           {
if(isSumDivisibleByVal(adjPairSum,divisors[j]))
               {
                   countOfDivisibleAdjPairs[j]++;
               }
           }
       }
       System.out.println(countOfDivisibleAdjPairs[0]+" " + countOfDivisibleAdjPairs[1]);

   }
}
```