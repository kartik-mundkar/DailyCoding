#User function Template for python3
class Solution:
    #Function to rotate an array by d elements in counter-clockwise direction. 
    def rotateArr(self, arr, d):
        #Your code here
        d=d%len(arr)
        self.reverse(arr,0,d-1)
        self.reverse(arr,d,len(arr)-1)
        self.reverse(arr,0,len(arr)-1)
    def reverse(self,arr,start,end):
        while start<end:
            arr[start],arr[end]=arr[end],arr[start]
            start+=1
            end-=1
            
    
...# } Driver Code Ends