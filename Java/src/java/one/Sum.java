package java.one;

public class Sum {
    public static void main(String[] args)
    {
        System.out.printf("Tổng từ 1 -> 50 là: " + tongDaySo());
    }

    public static int tongDaySo()
    {
        int sum = 0;

        for(int i = 1; i <= 50; i++)
        {
            sum+=i;
        }
        return sum;
    }
}
