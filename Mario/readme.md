Mario

  Ina video game, Mario has to rescue the danger-prone Princess Peach from the clutches of the evil Bowser. Along the way, Mario collects coins and bombs atvarious posts.   Pakkun Flower, a maneating plant that grows at entrance of some of the posts, cannot be jumped on.To kill these, you have to throw a bomb at them or otherwise pay price to moveahead.

  Each level of a game comprises of various posts that should be successfully crossed one after the other.  In order to reach the end of a level of the game, there are a few basic rules that will get Mario through a game level.

   ﻿

  You have to guide Mario to cross a level by successfully passing all the posts while earning as much Coins possible.  These coins will be useful in next level topurchase some powers, so it is good to have maximum coins after crossing lastpost.

 

1. The Post:

    Each post has a gate, which Mario shouldpass through.  However, sometimes PakkunFlower is guarding the gate.  So Mario has to deal with it.

    Just after the gate of a post, there are gift items coins and bombs that Mario can collect once successfully passed that post.
2. The Pakkun Flower:

  Pakkun flower has some petals that aredangerous for Mario, in the sense that it will kill Mario, if Mario does not pay it money.  Each petal of Pakkun flow requires 1 coin to be deposited as Gate passing fees. If Mario has fewer coins than number of petals on Pakkun Flower and tries to pass through the gate, then Mario will die and game ends.

 

3. The Bomb:

  Mario can collect bombs placed after the gate of each post after successfully crossing that post.  However these bombs have a self decay trigger mechanism that makes them start decaying once collected by Mario.  This decaying causes performance of bomb to decrease as the next posts are crossed.

  After picking a bomb, it can destroy 5 petalsof Pakkun Flower at gate of next immediate post.  Further at next next post, the bomb can destroy2 petals of Pakkun Flower.  Finally furtherat next next next post, it can destroy only 1 petal of Pakkun Flower.  After that if the bomb still remains unused,it completely decays and becomes useless.

 

4. Action at a Post:

A.) Throw bombs:

   Mariocan throw one or more bombs one by one as available to him and as desired.  It will cause damage to the Pakkun Flower asdescribed above in point #3 previously.   However once Mario throws a bomb at PakkunFlower at a post, then he should ensure that all Petals are destroyed.  Otherwise Pakkun will get angry because ofpain of losing petals and will kill Mario with any remaining petal (It won’texcept Gate fees then, as it will be mad with anger). 

  Since Mario is wise he decided to throw old bombs first.  So if he has to throw manybombs then oldest acquired bomb(s) are thrown first and so in order to latest acquired bomb (that acquired at previous post, if any).

  However there is an effect of using bomb evenafter Mario has neutralized Pakkun with bomb(s) as Pakkun has setup Magic incase someone harms it:

       * Coins outside the gate of post will getevaporated. 

       * Bombs kept outside the gate willexplode and hence cannot be further collected.

 

B.) Pay Money toPakkun:

  Pay coins to Pakkun Flower equal to number of petals of Pakkun Flower and march ahead, without any damage.

       The coins and bomb placed outside thepost can then be collected after crossing the gate of that post.

 

C.) Do not pay anythingto Pakkun Flower:
  Pass the post while facing wrath ofPakkun Flower, while saving the money.

         - Pakkun flower will attack Mario

         - All the bombs that Mario has accumulated will be snatched away by the Flower.

         - However, existing coins of Mario remain unaffected.

         - Note:  If Mario does not have any bombs, then Pakkun will kill Mario.  Obviously, it is betterto pay money to Pakkun, in case Mario does not have any bombs with him.

 

Below Figures shows 5random examples of a posts and its setup of Pakkun, coins and bombs:
Input

  Firstline is the numeric value indicating the number of test cases, followed by testcases from next line.

  Each test case consists of first line as N,the number of posts.  The number of posts may vary from 5 to 20. Then N lines follows containing information for each of the post.  The information of the post consists of following numerical values separate by a space:

PakkunFlower:  1 => Flower is guarding thepost.  0 => Post is unguarded.

Numberof petals in Pakkun Flower:  It varies from 1 to 10.  If Post is unguarded then this value is 0.

  The number of Coins and Bombs: thatcan be collected after crossing the post.   The number of coins varies from 0 to 99.  The number of bombs varies from 0 to 5.

Output

  First output line of a test case is "Case#tn", where tn is the test case number.  The next line contains the maximum number ofcoins that Mario earns after finishing the level successfully (i.e. crossingthe last post successfully).

  If it is not possible to cross the level,then print -1 as second line.

Sample input

5 

5 

0 0 10 0

0 0 5 1

1 5 5 1

0 0 99 2

1 5 5 1

5

0 0 99 1

0 0 15 1

1 5 0 1

1 10 9 0

1 10 5 1

5

0 0 67 2

1 10 24 2

0 0 62 0

1 6 81 3

0 0 91 3

6

0 0 27 0

1 5 2 1

1 3 21 0

0 0 95 3

1 2 38 1

0 0 67 3

10

0 0 94 3

1 3 33 1

1 2 11 1

1 8 44 2

1 8 59 3

0 0 29 2

1 6 90 2

1 7 40 2

0 0 48 2

1 1 29 2

 

Sample output

Case #1

124

Case #2

118

Case #3

325

Case #4

245

Case #5

477
