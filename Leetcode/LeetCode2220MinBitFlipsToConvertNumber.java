public class LeetCode2220MinBitFlipsToConvertNumber
{
    public static void main(String[] args)
    {
        // System.out.println(countSetBits(15));
        System.out.printf((4 & 1) + "");//100 + 001
    }


    public static int countSetBits(int number)
    {
        int count = 0;
        while (number > 0)
        {
            count = count + number & 1; //
            number = number >> 1;//1111 0111 011 0001
            System.out.println(count);
        }
        return count;
    }
}
