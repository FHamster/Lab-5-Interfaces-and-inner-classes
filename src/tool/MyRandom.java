package tool;

public class MyRandom
{
    public static int randNum(int a, int b)
    {
        return (int) (a + Math.random() * (b - a + 1));
    }//生成[a,b]区间内随机数字
}
