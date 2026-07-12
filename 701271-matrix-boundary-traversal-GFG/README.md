# [Matrix Boundary Traversal](https://www.geeksforgeeks.org/problems/boundary-traversal-of-matrix-1587115620/1)
## Easy
You are given a matrix mat[][] . Return the boundary traversal on the matrix in a clockwise manner starting from the first row of the matrix. Examples:
Input: mat[][] = [[1, 2, 3, 4],                [5, 6, 7, 8],                [9, 10, 11, 12],                [13, 14, 15,16]]
Output: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5]
Explanation: The boundary traversal is: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5]

Input:mat[][] = [[12, 11, 10, 9],               [8, 7, 6, 5],               [4, 3, 2, 1]]
Output: [12, 11, 10, 9, 5, 1, 2, 3, 4, 8]Explanation: The boundary traversal is: [12, 11, 10, 9, 5, 1, 2, 3, 4, 8]
Input:mat[][] = [[12, 11],                [4, 3]] Output: [12, 11, 3, 4]Explanation: The boundary traversal is: [12, 11, 3, 4]
Constraints:1 ≤ mat.size()≤ 10001 ≤ mat[0].size() ≤ 10000 ≤ mat[i][j] ≤ 1000