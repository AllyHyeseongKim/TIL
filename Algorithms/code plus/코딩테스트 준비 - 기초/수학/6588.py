# code plus 코딩 테스트 준비 - 기초
# 수학
# (S1) 6588: 골드바흐의 추측

import sys

tests = []
while True:
    n = int(sys.stdin.readline())
    if n == 0:
        break
    else:
        tests.append(n)
m = max(tests)

# 에라토스테네스의 체를 사용하여 소수 구하기
DP = [True for _ in range(m + 1)]
DP[0] = False
DP[1] = False
for i in range(2, m + 1):
    for j in range(2, m // i + 1):
        DP[i * j] = False
primes_sorted = []
primes_set = set()
for i in range(2, m):
    if DP[i]:
        primes_sorted.append(i)
        primes_set.add(i)

found = False
for n in tests:
    for prime in primes_sorted:
        if prime < n and n - prime in primes_set:
            print(n, "=", prime, "+", n - prime)
            found = True
            break
    if not found:
        print("Goldbach's conjecture is wrong.")
