package main.java.services;

import main.java.models.Entities;
import main.java.models.Players;
import main.java.models.Scene;
import main.java.models.World;
import main.java.models.WorldObjects;

//service to construct new worlds
public class WorldMakerService implements WorldMakerInterface {

    @Override
    public World createNewWorld() {

        World world = new World();

        world.setScene(new Scene());
        world.setObjects(new WorldObjects());
        world.setEntities(new Entities());
        world.setPlayers(new Players());

        return world;
    }
}
