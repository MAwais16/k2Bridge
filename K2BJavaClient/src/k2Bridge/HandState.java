/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package k2Bridge;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum HandState implements org.apache.thrift.TEnum {
  CLOSED(0),
  OPEN(1),
  LASSO(2);

  private final int value;

  private HandState(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static HandState findByValue(int value) { 
    switch (value) {
      case 0:
        return CLOSED;
      case 1:
        return OPEN;
      case 2:
        return LASSO;
      default:
        return null;
    }
  }
}
