#User function Template for python3
class Solution:
    def subarraySum(self, arr, target):
        # code here
        prefix_sum=[0]
        p_sum = 0
        for i in arr:
            p_sum+=i
            prefix_sum.append(p_sum)
        left=0
        right=1
        while left<=right and right<=len(arr):
            if prefix_sum[right]-prefix_sum[left]<target:
                right+=1
            elif prefix_sum[right]-prefix_sum[left]>target:
                left+=1
            else:
                return [left+1,right]
 
        return [-1]    
        
...# } Driver Code Ends