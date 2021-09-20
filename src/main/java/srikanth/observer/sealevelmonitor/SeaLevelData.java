
package srikanth.observer.sealevelmonitor;

import java.util.*;

public class SeaLevelData implements Subject{
    private List<Observer> observers;
    private double height;
    public SeaLevelData( ){
        observers = new ArrayList<Observer>();
    }
    public void register( Observer o ){
        observers.add(o);
    }
    public void unregister(Observer o){
        if(observers.contains(o)){
            observers.remove(o);
        }
    }
    public void notifyObservers(){
        for ( Observer observer :  observers ){
            observer.update(height);
        }
    }
    public void heightChanged(){
        notifyObservers();
    }
    public void setHeight( double height ){
        this.height = height;
        heightChanged();
    }
}
