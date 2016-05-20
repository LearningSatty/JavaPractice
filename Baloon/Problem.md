            Burst Baloon Problem
            
There are multiple balloons tied in a line. Each balloon has a number printed on it. You are required to burst all of the balloons one by one. Whenever a balloon bursts, you get a score equal to the multiplication of the values of adjacent balloons to the left and right. After the burst, these 2 balloons become adjacent.
 If there is only one balloon adjacent to the one bursting, the score will be equal to the value of that single balloon. If its the last balloon to be burst, the score is equal to its own value.


 You need to find the maximum score that can be achieved by bursting the balloons in an optimum sequence
 

[Input] 

 First number will be number of test cases present in input file
 For each test case, a number denoting count of balloons N (1-10) is given
 In next line, space separated N balloon values (ranging from 1 to 999) are given .


[Output] 

 For each test case, print "Case #" followed by test case number. In next line, print the maximum score.

[Sample Input]
3

2
189 740 
3
490 388 989 
4
305 844 971 492  


[Sample Output] 

Case #1
1480
Case #2
486588
Case #3
566292

