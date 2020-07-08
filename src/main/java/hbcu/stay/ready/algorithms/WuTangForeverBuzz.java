package hbcu.stay.ready.algorithms;

public class WuTangForeverBuzz {

    public String wuTangClan(int n){
        StringBuilder fizzBuzz = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (divisibleBy3(i) && divisibleBy5(i)) {
                fizzBuzz.append("\nWuTang Forever");
            } else if (divisibleBy3(i) && !divisibleBy5(i)) {
                fizzBuzz.append("\nWu");
            } else if (divisibleBy5(i) && !divisibleBy3(i)) {
                fizzBuzz.append("\nTang");
            } else {
                if (i == 1) {
                    fizzBuzz.append(i);
                } else {
                    fizzBuzz.append("\n" + i);
                }
            }
        }
        return fizzBuzz.toString();
    }

    public boolean divisibleBy3(int num) {
        if (num % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean divisibleBy5(int num) {
        if (num % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
