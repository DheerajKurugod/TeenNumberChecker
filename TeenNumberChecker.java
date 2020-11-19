public class TeenNumberChecker {

    public static void main(String[] args) {

        boolean x = hasTeen(19, 19, 29);
        System.out.println(x);
    }

    public static boolean hasTeen(int age1, int age2, int age3){
        return isTeen(age1) || isTeen(age2) || isTeen(age3);
    }

    public static boolean isTeen(int age){
        return ((age >=13) && (age <=19));
    }
}
