import re
def find_mul(text):
    pattern = r"mul\(\d{1,3},\d{1,3}\)"
    matches = re.findall(pattern, text)
    total_sum = 0
    
    for mul in matches:
        number_pattern = r"\d{1,3}"
        number_match = re.findall(number_pattern, mul)
        total_sum += int(number_match[0]) * int(number_match[1])
        
    print(total_sum)
    
    
def main():
    file_path = 'AdventofCode2024/input3.txt'
    with open(file_path, 'r') as file:
        total_text = ''
        for line in file:
            total_text += line
        find_mul(total_text)
                
if __name__ == "__main__":
    main()