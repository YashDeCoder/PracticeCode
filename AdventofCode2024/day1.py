import pandas as pd

def sum_distance(list1, list2):
    sum = 0
    list1.sort()
    list2.sort()
    
    # What if they aren't the same size?
    for i in range(len(list1)):
        diff = 0
        num1 = int(list1[i])
        num2 = int(list2[i])
        # How would I solve this better?
        if num2 >= num1:
            diff = num2 - num1
        else:
            diff = num1 - num2
        sum += diff
    
    print(sum)
    return sum

def main():
    # The seperator seems to get some weird parsing error
    df = pd.read_csv('input1.txt', sep='   ', header=None, names=['list1', 'list2'])
    list1 = df['list1'].tolist()
    list2 = df['list2'].tolist()
    sum = sum_distance(list1, list2)
    print(sum)

if __name__ == "__main__":
    main()

    
