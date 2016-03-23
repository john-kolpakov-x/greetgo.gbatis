package kz.greetgo.gbatis.struct.exceptions;

import kz.greetgo.gbatis.struct.Place;

public class NoCurrentTypeToAddField extends SyntaxException {
  public final String fieldName;
  public final Place place;

  public NoCurrentTypeToAddField(String fieldName, Place place) {
    super(fieldName + " at " + place.placement());
    this.fieldName = fieldName;
    this.place = place;
  }
}
