def fib(n: int):
    if n == 0 or n == 1:
        return 1
    mem = [1, 1]
    x = 2 
    while x != n:
        if mem[x]:  return 0