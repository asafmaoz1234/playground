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


}
