package ua.kpi.fict;

/*
 * Created by Yevhenii Milashevskyi by 06.02.2019
 *
 */
public class Model {

    private String resultString;

    public Model() {
        resultString = "";
    }

    //Business logic

    public void createResult(String str1, String str2) {
        resultString = str1 + " " + str2;
    }

    public String getResult() {
        return resultString;
    }


}
