import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class opiLab3Tests {
    private Dot dot;
    @Before
    public void create() {
        dot = new Dot();
    }
    @Test
    public void checkFirstQuadrant() {
        for (double r = 0; r <=3; r+=0.1 ) {
            for (double x = 0; x <= 20; x += 0.01) {
                for (double y = 0; y <= 20; y += 0.01) {
                    dot.setR(r);
                    dot.setX(x);
                    dot.setY(y);
                    dot.setResult(DotsBean.isInArea(dot));
                    if (y + 2 * x <= r) {
                        Assert.assertEquals(true, dot.getResult());
                    } else {
                        Assert.assertEquals(false, dot.getResult());
                    }
                }
            }
        }
    }

    @Test
    public void checkSecondQuadrant() {
        for (double r = 0.1; r <=3; r+=0.1 ) {
            for (double x = 0.1; x <= 20; x += 0.01) {
                for (double y = -0.1; y >= -20; y -= 0.01) {
                    dot.setR(r);
                    dot.setX(x);
                    dot.setY(y);
                    dot.setResult(DotsBean.isInArea(dot));
                    Assert.assertEquals(false, dot.getResult());

                }
            }
        }
    }
    @Test
    public void checkThirdQuadrant() {
        for (double r = 0.1; r <=3; r+=0.1 ) {
            for (double x = -0.1; x >= -20; x -= 0.01) {
                for (double y = -0.1; y >= -20; y -= 0.01) {
                    dot.setR(r);
                    dot.setX(x);
                    dot.setY(y);
                    dot.setResult(DotsBean.isInArea(dot));
                    if (y*y + x * x <= r* r) {
                        Assert.assertEquals(true, dot.getResult());
                    } else {
                        Assert.assertEquals(false, dot.getResult());
                    }
                }
            }
        }
    }
    @Test
    public void checkFourthQuadrant() {
        for (double r = 0; r <=3; r+=0.1 ) {
            for (double x = -0.1; x >= -20; x -= 0.01) {
                for (double y = 0; y <= 20; y += 0.01) {
                    dot.setR(r);
                    dot.setX(x);
                    dot.setY(y);
                    dot.setResult(DotsBean.isInArea(dot));
                    if (-x<= r && 2 * y <= r) {
                        Assert.assertEquals(true, dot.getResult());
                    } else {
                        Assert.assertEquals(false, dot.getResult());
                    }
                }
            }
        }
    }

}
