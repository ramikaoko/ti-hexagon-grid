package de.ra.model;

import java.util.UUID;

public class Tile {

    private String mName;

    private boolean isSpecial;

    private boolean isHomeSystem;

    private boolean isWormhole;

    private int mQuality; // 1: good systems, 2: moderate systems, 3: bad systems

    private UUID mId;

    public Tile(String name, boolean special, boolean homeSystem, boolean wormhole, boolean quality)
    {
        setId(UUID.randomUUID());
    }

    public UUID getId()
    {
        return mId;
    }

    public void setId(UUID id)
    {
        mId = id;
    }

    public String getName()
    {
        return mName;
    }

    public boolean isSpecial()
    {
        return isSpecial;
    }

    public boolean isHomeSystem()
    {
        return isHomeSystem;
    }

    public boolean isWormhole()
    {
        return isWormhole;
    }

    public int getQuality()
    {
        return mQuality;
    }

}
