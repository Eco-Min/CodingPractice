'''
정수가 주어질 때 정수 X에 사용할 수있는 연산은 다음과 같이 4자이 이다
X가 5로 나누어 떨어지면 5으로 나눈다.
X가 3로 나누어 떨어지면 3으로 나눈다.
X가 2로 나누어 떨어지면 2로 나눈다.
x 에서 1을 뺀다

26
-> 3
'''

x = int(input())
d = [0] * (x+1)

for i in range(2, x+1):
  print(d)
  d[i] = d[i-1] + 1
  print("1 = {} : {}".format(i ,d[i]))
  if i % 2 == 0:
    print(d)
    d[i] = min(d[i], d[i//2] + 1)
    print("2 = {} : {}".format(i ,d[i]))
  if i % 3 == 0:
    print(d)
    d[i] = min(d[i], d[i//3] + 1)
    print("3 = {} : {}".format(i ,d[i]))
  if i % 5 == 0:
    print(d)
    d[i] = min(d[i], d[i//5] + 1)
    print("5 = {} : {}".format(i ,d[i]))

print(d)
print(d[x])