package lab_5;

public final class Clock {
    private int hour;
    private int minute;
    private String amPm;

    public Clock(int hour, int minute, String amPm) {
        this.hour = hour;
        this.minute = minute;
        this.amPm = amPm;
    }

    // param is type long so that the advance problem itself works!
    public void advance(long minutes) {
        for (int i = 0; i < minutes; i++) {
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour == 12) {
                    amPm = (amPm.equalsIgnoreCase("AM") ? "PM" : "AM");
                } else if (hour > 12) {
                    hour = 1;
                }
            }
        }
    }

    public final int getHour() {
        return hour;
    }

    public final int getMinute() {
        return minute;
    }

    public final String getAmPm() {
        return amPm;
    }

    public final String toString() {
        String result = hour + ":";
        if (minute < 10) {
            result += "0" + minute;
        } else {
            result += minute;
        }
        result += " " + amPm;
        return result;
    }

    public boolean equals(Object o) {
        if (o instanceof Clock) {
            Clock t = (Clock) o;
            return t.hour == this.hour && t.minute == this.minute && t.amPm.equals(this.amPm);
        } else {
            return false;
        }
    }
    public boolean isWorkTime() {
        if (amPm.equals("AM")) {
            // Work time is between 9:00 AM and 11:59 AM
            return (hour >= 9 && hour <= 11);
        } else if (amPm.equals("PM")) {
            // Work time is between 12:00 PM and 5:00 PM
            return (hour >= 12 && hour <= 5);
        }
        return false; // Return false if none of the conditions match
    }

    public static void main(String[] args) {
        Clock t1 = new Clock(3, 27, "PM");
        Clock t2 = new Clock(12, 45, "AM");
        Clock t3 = new Clock(6, 02, "AM");
        Clock t4 = new Clock(8, 59, "AM");
        Clock t5 = new Clock(9, 00, "AM");
        Clock t6 = new Clock(11, 38, "AM");
        Clock t7 = new Clock(12, 53, "PM");
        Clock t8 = new Clock(3, 15, "PM");
        Clock t9 = new Clock(4, 59, "PM");
        Clock ta = new Clock(5, 00, "PM");
        Clock tb = new Clock(5, 01, "PM");
        Clock tc = new Clock(8, 30, "PM");
        Clock td = new Clock(11, 59, "PM");

        System.out.println("t1: " + t1.isWorkTime()); // Expected: true
        System.out.println("t2: " + t2.isWorkTime()); // Expected: false
        System.out.println("t3: " + t3.isWorkTime()); // Expected: false
        System.out.println("t4: " + t4.isWorkTime()); // Expected: false
        System.out.println("t5: " + t5.isWorkTime()); // Expected: true
        System.out.println("t6: " + t6.isWorkTime()); // Expected: true
        System.out.println("t7: " + t7.isWorkTime()); // Expected: true
        System.out.println("t8: " + t8.isWorkTime()); // Expected: true
        System.out.println("t9: " + t9.isWorkTime()); // Expected: true
        System.out.println("ta: " + ta.isWorkTime()); // Expected: true
        System.out.println("tb: " + tb.isWorkTime()); // Expected: false
        System.out.println("tc: " + tc.isWorkTime()); // Expected: false
        System.out.println("td: " + td.isWorkTime()); // Expected: false
    }
}