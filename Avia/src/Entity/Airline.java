package Entity;

public enum Airline {
AZAL("F111"),
    WIZZAIR("F112"),
    TURKISH_AIRLINES("F113"),
    AIR_FRANCE("F114"),
    LUFTHANSA("F115"),
    QATAR_AIRWAYS("F116"),
    EMIRATES("F117"),
    AEROSVIT("F118"),
    LOT_AIRLINES("F119"),
    USA_AIRWAYS("F120");
private final String code;
Airline(String Code){
    this.code=Code;
}
public String getCode(){
    return this.code;
}
}
