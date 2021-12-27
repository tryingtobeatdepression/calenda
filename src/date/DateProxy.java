package date;

import user.Role;

public class DateProxy implements IDate{
    private Date date;
    private Role role;

    @Override
    public void displayDateInfo() {
        if(checkAccess()) {
            System.out.println("Access granted to admin!");
            date.displayDateInfo();
        }
        else
            System.out.println("Unauthorized.");
    }

    boolean checkAccess() {
        return role.equals(Role.ADMIN);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
