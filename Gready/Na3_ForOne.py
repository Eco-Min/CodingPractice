n, m = map(int, input().split())
k = 0

while (n != 1):
    if n % m == 0:
        n = n/m
        k += 1
    else:
        n -= 1
        k += 1
print(k)