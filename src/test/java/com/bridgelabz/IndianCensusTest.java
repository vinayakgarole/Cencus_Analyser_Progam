package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IndianCensusTest {

    private static final String INDIA_CENSUS_CSV_FILE_PATH = "C:\\Users\\Infinty system\\IdeaProjects\\Cencus_Analyser_Program\\src\\test\\resources\\IndianCensusStateData.csv";
    public IndianCensusAnalyser analyser;
    private static final String INDIAN_CSV_STATE_PATH = "C:\\Users\\Infinty system\\IdeaProjects\\Cencus_Analyser_Program\\src\\test\\resources\\IndianCensusStateData.csv";


    @Test
    public void returnSize() throws Exception {
        try {
            Assertions.assertEquals(29, analyser.loadCensusData(INDIA_CENSUS_CSV_FILE_PATH));
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldExecuteProperly_IfRecordsAreEqual() throws Exception {
        try {
            Assertions.assertEquals(29, analyser.loadCensusData(INDIA_CENSUS_CSV_FILE_PATH));
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnRecordsif_CSVFileIsDetected() throws Exception {
        try {
            Assertions.assertEquals(29, analyser.loadCensusData(INDIA_CENSUS_CSV_FILE_PATH));
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnCustomException_ifDelimiterIncorrect() throws Exception {
        try {
            Assertions.assertEquals(29, analyser.loadCensusData(INDIA_CENSUS_CSV_FILE_PATH));
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturCustomException_ifCSVHeaderIncorrect() throws Exception {
        try {
            Assertions.assertEquals(29, analyser.loadCensusData(INDIA_CENSUS_CSV_FILE_PATH));
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }


//	State

    @Test
    public void returnSizeState() throws Exception {
        try {

            Assertions.assertEquals(37, analyser.loadStateData(INDIAN_CSV_STATE_PATH));
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldExecuteProperly_IfRecordsAreEqualState() throws Exception {
        try {
            Assertions.assertEquals(37, analyser.loadStateData(INDIAN_CSV_STATE_PATH));
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnRecordsif_CSVFileIsDetectedState() throws Exception {
        try {
            Assertions.assertEquals(37, analyser.loadStateData("xyz.csv"));
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnCustomException_ifDelimiterIncorrectState() throws Exception {
        try {

            Assertions.assertEquals(37, analyser.loadStateData(INDIAN_CSV_STATE_PATH));
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldRetureCustomException_ifCSVHeaderIncorrectState() throws Exception {
        try {
            Assertions.assertEquals(37, analyser.loadStateData(INDIA_CENSUS_CSV_FILE_PATH));
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
}