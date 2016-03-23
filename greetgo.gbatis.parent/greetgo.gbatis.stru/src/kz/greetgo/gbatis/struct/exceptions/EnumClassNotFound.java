package kz.greetgo.gbatis.struct.exceptions;

import kz.greetgo.gbatis.struct.Place;

public class EnumClassNotFound extends SyntaxException {
  public final String enumClassName;
  public final Place place;

  public EnumClassNotFound(String enumClassName, Place place, ClassNotFoundException e) {
    super("enumClassName = " + enumClassName + ", place = " + place.placement(), e);
    this.enumClassName = enumClassName;
    this.place = place;
  }
}
