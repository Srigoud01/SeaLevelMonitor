
package srikanth.observer.sealevelmonitor;

public class NewsStationObserver  implements Observer, DisplayPrinter {
    private SeaLevelData seaLevelData;
    private double height;
    public NewsStationObserver( SeaLevelData seaLevelData ){
        this.seaLevelData = seaLevelData;
        this.seaLevelData.register(this);
    }
    
    public void update( double height) {
        this.height = height;
        display();
    }
    public void display(){
        System.out.println("News Station Sea Level Changed new Height " + height + " cm");
    }
}