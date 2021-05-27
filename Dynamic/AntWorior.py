'''
먹이를 구해야 한다
첫번째 칸의 먹이를 구햇으면 
이어져 있는 칸의 먹이는 구하지 못한다
최대 먹이값을 구해라

4
1 3 1 5
-> 8
'''
x = int(input())
array = list(map(int, input().split()))

d = [0] * (x+1)

d[0] = 0
d[1] = array[0]
print(d)
for i in range(2, x+1):
  d[i] = max(d[i-1], d[i-2] + array[i-1])

print(array)
print(d)
