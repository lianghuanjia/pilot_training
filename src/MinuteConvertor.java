public class MinuteConvertor {
    private int MINUTES_IN_A_DAY = 24*60;
    private int MINUTES_IN_A_YEAR = 365 * MINUTES_IN_A_DAY;
    public void convert (int minute){
        long years = minute / MINUTES_IN_A_YEAR;
        long remain_minutes = minute % MINUTES_IN_A_YEAR;
        long days = remain_minutes / MINUTES_IN_A_DAY;
        System.out.println(years+" year(s) "+days+" day(s).");
    }
}
