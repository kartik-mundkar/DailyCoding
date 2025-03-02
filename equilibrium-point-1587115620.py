# User function Template for python3
class Solution:
    #Function to find equilibrium point in the array.
    def findEquilibrium(self, arr):
        # code here
        pref_sum_map = []
        pref_sum = 0
        for i in arr:
            pref_sum+=i
            pref_sum_map.append(pref_sum)
        for i in range(1,len(pref_sum_map)):
            if pref_sum_map[i-1]==pref_sum_map[-1]-pref_sum_map[i]:
                return i
                
        return -1
...# } Driver Code Ends