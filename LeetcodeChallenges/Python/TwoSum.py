from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # First try
        # for i in range(0, len(nums)):
        #     for j in range(1, len(nums)):
        #         if nums[i] + nums[j] == target:
        #             return [i, j]

        # Dictionary -> keys: value, values: index
        seen = {}

        for i, num in enumerate(nums):
            complement = target - num

            if complement in seen:
                return [seen[complement], i]
            
            seen[num] = i

        return []
            


    
# Testing the function
if __name__ == "__main__":
    nums = [2, 7, 11, 15]
    target = 9
    solution = Solution()
    result = solution.twoSum(nums, target)
    print(f"Indices: {result}")