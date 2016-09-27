Jump karo
You are given a matrix which represents a rock climbing game. You will always start from the bottom row first column which is marked as 2 in the matrix. You can only place foot on cells marked with 1. Cells marked with 0 have nothing to hold you. You can move freely in a particular row for continuous 1's (where you have place to hold on). You cannot jump in horizontal direction over an empty cell. You can jump or fall in vertical direction for any number of steps till you reach another cell with a 1 to hold you on. This way you need to go to a target cell which is marked as 3. The bottom row does not contain any 0. 



You need to find the best path from Start (2) to End (3) which needs minimum step vertical jump/fall. The selected best path can be longer in terms of traversal, but should have minimum step size. Print that minimum possible jump in the given format.

Like there are 3 paths in the above situation, one with max 3 steps jump, one with max 2 step jumps and one with only 1 step jumps. So, answer will be 1 in this case.

 

[Input] 

 First number will be number of test cases present in input file
 For each test case, height H and width W (upto 50) are given
 In next H lines, space separated W numbers representing the grid are given .

 

[Output] 

 For each test case, print "Case #" followed by test case number. In next line, print the minimum step size.

 



[Limits]

4 < H,W < 51

 

[Sample Input] 

 

1  // No of test cases

5 8  // Height and Width of matrix

1 1 1 1 0 0 0 0

0 0 0 3 1 1 1 0

1 0 1 0 0 0 1 0

0 0 0 0 0 0 1 0

2 1 1 1 1 1 1 1

[Sample Output]

 

Case #1

1

