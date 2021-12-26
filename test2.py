s = 'John Doe, Peter Parker, Mary Jane Watson-Parker, James Doe, John Elvis Doe, Jane Doe, Penny Parker'
s1 = s.split(',')
b = s.replace(" ", "")
print(b)
c = b.split(',')
email = "@example.com>"
print(c)
k = list()

for i in c:
  a = ""
  flag = 0
  for j in range(0, len(i)):
    if i[j].isupper():
      a += i[j]
      if(i[j-1] != "-"):
       flag = j
  a += i[flag+1: -1] + i[-1]
  m = a.lower().replace("-", "")
  count = 2
  for l in k:
    if l == m and not m[-1].isdigit():
      m += str(count)
    elif l == m and m[-1].isdigit():
      m = m[0:len(m)-1]
      count += 1
      m+=str(count)
  k.append(m)
  print(k)
  

newStr = ""
for mk in range(0, len(s1)):
  newStr += s1[mk] + " <" +k[mk] + email + ", "
print(newStr[0:-2])
