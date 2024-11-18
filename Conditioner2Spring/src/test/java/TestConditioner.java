import com.example.Conditioner2Spring.Conditioner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestConditioner {
    @Test
    public void testHeat1(){
        Assertions.assertEquals(20, Conditioner.heat(10, 20));
    }
    @Test
    public void testHeat2(){
        Assertions.assertEquals(30, Conditioner.heat(30, 20));
    }

    @Test
    public void testHeat3(){
        Assertions.assertEquals(0, Conditioner.heat(0, 0));
    }

    @Test
    public void testFreeze1(){
        Assertions.assertEquals(10, Conditioner.freeze(10, 20));
    }
    @Test
    public void testFreeze2(){
        Assertions.assertEquals(20, Conditioner.freeze(30, 20));
    }

    @Test
    public void testFreeze3(){
        Assertions.assertEquals(0, Conditioner.freeze(0, 0));
    }

    @Test
    public void testResultT1() throws Exception {
        Assertions.assertEquals(20, Conditioner.getResultTemp(10, 20, "heat"));
    }

    @Test
    public void testResultT2() throws Exception {
        Assertions.assertEquals(10, Conditioner.getResultTemp(10, 20, "freeze"));
    }

    @Test
    public void testResultT3() throws Exception {
        Assertions.assertEquals(20, Conditioner.getResultTemp(10, 20, "auto"));
    }

    @Test
    public void testResultT4() throws Exception {
        Assertions.assertEquals(10, Conditioner.getResultTemp(10, 20, "fan"));
    }

    @Test
    public void testResultT5() throws Exception {
        Assertions.assertEquals(30, Conditioner.getResultTemp(30, 20, "heat"));
    }

    @Test
    public void testResultT6() throws Exception {
        Assertions.assertEquals(20, Conditioner.getResultTemp(30, 20, "freeze"));
    }

    @Test
    public void testResultT7() throws Exception {
        Assertions.assertEquals(20, Conditioner.getResultTemp(30, 20, "auto"));
    }

    @Test
    public void testResultT8() throws Exception {
        Assertions.assertEquals(30, Conditioner.getResultTemp(30, 20, "fan"));
    }

    @Test
    public void testResultT9() throws Exception {
        Assertions.assertEquals(0, Conditioner.getResultTemp(0, 0, "heat"));
    }

    @Test
    public void testResultT10() throws Exception {
        Assertions.assertEquals(0, Conditioner.getResultTemp(0, 0, "freeze"));
    }

    @Test
    public void testResultT11() throws Exception {
        Assertions.assertEquals(0, Conditioner.getResultTemp(0, 0, "auto"));
    }

    @Test
    public void testResultT12() throws Exception {
        Assertions.assertEquals(0, Conditioner.getResultTemp(0, 0, "fan"));
    }

    @Test
    public void testResultT13(){
        //Assertions.assertEquals(0, Conditioner.getResultTemp(0, 0, "Vasya"));
        Assertions.assertThrows(Exception.class, ()->Conditioner.getResultTemp(0, 0, "Vasya"));
    }
}
