# code plus 코딩 테스트 준비 - 기초
# 수학
# (B5) 10430: 나머지

import sys

A, B, C = map(int, sys.stdin.readline().split("\n")[0].split(" "))

print((A + B) % C)
print(((A % C) + (B % C)) % C)
print((A * B) % C)
print(((A % C) * (B % C)) % C)

# print((A + B) % C, ((A % C) + (B % C)) % C, (A * B) % C, ((A % C) * (B % C)) % C, sep="\n")
