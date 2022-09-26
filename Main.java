package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean isanyoneofthemisteen = hasTeen(23,35,33);
        System.out.println(isanyoneofthemisteen);
        boolean checkteen = isTeen(17);
        System.out.println(checkteen);

    }
    public static boolean hasTeen(int one,int two,int three){
        if(one>12&&one<20)
            return true;
        else if (two>12&&two<20)
            return true;
        else if(three>12&&three<20)
        return true;
        return false;
    }
    public static boolean isTeen(int one){
        if(one>12&&one<20)
            return true;
        return false;
    }
}
