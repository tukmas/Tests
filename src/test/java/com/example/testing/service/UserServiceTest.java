package com.example.testing.service;

import com.example.testing.Repository.Impl.UserDaoImpl;
import com.example.testing.service.Impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserDaoImpl daoMock;
    @InjectMocks
    private UserServiceImpl out;


    @Test
    public void shouldReturnTrueIfUserExist() {
        when(daoMock.getUserByName("Vitaly"))
                .thenReturn("Vitaly");
        assertTrue(out.checkUserExist("Vitaly"));
        verify(daoMock, times(1)).getUserByName("Vitaly");
    }

    @Test
    public void shouldReturnFalseIfUserNotExist() {
        when(daoMock.getUserByName("Ivan"))
                .thenReturn(null);
        assertFalse(out.checkUserExist("Ivan"));
        verify(daoMock, times(1)).getUserByName("Ivan");
    }
}