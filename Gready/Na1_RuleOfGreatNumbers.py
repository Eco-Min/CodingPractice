n, m, k = map(int, input().split())
data = list(map(int, input().split()))
data.sort(reverse=True)
result = 0

while (m > 0):
    for i in range(k):
        result += data[0]
        m -= 1
    result += data[1]
    m -= 1
print(result)
