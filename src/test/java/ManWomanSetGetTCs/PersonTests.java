package ManWomanSetGetTCs;

import com.rd.dz.Man;
import com.rd.dz.Person;
import com.rd.dz.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PersonTests {
    Woman woman;
    Man man;
    @Parameters({
            "firstName",
            "lastName",
            "age",
            "partnerFirstName",
            "partnerLastName"
    })
    @BeforeClass
    public void preparePersons(String firstName, String lastName, int age, String partnerFirstName, String partnerLastName) {
        woman = new Woman(firstName, lastName, age, new Man(partnerFirstName, partnerLastName));
        man = new Man(firstName, lastName, age, new Woman(partnerFirstName, partnerLastName));
    }
    @Test
    public void testSetFirstName() {
        String updatedName = "UpdatedFirstName";
        man.setFirstName(updatedName);
        Assert.assertEquals(man.getFirstName(), updatedName, "incorrect  first name");
    }
    @Test
    public void testSetLastName() {
        String updatedName = "UpdatedLastName";
        man.setLastName(updatedName);
        Assert.assertEquals(man.getLastName(), updatedName, "incorrect  last name");
    }
    @Test
    public void testSetAge() {
        int updatedAge = 55;
        man.setAge(updatedAge);
        Assert.assertEquals(man.getAge(), updatedAge, "incorrect age name");
    }
    @Test
    public void testSetPartner_LastName() {
        String updatedPartnerLastName = "UpdatedPartner_LastName";
        man.setLastName(updatedPartnerLastName);
        Assert.assertEquals(man.getLastName(), updatedPartnerLastName, "partner has registerPartnership ");
    }

}
