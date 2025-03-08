        return primes;
    }
    public int[] closestPrimes(int left, int right) {
        int[] resultArr = {-1,-1};
        boolean[] primeArr = primeArrBool(left, right);
        int size = right-left+1;
        int diff,min_diff=right-left;
        int ptr1=0,ptr2=0;
        while(ptr1<size){
            if(primeArr[ptr1]!=true){
                ptr1+=1;
                continue;
            }
        for(int i = left;i<=right;i++){
            primes[i-left]=allPrimes[i];
        }
                continue;
            }
        } 
            }
            else{
                    allPrimes[j]=false;
                }
            if (allPrimes[i]){
                for(int j=2*i;j<=right;j=j+i){
        }
        for(int i=2;i<=right;i++){
        boolean[] allPrimes = new boolean[right+1];
        for(int i=2;i<right+1;i++){
            allPrimes[i]=true;
        // int[] numbers = new int[right-left+1];
        boolean[] primes = new boolean[right-left+1];
    public boolean[] primeArrBool(int left, int right){
class Solution {