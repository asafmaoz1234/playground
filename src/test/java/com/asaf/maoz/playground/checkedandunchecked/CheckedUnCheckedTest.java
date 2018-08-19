package com.asaf.maoz.playground.checkedandunchecked;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

//Created a simple checked and un checked exception to show usage differences.

public class CheckedUnCheckedTest {

    private String errorMessage;
    private Integer errorCode;
    @Before
    public void setUp() throws Exception {
        this.errorCode = 40;
        this.errorMessage = "exception throwen";
    }
    //no need to declare the exception
    @Test(expected = UnCheckedException.class)
    public void test_unCheckedExceptionThrown() {
        throw new UnCheckedException(this.getErrorMessage(), this.getErrorCode());
    }

    @Test
    public void test_unCheckedExceptionCaught() {
        try {
            throw new UnCheckedException(this.getErrorMessage(), this.getErrorCode());
        } catch (UnCheckedException e) {
            assertThat(e.getExceptionMessage(), is(equalTo(this.getErrorMessage())));
            assertThat(e.getExceptionCode(), is(equalTo(this.getErrorCode())));
        }
    }

    //need to declare exception
    @Test (expected = CheckedException.class)
    public void test_checkedExceptionThrown() throws CheckedException {
        throw new CheckedException(this.getErrorMessage(), this.getErrorCode());
    }

    @Test
    public void test_checkedExceptionCaught() {
        try {
            throw new CheckedException(this.getErrorMessage(), this.getErrorCode());
        } catch (CheckedException e) {
            assertThat(e.getExceptionMessage(), is(equalTo(this.getErrorMessage())));
            assertThat(e.getExceptionCode(), is(equalTo(this.getErrorCode())));
        }
    }


    public String getErrorMessage() {
        return errorMessage;
    }

    public Integer getErrorCode() {
        return errorCode;
    }
}
