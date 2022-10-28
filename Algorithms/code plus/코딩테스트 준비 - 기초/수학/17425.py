# code plus 코딩 테스트 준비 - 기초
# 수학
# (G4) 17425: 약수의 합
# TODO: DP를 사용하여 시간복잡도 줄이기
import sys

t = int(sys.stdin.readline())
ns = []
for _ in range(t):
    ns.append(int(sys.stdin.readline()))
m = max(ns)
f = [1 for _ in range(m + 1)]
g = [0 for _ in range(m + 1)]
# 에라토스테네스의 체를 사용하여 구현
for i in range(2, m + 1):
    for j in range(1, m // i + 1):
        f[i * j] += i
for i in range(1, len(g)):
    g[i] = g[i - 1] + f[i]

for n in ns:
    print(g[n])
