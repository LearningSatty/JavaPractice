                                                              Chess Rook

Inchess, the rook is a piece that can move any number of squares vertically orhorizontally. In this problem we will consider small chess boards (at most 4 ×4) that can also contain walls through which rooks cannot move. The goal is toplace as many rooks on a board as possible so that no two can capture eachother. A configuration of rooks is legal provided that no two rooks are on thesame horizontal row or vertical column unless there is at least one wallseparating them. The following image shows five pictures of the same board. Thefirst picture is the empty board, the second and third pictures show legalconfigurations, and the fourth and fifth pictures show illegal configurations.For this board, the maximum number of rooks in a legal configuration is 5; thesecond picture shows one way to do it, but there are several other ways.

http://sotong.sec.samsung.net/sotong/uploadimage/2016323204926793_e1cxWiwZ4S1vf28kZbLY7MZCA...PNG

Yourtask is to write a program that, given a description of a board, calculates themaximum number of rooks that can be placed on the board in a legalconfiguration.

Input

Firstline of input is number of test cases. Each test case contains a board description. Each board descriptionbegins with a line containing a positive integer N that is the size ofthe board; N will be at most 4. The next N lines each describeone row of the board, with a ‘.’ indicating an open space and an uppercase ‘X’indicating a wall. There are no spaces in the input file. 

Output

For each test case, output one line containing the maximum numberof rooks that can be placed on the board in a legal configuration. Note thatfirst output line of each test case should be Case #tn, where tnis the test case number.

Sample input
5

4

.X..

....

XX..

....

2

XX

.X

3

.X.

X.X

.X.

3

...

.XX

.XX

4

....

....

....

....

Sample output

Case #1

5

Case #2

1

Case #3

5

Case #4

2

Case #5

4

