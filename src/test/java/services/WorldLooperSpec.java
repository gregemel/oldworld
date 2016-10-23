package test.java.services;

import main.java.models.World;
import main.java.services.EntitiesThinkerInterface;
import main.java.services.EntitiesThinkerService;
import main.java.services.WorldLooperInterface;
import main.java.services.WorldLooperService;
import main.java.services.WorldMakerInterface;
import main.java.services.WorldMakerService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

//spec to guarantee the behavior of the world looper service
public class WorldLooperSpec {

    private WorldLooperInterface target = null;
    private World world = null;
    private WorldMakerInterface makerService = null;
    private EntitiesThinkerMock thinker = null;

    @Before
    public void setup() {
        thinker = new EntitiesThinkerMock();
        target = new WorldLooperService(thinker);
        makerService = new WorldMakerService();
        world = makerService.createNewWorld();
    }

    @Test
    public void shouldTellTheEntitiesToThinkDuringLoop() {

        assertFalse(thinker.getThinkCalled());

        target.loop(world);

        assertTrue(thinker.getThinkCalled());
    }
}
