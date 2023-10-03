package org.launchcode.techjobs.oo;

import static org.junit.Assert.*;
import static org.testng.AssertJUnit.assertTrue;
import org.junit.Test;

public class JobTest {

    @Test // #1 - Empty constructor
    public void testSettingJobId() {
        Job jobA = new Job();
        Job jobB = new Job();
        assertNotEquals(jobA.getId(), jobB.getId());
    }

    @Test // #2 - Full constructor
    public void testJobConstructorSetsAllFields () {
        Job job = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertTrue(true);
        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test // #3 - Test for equality
    public void testJobForEquality () {
        Job jobA = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job jobB = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertFalse(jobA.equals(jobB));
    }

    @Test // #4 - String starts and ends w/ new line
    public void testToStringStartsAndEndsWithNewLine () {
        Job job = new Job();
        String result = job.toString();
        assertEquals(true, result.startsWith(System.lineSeparator()));
        assertEquals(true, result.endsWith(System.lineSeparator()));
    }

    @Test // #5 - Entry has all correct data
    public void testToStringContainsCorrectLabelsAndData () {
        Job job = new Job("Product Tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality Control"),
                new CoreCompetency("Persistence"));
        String result = job.toString();
        String expected = System.lineSeparator() +
                "ID: " + job.getId() + System.lineSeparator() +
                "Name: Product Tester" + System.lineSeparator() +
                "Employer: ACME" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Quality Control" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator();
        assertEquals(expected, result);
    }

}
