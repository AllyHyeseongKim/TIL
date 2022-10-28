# code plus 코딩 테스트 준비 - 기초
# 수학
# (S5) 1978: 소수 찾기

import sys

n = int(sys.stdin.readline())
nums = list(map(int, sys.stdin.readline().split("\n")[0].split(" ")))
m = max(nums)

# 에라토스테네스의 체를 사용하여 구현
DP = [1 for _ in range(m + 1)]
DP[0] = 0
DP[1] = 0
for i in range(2, m + 1):
    for j in range(2, m // i + 1):
        DP[i * j] = 0

result = 0
for n in nums:
    result += DP[n]
print(result)
