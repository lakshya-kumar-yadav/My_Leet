
# Median of Two Sorted Arrays

## Problem Statement

Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return the **median** of the two sorted arrays.

The overall run time complexity should be `O(log (m+n))`.

## Examples

### Example 1

**Input:**
```text
nums1 = [1,3], nums2 = [2]
```

**Output:**
```text
2.00000
```

**Explanation:**

Merged array = `[1,2,3]`

The median is `2`.

### Example 2

**Input:**
```text
nums1 = [1,2], nums2 = [3,4]
```

**Output:**
```text
2.50000
```

**Explanation:**

Merged array = `[1,2,3,4]`

The median is `(2 + 3) / 2 = 2.5`.

## Constraints

- `nums1.length == m`
- `nums2.length == n`
- `0 <= m <= 1000`
- `0 <= n <= 1000`
- `1 <= m + n <= 2000`
- `-10^6 <= nums1[i], nums2[i] <= 10^6`

## Approach

**Binary Search on the Smaller Array**

- Perform binary search on the smaller array to optimize the search space.
- Divide both arrays into two partitions.
- Ensure that all elements in the left partition are less than or equal to all elements in the right partition.
- Calculate the median based on whether the total number of elements is odd or even.
- Use `Integer.MIN_VALUE` and `Integer.MAX_VALUE` to handle partition boundaries.

## Complexity Analysis

| Complexity | Value |
|---|---|
| Time Complexity | `O(log(min(m, n)))` |
| Space Complexity | `O(1)` |

## Key Concepts

- Binary Search
- Sorted Arrays
- Array Partitioning
- Boundary Conditions
- Median Calculation

## Solution

**Language:** Java

**Approach:** Binary Search
