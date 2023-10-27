
public class GarbageTruck {
    private int capacity;
    private int currentGarbage;
    private int time;

    public GarbageTruck(int capacity) {
        this.capacity = capacity;
        this.currentGarbage = 0;
        this.time = 0;
    }

    public int collectGarbage(GarbageStation station) {
        int garbage = station.getGarbageAmount();
        int timeToLoad = 8;

        if (currentGarbage + garbage <= capacity) {
            currentGarbage += garbage;
            time += timeToLoad;
            return 0;
        } else {
            int remainingGarbage = currentGarbage + garbage - capacity;
            currentGarbage = capacity;
            time += timeToLoad;
            time += 30; 
            currentGarbage = 0;
            return remainingGarbage;
        }
    }

    public int returnToStation() {
        time += 30; 
        return time;
    }

    public int getTotalTime() {
        return time;
    }
}


