n, m = map(int, input().split())
x, y, d = map(int, input().split())
mapList = [list(map(int, input().split())) for _ in range(n)]
standed = [[0]*m for _ in range(n)]
standed[x][y] = 1

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

# 왼쪽으로 돌기


def turnLeft():
    global d
    d -= 1
    if d == -1:
        d = 3


cnt = 0
turnTable = 0

while True:
    turnLeft()
    nx = x + dx[d]
    ny = y + dy[d]
    if (standed[nx][ny] == 0 and mapList[nx][ny] == 0):
        standed[nx][ny] = 1
        x = nx
        y = ny
        cnt += 1
        turnTable = 0
    else:
        turnTable += 1

    if turnTable == 4:
        nx = x - dx[d]
        ny = y - dy[d]
        if (mapList[nx][ny] == 0):
            x = nx
            y = ny
            cnt += 1
            turnTable = 0
        else:
            break

print(cnt)
