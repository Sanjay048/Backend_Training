/*Use Date and Time API, Factory Methods, and Streams to build a simple scheduling system.
Create a class Event with fields name, dateTime, and duration.
Create a list of events using List.of().
Provide the following functionality:
Display all events.
Filter events based on a specific date.
Calculate the duration between events using Duration.between.
Example Input:
Events:
"Meeting", 2025-01-28T10:00, 1 hour
"Workshop", 2025-01-28T13:00, 2 hours
Example Output:
Events on 2025-01-28:
"Meeting"
"Workshop"
*/

package Day20;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class FilesDateTime {

    static class Event{
        String fieldsName;
        LocalDateTime dateTime;
        Duration duration;

        public Event(String fieldsName, LocalDateTime dateTime, Duration duration) {
            this.fieldsName = fieldsName;
            this.dateTime = dateTime;
            this.duration = duration;
        }

        public String getFieldsName() {
            return fieldsName;
        }

        public LocalDateTime getDateTime() {
            return dateTime;
        }

        public Duration getDuration() {
            return duration;
        }

        @Override
        public String toString() {
            return "Event [ " +
                    "FieldsName = " + fieldsName +
                    ", DateTime = " + dateTime +
                    ", Duration = " + duration +" ]";
        }
    }
    public static void main(String[] args) {
        List<Event> list = List.of(
                new Event("Home",LocalDateTime.of(2025, 1, 28, 10, 0), Duration.ofHours(1)),
                new Event("Office",LocalDateTime.of(2025, 1, 27, 10, 0), Duration.ofHours(2))
                );
        LocalDate date = LocalDate.of(2025,1,28);

        List<Event> events = list.stream().filter(event -> event.getDateTime().toLocalDate().equals(date)).collect(Collectors.toList());
        System.out.println("Events on "+ date+" : ");
        events.forEach(event -> System.out.println(event.getFieldsName()));
    }
}
