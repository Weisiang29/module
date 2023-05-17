package sg.edu.rp.c346.mymodules;

public class Module{
    String moduleCode;
    String moduleName;
    int moduleYear;
    int moduleSem;
    double moduleCredit;
    String moduleVenue;
    public Module(String code, String name, int year, int sem, double credit,String venue){
        moduleCode=code;
        moduleName=name;
        moduleYear=year;
        moduleSem=sem;
        moduleCredit=credit;
        moduleVenue=venue;

    }
    public Module(String code, String name, int year, int sem){
        moduleCode=code;
        moduleName=name;
        moduleYear=year;
        moduleSem=sem;


    }

}
