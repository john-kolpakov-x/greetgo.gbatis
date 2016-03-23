package kz.greetgo.gbatis.struct.exceptions;

import kz.greetgo.gbatis.struct.Place;

public class AliasAlreadyDefined extends SyntaxException {
  public final String name;
  public final Place currentPlace;
  public final Place alreadyExistsPlace;

  public AliasAlreadyDefined(String name, Place currentPlace, Place alreadyExistsPlace) {
    super("name = " + name + ", currentPlace = " + currentPlace.placement()
      + ", alreadyExistsPlace = " + alreadyExistsPlace.placement());
    this.name = name;
    this.currentPlace = currentPlace;
    this.alreadyExistsPlace = alreadyExistsPlace;
  }
}
