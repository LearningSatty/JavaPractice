                                                            Grid Acid

 

A rectangular grid has N x M size.  Each cell is either made of a special metal(type A) or made of stone (type B).

If acid is poured on a cell of grid, it can either melt it(for type A: special metal cell) and spread further or do not pass through it(for type B: stone cell).

The cell made with special metal (type A) can melt with acid in 1 second and thus allow acid to spread further.

The cell made with stone (type B) does not react with acidand hence neither melt nor allow acid to pass through it.

 

There is a third type of a cell that is empty (type C), buthas a boundary (all 4 sides) covered with a protective metal.
If all 4 sides of it (type C: empty cell) come into contactwith acid at any given time, then in that case boundary of it (all 4 sides)melt and allow acid to pass through it. In that case it (type C:  emptycell) get filled with acid.

There is only one and only one such cell in a given grid.

 

Acid is poured on one of the cell of grid, the cell beingmade of special metal that can melt with acid.

It is guaranteed that acid will be poured on only one cellmade up of special metal (type A), not on the stone (type B) or the empty cell(type C).

Acid is poured continuously until all the grid cells (exceptstone - type B) melt completely.

 

You have to tell when the empty cell with special protectiveboundary will get filled with acid and when whole grid will get filled withacid (except the cells made up of stones).

 

It takes 1sec for acid to dissolve special metal cell andafter that it can spread to its 4 orthogonal neighbors (Left, Right, Up, Down).

 

Input:

 

First entry is number of test cases; rest is each test caseinput.

For each test case first row contains N and M as twointegers separated by a space.

Next row contains the location of cell (row and columnnumber separated by space) where acid will be poured continuously until wholegrid (except stone cells) melt.

Next N rows contain M integer values each containing thecell type.

 

Cell type value is of 3 types:

    -  0 : cell is stone (type B)

    -  1:  cell is made special metal (type A)

    -  2:  cell is special empty cell, having a special boundary (type C)

  Note:  There is always one and only one cell of typeC (value 2) in a given grid.

 

Output:

 

Output should contain 2 lines for each test case.

1st line:   Case#

2nd line:   Count1  Count2

    Where:

            Count1:  time in seconds when special empty cell (typeC) will get filled.

            Count2:  time in seconds when whole grid will getfilled with water (note:  stone cell cannotbe filled with acid).

 

Note:

1.  Count2 will be -1if all cells of the grid (except stone cells) cannot be dissolved.  Whole grid dissolving term means that allcells except stone get filled with Acid.

2.  Count1 will be -1if empty cell cannot be filled. If empty cell cannot be filled the #1 is alsoapplicable, i.e. then Count2 = -1.

3.  Once acid entersspecial cell, it accumulates there for 1 second.  After that the acid starts leaking to neighboring (left, right, up, down) cells.

4.  The terms “dissolve”,“melt”, “leaking” are used to express similar meaning that the cell startsleaking the acid to its neighbor cells (left, right, up, down).

5. Acid is poured continuously so once a cell starts leakingacid, it may spread further to other cells in further course of time.

6.  The maximum number of rows or columns of grid is 3000.

 

Sample Input:

9       ---->Number of test cases.

4 5    -------> N=4: number of rows,   M= 5: number of columns

2 4       ----->  Location of cell(row  col) where acid is poured

1 0 1 0 1   ------>  Grid 1st row with M cell entries

1 0 1 1 1     ----> Acid is  poured on 4thcell of this (2nd) row.

1 1 2 1 1      -----> Rows contains empty cell (type C: value: 2)

1 0 1 0 1         -------> Last row of the grid with cell M values

3 3    ------> 2ndtest case starts, N=3, M=3

1 2   --->  Acid is pouring location

1 1 0   ---> 1strow of grid; Acid poured on 2nd cell of this (1st) row of the grid.

1 2 1

0 1 1

3 3

1 1

1 1 1

1 2 1

0 1 1

3 3

3 3

1 1 1

1 2 1

0 1 1

4 4

2 3

0 0 1 0

0 1 1 1

1 1 2 1

1 0 1 1

3 3

1 3

0 1 1

1 2 1

1 1 1

4 5

1 3

1 0 1 0 1

1 0 1 1 1

1 1 1 2 1

1 0 0 1 1

4 5

3 5

1 0 1 0 1

1 0 1 1 1

1 1 1 2 1

1 0 0 1 1

4 5

2 4

1 0 1 0 1

1 1 1 1 1

1 1 2 1 1

1 0 1 1 1

 

Sample Output:

Case #1

-1 -1         --->Count1    Count2  (refer to output description)

Case #2

-1 -1

Case #3

6 6

Case #4

6 6

Case #5

5 5

Case #6

6 6

Case #7

7 7

Case #8

5 9

Case #9

4 6
