package test.java.services;

import main.java.models.Entities;
import main.java.services.EntitiesThinkerInterface;

/**
 * Created by emelg on 10/23/16.
 */
public class EntitiesThinkerMock implements EntitiesThinkerInterface {

    private boolean thinkCalled = false;

    @Override
    public void think(Entities entities) {
        thinkCalled = true;
    }

    public boolean getThinkCalled() {
        return thinkCalled;
    }
}
