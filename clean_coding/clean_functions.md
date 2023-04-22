1. No one Likes to read a function with too many lines , it should be as concise as possible.

2. Function should not do too many things , it should be a single responsible function.

3. Function should not manipulate the original values provided in parameters (Like arrays etc) until it is necessary or asked .

4. Multiple smaller functions with unique responsibility is far better than a single large function with multiple responsibility.

5. A Function does exactly 1 thing if it holds either of these

One can’t meaningfully extract any other function from it .
All lines are just 1 level of abstraction below the function level.
6. Things which are more understandable to the human should be at higher level and things which are more understandable to machines should be at lower level (Like bitwise operators , byte arrays ).

7. It should not happen that the lower level operations are being performed in higher level API’s.