from collections import deque
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
# n = y축 m = x축
n, m = map(int, input().split())
mapList = [list(map(int, input().split())) for _ in range(n)]
ch = [[0]*m for _ in range(n)]

Q = deque()
Q.append((0, 0))
mapList[0][0] = 0
ch[0][0] = 1
cnt = 0

while Q:
  tmp = Q.popleft()
  for i in range(4):
    nx = tmp[1] + dx[i]
    ny = tmp[0] + dy[i]
    print("Q :{}".format(Q))
    print("y, x : {}, {} ".format(ny, nx))
    print("tmp {}".format(tmp))
    if 0 <= ny <= n-1 and 0 <= nx <= m-1 and mapList[ny][nx] == 1:
      mapList[ny][nx] = 0
      ch[ny][nx] = ch[tmp[0]][tmp[1]] + 1
      for k in ch:
        print(k)
      Q.append((ny, nx))



for j in ch:
  print(j)

""" 
5 6
1 0 1 0 1 0
1 1 1 1 1 1
0 0 0 0 0 1
1 1 1 1 1 1
1 1 1 1 1 1
"""

""" 
3 4
1 0 1 0
1 1 1 1 
0 0 0 1 
"""
