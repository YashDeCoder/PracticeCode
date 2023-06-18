def multiplesof3or5(n: int):
    x = 0
    list1 = []
    while x != n:
        if x % 3 == 0 or x % 5 == 0:
            list1.append(x)
        x += 1
    sumation = sum(list1)
    return sumation

print(multiplesof3or5(1000))