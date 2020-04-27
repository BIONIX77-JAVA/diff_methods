import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//    by Oleksandr Falendysh

public class OlympicGamesInTableByArray {
    public static void main(String[] args) throws IOException {
        // Summer Olympic games cities and years
        int[] gamesYear = {1896, 1900, 1904, 1908, 1912, 1916, 1920, 1924, 1928, 1932, 1936, 1940, 1944, 1948,
                1952, 1956, 1960, 1964, 1968, 1972, 1976, 1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008,
                2012, 2016, 2020, 2024, 2028};
        String[] country = {"Greece", "France", "United States", "England", "Sweden", "Cancelled(WWI – Berlin had been awarded)",
                "Belgium", "France", "Netherlands", "United States", "Germany", "Cancelled(WWII – Tokyo had been awarded)",
                "Cancelled(WWII – London had been awarded)", "England", "Finland", "Australia", "Italy", "Japan",
                "Mexico", "West Germany", "Canada", "Soviet Union", "United States", "South Korea", "Spain", "United States",
                "Australia", "Greece", "China", "England", "Brazil", "Japan", "France", "United States"};
        String[] city = {"Athens", "Paris", "St. Louis", "London", "Stockholm", "17 million soldiers and civilians died",
                "Antwerp", "Paris", "Amsterdam", "Los Angeles", "Berlin", "-", " 80 million soldiers and civilians died", "London", "Helsinki", "Melbourne",
                "Rome", "Tokyo", "Mexico City", "Munich", "Montreal", "Moscow", "Los Angeles", "Seoul", "Barcelona", "Atlanta", "Sydney",
                "Athens", "Beijing", "London", "Rio de Janeiro", "Tokyo", "Paris", "Los Angeles"};

        /* Winter Olympic Games 1924  Chamonix, France, 1928  St. Moritz, Switzerland, 1932  Lake Placid, United States,
        1936  Garmisch-Partenkirchen, Germany, 1940  Cancelled (WWII – Sapporo had been awarded),
        1944  Cancelled (WWII – Cortina d’Ampezzo had been awarded), 1948  St. Moritz, Switzerland,
        1952  Oslo, Norway, 1956  Cortina d’Ampezzo, Italy, 1960  Squaw Valley, United States, 1964  Innsbruck,
         Austria, 1968  Grenoble, France, 1972  Sapporo, Japan, 1976  Innsbruck, Austria, 1980  Lake Placid,
          United States, 1984  Sarajevo, Yugoslavia, 1988  Calgary, Canada, 1992  Albertville, France,
           1994  Lillehammer, Norway, 1998  Nagano, Japan, 2002  Salt Lake City, United States, 2006  Turin, Italy,
            2010  Vancouver, Canada, 2014  Sochi, Russia, 2018  Pyeongchang, South Korea , 2022  Beijing, China,
             2026  Milan – Cortina d’Ampezzo, Italy */

        System.out.println("Game Year\tCountry and City");
        for (int i = 0; i < gamesYear.length; i++) {
            System.out.println(gamesYear[i] + "\t" + country[i] + " - " + city[i] + "\n");
        }

        System.out.println("Enter year to search: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());
        boolean yearFound = false;
        for (int j = 0; j < gamesYear.length; j++) {
            if (gamesYear[j] == year) {
                System.out.println(gamesYear[j] + "\t" + country[j] + " - " + city[j] + "\n");
                yearFound = true;
            }
        }
        if (!yearFound)
            System.out.println("Sorry, this year there were no games");

    }
}