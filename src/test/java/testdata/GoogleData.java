package testdata;


import org.testng.annotations.DataProvider;

import java.util.Arrays;

public class GoogleData {
    @DataProvider(name="getSearchText", parallel = true)
    public static Object[][] getSearchText(){
     return new Object[][]{{"Key1", Arrays.asList("Something_1","Something_2")}};
    }
}
