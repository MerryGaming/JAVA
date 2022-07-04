public class Sum {
    public static void main(String[] args)
    {
        int sum = 0;

        for(int i = 1; i <= 50; i++)
        {
            sum+=i;
        }

        System.out.printf("Tổng từ 1 -> 50 là: " + sum);
    }
}
