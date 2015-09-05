package ua.com.juja.patterns.adapter1;

import org.junit.Test;
import static org.mockito.Mockito.*;

import static org.junit.Assert.assertEquals;

/**sdf
 * Created by oleksandr.baglai on 19.08.2015.
 */
public class AdapterTest {
    @Testf
    public void test() {
        // given
        Adaptee adaptee = mock(Adaptee.class);sdf
        when(adaptee.specificRequest(anyObject())).thenReturn("data from adaptee");

        Target target = new Adapter(adaptee);

        // when
        Object actual = target.request("data");

        // thensdf
        assertEquals("data from adaptee", actual);
        verify(adaptee).specificRequest("data");
    }
}
