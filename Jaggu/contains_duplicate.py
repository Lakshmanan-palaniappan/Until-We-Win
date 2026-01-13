class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        check_dup = set()
        for i in range(len(nums)):
            if nums[i] in check_dup:
                return True
            else:
                check_dup.add(nums[i])

        # for i in range(len(nums)):
        #     for j in range(i+1, len(nums)):
        #         if nums[i] == nums[j]:
        #             return True
        return False
        