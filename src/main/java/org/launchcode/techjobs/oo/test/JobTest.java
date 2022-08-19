package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {


    @Test
    public void testSettingJobId () {

        Job o = new Job();
        Job a = new Job();
        assertNotEquals(o, a);
    }

    @Test
    public void testJobConstructorSetsAllFields () {
        Job constructorSetsFields = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(constructorSetsFields instanceof Job);
        assertEquals("Product tester", constructorSetsFields.getName());
        assertTrue(constructorSetsFields.getEmployer() instanceof Employer);
        assertEquals("ACME", constructorSetsFields.getEmployer().getValue());
        assertTrue(constructorSetsFields.getLocation() instanceof Location);
        assertEquals("Desert", constructorSetsFields.getLocation().getValue());
        assertTrue(constructorSetsFields.getPositionType() instanceof PositionType);
        assertEquals("Quality control", constructorSetsFields.getPositionType().getValue());
        assertTrue(constructorSetsFields.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", constructorSetsFields.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality () {
        Job jobEquality1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Job jobEquality2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(jobEquality1, jobEquality2);

    }

}
