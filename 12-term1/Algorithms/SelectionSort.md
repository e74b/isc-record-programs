## Algorithm

```
1) Start
2) Declare necessary variables
3) Input numebr of elements 'n'
4) Declare an arrray 'a' iwth 'n' elements
5) For i <-- 0 to n
	5.1) Input element a[i]
	5.2) End for loop
6) For i <-- 0 to n
	6.1) small = a[j]
	6.2) pos = i
	6.3) For j <-- (i + 1) to n
		1) If (a[j] < small) then small = a[j], pos = j
		2) End for loop
	6.4) Swap a[i] and a[pos]
	6.5) End for loop
7) For i <-- ) to n
	7.1) Print a[i]
	7.2) End for loop.
8) Stop.
```

## Output 

```
Enter number of elements:
5
Enter 5 elements:
6
18
24
12
21
Sorted array:
6
12
18
21
24
```

