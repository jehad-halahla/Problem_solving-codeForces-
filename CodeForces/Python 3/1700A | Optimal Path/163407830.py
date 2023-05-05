t = input()
for i in range(int(t)):
    line = input()
    n, m = line.split(" ")
    n = int(n)
    m = int(m)
    summation1 = n * (n + 1) / 2
    summation2 = (m-1) * m / 2
    res = m*summation1 + summation2
    print(int(res))