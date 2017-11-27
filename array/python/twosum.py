class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for i in range(len(nums)):
            for j in range(1, len(nums)):
                if target == nums[i] + nums[j]:
                    list = [i, j]
                    return list


if __name__ == "__main__":
    solution = Solution()
    list = solution.twoSum([1, 2, 7, 5], 9)
    print list 
    print list[0]
    print list[1]