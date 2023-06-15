package ManWomanTestcases;

import com.rd.dz.Man;
import com.rd.dz.Woman;
import dataproviders.TestDataProvider;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ManTests {
    Man man = new Man("Peter","Nelson",65,new Woman("Nelly","Nelson"));
    //Man man;
    //@Parameters({
            //"firstName",
            //"lastName",
            //"age",
            //"partnerFirstName",
            //"partnerLastName"
    //})

    //@BeforeClass
    //public void prepareWoman(String firstName, String lastName, int age, String partnerFirstName, String partnerLastName) {
        //woman = new Woman(firstName, lastName, age, new Man(partnerFirstName, partnerLastName));
        //man = new Man(firstName, lastName, age, new Woman(partnerFirstName, partnerLastName));
    //}
    @Test(dataProvider = "Age",dataProviderClass = TestDataProvider .class)
    public void testIsManRetired(int ageRetired) {
        //int ageRetired = 58;
        man.setAge(ageRetired);
        Assert.assertEquals(man.getAge(), ageRetired, "Woman is not retired");
    }
    @Test(dataProvider = "Age",dataProviderClass = TestDataProvider.class)
    public void testIsNotManRetired(int ageRetired) {
        //int ageRetired = 62;
        man.setAge(ageRetired);
        Assert.assertEquals(man.getAge(), ageRetired, "Woman is retired");
    }
}
