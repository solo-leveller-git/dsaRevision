# [Vertical Sum](https://www.geeksforgeeks.org/problems/vertical-sum/1)
## Medium
Given a binary tree having n nodes, find the vertical sum of the nodes that are in the same vertical line. Return all sums through different vertical lines starting from the left-most vertical line to the right-most vertical line.
Examples:
Input:
  
Output: 4 2 12 3 7
Explanation:
The tree has 5 vertical lines
Line 1 has only one node 4 =&gt; vertical sum is 4.
Line 2 has only one node 2 =&gt; vertical sum is 2.
Line-3 has three nodes: 1,5,6 =&gt; vertical sum is 1+5+6 = 12.
Line-4 has only one node 3 =&gt; vertical sum is 3.
Line-5 has only one node 7 =&gt; vertical sum is 7.

Input:
Output: 7 6 4 3 2 1
Explanation:
There are six vertical lines each having one node.
Constraints:1&lt;=n&lt;=1041&lt;= Node value &lt;= 105