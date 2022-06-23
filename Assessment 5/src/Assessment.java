public class Assessment {
    // Task 1a: Instance Variables
    private String assessmentName;
    private int assessmentValue;

    // Task 1b: Getters
    public String getAssessmentName() {
        return assessmentName;
    }

    public int getAssessmentValue() {
        return assessmentValue;
    }

    // Task 1c: Setters
    // Assessment Name needs to be from 20 letters max
    public boolean setAssessmentName(String newAssessmentName) {
        boolean retVal = false;
        if (newAssessmentName.length() > 0 && newAssessmentName.length()<=20) {
            assessmentName = newAssessmentName;
            retVal = true;
        }
        return retVal;
    }
    // must range from 0-100% & inclusive
    public boolean setAssessmentValue(int newAssessmentValue){
        boolean retVal = false;
        if (newAssessmentValue >= 0 && newAssessmentValue <= 100) {
            assessmentValue = newAssessmentValue;
            retVal = true;
        }
        return retVal;
        }


}
