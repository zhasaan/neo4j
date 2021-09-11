package main;

public enum city {
    //main usage of overriding enumerations
    A("A", 0),
    B("B", 1),
    C("C", 2),
    D("D", 3),
    E("E", 4),
    // represents any city
    ANY("", -1),
    // represents a city or no city
    OPTIONAL("", -2);
    private int index;
    private String name;

    private city(String name, int index) {
        this.name = name;
        this.index= index;
    }

    public String getName() {
        return name;
    }

    /**
     * >= 0: normal cities.
     * <  0: else status. 
     */
    public int getIndex(){
        return index;
    }

}
