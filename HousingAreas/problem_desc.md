                                                    Housing Areas
  
  There is a square-shaped map as in . 0 indicates that an area has no houses, and 1 indicates that an area has houses.
Mr. Lee wants to define a housing area which is a group of connected houses using this map and to mark numbers on housing areas. Here, the ‘connected’ means that a certain house is attached to other house on the right/left or up/down. Two houses in diagonal are not connected.
is the numbered by housing areas. Create a program that outputs the number of housing areas by inputting a map.

http://sotong.sec.samsung.net/sotong/uploadimage/201491513473705_e1cncwC9Hu2FII..PNG

Time limit: 1 second (java: 2 seconds)
[Input]
Several test cases can be included in the inputs. T, the number of cases is given in the first row of the inputs. After that, the test cases as many as T (T ≤ 20) are given in a row. 
N, the map size is given in the first row of each test case. This map is always a square (5 ≤ N ≤ 25). 
The map information is given separately from the second row to the number of N. In case houses do not exist in the corresponding area, 0 is given, and in case houses exist in the corresponding area, 1 is given. 
[Output]
For each test case, you should print "Case #T" in the first line where T means the case number. For each test case, you should output the total number of housing areas in the first row of each test case.
[I/O Example] 
Input
2
7
0 1 1 0 1 0 0
0 1 1 0 1 0 1
1 1 1 0 1 0 1
0 0 0 0 1 1 1
0 1 1 1 0 0 0
0 1 1 1 1 1 0
0 1 0 0 0 1 1
5
0 1 0 1 0
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1
0 1 0 1 0

Output
Case #1
3
Case #2
12

