TelephoneTower Selection

Telephone poles arepart of an outdated technology. Cell phones nowadays allow us to call whoever wewant, wherever we want, independent of any wire. There is one problem - withouta service tower nearby a cell phone is useless.

 

In the absence ofhills and mountains, a service tower will provide coverage for a circular area.Instead of planning where to place the wires, a wireless telephone company hasto plan where to build its service towers. Building the towers too far apart causesholes in the coverage and increases complaints. Building the towers too closeto each other results in large areas covered by more than one service tower,which is redundant and inefficient.

 

International CellPhone Company is developing a network strategy to determine the optimalplacement of service towers. Since most customers have replaced their old wiredhome phones by cell phones, the strategy for planning service towers istherefore to cover as many homes of customers as possible.

 

The figure belowshows the service areas for the five towers ICPC’s strategic department plannedto build this year. Tower 5 will serve 24 customers, 6 of which are also servedby tower 4. Towers 1, 2 and 3 have a common service area containing 3customers.




Shortly after theplans for these five towers had been published, higher management issued a stopon all tower building. Protesting customers forced them to weaken this decree,and allow the building of three towers out of the five planned. These threetowers should serve as many customers as possible, of course. Finding the bestpossible choice for the towers to build is not trivial (the best choice in thiscase is towers 2, 4 and 5, serving 68 customers).

 

You must write aprogram to help ICPC choose which towers to build in cases like these. Ifseveral choices of towers serve the same number of customers, choices includingtower 1 are preferable. If this rule still leaves room for more than onesolution, solutions including tower 2 are preferable, and so on.

 

Input

The input filecontains several test cases. First line of input file indicates the number oftest cases, followed by test cases from next line.  The first line of each test case contains twopositive integers:  The number n (n <=20) of towers planned, and the number of towers to be actually built.

 

The next line containsn numbers, each giving the number of customers served by a plannedtower. (The first number refers to the first tower, and so on.) No tower servesmore than a million people.

 

The next linecontains the number m (m <= 10) of common service areas. Eachof the next m lines contains the description of a common service area. Such aline starts with the number t (t > 1) of towers for which thisis a common service area, followed by the t numbers of the towers. Thelast number on the line is the number of customers in the common service area.

 

Output

For each test case, firstline is “Case #tn”, where tn is the test case number.  In second line display the number ofcustomers served and the best choice for the location of the towers. Refer to thesample output for output format.

Sample Input

3

5 3

15 20 25 30 24

5

2 1 2 7

3 1 2 3 3

2 2 3 2

2 3 4 5

2 4 5 6

5 3

25 25 25 25 25

4

2 1 2 5

2 2 3 5

2 3 4 5

2 4 5 5

5 3

25 25 25 25 25

0

 

Sample Output

Case #1

68 2 4 5

Case #2

75 1 3 5

Case #3

75 1 2 3
