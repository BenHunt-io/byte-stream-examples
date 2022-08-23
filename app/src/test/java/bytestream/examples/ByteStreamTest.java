package bytestream.examples;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

public class ByteStreamTest {


    @Test
    void byteStreamTest(){

        byte[] bytes = new byte[] {1, 2, 3, 4};
        ByteArrayInputStream byteInputStream = new ByteArrayInputStream(bytes);

        byte[] resultOne = new byte[2];
        byte[] resultTwo = new byte[2];
        byteInputStream.read(resultOne, 0, 2);
        byteInputStream.read(resultTwo, 0, 2);

        assertArrayEquals(resultOne, new byte[]{1,2});
        assertArrayEquals(resultTwo, new byte[]{3,4});
    }
    
} 
