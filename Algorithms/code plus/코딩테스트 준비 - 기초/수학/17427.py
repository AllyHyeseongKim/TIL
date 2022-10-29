# code plus 코딩 테스트 준비 - 기초
# 수학
# (S2) 17427: 약수의 합 2
# TODO: 약수의 합 구하는 방법

import sys
# import math

n = int(sys.stdin.readline())
# fs = []
#
# 1부터 n까지 f(A) 값 구하기
# for i in range(1, n + 1):
#     divisors = set()
#     divisors.add(1)
#     if n != 1:
#         divisors.add(i)
#     # for j in range(1, n // 2 + 1):
#     for j in range(1, int(math.sqrt(n)) + 1):
#         if i % j == 0:
#             divisors.add(i)
#             divisors.add(i // j)
#     fs.append(sum(divisors))
#
# print(sum(fs))

g = 0
for i in range(1, n + 1):
    g += i * (n // i)
print(g)
