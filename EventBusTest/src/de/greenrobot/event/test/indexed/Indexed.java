package de.greenrobot.event.test.indexed;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.EventBusTestsIndex;

public class Indexed {
    static EventBus build() {
        return EventBus.builder().addIndex(new EventBusTestsIndex()).build();
    }
}
