#include <iostream>

class Solution
{
public:
    int romanToInt(std::string s)
    {
        int result = 0;
        int N = s.length();
        for (int i = 0; i < N; i++)
        {
            switch (s[i])
            {
            case 'I':
                if (i + 1 != N && (s[i + 1] == 'V' || s[i + 1] == 'X'))
                {
                    result--;
                }
                else
                {
                    result++;
                }
                break;
            case 'V':
                result = result + 5;
                break;
            case 'X':
                if (i + 1 != N && (s[i + 1] == 'L' || s[i + 1] == 'C'))
                {
                    result = result - 10;
                }
                else
                {
                    result = result + 10;
                    std::cout << "Why are you going further:" << s[i] << std::endl;
                }
                break;
            case 'L':
                std::cout << "This went further:" << s[i] << std::endl;
                result = result + 50;
                break;
            case 'C':
                if (i + 1 != N && (s[i + 1] == 'D' || s[i + 1] == 'M'))
                {
                    std::cout << s[i] << std::endl;
                    result = result - 100;
                }
                else
                {
                    result = result + 100;
                }
                break;
            case 'D':
                result = result + 500;
                break;
            case 'M':
                result = result + 1000;
                break;
            }
        }
        return result;
    }
};

int main()
{
    Solution tryRoman;
    int decimalNumber = tryRoman.romanToInt("MCMXCIV");
    std::cout << "This is your number in decimal notation:" << decimalNumber << std::endl;
    return decimalNumber;
}