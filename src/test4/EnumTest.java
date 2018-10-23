package test4;

public class EnumTest
{
    public static void main(String[] args)
    {
        for (CurrencyUnit x : CurrencyUnit.values())
        {
            System.out.println(x);
        }
    }
}
