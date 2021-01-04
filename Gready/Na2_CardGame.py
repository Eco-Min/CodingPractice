n, m = map(int, input().split())
resultList = list()

for i in range(n):
    data = list(map(int, input().split()))
    resultList.append(min(data))
print(max(resultList))