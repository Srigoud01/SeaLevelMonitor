
package srikanth.observer.sealevelmonitor;

public class InternetObserver  implements Observer, DisplayPrinter {
    private SeaLevelData seaLevelData;
    private double height;
    public InternetObserver( SeaLevelData seaLevelData ){
        this.seaLevelData = seaLevelData;
        this.seaLevelData.register(this);
    }
    
    public void update( double height) {
        this.height = height;
        display();
    }
    public void display(){
        System.out.println("Internet Sea Level Changed new Height " + height + " cm");
    }
}