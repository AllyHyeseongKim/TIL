# code plus 코딩 테스트 준비 - 기초
# 수학
# (S3) 1929: 소수 구하기

import sys

m, n = map(int, sys.stdin.readline().split("\n")[0].split(" "))

# 에라토스테네스의 체를 사용하여 구현
DP = [True for _ in range(n + 1)]
DP[0] = False
DP[1] = False
for i in range(2, n + 1):
    for j in range(2, n // i + 1):
        DP[i * j] = False

for i in range(m, n + 1):
    if DP[i]:
        print(i)
