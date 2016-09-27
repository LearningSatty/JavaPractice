Capture the Guards
Problem Statement 

 

Your team has been captured incombat in enemy area. It is your responsibility to plan an escape for yourteam. Your capture location consists of N guards and they need to be controlledin minimum time. Controlling one guard requires only one person from your team;you always have more than N people in your team. In order to control a guardyour team member has to approach the corresponding guard and control the guard.

You want to plan an attack on theguard team in such a way that you are able to control all guards in minimumtime. It is a challenge to find a position in the capture location such thatthe maximum of all the distances of guards from the position is as less aspossible.

Constraints: 

1.      The size of capture location is maximum 20 X 20

2.      There are areas in capture location which youand your guards cannot pass (These areas are indicated by 0)

 

Input 

Input consists of T (maximum 10)test cases. First line of input indicates the number of test cases. Second lineonwards details of each test case is mentioned. In each test case first linehas two integers S and N, where S is the size of matrix depicting the capturelocation (S X S) and N is the number of guards.

Next S lines in input contain Sintegers with 2 possible values 0, 1 (0 means your team cannot pass throughthis area, 1 means your team can pass through this area)

Next N lines contain thepositions of N guards with first integer as the row and second the column. 

 

Output

Output consists of T lines witheach line having the minimum value of maximum distance of all guards from anyposition in the capture area.
Sample

Input

2


5 2


1              1              1              1              1


1              1              1              1              1


1              1              0              1              1


1              0              1              1              1


1              1              1              1              1


1              4


1              3


10           3


0              1              1              1              1              1              1              0              1              1


1              0              1              1              0              1              1              1              1              1


1              1              1              0              1              1              1              1              0              1


1              1              1              1              0              1              1              1              1              1


1              1              1              1              1              1              1              1              1              0


1              1              1              1              1              1              1              0              1              1


1              1              1              1              1              1              1              1              0              1


1              1              1              1              1              1              1              1              1              1


1              1              1              1              0              1              1              1              0              1


1              1              1              1              1              1              1              1              1              1


5              2


4              7


7              4


 

Output


2


3
