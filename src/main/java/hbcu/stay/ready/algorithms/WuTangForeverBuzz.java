package hbcu.stay.ready.algorithms;

public class WuTangForeverBuzz {

    public String wuTangClan(int n) {

        String result = "";

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) { // if divisible by 15
                result += "WuTang Forever"; // replace # with
            } else if (i % 3 == 0) { // divisible by 3
                result += "Wu";
            } else if (i % 5 == 0) { // divisible by 5
                result += "Tang";
            } else { // not divisible by 3 or 5
                result += i; // print number
            }
            result += "\n"; // add line break after each output
        }
        return result;
    }
}
