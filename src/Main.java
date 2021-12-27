import date.*;
import date_template.DateType;
import date_template.MakeDate;
import date_template.MakeEvent;
import notifications.AppSettings;
import user.Role;
import user.User;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create Util.Dates
        String date1 = getDate(30, 7, 1998);
        // Create Users
        User user = new User("Mohammad", Role.USER);
        User admin = new User("Omar", Role.ADMIN);

        // Create AppSettings
        AppSettings settings = new AppSettings();
        settings.setCurrentUser(user);
        settings.setSoundNotifications(true);
        // Create Dates
        Date d1 = new Date();
        d1.addPartialDate(new Meeting());
        d1.addPartialDate(new Event());

        // Create Conference
        Date c1 = new Conference();
        c1.addPartialDate(new Event());

        d1.addPartialDate(c1);

        // Display d1 info
//        d1.displayDateInfo();

        // Notify
        settings.notifyUser();

        // Admin Proxy
        DateProxy dateProxy = new DateProxy();
        dateProxy.setDate(d1);
        dateProxy.setRole(admin.getRole());
        // Try accessing data through DateProxy
        dateProxy.displayDateInfo();

        // Create new Date using Template Method
        MakeDate makeDate = new MakeEvent();
        Event event = (Event) makeDate.make();
    }

    public static String getDate(int d, int m, int y) {
        return String.valueOf(LocalDate.of(y, m, d));
    }
}
