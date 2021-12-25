import date.Conference;
import date.Date;
import date.Event;
import date.Meeting;
import user.Role;
import user.User;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create Util.Dates
        String date1 = getDate(30, 7, 1998);

        // Create User
        User user = new User("Mohammad", Role.USER);

        // Create Dates
        Date d1 = new Date();
        d1.addPartialDate(new Meeting());
        d1.addPartialDate(new Event());

        // Create Conference
        Date c1 = new Conference();
        c1.addPartialDate(new Event());

        d1.addPartialDate(c1);

        // Display d1 info
        d1.displayDateInfo();
    }

    public static String getDate(int d, int m, int y) {
        return String.valueOf(LocalDate.of(y, m, d));
    }
}
