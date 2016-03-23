package kz.greetgo.gbatis.struct.exceptions;

import kz.greetgo.gbatis.struct.ParsedType;

public class DuplicateType extends SyntaxException {
  public final ParsedType currentType;
  public final ParsedType alreadyExistsType;

  public DuplicateType(ParsedType currentType, ParsedType alreadyExistsType) {
    super(currentType.name + ", currentTypePlace = " + currentType.placement()
      + ", alreadyExistsTypePlace = " + alreadyExistsType.placement());
    this.currentType = currentType;
    this.alreadyExistsType = alreadyExistsType;
  }
}
