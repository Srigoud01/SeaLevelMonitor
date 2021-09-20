
package srikanth.observer.sealevelmonitor;


public class SeaLevelMonitorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        SeaLevelData seaLevelData = new SeaLevelData();
        
        InternetObserver internetObserver = new InternetObserver(seaLevelData);
        MetrologicalObserver metrologicalObserver = new MetrologicalObserver(seaLevelData);
        NewsStationObserver newsStationObserver = new NewsStationObserver(seaLevelData);
        SeaLevelStationObserver seaLevelStationObserver = new SeaLevelStationObserver(seaLevelData);
        
        System.out.println("\n");
        System.out.println("Sea Level Changed ");
        System.out.println("\n");
        seaLevelData.setHeight(2);
        
        System.out.println("\n");
        System.out.println("Sea Level Changed ");
        System.out.println("\n");
        seaLevelData.setHeight(10);
        
        seaLevelData.unregister(internetObserver);
        seaLevelData.unregister(metrologicalObserver);
        
        System.out.println("\n");
        System.out.println("Sea Level Changed ");
        System.out.println("\n");
        seaLevelData.setHeight(15);        
    }
}
