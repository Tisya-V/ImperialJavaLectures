package lectrue4;

public class Lamp {
  protected boolean isOn;

  public Lamp(boolean isOn) {
    this.isOn = isOn;
  }

  public void pressSwitch() {
    isOn = !isOn;
  }

  public String toString() {
    return "Lamp("
        + (isOn ? "on" : "off")
        + ")";
  }
}

final class AdjustableLamp extends Lamp {
  public static final int MIN_BRIGHTNESS = 0;
  public static final int MAX_BRIGHTNESS = 10;

  private int brightness;

  public AdjustableLamp(boolean isOn) {
    super(isOn);
    brightness = digitalOnOff();
  }

  @Override
  public void pressSwitch() {
    super.pressSwitch();
    brightness = digitalOnOff();
  }

  private int digitalOnOff() {
    return isOn ? MAX_BRIGHTNESS : MIN_BRIGHTNESS;
  }

  public void dim() {
    if (isOn && brightness > 1)
      brightness--;
  }

  @Override
  public String toString() {
    return "AdjustableLamp(" +
        (isOn ? "on" : "off") +
        ", " + brightness + ")";
  }
}

