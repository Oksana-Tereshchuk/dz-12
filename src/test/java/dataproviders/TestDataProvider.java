package dataproviders;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
    @DataProvider(name="Age")
    public static Object[][] Age(){
        return new Object[][] {{58}};
    }
    @DataProvider(name="updatedPartnerLastName")
    public static Object[][] updatedPartnerLastName(){
        return new Object[][] {{"UpdatedName"}};
    }
}
