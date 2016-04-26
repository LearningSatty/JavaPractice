                                               Sky Map

http://sotong.sec.samsung.net/sotong/uploadimage/2013924161713386_e1c53WDVpjeAgE..JPG

You are making “sky map” to draw constellation (set of starts) on the sky in the night. 
A constellation is compossed of stars and these stars are located in their upper, left, right and lower part. 
(Only a star also can be a constellation.)﻿ 
Number 1 means a star and 0 means void from the inputs. 
If two starts are located in each diagonal part,  
then the stars can not be a constellation.
How many constellations are in your sky map, and how many stars in the biggest constellation? 
Time limit : 2 sec (Java : 4 sec)﻿
[Input]
There can be more than one test case in the input.  
The first line has T, the number of test cases. 
Then the totally T test cases are provided in the following lines (T<=10)
In each test case, the first line has an integer N(5 ≤ N ≤ 25), the size of map. 
The map is a square, and is represented as N x N matrix.
For next N lines, each contains each raw of the matrix
[Output]
For each test case, you should print "Case #T" in the first line where T means the case number. For each test case, you should output the number of constellation and the number of starts in the greatest constellation separated by blank.

[I/O Example] 
Input
2
7
0 1 1 0 0 0 0
0 1 1 0 1 0 0
1 1 1 0 1 0 1
0 0 0 0 1 1 1
1 0 0 0 0 0 0
0 1 1 1 1 1 0
0 1 0 1 1 0 0
5
0 1 0 0 0
0 1 0 0 0
0 1 0 0 0
0 0 0 0 0
0 0 0 0 0

Output 
Case #1
4 8

Case #2
1 3
