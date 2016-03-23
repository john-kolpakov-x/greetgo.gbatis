package kz.greetgo.gbatis.struct.exceptions;

import kz.greetgo.gbatis.struct.Place;

public class UnknownLine extends SyntaxException {
  public final String line;
  public final Place place;

  public UnknownLine(String line, Place place) {
    super(place.placement() + ", line [[" + line + "]]");
    this.line = line;
    this.place = place;
  }
}
