package sample2;

import java.util.ArrayList;

public class Model {
    private ArrayList<ChangedValueListener> listnerList = new
            ArrayList<ChangedValueListener>(100);
    private int valeur;

    public Model() {
        this.valeur = 0;
    }

    public Model(int valeur) {
        this.valeur = valeur;
    }

    public int
    getValue() {
        return
                valeur;
    }

    public void setValue(int valeur) {
        this.valeur = valeur;
        fireVolumeChanged();
    }

    public void addVolumeListener(ChangedValueListener listener) {
        listnerList.add(listener);
    }

    public void removeVolumeListener(ChangedValueListener listener) {
        listnerList.remove(listener);
    }

    public void fireVolumeChanged() {
        ChangedValueEvent evt = new ChangedValueEvent(this, getValue());
        for (int i = 0; i < listnerList.size(); i++) {
            listnerList.get(i).volumeChanged(evt);
        }
    }

}