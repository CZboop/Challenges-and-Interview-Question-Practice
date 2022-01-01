class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        str_ = ""
        for x in range(len(min(strs, key=len))):
            if len(set(i[:x+1] for i in strs))==1:
                str_+=strs[0][x]
            else:
                break
        return str_
        