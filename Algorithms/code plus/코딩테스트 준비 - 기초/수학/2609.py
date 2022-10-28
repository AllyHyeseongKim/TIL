# code plus 코딩 테스트 준비 - 기초
# 수학
# (B1) 2609: 최대공약수와 최소공배수

import sys

num = list(map(int, sys.stdin.readline().split("\n")[0].split(" ")))
num.sort()


# 유클리드 호제법을 사용하여 구현
def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)


def lcm(a, b):
    return a * b // gcd(a, b)


print(gcd(num[1], num[0]))
print(lcm(num[1], num[0]))
