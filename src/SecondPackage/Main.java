package SecondPackage;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String comparing;
        Date date = new Date("2023-9-18");
        System.out.println("Сегодняшняя дата = " + date);
        Date date1 = new Date();
        System.out.println("\nСравним даты " + date + " и " + date1 + ":" );
        if(date.compare(date1)) comparing = "true";
        else comparing = "false";
        System.out.println("Результатом сравнения дат является - " + comparing);
        System.out.printf("\n"+ date + " + 20 days = " );
        date.add(20);
        System.out.println(date);
        System.out.printf("\n" + date + " - 33 days = " );
        date.delete(33);
        System.out.println( date);
        System.out.println("\nКоличество дней между датами " + date + " и "+ date1 + " = " +date.range(date1));
        System.out.println("\nСравним даты " + date + " и " + date1 + ":" );
        if(date.compare(date1)) comparing = "true";
        else comparing = "false";
        System.out.println("Результатом сравнения дат является - " + comparing);
    }
}