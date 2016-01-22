package de.greenrobot.event.test.indexed;

import org.junit.Before;
import org.junit.Test;

import de.greenrobot.event.test.EventBusBasicTest;

import static org.junit.Assert.assertTrue;

public class EventBusBasicTestWithIndex extends EventBusBasicTest {
    @Before
    public void overwriteEventBus() throws Exception {
        eventBus = Indexed.build();
    }

    @Test
    public void testIndex() {
        assertTrue(eventBus.toString().contains("indexCount=1"));
    }
}
