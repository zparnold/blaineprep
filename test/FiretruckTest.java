import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiretruckTest extends Vehicle {
  private String ftSpeed;
  private String ft2Speed;

  @BeforeEach
  void setUp() {
    Firetruck ft = new Firetruck();
    ftSpeed = ft.performTask();
    Firetruck ft2 = new Firetruck(55);
    ft2Speed = ft2.performTask();
  }

  @Test
  void performTaskWithoutArgs() {
    assertEquals("60", ftSpeed);
  }

  @Test
  void performTaskWithArgs(){
    assertEquals("55", ft2Speed);
  }
}

class BullhornTest {
  private String bhDecibel;
  private String bh2Decibel;

  @BeforeEach
  void setUp() {
    Bullhorn bh = new Bullhorn();
    bhDecibel = bh.performTask();
  }

  @Test
  void performTask() {
    assertEquals("LOUD NOISE COMING AT DECIBEL: 100000000", bhDecibel);
  }
}