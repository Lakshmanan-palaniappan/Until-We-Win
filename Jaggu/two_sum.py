class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashMap = {}
            
        for i in range(len(nums)):
            match_val = target - nums[i]
            if match_val in hashMap and i != hashMap[match_val]:
                return [hashMap[match_val], i]
            hashMap[nums[i]] = i
            
        

        