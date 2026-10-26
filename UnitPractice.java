public class UnitPractice {

    // Read REQ 02
    public String alarmClock(int day, boolean vacation) {
        boolean weekday = day >= 1 && day <= 5;

        if (!vacation) {
            if (weekday) {
                return "7:00";
            } else {
                return "10:00";
            }
        } else {
            if (weekday) {
                return "10:00";
            } else {
                return "off";
            }
        }
    }

    // Read REQ 03
    public boolean makesSix(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        } else if (a + b == 6) {
            return true;
        } else if (Math.abs(a - b) == 6) {
            return true;
        } else {
            return false;
        }
    }

    // Read REQ 04
    public int ticketPrize(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (a != b && a != c) {
            return 1;
        } else {
            return 0;
        }
    }

    // Read REQ 05
    public String fizzBuzzLabel(String str) {
        if (str.length() == 0) {
            return "";
        }

        if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
            return "FizzBuzz";
        } else if (str.charAt(0) == 'f') {
            return "Fizz";
        } else if (str.charAt(str.length() - 1) == 'b') {
            return "Buzz";
        } else {
            return str;
        }
    }

    // Read REQ 06
    public String doubleChar(String str) {
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            newStr += str.charAt(i);
            newStr += str.charAt(i);
        }

        return newStr;
    }

    // Read REQ 07
    public int countHi(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }

        return count;
    }

    // Read REQ 08
    public boolean catsEqualDogs(String str) {
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                catCount++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                dogCount++;
            }
        }

        return catCount == dogCount;
    }

    // Read REQ 09
    public int countCode(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2) == "co" && str.substring(i + 3, i + 4).equals("e")) {
                count++;
            }
        }

        return count;
    }

    // Read REQ 10
    public String repeatEnd(String str, int n) {
        String newStr = "";

        for (int i = 0; i < n; i++) {
            newStr += str.substring(str.length() - n, str.length());
        }

        return newStr;
    }

    // Read REQ 11
    public String firstTwo(String str) {
        if (str.length() == 0) {
            return "**";
        } else if (str.length() == 1) {
            return str + "*";
        } else {
            return str.substring(0, 2);

        }
    }

    // Read REQ 12
    public int countEvens(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[i]) % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    // Read REQ 13
    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }

    // STRETCH:

    public double divide(int a, int b) {
        if (b == 0 || a == 0) {
            return 0.0;
        }

        if (b > a) {
            return (double) b / a;
        } else {
            return (double) a / b;
        }
    }

    public String mixString(String a, String b) {
        String str = "";

        for (int i = 0; i < a.length() || i < b.length(); i++) {
            if (i < a.length()) {
                str += a.charAt(i);
            }

            if (i < b.length()) {
                str += b.charAt(i);

            }
        }

        return str;
    }

    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() >= b.length()) {
            return a.substring(a.length() - b.length()).equals(b);
        } else {
            return b.substring(b.length() - a.length()).equals(a);
        }
    }
}