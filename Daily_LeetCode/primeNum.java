package Daily_LeetCode;

import java.util.ArrayList;

public class primeNum {
     public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=left; i<=right; i++){
            if(isPrime(i)){
                list.add(i);
            }
        }

        int min = Integer.MAX_VALUE;
        int one = -1;
        int two = -1;
        for(int i=1; i<list.size(); i++){
            int diff = list.get(i) - list.get(i-1);
            if(min > diff){
                min = diff;
                one = list.get(i-1);
                two = list.get(i);
            }
        }

        return new int[]{one, two};
    }
    public boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        for(int i=2; i*i <= n ;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
