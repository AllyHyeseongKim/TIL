# code plus 코딩 테스트 준비 - 기초
# 수학
# (B1) 1037: 약수

import sys

num = int(sys.stdin.readline())
divisors = list(map(int, sys.stdin.readline().split("\n")[0].split(" ")))
divisors.sort()
print(divisors[0] * divisors[-1])
# print(min(divisors) * max(divisors))
