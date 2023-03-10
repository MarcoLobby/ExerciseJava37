package it.DevelHope.ExerciseJava37;

import java.time.LocalDate;
import java.util.Locale;

public class Start {
    public static void main(String[] args) {

        LocalDate todayDate = LocalDate.now();

        int currentDayOfTheMonth = todayDate.getDayOfMonth(); // GIORNO ATTUALE DEL MESE
        int lengthOfTheMonth = todayDate.lengthOfMonth();     // GIORNI TOTALI DEL MESE
        int daysUntilTheEndOfTheMonth = lengthOfTheMonth - currentDayOfTheMonth; //RISULTATO DEI GIORNI MANCANTI ALLA FINE DEL MESE

        int currentDayOfTheYear = todayDate.getDayOfYear(); // GIORNO ATTUALE DELL'ANNO
        int lengthOfTheYear = todayDate.lengthOfYear();     // GIORNI TOTALI DELL'ANNO
        int daysUntilTheEndOfTheYear = lengthOfTheYear - currentDayOfTheYear; // RISULTATO DEI GIORNI MANCANTI ALLA FINE DELL'ANNO

        System.out.println("There are " + daysUntilTheEndOfTheMonth + " days until the end of the Month.");
        System.out.println(" ------------------------------------------ ");
        System.out.println("The are " + daysUntilTheEndOfTheYear + " days until the end of the Year.");
    }
}
/* using LocaleDate, calculate and print:

    how many days are left till the end of the month
    how many days are left till the end of the year, using the length() method from java.time.Year.of()
*/