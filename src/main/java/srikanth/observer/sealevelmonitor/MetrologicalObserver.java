
package srikanth.observer.sealevelmonitor;


public class MetrologicalObserver  implements Observer, DisplayPrinter {
    private SeaLevelData seaLevelData;
    private double height;
    public MetrologicalObserver( SeaLevelData seaLevelData ){
        this.seaLevelData = seaLevelData;
        this.seaLevelData.register(this);
    }
    
    public void update( double height) {
        this.height = height;
        display();
    }
    public void display(){
        System.out.println("MetroLogical Weather Station Sea Level Changed new Height " + height + " cm");
    }
}