import java.awt.*;

import org.junit.Before;
import org.testng.*;

import main.pojos.*;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarTest {
    Car carWithForeignPermission=new Car();

    @Before
    public void setUp()
    {
        this.carWithForeignPermission.setName("Audi A4");
        this.carWithForeignPermission.setAge(6);
        this.carWithForeignPermission.setColor(Color.BLACK);
        this.carWithForeignPermission.setProperties(Arrays.asList("Automatic gear","Tempomat","Three zoned air-conditioning","XENON"));
        this.carWithForeignPermission.setOkayToAbroad(true);

    }
}
