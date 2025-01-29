package Daily_GFG;

public class Implement_power {
    double power(double b, int e) {
        // code here
        
        int m = e;
        double ans = 1.0;
        
        if(e < 0) e = -1 * e;
        
        while(e > 0){
            if(e % 2 == 1){
                
                ans = ans * b;
                e = e - 1;
            }
            else{
                e = e / 2;
                b = b * b;
            }
        }
        
        if(m < 0){
           ans = (double)1.0 / (double)ans; 
        } 
        
        return ans;
    }
}
