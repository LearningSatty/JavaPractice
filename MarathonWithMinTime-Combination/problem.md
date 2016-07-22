                                                                  MARATHON

A man participated in a marathon. For him to win themarathon, he has to finish running the entire distance in the minimum timepossible. But he cannot exhaust his energy in doing so before finishing therace. So, the key is to control pace. 

There is a 5 point pace plan which he can follow. Each pace is associated with a time(represented in Minutes and seconds) and energy required, to finish 1 Km.

For example: 
 
  
Pace (per Km)                 1                     2                 3                    4                  5           
Time (per Km)             1 min 40 sec        3 min 0 sec       3 min 40 sec        4 min 55 sec        5 min 35 sec            
Energy (per Km)(C)            12                    10                7                    5                  3
 

Given man’s total physical energy H and total distance of marathon D Kilometer, find the minimum time in which he can finish themarathon (He can finish marathon only if H-total energy consumed >=0)

He can change his pace at a unit of 1 Km.
Constraints: g

1.      Total energy consumed should not be greater thanH.

2.      He can change his pace at a unit of 1Km.

3.      He has to complete entire D Kilometer to finishthe marathon.

4.      5<=D<=40

5.     9 < H < 501

6.      0<=seconds<=59

Sample Input

1   # number of test cases

130 30  # H D (man’s total physical energy , total distance of marathon )

4 50 7  # M S C (Minute , seconds, Energy)  

5 0 5

5 10 4

5 20 3

50 30 2

 

Sample Output

Case #1

153 20 # M S(minutes, seconds)
