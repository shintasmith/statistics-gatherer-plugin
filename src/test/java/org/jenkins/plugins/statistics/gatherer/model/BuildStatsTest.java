package org.jenkins.plugins.statistics.gatherer.model;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by mcharron on 2016-06-29.
 */
public class BuildStatsTest {

    private static final String CI_URL = "http://url.com";
    private static final String JOB_NAME = "JOB";
    private static final String FULL_JOB_NAME = "FULLJOB";
    private static final String STARTED_USER_ID = "USER";
    private static final String STARTED_USER_NAME = "USERNAME";
    private static final String RESULT = "SUCCESS";
    private static final int NUMBER = 1;
    private static final Date START_TIME = new Date(0);
    private static final Date END_TIME = new Date(1000000);
    private static final long DURATION = 123456;
    private static final long QUEUE_TIME = 12345678;
    private static final SlaveInfo SLAVE_INFO = new SlaveInfo();
    private static final SCMInfo SCM_INFO = new SCMInfo();
    private static final Map<String, String> PARAMETERS = new HashMap<String, String>();
    private BuildStats buildStats;

    @Before
    public void initBaseObject() {
        buildStats = new BuildStats(CI_URL,
                JOB_NAME,
                FULL_JOB_NAME,
                NUMBER,
                SLAVE_INFO,
                START_TIME,
                END_TIME,
                STARTED_USER_ID,
                STARTED_USER_NAME,
                RESULT,
                DURATION,
                PARAMETERS,
                SCM_INFO,
                QUEUE_TIME);
    }

    @Test
    public void givenNothing_whenConstruct_thenValuesAreSet(){
        //when
        BuildStats buildStats = new BuildStats();
        //then
        Date compareDate =new Date();
        assertTrue(buildStats.getStartTime().before(compareDate)|| buildStats.getStartTime().equals(compareDate));
        assertTrue(buildStats.getEndTime().before(compareDate)|| buildStats.getEndTime().equals(compareDate));
        assertEquals("", buildStats.getCiUrl());
        assertEquals("", buildStats.getJobName());
        assertEquals("", buildStats.getFullJobName());
        assertEquals(0, buildStats.getNumber());
        assertEquals("", buildStats.getSlaveInfo().getSlaveName());
        assertEquals("", buildStats.getStartedUserId());
        assertEquals("", buildStats.getStartedUserName());
        assertEquals("", buildStats.getResult());
        assertEquals(0, buildStats.getDuration());
        assertEquals(new HashMap<String,String>(), buildStats.getParameters());
        assertEquals("", buildStats.getScmInfo().getUrl());
        assertEquals(0, buildStats.getQueueTime());
    }

    @Test
    public void givenStatsBuild_whenGetCiUrl_thenReturnCiUrl() {
        //given

        //when
        String ciUrl = buildStats.getCiUrl();

        //then
        assertEquals(CI_URL, ciUrl);
    }

    @Test
    public void givenStatsBuild_whenSetCiUrl_thenCiUrlIsSet() {
        //given
        String expectedCiUrl = "IHazCiUrl!";
        //when
        buildStats.setCiUrl(expectedCiUrl);

        //then
        String actualCiUrl = buildStats.getCiUrl();
        assertEquals(expectedCiUrl, actualCiUrl);
    }

    @Test
    public void givenStatsBuild_whenGetJobName_thenReturnJobName() {
        //given

        //when
        String jobName = buildStats.getJobName();

        //then
        assertEquals(JOB_NAME, jobName);
    }

    @Test
    public void givenStatsBuild_whenSetJobName_thenJobNameIsSet() {
        //given
        String expectedJobName = "IHazJobName!";
        //when
        buildStats.setJobName(expectedJobName);

        //then
        String actualJobName = buildStats.getJobName();
        assertEquals(expectedJobName, actualJobName);
    }

    @Test
    public void givenStatsBuild_whenGetFullJobName_thenReturnFullJobName() {
        //given

        //when
        String fullJobName = buildStats.getFullJobName();

        //then
        assertEquals(FULL_JOB_NAME, fullJobName);
    }

    @Test
    public void givenStatsBuild_whenSetFullJobName_thenFullJobNameIsSet() {
        //given
        String expectedFullJobName = "IHazFullJobName!";
        //when
        buildStats.setFullJobName(expectedFullJobName);

        //then
        String actualFullJobName = buildStats.getFullJobName();
        assertEquals(expectedFullJobName, actualFullJobName);
    }

    @Test
    public void givenStatsBuild_whenGetStartedUserId_thenReturnStartedUserId() {
        //given

        //when
        String startedUserId = buildStats.getStartedUserId();

        //then
        assertEquals(STARTED_USER_ID, startedUserId);
    }

    @Test
    public void givenStatsBuild_whenSetStartedUserId_thenStartedUserIdIsSet() {
        //given
        String expectedStartedUserId = "IHazStartedUserId!";
        //when
        buildStats.setStartedUserId(expectedStartedUserId);

        //then
        String actualStartedUserId = buildStats.getStartedUserId();
        assertEquals(expectedStartedUserId, actualStartedUserId);
    }

    @Test
    public void givenStatsBuild_whenGetStartedUserName_thenReturnStartedUserName() {
        //given

        //when
        String startedUserName = buildStats.getStartedUserName();

        //then
        assertEquals(STARTED_USER_NAME, startedUserName);
    }

