# TODO: so this code is not very extendible, making it harder to maintain in the long run. I would need to adopt more standards
# E.g. day 2 part 2 this code does not make it easy to improve
# I think I realise now why you just want to add code and not change it directly

def safe_levels(row):
    is_decreasing = all([row[i] > row[i + 1] for i in range(0, len(row) - 1)])
    is_increasing = all([row[i + 1] > row[i] for i in range(0, len(row) - 1)])
    # Don't remember why I do this
    if is_decreasing == is_increasing:
        return False
    if is_increasing:
        return all([row[i] - row[i - 1] >= 1 and row[i] - row[i - 1] <= 3 for i in range(1, len(row))])
    else:
        return all([row[i - 1] - row[i] >= 1 and row[i - 1] - row[i] <= 3 for i in range(1, len(row))])
    

def safe_levels_part_2(row):
    # We know for sure that this does not return as a safe level, so we will try to remove one element and see if it then works
    # Returns 0 if it is still unsafe else returns 1
    
    for i in range(0, len(row) - 1):
        if row[i] == row[i+1]:
            break
        
        new_row = row[:i] + row[i+1:]
        is_increasing = all([new_row[i + 1] > new_row[i] for i in range(0, len(new_row) - 1)])
        
        if is_increasing and all([new_row[i] - new_row[i - 1] >= 1 and new_row[i] - new_row[i - 1] <= 3 for i in range(1, len(new_row))]):
            return 1
        else:
            if all([new_row[i - 1] - new_row[i] >= 1 and new_row[i - 1] - new_row[i] <= 3 for i in range(1, len(new_row))]):
                return 1
    
    return 0
    

def main():
    # Part 1
    total_safe = 0
    file_path = 'AdventofCode2024/input2.txt'
    with open(file_path, 'r') as file:
        for line in file:
            row = [int(x) for x in line.split()]  # Convert strings to integers
            is_safe = safe_levels(row)
            if is_safe:
                total_safe += 1
    print(total_safe)
    
    # Part 2
    total_safe = 0
    file_path = 'AdventofCode2024/input2.txt'
    with open(file_path, 'r') as file:
        for line in file:
            row = [int(x) for x in line.split()]  # Convert strings to integers
            is_safe = safe_levels(row)
            if is_safe:
                total_safe += 1
            else:
                total_safe += safe_levels_part_2(row)
    print(total_safe)

if __name__ == "__main__":
    main()

    
