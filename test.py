class Solution:
  def __init__(self):
    self.result = 10

  def add(self, num):
    self.result += num
    return self

if __name__ == "__main__":
  cal1 = Solution()
  print(cal1.add(3))
  print(3)

