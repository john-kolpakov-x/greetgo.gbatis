package kz.greetgo.gbatis.struct;

import java.util.ArrayList;
import java.util.List;

public class ParsedType {

  public String name, type, comment;

  public final List<ParsedField> fieldList = new ArrayList<>();
}
