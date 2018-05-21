package com.asaf.maoz.playground.autowirefromtestmockito;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class UserActionsTests {

    private static final String DEF_USER_NAME = "userNameTest";

    @InjectMocks
    UserActions userActions;

    @Mock
    UserRepository userRepository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test(expected = Exception.class)
    public void emptyUserName_exception() throws Exception {
        this.userActions.addUser("");
    }

    @Test
    public void addUser() throws Exception {
        this.userActions.addUser(DEF_USER_NAME);
    }
}
