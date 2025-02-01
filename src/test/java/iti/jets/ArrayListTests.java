package iti.jets;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import java.util.ArrayList;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ArrayListTests {
    @Mock
    ArrayList<String> mockedList;
    @Test
    void testArrayListLength(){
        when(mockedList.size()).thenReturn(20).thenReturn(50);// Stups
        assertEquals(20, mockedList.size());
        assertEquals(50, mockedList.size());
        verify(mockedList, times(2)).size(); // spy
    }
    @Test
    void getNameByID(){
        when(mockedList.get(10)).thenReturn("Ahmed");
        assertEquals("Ahmed", mockedList.get(10));
    }

}
