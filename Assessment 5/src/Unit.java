/*
 * Assessment 5
 * Student Name: Ngoc Han Luu
 * Student ID: 33104824
 */
// parent / super class
public class Unit {

    // Task 1: Instance Variables
    private String unitCode;
    private String unitName;
    private int creditHour;
    private String offerFaculty;
    private boolean offeredThisSemester;
    private String customCreditHour;

    // ---------------------------------------------------------------------------------------------

    // Task 2: constructors "default"
    public Unit() {
        setUnitCode("null");
        setCreditHour(0);
        setOfferFaculty("FIT");
        setOfferedThisSemester(true);
    }

    // Constructor 4 -param
    public Unit(String initUnitCode, int initCreditHour, String initOfferFaculty, boolean initOfferedThisSemester) {
        setUnitCode(initUnitCode);
        setCreditHour(initCreditHour);
        setOfferFaculty(initOfferFaculty);
        setOfferedThisSemester(initOfferedThisSemester);
    }

    // constructor 3 - param
    public Unit(String initUnitCode, int initCreditHour, String initOfferFaculty) {
        setUnitCode(initUnitCode);
        setCreditHour(initCreditHour);
        setOfferFaculty(initOfferFaculty);
    }


    public Unit(String initUnitCode, int initCreditHour) {

    }

    // Task 3: Getter
    public String getUnitCode() {
        return unitCode;
    }

    public String getUnitName() {
        return unitName;
    }

    public int getCreditHour() {
        return creditHour;
    }

    public String getOfferFaculty() {
        return offerFaculty;
    }

    public boolean getOfferedThisSemester() {
        return offeredThisSemester;
    }

    public String getCustomCreditHour() {
        return customCreditHour;
    }

    // ---------------------------------------------------------------------------------------------
    // Task 4: Setter
    public boolean setUnitCode(String newUnitCode) {
        boolean retVal = false;
        if (newUnitCode.length() > 0 && newUnitCode.length() <= 7) {
            unitCode = newUnitCode;
            retVal = true;
        }
        return retVal;
    }

    public boolean setUnitName(String newUnitName){
        boolean retVal = false;
        if (newUnitName.length() > 0 && newUnitName.length() < 40){
            unitName = newUnitName;
            retVal = true;
        }
        return retVal;
    }

    public boolean setCreditHour(int newCreditHour){
        boolean retVal = false;
        if (newCreditHour > 0 && newCreditHour < 50) {
            creditHour = newCreditHour;
            retVal = true;
        }
        return retVal;
    }

    public boolean setOfferFaculty(String newOfferFaculty){
        boolean retVal = false;
        if (newOfferFaculty.length() > 0 && newOfferFaculty.length() <= 20){
            offerFaculty = newOfferFaculty;
            retVal = true;
        }
        return retVal;
    }

    public void setOfferedThisSemester(boolean newOfferedThisSemester) {
        offeredThisSemester = newOfferedThisSemester;
    }

    // ---------------------------------------------------------------------------------------------
    // Task 5: toString method
    public String toString(){
        String retVal = " ";
        System.out.print("unit code:");
        retVal += getUnitCode() + "\nOffered Faculty: ";
        retVal += getOfferFaculty() + "\nCredit Hour: ";
        retVal += getCreditHour() + "\nOffered this Semester?: ";
        retVal += getOfferedThisSemester();
        return retVal;
    }

    // ---------------------------------------------------------------------------------------------
    // Task 6: customCreditHour method
    // Constructor 2 - param (Unit code, Credit Hour)

    public boolean customCreditHour(String unitCode, int creditHour){
        boolean retVal = false;
        String containsFIT = unitCode.substring(0,3); // Will accept 'FIT'1051 rather than 1051'FIT'
        if (containsFIT.equals("FIT")) {
            if (creditHour == 6) {   // VALID WHEN ... Unit Code = FIT && Credit Hour == 6
                customCreditHour = unitCode;
                System.out.println("Credit Hour: " + creditHour);
                retVal = true;
            }
            else {    // INVALID WHEN ... Unit Code = FIT && Credit Hour =! 6
                System.out.println("Error. This is FIT unit and the number of credit hour is 6 by default");
                customCreditHour = unitCode;
            }
        }
        else {  // VALID WHEN ... Any Unicode && any Credit Hour
            customCreditHour = unitCode;
            System.out.println("credit hour: " + creditHour);
            return true;
        }

        return retVal;

   }


}
