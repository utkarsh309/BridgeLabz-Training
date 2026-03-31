package stream_api;

import java.util.List;

public class EventWelcomeMessage {

    public static void main(String[] args) {

        List<String> attendees =
                List.of("Rahul", "Anita", "Mohan", "Sneha");

        attendees.forEach(name ->
                System.out.println("Welcome to the event, " + name + "!")
        );
    }
}

