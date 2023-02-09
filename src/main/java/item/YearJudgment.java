package item;

public class YearJudgment {
    public static void judgement(int year){
        if(year%4==0&&year%100!=0){
            System.out.println("yes");
        }else if(year%400==0){
            System.out.println("yes");
        }else System.out.println("no");
    }

    public static void main(String[] args) {
        judgement(2020);
        judgement(2016);
        judgement(3203);
    }
}
