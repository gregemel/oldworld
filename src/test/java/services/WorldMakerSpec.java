package test.java.services;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import main.java.models.World;
import main.java.services.WorldMakerInterface;
import main.java.services.WorldMakerService;

//spec to guarantee the behavior of the world maker service
public class WorldMakerSpec {

    WorldMakerInterface target = null;
    World world = null;

    @Before
    public void setup() {
        target = new WorldMakerService();
        world = target.createNewWorld();
    }

    @Test
    public void shouldCreateAnEmptyWorld() {
        assertNotNull(world);
    }

    @Test
    public void newWorldShouldHaveSceneMap() {
        assertNotNull(world.getScene());
    }

    @Test
    public void newWorldShouldHaveObjectsCollection() {
        assertNotNull(world.getObjects());
    }

    @Test
    public void newWorldShouldHaveEntitiesCollection() {
        assertNotNull(world.getEntities());
    }

    @Test
    public void newWorldShouldHavePlayersCollection() {
        assertNotNull(world.getPlayers());
    }
}