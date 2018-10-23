package test4;

public enum CurrencyUnit
{
    USD("美元","美国"),
    GBP("英镑","英国"),
    EUR("欧元","欧盟"),
    RMB("人民币","中国"),
    JPY("日元", "日本"),;


    private String currency;
    private String country;

    CurrencyUnit(String currency, String country)
    {
        this.country = country;
        this.currency = currency;
    }

    @Override
    public String toString()
    {
        return "CurrencyUnit{" +
                "currency='" + currency + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
