class Solution(object):
    def containsDuplicate(self, nums):
        s = set()

        for cur in nums:
            if cur in s:
                return True
            s.add(cur)

        return False
