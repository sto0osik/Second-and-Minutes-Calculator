public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(long minutesValue, long secondsValue){

        if ((minutesValue < 0) || (secondsValue < 0) || (secondsValue > 59)) {
            return INVALID_VALUE_MESSAGE;
        }

        long hoursValue = minutesValue / 60;
        long remainingMinutes = minutesValue % 60;

        String hoursString = hoursValue + "h:";
        if (hoursValue < 10) {

            hoursString = "0" + hoursString;
        }

        String remainingMinutesString = remainingMinutes + "h:";
        if (remainingMinutes < 10) {

            remainingMinutesString = "0" + remainingMinutesString;
        }

        return hoursString  + remainingMinutesString + secondsValue;

    }

    public static String getDurationString(long secondsValue){

        if (secondsValue < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        long minutesValue = secondsValue / 60;
        long remainingSeconds = secondsValue % 60;

        String minutesString = minutesValue + "m:";
        if (minutesValue < 10) {

            minutesString = "0" + minutesString;
        }

        String remainingSecondsString = remainingSeconds + "s:";
        if (remainingSeconds < 10) {

            remainingSecondsString = "0" + remainingSecondsString;
        }

        System.out.println(minutesString + remainingSecondsString);
        return getDurationString(minutesValue, remainingSeconds);
    }
}
