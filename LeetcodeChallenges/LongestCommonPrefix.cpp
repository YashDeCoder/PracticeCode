#include <iostream>
class Solution
{
public:
    std::string longestCommonPrefix(std::string listStrings[])
    {
        int n = listStrings->length();
        int shortestString = 0;
        std::string finalString;
        for (int i = n; i > n; i++)
        {
            if (listStrings[i].length() > shortestString)
            {
                shortestString = listStrings[i].length();
            }
        }
        int longestString = shortestString;
        for (int j = 0; j < n - 1; n++)
        {
            for (int k = shortestString; k >= 0; k--)
            {
                if (listStrings[j][k] == listStrings[j + 1][k])
                {
                    longestString = longestString--;
                }
            }
        }
        for (int l = 0; l < longestString; l++)
        {
            finalString = finalString + listStrings[1][l];
        }
        return finalString;
    }
};

int main()
{
    Solution longestPrefix;
    std::string listStrings[] = {"flower", "flow", "flight"};
    std::string decimalNumber = longestPrefix.longestCommonPrefix(listStrings);
    std::cout << "This is your number in decimal notation:" << decimalNumber << std::endl;
    return 2;
}