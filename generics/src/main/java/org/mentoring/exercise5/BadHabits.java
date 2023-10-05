package org.mentoring.exercise5;

import java.util.List;

public class BadHabits implements Habits{

    @Override
    public List<String> describe() {

        return List.of("drinking alcohol", "taking drugs");
    }
}
