package sample2;

import java.util.EventObject;
public class ChangedValueEvent extends EventObject {
    int newValue;

    public ChangedValueEvent(Object source, int newValue){
        super(source);
        this.newValue = newValue;
    }

    public int getNewValue(){
        return newValue;
    }}