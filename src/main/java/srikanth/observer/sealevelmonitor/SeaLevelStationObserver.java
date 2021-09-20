
package srikanth.observer.sealevelmonitor;

public class SeaLevelStationObserver implements Observer, DisplayPrinter {
    private SeaLevelData seaLevelData;
    private double height;
    public SeaLevelStationObserver( SeaLevelData seaLevelData ){
        this.seaLevelData = seaLevelData;
        this.seaLevelData.register(this);
    }
    
    public void update( double height) {
        this.height = height;
        display();
    }
    public void display(){
        System.out.println("Sea Level Monitor Station Sea Level Changed new Height " + height + " cm");
    }
}
