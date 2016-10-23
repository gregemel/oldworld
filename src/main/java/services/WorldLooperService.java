package main.java.services;

import main.java.models.Entities;
import main.java.models.World;

public class WorldLooperService implements WorldLooperInterface {

    private EntitiesThinkerInterface thinker = null;
    private World world = null;

    public WorldLooperService(EntitiesThinkerInterface thinker) {
        this.thinker = thinker;
    }

    @Override
    public void loop(World worldToLoop) {
        world = worldToLoop;
        thinkEntities();
    }

    private void thinkEntities() {
        thinker.think(world.getEntities());
    }
}
