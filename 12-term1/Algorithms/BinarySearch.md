### Algorithm

```
1) Start
2) Declare necessary variables
3) Input number of elements 'n'
4) Declare array 'a' with 'n' elements.
5) For i <-- 0 to n:6) Input array element a[i]
	5.1) End for loop.
6) Input search element 'search'
7) Declare variables first = 0, last = n-1, flag = 0
8) Repeat steps while first <= last:
	8.1) mid = (first + last / 2)
	8.2) if (a\[mid\] = search): flag = 1; break;
	8.3) if (a\[mid\] > search): last = (mid - 1); goto step 8;
	8.4) if (a\[mid\] < search): first = (mid + 1); goto step 8;
	8.5) Close while loop
9) If (flag = 1) then print "Found"
	9.1) Else print "Not found."
10) Stop
```
### Output 

```
Enter number of elements:
5
Enter 5 elements, sorted.
2
4
6
8
10
Enter search element:
4
Element found.
```
