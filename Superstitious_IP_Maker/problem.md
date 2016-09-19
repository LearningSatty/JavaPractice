After returning from his previous trade, the BusinessMan decides to upgrade his office with latest computers. He is very superstitious about numbers and is deeply influenced by a numerologist named Dus Numbari. BusinessMan approaches the numerologist to suggests him some lucky IPs for his office network. Dus Numbari advices him to use some unique N digits [2<=N<=6] from all of the available 10 digits [0-9] with the below conditions. 

1) Any digit cannot be used more than 2 times 

2) All digits should be used at least once in the generated IP. 

3) IP range can be within 0.0.0.0 to 255.255.255.255, not beyond that. 

4) 00, 01, 05 is not valid use of "0". 

5) The generated IP should form a palindrome (if the '.' are removed) 

﻿ 

The BusinessMan is puzzled with these rules but wants to abide by them. As he is not too good with programming, he wants you to find out how many possible IPs can be created with the above rules. 

﻿ 

[Input] 

 First number will be number of test cases present in file
 For each test case, the number of digits [N] is given, followed by N unique digits from 0-9. 

﻿ 

[Output] 

For each test case, print "Case #" followed by test case number.  

In next line, print the count of IPs generated using given rules.

﻿ 

[Limits] 

1 < N < 7

 

 

[Sample Input]
2
2 0 1
3 1 9 0


﻿

[Sample Output] 

﻿Case #1
2
Case #2
38

 

[Sample Explanation] 

For Case 1,
[1] 0.1.1.0
[2] 1.0.0.1
Total IPs = 2 

﻿ 

For Case 2,
[1] 190.0.9.1
[2] 19.0.0.91
[3] 1.90.0.91
[4] 19.0.9.1
[5] 1.90.9.1
[6] 1.9.0.91
[7] 109.9.0.1
[8] 10.99.0.1
[9] 10.9.90.1
[10] 10.9.0.1
[11] 1.0.90.1
[12] 91.0.0.19
[13] 9.100.1.9
[14] 9.10.0.19
[15] 91.0.1.9
[16] 9.10.1.9
[17] 9.1.0.19
[18] 90.11.0.9
[19] 90.1.10.9
[20] 9.0.110.9
[21] 9.0.1.109
[22] 90.1.0.9
[23] 9.0.10.9
[24] 0.199.1.0
[25] 0.19.91.0
[26] 0.19.9.10
[27] 0.1.99.10
[28] 0.19.1.0
[29] 0.1.91.0
[30] 0.1.9.10
[31] 0.91.19.0
[32] 0.91.1.90
[33] 0.9.119.0
[34] 0.9.11.90
[35] 0.9.1.190
[36] 0.91.9.0
[37] 0.9.19.0
[38] 0.9.1.90
Total IPs = 38

