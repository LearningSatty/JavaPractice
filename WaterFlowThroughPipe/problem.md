            WaterFlow through pipe

There is a network of pipes designed for the flow of water for fire conditions. It is made by joining unit length nodes of multiple designs. There are 7 designs available.

        1 2 3 4 5 6 7
        ┼ ─ │ └ ┘ ┌ ┐
        
 Water can flow between nodes only if they align a connection. For example,
 
        1234    56789
        │┼─┘    └─┼─┘
        
 in above configurations, water can go to node 3 and 4 from 2, but not to 1. And can go to all 5,6,7,8,9 from any of 5,6,7,8,9

﻿ 

[Input] 

 First number will be number of test cases present in file. For each test case, 5 numbers denoting ROW and COL (MAX 50), Y, X, N is given. X,Y (1<=Y<=ROW 1<=X<=COL) is the starting point of traversal. N is number of seconds.  Then, a space separated matrix of given size will be present. 1-7 represent a pipe node, 0 represents an empty space. 

 

[Output] 

 After "Case #" and test case number, in the next line you need to print the count of 

 nodes filled with water after N seconds, considering that water progress one node

 in 1 second. 

﻿
 

[Input Sample]

2

5 5 3 2 4
4 1 4 6 6 
2 0 1 1 3 
3 1 2 2 5 
3 4 7 4 6 
1 4 3 5 4 

10 10 5 7 15
6 3 2 5 0 6 7 3 6 7 
3 2 5 1 2 5 3 5 4 3 
4 6 2 5 3 3 3 1 2 4 
3 6 2 0 5 0 3 0 0 6 
5 2 1 2 1 1 5 1 4 5 
7 4 3 4 0 6 0 3 3 0 
7 2 3 1 2 6 2 1 5 1 
3 7 3 0 2 1 2 1 2 5 
1 4 5 6 5 1 5 1 0 2 
2 1 4 3 7 7 6 7 4 6 


[Output Sample]
Case #1
8
Case #2
23
