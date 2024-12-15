import random

def movement():
    count = 0
    start = [0,0]
    endpoints = [[2,0],[-2,0],[0,-2],[0,2]]
    while (start not in endpoints):
        direction = random.randint(1,4)
        if (direction == 1):
            start[0] += 1
        elif (direction == 2):
            start[0] -= 1
        if (direction == 3):
            start[1] += 1
        if (direction == 4):
            start[1] -= 1
        count += 1
    return count

def probability():
    # Take average of all
    count = 0
    for i in range(0,100):
        count += int(movement())
    count = count/100
    print(count)

probability()