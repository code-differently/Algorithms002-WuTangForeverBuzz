package hbcu.stay.ready.algorithms;

public class WuTangForeverBuzz {

    public String wuTangClan(int n){
        String ok = "";
        for (int i=1; i<=n; i++)
            ok += WuTangForeverBuzz.ifFactorofThreeFive(i)+"\n";
        return ok;
    }

    public static String ifFactorofThreeFive(int n){
        String number = "";
        if(n<3)
            return Integer.toString(n);
        if(n%15 == 0)
            return "WuTang Forever";
        if(n%3 == 0)
            return "Wu";
        if(n%5 == 0)
            return "Tang";
        else
            return Integer.toString(n);
    }
}
