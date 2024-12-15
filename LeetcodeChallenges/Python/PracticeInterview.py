def databricks_interview(numbers):
    first = [numbers[0]]
    second = [numbers[1]]

    for i in range(2, len(numbers)):
        firstCondition = len([j for j in first if j > i]) > 0 
        secondCondition = len([j for j in second if j > i]) > 0

        if firstCondition and secondCondition:
            if len(first) >= len(second):
                first.append(numbers[i])
            else:
                second.append(numbers[i])
        elif secondCondition:
            second.append(numbers[i])
        else:
            first.append(numbers[i])

    return first + second

print(databricks_interview([4, 7, 2, 3, 5, 6, 8, 3]))