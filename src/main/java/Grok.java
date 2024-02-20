
/**
 * Groks are bad actors in a game.  Groks have the ability to ingest
 * a PowerPill to replenish their energy.  This makes them difficult
 * to kill.
 *
 * @author (You Again)
 * @version (0.1)
 */
public class Grok
{
    private static final int DEFAULT_POWER_LEVEL = 50;
    private int powerLevel;
    /**
     \* Initializes a Grok object to the default power level of 50.
     */

    public Grok(){
        powerLevel = DEFAULT_POWER_LEVEL;
    }

    public Grok(int powerLevel){
        setPowerLevel(powerLevel);
    }

    public int getPowerLevel(){
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel){
        this.powerLevel = powerLevel;
    }

    public void takePowerPill(PowerPill pill){
        this.powerLevel += pill.getPower();
    }

    public void tookHit(){
        this.powerLevel -= 5;
    }


    // implement this class per instructions in Required Activities.
}