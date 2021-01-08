def DFS(v):
    if v == n:
        print()
        for k in path:
            print(k, end=" ")
        print("\nkkkkkkkkkkk")
        # return

    # elif len(path) == 8:
    #     return

    else:
        for i in range(1, n+1):
            if nodeList[v][i] == 1 and ch[i] == 0:
                ch[i] = 1
                path2.append(i)
                if (i not in path):
                    path.append(i)
                DFS(i)
                path2.pop()
                ch[i] = 0


if __name__ == '__main__':
    n, m = map(int, input().split())
    nodeList = [[0]*(n+1) for _ in range(n+1)]
    ch = [0]*(n+1)

    for i in range(m):
        x, y = map(int, input().split())
        nodeList[x][y] = 1
        nodeList[y][x] = 1

    ch[1] = 1
    path = []
    path2 = []
    path.append(1)
    path2.append(1)
    DFS(1)

    print(path)
    print()
    for k in nodeList:
        print(k)
