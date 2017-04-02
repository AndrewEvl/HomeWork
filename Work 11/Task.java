import java.io.*;
import java.time.Duration;
import java.time.LocalTime;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 28.03.2017.
 */
public class Task {
    public static void main(String[] args) throws IOException {
        File directory = new File("src" + File.separator);
        File log = new File(directory, "log.txt");
        File timePeriod = new File(directory, "TimePeriod.txt");
        File totalTime = new File(directory, "TotalTime.txt");
        timePeriod.createNewFile();
        totalTime.createNewFile();
        long xxx = 0;

        Map<String, Long> total = new HashMap<>();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(timePeriod));
        BufferedWriter totalWriter = new BufferedWriter(new FileWriter(totalTime));
        Scanner scanner = new Scanner(new BufferedReader(new FileReader(log)));

        Pattern pattern = Pattern.compile("(\\d{2}):(\\d{2})\\s(.*)");
        String hourTwo = "9";
        String minutsTwo = "00";

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                String hour = matcher.group(1);
                String minuts = matcher.group(2);
                String activitis = matcher.group(3);

                int intHour = Integer.parseInt(hour);
                int intMinuts = Integer.parseInt(minuts);
                int intHourTwo = Integer.parseInt(hourTwo);
                int intMinutsTwo = Integer.parseInt(minutsTwo);

                LocalTime time = LocalTime.of(intHourTwo, intMinutsTwo);
                LocalTime timeTwo = LocalTime.of(intHour, intMinuts);
                Duration duration = Duration.between(time, timeTwo);
                Long l = duration.toMinutes();
                xxx = xxx + l;
                total.put(activitis, l);

                bufferedWriter.write(hourTwo + ":" + minutsTwo + "-" + hour + ":" + minuts + " " + activitis + "\n");
                bufferedWriter.flush();
                if (Objects.equals(matcher.group(3), "Конец")) {
                    bufferedWriter.write(" \n");
                    bufferedWriter.flush();
                    hourTwo = "9";
                    minutsTwo = "00";
                    for (long value : total.values()) {
                        double procent = (value * 100) / xxx;
                        totalWriter.write(procent + "% ");
                    }
                    xxx = 0;
                    totalWriter.write("\n");
                } else if (!Objects.equals(matcher.group(3), "Конец")) {
                    hourTwo = hour;
                    minutsTwo = minuts;
                }
            }
        }
        totalWriter.write("\n" + String.valueOf(total));
        bufferedWriter.close();
        totalWriter.close();
    }
}
