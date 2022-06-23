import java.util.ArrayList;

// child / subclass
public class UnitAssessment extends Unit {

    // Instance variables
    private int assessmentList;
    private String typeOfAssessment;

    // default constructors
    public UnitAssessment() {
        setAssessmentList(1);
        setTypeOfAssessment("");
    }

    // non-default constructors 4-param w/ 3 instances variables from superclass
    public UnitAssessment(String initUnitCode, int initCreditHour, String initOfferFaculty, String initTypeOfAssessment) {
        super(initUnitCode, initCreditHour, initOfferFaculty);
        setTypeOfAssessment(initTypeOfAssessment);
    }

    // getter
    public int getAssessmentList() {
        return assessmentList;
    }

    public String getTypeOfAssessment() {
        return typeOfAssessment;
    }

    // setter
    public boolean setAssessmentList(int newAssessmentList) {
        boolean retVal = false;
        if (newAssessmentList > 0 && newAssessmentList <= 10) {
            assessmentList = newAssessmentList;
            retVal = true;
        }
        return retVal;
    }

    public void setTypeOfAssessment(String newTypeOfAssessment) {
        if (newTypeOfAssessment.length() > 0)
            typeOfAssessment = newTypeOfAssessment;
    }

    // public method called 'addAssessment' = to a new assessment to assessmentList ArrayList
    public boolean addAssessment() {
        boolean retVal = false;
        ArrayList<String> assessmentList = new ArrayList<String>();

        return retVal;
        }
    }













