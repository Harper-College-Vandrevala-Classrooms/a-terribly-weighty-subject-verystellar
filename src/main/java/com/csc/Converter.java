package com.csc;

public class Converter {

  public String toPounds(int ounces) {
    double lbs = (double)ounces/16.0;
    String unit = "";
    if (lbs == 1.0000 ){
        unit = " lb";
    } else {
        unit = " lbs";
    }
    String s = String.format("%.4f",lbs) + unit;
    return s;
  }

  public String toPoundsAndOunces(int ounces) {
    int oz = ounces%16;
    int lb = ounces/16;
    String unit = "";
    if (lb == 1 ){
        unit = " lb ";
    } else {
        unit = " lbs ";
    }
    String s = String.valueOf(lb) + unit + String.valueOf(oz) + " oz";
    return s;
  }

  public String toPounds(){
    return toPounds(0);
  }
  public String toPoundsAndOunces(){
    return toPoundsAndOunces(0);
  }

  public String toOunces(int pounds, int ounces) {
    int oz = ounces + pounds*16;
    String unit;
    if (oz == 1 ){
      unit = " ounce";
    } else {
      unit = " ounces";
    }
    String s = String.valueOf(oz) + unit;
    return s;
  }
}
