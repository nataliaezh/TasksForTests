package Tasks;



public class Task2 {

    public int function (int m, int r) throws NumberOutOfRangeException {
        int result=0;
        if (m > r && m == r) {
            throw new NumberOutOfRangeException("Число r должно быть меньше или равно m");

        } else {

            result = countingM(m)/(countingR(r)*countingDifference(m,r));
            System.out.println(result);
        }
        return result;
    }

    public int countingM(int m) {
        int ret = 1;
        for (int i = 1; i <= m; ++i) ret = ret*=i;
   //     System.out.println(ret);
        return ret;
    }

    public int countingR(int r) {
        int ret = 1;
        for (int i = 1; i <= r; ++i) ret = ret*=i;
      //  System.out.println(ret);
        return ret;
    }

    public int countingDifference(int m, int r) {
        int difference = m-r;
        int ret = 1;
        for (int i = 1; i <= difference; ++i) ret = ret*=i;
      //  System.out.println(ret);
        return ret;
    }

}