Trunk Arrangement

 

We have many trunks withunique sequential ID 1 to N. Length, width & heightsof all trunks are identical.  We have to pile up some of the trunks whilefollowing the below rules:

 

1.   Wecannot put more than one trunk directly upon a trunk

2.   Trunkswith smaller ID cannot be put upon the one with a larger ID

3.   Each trunk has some weight associated with it. 

4.   Thepeak load which a trunk can bear is given

5.   Thetotal weight of all trunks upon a trunk should not exceed its peak load. 

 

Please write a program that finds the maximum number oftrunks that can be piled up according to the above rules.

 

 

Input

The first line contains the value indicating number oftest cases.  Then N test case inputfollow one after another.

The first line of each testcase is aninteger N (1 <= N <= 1000). It is followed by N lines,where eachline contains two integers, both <= 3000, indicating the weight and peak load of each trunkrespectively.

 

 

Output

First output line foreach test case should be “Case #tn”, where “tn” is the test casenumber.

The second line ofoutput shouldprint the number of trunks that can be piled up with conditions as described above, previously.

﻿ 

Refer to below solution arrangement of trunks for 1st input given in sample input, for reference (so output answer is 4). 
