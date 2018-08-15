package com.asaf.maoz.playground;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GeneralTests {

    @Test
    public void runAllTests() {
    }

    @Test
    public void convertUnixTstampToDate(){
        //2017-04-26 03:01
        long timeStamp = 1529412564;
        String tm = new SimpleDateFormat("yyyy-MM-dd HH:mm")
                .format(new Date(timeStamp*1000));
        assertThat(tm, is(equalTo("2018-06-19 15:49")));
    }

    @Test
    public void convertUnixTstampToUTCDate(){
        long timeStamp = 1529412564;
        SimpleDateFormat jdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        jdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String tm = jdf.format(new Date(timeStamp*1000));
        assertThat(tm, is(equalTo("2018-06-19 12:49")));
    }

    @Test
    public void convertArrToList() {
        List<String> listStrings = Arrays.asList(new String[]{"one", "two"});
        assertThat(listStrings, is(equalTo(Arrays.asList(new String[]{"one", "two"}))));
    }

    @Test(expected = NullPointerException.class)
    public void convertNullToList() {
        List<String> list = Arrays.asList(null);
    }

    @Test
    public void convertEmptyToList() {
        List<String> list = Arrays.asList(new String[]{});
        assertThat(list, is(equalTo(Collections.emptyList())));
    }

    @Test
    public void stringBufferSubString() {
        int maxLength = 400;
        StringBuilder downloadFailure = new StringBuilder();
        downloadFailure.append("Another difference between them is that, If both \"==\" and equals() is used to compare objects than == returns true only if both references points to same object while equals() can return true or false based on its overridden implementation.One of the popular cases is comparing two String in Java in which case == and ");

        String reasonFromFunc = this.extractReason(downloadFailure, maxLength);
        String reasonFromWTF = downloadFailure != null ? (downloadFailure.substring(0, downloadFailure.length() > maxLength ? maxLength : downloadFailure.length())) : "";
        assertThat(reasonFromFunc, is(equalTo(reasonFromWTF)));

        maxLength = 20;
        reasonFromFunc = this.extractReason(downloadFailure, maxLength);
        reasonFromWTF = downloadFailure != null ? (downloadFailure.substring(0, downloadFailure.length() > maxLength ? maxLength : downloadFailure.length())) : "";
        assertThat(reasonFromFunc, is(equalTo(reasonFromWTF)));
        System.out.println(reasonFromFunc);

    }

    private String extractReason(StringBuilder downloadFailure, int maxLength) {
        String reason;
        if (downloadFailure == null) {
            return "";
        }

        int endLocationOfReason = maxLength;
        if(downloadFailure.length() < maxLength) {
            endLocationOfReason = downloadFailure.length();
        }
        reason = downloadFailure.substring(0, endLocationOfReason);
        return reason;
    }
}
