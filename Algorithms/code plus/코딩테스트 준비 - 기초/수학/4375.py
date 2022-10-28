# code plus 코딩 테스트 준비 - 기초
# 수학
# (S3) 4375: 1

import sys

test_case = []
while True:
    try:
        test_case.append(int(sys.stdin.readline()))
    except:
        break

for test in test_case:
    # 1로 이루어지면서 test 자리수와 같은 수 만들기(format(int, "b")으로 bin 앞 0b 제거)
    multiple = format(2 ** len(str(test)) - 1, "b")
    while True:
        if int(multiple) % test == 0:
            print(len(str(multiple)))
            break
        else:
            multiple += "1"
