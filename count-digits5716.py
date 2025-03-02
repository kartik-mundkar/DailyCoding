#User function Template for python3
class Solution:
    def evenlyDivides (self, N):
        # code here
        num=N
        count=0
        while True:
            rem=num%10
            if rem>0 and N%(rem)==0:
                count+=1
            num=num//10
            if num==0:
                break
        return count
...# } Driver Code Ends