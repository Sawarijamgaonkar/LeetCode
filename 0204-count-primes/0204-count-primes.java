class Solution {
    public int countPrimes(int n) {
        int count=0;
        boolean prime[]=new boolean[n+1];
        for(int i=0;i<prime.length;i++){
            prime[i]=true;
        }
        for(int i=2;i*i<=n;i++){
            if(prime[i]==true){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(prime[i]==true){
                count++;
            }
        }
        return count;
    }
}