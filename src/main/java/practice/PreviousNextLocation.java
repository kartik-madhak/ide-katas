package practice;

public class PreviousNextLocation {

    public void running(String args[]) {
        System.out.println("Running?");
        log(method1("ABC", 0, true)); // TODO: use ctrl B to go to the method definition, and come back to this line quickly using the appropriate command
    }

    public String method1(String stringArg, int intArg, boolean booleanArg) {
        int errorCount = 0;
        String result = "";
        if (stringArg == null) {
            result = "stringArg cannot be null";
            errorCount += 1;
        } else {
            if (stringArg.equals("")) {
                result = "stringArg cannot be empty";
                errorCount += 1;
            }
        }
        if (intArg < 0 || intArg > 19) {
            result = "intArg must be non-negative and less than 20; was " + intArg;
            errorCount += 1;
        }
        if (errorCount > 0) {
            log(result);
            log("Error count: " + errorCount);
            throw new IllegalArgumentException(result);
        }
        if (booleanArg) {
            if (intArg >= 0 && intArg < 10) {
                if (stringArg.matches("^ABC.*?")) {
                    result = "Category A";
                    log(result);
                } else {
                    result = "Category B";
                    log(result);
                }
            } else {
                if (intArg >= 10 && intArg < 20) {
                    if (stringArg.matches("^ABC.*?")) {
                        result = "Category E";
                        log(result);
                    } else {
                        result = "Category F";
                        log(result);
                    }
                }
            }
        } else {
            if (intArg >= 0 && intArg < 10) {
                if (stringArg.matches("^ABC.*?")) {
                    result = "Category C";
                    log(result);
                } else {
                    result = "Category D";
                    log(result);
                }
            } else {
                if (intArg >= 10 && intArg < 20) {
                    if (stringArg.matches("^ABC.*?")) {
                        result = "Category G";
                        log(result);
                    } else {
                        result = "Category H";
                        log(result);
                    }
                }
            }
        }
        return result;
    }

    private void log(String value) {
        System.out.println(System.currentTimeMillis() + ": result: " + value);
    }
}