    @Test
    public void givenStatsBuild_whenSetStartedUserName_thenStartedUserNameIsSet() {
        //given
        String expectedStartedUserName = "IHazStartedUserName!";
        //when
        buildStats.setStartedUserName(expectedStartedUserName);

        //then
        String actualStartedUserName = buildStats.getStartedUserName();
        assertEquals(expectedStartedUserName, actualStartedUserName);
    }

    @Test
    public void givenStatsBuild_whenGetResult_thenReturnResult() {
        //given

        //when
        String result = buildStats.getResult();

        //then
        assertEquals(RESULT, result);
    }

    @Test
    public void givenStatsBuild_whenSetResult_thenResultIsSet() {
        //given
        String expectedResult = "IHazResult!";
        //when
        buildStats.setResult(expectedResult);

        //then
        String actualResult = buildStats.getResult();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenStatsBuild_whenGetNumber_thenReturnNumber() {
        //given

        //when
        int number = buildStats.getNumber();

        //then
        assertEquals(NUMBER, number);
    }

    @Test
    public void givenStatsBuild_whenSetNumber_thenNumberIsSet() {
        //given
        int expectedNumber = 123456789;
        //when
        buildStats.setNumber(expectedNumber);

        //then
        int actualNumber = buildStats.getNumber();
        assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void givenStatsBuild_whenGetDuration_thenReturnDuration() {
        //given

        //when
        long Duration = buildStats.getDuration();

        //then
        assertEquals(DURATION, Duration);
    }

    @Test
    public void givenStatsBuild_whenSetDuration_thenDurationIsSet() {
        //given
        long expectedDuration = 123456789;
        //when
        buildStats.setDuration(expectedDuration);

        //then
        long actualDuration = buildStats.getDuration();
        assertEquals(expectedDuration, actualDuration);
    }

    @Test
    public void givenStatsBuild_whenGetQueueTime_thenReturnQueueTime() {
        //given

        //when
        long queueTime = buildStats.getQueueTime();

        //then
        assertEquals(QUEUE_TIME, queueTime);
    }

    @Test
    public void givenStatsBuild_whenSetQueueTime_thenQueueTimeIsSet() {
        //given
        long expectedQueueTime = 123456789;
        //when
        buildStats.setQueueTime(expectedQueueTime);

        //then
        long actualQueueTime = buildStats.getQueueTime();
        assertEquals(expectedQueueTime, actualQueueTime);
    }

    @Test
    public void givenStatsBuild_whenGetSlaveInfo_thenReturnSlaveInfo() {
        //given

        //when
        SlaveInfo slaveInfo = buildStats.getSlaveInfo();

        //then
        assertEquals(SLAVE_INFO, slaveInfo);
    }

    @Test
    public void givenStatsBuild_whenSetSlaveInfo_thenSlaveInfoIsSet() {
        //given
        SlaveInfo expectedSlaveInfo = new SlaveInfo();
        //when
        buildStats.setSlaveInfo(expectedSlaveInfo);

        //then
        SlaveInfo actualSlaveInfo = buildStats.getSlaveInfo();
        assertEquals(expectedSlaveInfo, actualSlaveInfo);
    }

    @Test
    public void givenStatsBuild_whenGetSCMInfo_thenReturnSCMInfo() {
        //given

        //when
        SCMInfo scmInfo = buildStats.getScmInfo();

        //then
        assertEquals(SCM_INFO, scmInfo);
    }

    @Test
    public void givenStatsBuild_whenSetSCMInfo_thenSCMInfoIsSet() {
        //given
        SCMInfo expectedSCMInfo = new SCMInfo();
        //when
        buildStats.setScmInfo(expectedSCMInfo);

        //then
        SCMInfo actualSCMInfo = buildStats.getScmInfo();
        assertEquals(expectedSCMInfo, actualSCMInfo);
    }

    @Test
    public void givenStatsBuild_whenGetStartTime_thenReturnStartTime() {
        //given

        //when
        Date startTime = buildStats.getStartTime();

        //then
        assertEquals(START_TIME, startTime);
    }

    @Test
    public void givenStatsBuild_whenSetStartTime_thenStartTimeIsSet() {
        //given
        Date expectedStartTime = new Date();
        //when
        buildStats.setStartTime(expectedStartTime);

        //then
        Date actualStartTime = buildStats.getStartTime();
        assertEquals(expectedStartTime, actualStartTime);
    }

    @Test
    public void givenStatsBuild_whenGetEndTime_thenReturnEndTime() {
        //given

        //when
        Date endTime = buildStats.getEndTime();

        //then
        assertEquals(END_TIME, endTime);
    }

    @Test
    public void givenStatsBuild_whenSetEndTime_thenEndTimeIsSet() {
        //given
        Date expectedEndTime = new Date();
        //when
        buildStats.setEndTime(expectedEndTime);

        //then
        Date actualEndTime = buildStats.getEndTime();
        assertEquals(expectedEndTime, actualEndTime);
    }

    @Test
    public void givenStatsBuild_whenGetParameters_thenReturnParameters() {
        //given

        //when
        Map<String, String>  Parameters = buildStats.getParameters();

        //then
        assertEquals(PARAMETERS, Parameters);
    }

    @Test
    public void givenStatsBuild_whenSetParameters_thenParametersIsSet() {
        //given
        Map<String, String>  expectedParameters = new HashMap<String, String>();
        expectedParameters.put("aKey", "something");
        //when
        buildStats.setParameters(expectedParameters);

        //then
        Map<String, String> actualParameters = buildStats.getParameters();
        assertEquals(expectedParameters, actualParameters);
    }
}