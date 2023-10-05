package org.mentoring.exercise5;

import java.util.List;

public class GoodHabits implements Habits{
    @Override
    public List<String> describe() {
        return List.of("studying diligently","doing homework");
    }
}
