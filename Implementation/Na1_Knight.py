inputData = input()
row = 0
column = int(inputData[1])
rowData = {"a": 1, "b": 2, "c": 3, "d": 4, "e": 5, "f": 6, "g": 7, "h": 8}
for (k, v) in rowData.items():
    if k == inputData[0]:
        row = v

steps = [
    (-2, -1), (-1, -2), (1, -2), (2, -1),
    (2, 1), (1, 2), (-1, 2), (-2, 1)
]

cnt = 0
for step in steps:
    nextRow = row + step[0]
    nextColumn = column + step[1]
    print(nextRow, nextColumn)
    if (nextRow >= 1 and nextColumn <= 8 and nextColumn >= 1 and nextColumn <= 8):
        cnt += 1

print(cnt)