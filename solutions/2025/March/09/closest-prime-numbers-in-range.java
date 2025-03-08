                    allPrimes[j]=false;
        for(int i=2;i<=right;i++){
            if (allPrimes[i]){
                for(int j=2*i;j<=right;j=j+i){
            allPrimes[i]=true;
        }
        boolean[] allPrimes = new boolean[right+1];
        for(int i=2;i<right+1;i++){
        // int[] numbers = new int[right-left+1];
        boolean[] primes = new boolean[right-left+1];
class Solution {
    public boolean[] primeArrBool(int left, int right){