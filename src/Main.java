import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ///Задание 3
        //Задача 1
        byte aq = 100;
        System.out.println("Значение переменной " + "aq" + " с типом byte равно " + aq);
        short aw = 20000;
        System.out.println("Значение переменной " + "aw" + " с типом short равно " + aw);
        int ae = 30000000;
        System.out.println("Значение переменной " + "ae" + " с типом int равно " + ae);
        long ar = 500000000;
        System.out.println("Значение переменной " + "ar" + " с типом long равно " + ar);
        float at = 3.75f;
        System.out.println("Значение переменной " + "at" + " с типом flout равно " + at);
        double ay = 5.123456789;
        System.out.println("Значение переменной " + "ay" + " с типом double равно " + ay);


        //Задача 2
        float a = 27.12f;
        long b = 9876789965549L;
        byte c = 2;
        short d = 786;
        boolean e = false;
        short f = 569;
        short g = -159;
        short h = 27897;
        byte j = 67;

        //Задача 3
        int teacherA = 23;
        int teacherB = 27;
        int teacherC = 30;
        int paperAll = 480;
        int teacherAll = teacherA + teacherB + teacherC;
        System.out.println("Всего учеников " + teacherAll);
        int paperForOneStudent = paperAll / teacherAll;
        System.out.println("На каждого ученика рассчитано " + paperForOneStudent + " листов бумаги");

        //Задача 4
        int bottlesRer2Min = 16;
        int min = 2;
        int bottlesPerMin = bottlesRer2Min / min;
        System.out.println("Всего производится за минуту " + bottlesRer2Min / min + " бутылок");
        int bottlesPer20Min = bottlesPerMin * 20;
        System.out.println("За " + 20 + " минут машина произвела бутылок " + bottlesPer20Min + " штук");
        int minutes = 60;
        int hour = 24;
        int minutesIn1Day = minutes * hour;
        int bottlesPer1Day = minutesIn1Day * bottlesPerMin;
        System.out.println("В " + 1 + " сутки машина произвела бутылок " + bottlesPer1Day + " штук");
        int bottlesPer3Days = bottlesPer1Day * 3;
        System.out.println("За " + 3 + " дня машина произвела бутылок " + bottlesPer3Days + " штук");
        int bottlesPer1Month = bottlesPer1Day * 30;
        System.out.println("За " + 1 + " месяц машина произвела бутылок " + bottlesPer1Month + " штук");

        //Задача 5
        int white = 2;
        int brown = 4;
        int allbottles = 120;
        int oneClassRoom = allbottles/(white+brown);
        System.out.println("В школе, где " + oneClassRoom + " классов, нужно " + (white * oneClassRoom) + " банок белой краски и " + (brown * oneClassRoom) + " банок коричневой краски");

        //Задача 6
        float weightBanana = 5 * 0.08f;
        float weightMilk = 105 * 2;
        float weightIceCream = 2 * 100;
        float weightEgg = 4 * 0.07f;
        float gramWeight = weightBanana + weightMilk + weightEgg + weightIceCream;
        float kgWeight = gramWeight / 1000;
        System.out.println("Вес такого спорт-завтрака " + kgWeight + " кг");

        //Задача 7
        int sportsmanWeight = 7;
        float slowWeightLoss = 0.25f;
        float fastWeightLoss = 0.5f;
        float ifSlowWeightLoss = sportsmanWeight / slowWeightLoss;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то " + (int)ifSlowWeightLoss + " дней потребуется для похудения");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то " + (int)(sportsmanWeight / fastWeightLoss ) + " дней потребуется для похудения");

        //Задача 8
        float salaryIncrease = 0.1f;
        int startMashaSalary = 67760;
        float differenceMashaSalary = startMashaSalary * salaryIncrease;
        float newMashaSalary = startMashaSalary + (startMashaSalary * salaryIncrease);
        System.out.println("Маша теперь получает " + (int)newMashaSalary + " рублей. Годовой доход вырос на " + (int)(differenceMashaSalary * 12) + " рублей");

        int startDenisSalary = 83690;
        float differenceDenisSalary = startDenisSalary * salaryIncrease;
        float newDenisSalary = startDenisSalary + (startDenisSalary * salaryIncrease);
        System.out.println("Денис теперь получает " + (int)newDenisSalary + " рублей. Годовой доход вырос на " + (int)(differenceDenisSalary * 12) + " рублей");

        int startKristinaSalary = 76230;
        float differenceKristinaSalary = startKristinaSalary * salaryIncrease;
        float newKristinaSalary = startKristinaSalary + (startKristinaSalary * salaryIncrease);
        System.out.println("Кристина теперь получает " + (int)newKristinaSalary + " рублей. Годовой доход вырос на " + (int)(differenceKristinaSalary * 12) + " рублей");

    }
}