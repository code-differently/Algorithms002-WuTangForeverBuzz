package hbcu.stay.ready.algorithms;

public class WuTangForeverBuzz {

    public String wuTangClan(){

        String result = "";
        for(int i = 1; i <= 15; i++){
            if (i%3==0 && i % 5==0){
                result += ("WuTang Forever");
            }
            else if(i % 3 == 0){
                result += "Wu";
            }
            else if(i % 5 == 0){
                result += "Tang";
            }
            else{
                result += i;
            }
            result += "\n";
        }

        return result;
    }
}
