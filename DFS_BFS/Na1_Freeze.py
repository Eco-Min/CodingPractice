def DFS(x, y):
    global cnt
    print()
    for k in mapList:
        print(k)
    if x <= -1 or x >= n or y <= -1 or y >= m:
        return
    elif mapList[x][y] == 0:
        mapList[x][y] = 1
        DFS(x-1, y)
        DFS(x+1, y)
        DFS(x, y - 1)
        DFS(x, y + 1)
    

if __name__ == '__main__':
    n, m = map(int, input().split(" "))
    mapList = [list(map(int, input().split(" "))) for _ in range(n)]
    cnt = 0

    for i in range(n):
        for j in range(m):
            if mapList[i][j] == 0:
                DFS(i, j)
                cnt += 1
                print(i, j)
    print(cnt)
