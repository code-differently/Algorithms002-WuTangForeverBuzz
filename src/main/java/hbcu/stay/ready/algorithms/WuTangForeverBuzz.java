package hbcu.stay.ready.algorithms;

public class WuTangForeverBuzz {

    public String wuTangClan(){
        String ans = "";
        for(int i = 1; i <= 15; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                ans += "WuTang Forever";
                //don't want another new line
                break;
            }
            else if(i % 3 == 0) {
                ans += "Wu";
            }
            else if(i % 5 == 0) {
                ans += "Tang";
            }
            else {
                ans += i; 
            }
            ans += "\n";
        }
        return ans;
    }
}
