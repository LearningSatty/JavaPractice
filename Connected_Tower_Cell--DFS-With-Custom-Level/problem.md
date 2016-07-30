Romeo has planned an outing with Juliet along with his two children Roju and Juro. to a theme park LoWorld, which has a special game called HoldTight . The game HoldTight  contains hexagonal cells arranged in the form of a 2D matrix as shown in figure(size of matrix is 3x4) with each cell displaying the reward points(Rij) and they change for each game. Only a matrix of cells (mxn)  are active for each game The rules of the game are as follows:

 1) It has to be played by 4 members

2) Each member has to hold at least one other member. The hexagonal cells are designed such that persons standing only in neighbor cells can hold each other iff they stretch each others hands or legs. (Assume that Romeo is also an awesome gymnast and can stand on one leg :P)

3) Each cell can contain only one member.

Fig.Matrix with reward points

 

 

The number of times the game played is T. Each time the game played Romeo wants to optimize the reward points as much as he can. So, he asks you for your help In maximizing the reward points scored.

 

Constraints are:

 

1<=T<=15

0<=Rij<=1000

1<=m,n<=15

4<=m*n<=225

 

Input format: 

First line contains T, the number of times the game is played. For each game m,n are given and m lines of n reward points is given.

 

Output format:

For each game print the maximum reward points that can be earned.

Sample Input:

 

2

3 4

150 450 100 320

120 130 160 110

10 60 200 220

1 4

10 20 30 40

 

Sample Output:

1130

100

 

Explanation for sample Input 1:

 

Few Possibilities are:


Reward points for Case1 is 960, for Case2 is 940 , for Case3 is 1130 and for Case4 is  1080. So here the answer is 1130.


﻿﻿﻿﻿﻿﻿﻿

For sample test case2:

 

Only one possibility i.e 

 

So, the maximum reward points are 10+20+30+40 = 100.

