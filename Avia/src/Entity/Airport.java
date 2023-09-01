package Entity;

public enum Airport {
    BAKU("BA"),
    ISTANBUL("IS"),
    KIEV("KI"),
    NEW_YORK("NY"),
    MOSCOW("MO"),
    MILAN("MI"),
    LONDON("LO"),
    TOKIO("TO"),
    BUDAPEST("BU"),
    VIENNA("BU");
    private final String code;
    Airport(String Code){
        this.code=Code;
    }
    public String getCode(){
        return this.code;
    }
}
