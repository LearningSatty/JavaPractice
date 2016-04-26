1. In a BST, replace value of each node with the sum of itself and everything greater than 

itself.
2. There are two very large numbers, cant fit in any data type provided, so they are given in a 

linked list (one digit per node). Sum the two numbers.
3. Clone a linked list with random pointer.
4. You are given a BST and a number k. Find the  node in the tree which has the value closest 

to k?
5. Check a binary tree is BST or not?
6. Count BST nodes that are in a given range?
7. Binary Search, Quick Sort, MergeSort, HeapSort.
8. Given two nodes of a binary tree,check they are cousins or not.
9. Given a binary tree. return sum of all Left Leaf nodes.
10. Write a function that returns true if a given undirected graph is tree and false otherwise.
11. Direct Acyclic Graph
12. Given a binary tree, I was asked to serialize that tree and store it as a file format and 

retrieve it back to the form of a binary tree.
13. An binary tree is given. He asked me to serialize and deserialize the given binary tree. I 

gave him the approach using pre order traversal and store the elements in array and using 

another array which will store whether a node element is leaf node or internal node. He was 

convinced with the approach. Then he asked me to write the code for the same logic.
14.  finding the middle element of a linked list
15. printing the vertical sum of a tree.(http://www.geeksforgeeks.org/vertical-sum-in-a-given-

binary-tree/)
16. Sum of two linked list?(http://www.geeksforgeeks.org/sum-of-two-linked-lists/)
17. Given a running stream of integers. I need to find the median of the running stream. I gave 

  solution using heaps. He was interested in the approach using tree, after a hint i was able 

to solve it using tree. He was convinced by my approach
18. An infix expression is given and i need to evaluate this expression. create logic to 

convert the infix expression to post fix expression.
19. Given a post order traversal of a binary search tree. He asked me to write a clean code to 

create a BST using the given post order traversal and return the root of the BST.
20. There are two linked lists. Both linked lists have a single-digit number in their nodes. I 

needed to
treat this linked lists as a numbers and add them up and store the digits in a new linked list.
E.g., head -> 5 -> 6 -> 7-> 9
head -> 2-> 1 -> 1
Resultant linked list: head-> 5 -> 8-> 9-> 0 (5679 + 211 = 5890)
21. Given two trees, find out if the second tree is a “subtree” of the first one.
E.g., Tree 1
         A
       /   \
      B     C   
    /  \     \
   D    E     F 
 /
G  

Tree 2:
     B
   /   \
  D     E
 /
G

Answer: Yes (B is a subtree of A)
Tree 2:
     B
   /   \
  D     E
Answer: No (Tree 2 is not a subtree of Tree A)

22. Sort a linked list of 0s, 1s and 2s
http://www.geeksforgeeks.org/sort-a-linked-list-of-0s-1s-or-2s/
23. Floor and Ceil from a BST
http://www.geeksforgeeks.org/floor-and-ceil-from-a-bst/
24. Design a data structure that supports insert, delete, search and getRandom in constant time
http://www.geeksforgeeks.org/design-a-data-structure-that-supports-insert-delete-search-and-

getrandom-in-constant-time/
25) Given a continuous input stream of integers, can you find the maximum N numbers at any 

given instance?
https://www.quora.com/Programming-Puzzles-Given-a-continuous-input-stream-of-integers-can-you-

find-the-maximum-N-numbers-at-any-given-instance
26) lca of k nodes in given bst (http://www.geeksforgeeks.org/lowest-common-ancestor-in-a-

binary-search-tree/)
27) K’th largest element in a stream
http://www.geeksforgeeks.org/kth-largest-element-in-a-stream/
28) Lowest Common Ancestor in a Binary Search Tree.
http://www.geeksforgeeks.org/lowest-common-ancestor-in-a-binary-search-tree/
29) Swap two nodes in a singly linked list.(http://www.geeksforgeeks.org/swap-nodes-in-a-

linked-list-without-swapping-data/)
30) Building bridges problem (http://www.geeksforgeeks.org/dynamic-programming-set-14-

variations-of-lis/)
31) Implement a data structure with push() , pop() , find minimum element in O(1). 

