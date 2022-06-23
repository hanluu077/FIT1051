public class UnitDriver {
    public static void main(String[] args) {

        // Task 5: toString method
        System.out.println("=====ToString Method=====");
        Unit u1 = new Unit("FIT1051", 6, "Faculty of IT", true);
        System.out.println(u1.toString());

        //Task 6: Custom Credit Hour
        System.out.println("\n=====Custom Credit Hour=====");
        u1.customCreditHour("FIT1051", 6);
        System.out.println("Unit Code: " + u1.getCustomCreditHour() + "\n");

        u1.customCreditHour("FIT1051", 12);
        System.out.println("Unit Code: " + u1.getCustomCreditHour()+ "\n");

        u1.customCreditHour("MED2001", 12);
        System.out.println("Unit Code: " + u1.getCustomCreditHour());


        // Task 7: Successful and Unsuccessful attempt

        System.out.println("\n=====Successful Attempt=====");

        Unit u2 = new Unit();
        u2.setUnitCode("FIT1051");
        u2.setOfferFaculty("Faculty of IT");
        u2.setCreditHour(6);
        u2.setOfferedThisSemester(true);

        System.out.println("Unit Code: " + u2.getUnitCode());
        System.out.println("Offered Faculty: " + u2.getOfferFaculty());
        System.out.println("Credit Hour: " + u2.getCreditHour());
        System.out.println("Offered this semester?: " + u2.getOfferedThisSemester());

        System.out.println("\n=====Unsuccessful Attempt=====");

        Unit u3 = new Unit();
        u3.setUnitCode("");
        u3.setOfferFaculty("");
        u3.setCreditHour(111);
        u3.setOfferedThisSemester(true);

        System.out.println("Unit Code: " + u3.getUnitCode());
        System.out.println("Offered Faculty: " + u3.getOfferFaculty());
        System.out.println("Credit Hour: " + u3.getCreditHour());
        System.out.println("Offered this Semester?: " + u3.getOfferedThisSemester());

    }
}
