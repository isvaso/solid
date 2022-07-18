package main.theinterfacesegregationprinciple.good.musicians;

import main.theinterfacesegregationprinciple.good.interfaces.InterfaceSinger;

public class Singer implements InterfaceSinger {

    @Override public void sing() {
        System.out.println("Drummer started singing");
    }
}