(http://www.geeksforgeeks.org/design-and-implement-special-stack-data-structure/)
32. Merge two balanced BST’s (http://www.geeksforgeeks.org/merge-two-bsts-with-limited-extra-

space/)
33. 

LRU cache implementation. 
-----------------------------------------------------------------------------------------------
-----------------------------------------------------------------------------------------------
1. In an integer array, find the window with maximum sum.
2. implement Linked hash map using Linked list and hash map.
3. Given N ropes of lengths L1, L2, L3, L4...., LN. I had to join every rope to get a final 

rope of length L1+L2+L3+...+LN. 
However, I can join onlu two ropes at a time and the cost of joining the two ropes is L1+L2. I 

was supposed to join ropes in such a way that the cost is minimum?
4. Given an input string and a dictionary of words, find out if the input string can be 

segmented into a space-separated sequence of dictionary words. 

http://www.geeksforgeeks.org/dynamic-programming-set-32-word-break-problem
5. Given an array of 0s and 1s . I was asked to return the index of a zero turning which will 

produce a longest continuous 1s.
Ex 1 0 1 1 0 1 0 1 1 1 0 1. here turning the last 0 to 1 will form 5 ones. this is the longest 

of all.
6. Spiral printing of 2D matrix.(http://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-

form/)
7. Given an unsorted array which contains unique numbers from 0 to 999 and size of array is 

1000. At one of the index the element has been replaced by some other element. I need to find 

the original element. Only logic was required.
8. Given n non-negative integers representing an 2-D elevation map where the width of each bar 

is 1, i need to compute how much water it is able to trap after raining.
Input: arr[] = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
Output: 6
       | 
   |   || |
_|_||_||||||
Trap "1 unit" between first 1 and 2, "4 units" between
first 2 and 3 and "1 unit" between second last 1 and last 2
(http://www.geeksforgeeks.org/trapping-rain-water/)
9. Given a 2-D plane and number of points are given on that 2-D plane which are represented by 

its (x,y) co-ordinates. So i need to find the maximum number of points which can be lie on a 

single line.
Answer : I gave the solution using hashing, i calculate the slope using any two points, now one 

by one checks the slope with other points if slope matches i will increase the count for that 

particular slope in hash map. Now i will traverse the hash map and find the maximum. Time 

complexity O(n2).
Then discussion happens on what if slope comes out to be something that can even not be stored 

in type “long double”, what to do then.
10. Given the encoding rule:
A -> 0
B -> 1
C -> 2
…
K -> 10
…
Z -> 25
I was supposed to get the number of original strings possible given an encoded input.
E.g., Given input 10, two possible original strings are possible BA and K, the answer is 2.
11. Reverse the stack using recursion
http://www.geeksforgeeks.org/reverse-a-stack-using-recursion/
12. External merge sort
https://en.wikipedia.org/wiki/External_sorting
13. http://www.geeksforgeeks.org/find-two-rectangles-overlap/
14. given a string, calculate the frequency of characters, output the array with the letter and 

frequency. (such as: for “abbcddeee”, the output should be ab2cd2e3)
-----------------------------------------------------------------------------------------------
Design Based:
-------------
1. What data structure should we use to store restaurants(having location info), So that we can 

easily find the list of restaurants near my current location?
2. Design a chat application. How will you handle huge data?
3. Design an online pizza delivery system. Complete OO design needed?
4. Given a million list of co-ordinates in the form of longitude and latitude just as google 

maps. How will you print closest k cities to a given location?
5. Design an algorithm for Amazon Advertisement page.
6. If I am designing a media player and I want to store songs and play them in random order
  a) What data structure will you use to store songs?
  b) how will select the next song to play in a way which prevents the same song being played 

in consecutive turn?
7. Design a Elevator. How you store the input from users inside the elevator, outside the 

elevator. How the elevator will take decision whether to go up,down or stop.
8. There is an event in the auditorium and Given capacity of the auditorium (NxM).
every group of person booked ticket and all the tickets are booked, Now you have to assign seat 

number to all of them such that minimum number of group split.
We can solve this using this http://www.geeksforgeeks.org/dynamic-programming-subset-sum-

problem.
9. Design Movie tickets booking system
-Class diagram with all relevant classes & associations
-find out all use cases
-describe a typical flow of events
-show how each use case is handled using your class diagram (selection of seats, payment etc)
-how would system be designed such that you can show the user complete cinema hall with all -

seats in their respective locations.
-write a service for a front end controller which will let users to select multiple seats 

according to their preference. Already booked seats & available seats should be marked 

differently.
-how will the cost of a booking be determined (I used decorator pattern for it)
10. Design a system for a Building having various Access Points & Users having multiple levels 

of access
-Class diagram with all entities, relationships
-how will you achieve scalability? (handle the system when the number of users accessing it is 

very high at the same time)
-write all the necessary services required
-how will you handle the scenario when a person misplaces his card
-how will the scenario for visitors entering the building be handled?
11. design a s/w for game shop in shopping mall
Description: The game shop will distribute preloaded cards. That card needs to be used to play 

any game. if the card has balance the cardholder will be allowed to play the game.
12. Design chessboard. I was asked to write all the classes.
13. Discussion on what data structure i will use to implement recommendation engine. e.g. if 

someone buy mobile from Amazon, it should recommend the ear phones, power bank etc.
14. there is a news publishing/subscribing product of Amazon where electronic contents are collected from owners like newspaper, magazines. Customer is using kindle. Design how customer will get the content when his system kindle connects to net. how to send the contents to device?



Algo:
1. Brute Force Algo
2. Greedy Algo
3. Dijkstra Algo
4. Kruskal's Algo
5. Prim's Algo
6. Divide and Conquer
7. BackTracking
8. Dynamic Problem


