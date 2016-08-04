                                                            8-Queen: Maximum Score

The King of Narnia has no children, so he has decided that the country will be split into up to k separate parts on his death and each part will be inherited by whoever performs best at some test. Itis possible for any individual to inherit more than one or indeed all of the portions. To ensure that only highly intelligent people eventually become his successors, the King has devised an ingenious test. In a large hall filled there are k chess boards placed.  Each chessboard has numbers in the range 1 to 99 written on each square and is supplied with 8 chess queens. The task facing each potential successor is to place the 8 queens on the chess board in such a way that noqueen threatens another one, and so that the numbers on the squares thus selected sum to a number at least as high as one already chosen by the King.

Note:  As per the rules of chess, each row and column of the board containsexactly one queen, and each diagonal contains no more than one.

Write a program thatwill read in the number and details of the chessboards and determine thehighest scores possible for each board under these conditions.

Input

First line contains the number representing total number of testcases.  Then input of each test casefollows.

Test case Input will consist of k (the number of boards), on a line by itself, followed by k sets of 64 numbers, each set consisting of eight lines of eight numbers. Each number will be a positive integer less than 100. There will never be more than 22 boards.

Output

Output will consist of k numbers consisting of your k scores, each score on a separate line.  Note that first output line of each test case should be Case #tn, where tn is the test case number.

Sample input

2
1
1 2 3 4 5 6 7 8
9 10 11 12 13 14 15 16
17 18 19 20 21 22 23 24
25 26 27 28 29 30 31 32
33 34 35 36 37 38 39 40
41 42 43 44 45 46 47 48
48 50 51 52 53 54 55 56
57 58 59 60 61 62 63 64
5
1 2 3 4 5 6 7 8
9 10 11 12 13 14 15 16
17 18 19 20 21 22 23 24
25 26 27 28 29 30 31 32
33 34 35 36 37 38 39 40
41 42 43 44 45 46 47 48
48 50 51 52 53 54 55 56
57 58 59 60 61 62 63 64
1 2 3 4 5 6 7 8
9 10 11 12 13 14 15 16
17 18 19 20 21 22 23 24
25 26 27 28 29 30 31 32
33 34 35 36 37 38 39 40
41 42 43 44 45 46 47 48
48 50 51 52 53 54 55 56
57 58 59 60 61 62 63 64
1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1
10 11 21 31 41 11 12 13
2 2 2 2 2 2 2 2
3 3 3 3 3 3 3 3
4 4 4 4 4 4 4 4
5 5 5 5 5 5 5 5
6 6 6 6 6 6 6 6
1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1
21 11 81 91 61 12 13 11
10 88 99 10 11 13 12 20
31 41 61 41 15 25 35 45 
23 13 43 43 23 54 14 94
12 43 14 54 44 44 15 25 
16 62 65 66 55 55 50 99
90 91 92 93 94 93 95 96
70 71 72 73 74 75 76 77

Sample output

Case #1

260

Case #2
260
260
8
63
564
