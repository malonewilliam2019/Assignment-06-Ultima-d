public class Main {

    public static void main(String[] args) {

        int worldTime = 67294091;

        calcYear(worldTime);
        calcDay(worldTime);
        calcHour(calcdayMin(worldTime));
        calcMin(calchourMin(calcdayMin(worldTime)));
        calcTrammel(worldTime);
        calcFelucca(worldTime);

        System.out.println("worldTime is = "+worldTime);
        System.out.println("It is "+calcHour(calcdayMin(worldTime))+":"+calcMin(calchourMin(calcdayMin(worldTime)))+" on day "+calcDay(worldTime)+" of the year "+calcYear(worldTime)+".");
        System.out.println("Trammel is in day "+calcTrammel(worldTime)+" of its 9 day phase.");
        System.out.println("Felucca is in day "+calcFelucca(worldTime)+" of its 14 day phase.");
    }
public static int calcYear(int worldTime) {
    int year = (worldTime / (365 * 24 * 60)) + 1;
    return year;
}

public static int calcDay(int worldTime) {
    int dayMin=(worldTime%(365*24*60));
    int day=(dayMin/(24*60))+1;
    return day;
}

public static int calcdayMin(int worldTime){
    int dayMin=(worldTime%(365*24*60));
    return dayMin;
}
public static int calcHour(int dayMin) {
    int hourMin = (dayMin % (24 * 60));
    int hour = (hourMin / 60);
    return hour;
}
public static int calchourMin(int dayMin){
    int hourMin = (dayMin % (24 * 60));
    return hourMin;
    }

public static int calcMin(int hourMin) {
    int min=hourMin%(60);
    return min;
}
public static int calcTrammel(int worldTime){
        int totDays=worldTime/(24*60)+1;
        int Trammmel=totDays%9;
        return Trammmel;
}
public static int calcFelucca(int worldTime){
        int totDays=worldTime/(24*60)+1;
        int Felucca=totDays%14;
        return Felucca;
    }
}
