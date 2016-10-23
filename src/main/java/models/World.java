package main.java.models;


//this model is intended to hold all the game world things like scenery, entities, objects, and players
public class World {
    public Scene getScene() {
        return this.scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    private Scene scene;


    public WorldObjects getObjects() {
        return this.objects;
    }

    public void setObjects(WorldObjects objects) {
        this.objects = objects;
    }

    private WorldObjects objects;


    public Entities getEntities() {
        return this.entities;
    }

    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    private Entities entities;

    public Players getPlayers() {
        return this.players;
    }

    public void setPlayers(Players players) {
        this.players = players;
    }

    private Players players;

}
