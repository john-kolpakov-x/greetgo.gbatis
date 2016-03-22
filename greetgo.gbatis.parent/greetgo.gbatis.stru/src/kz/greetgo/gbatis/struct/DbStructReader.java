package kz.greetgo.gbatis.struct;

import kz.greetgo.gbatis.struct.resource.ResourceRef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class DbStructReader {

  private DbStructReader() {
  }

  private final DbStruct dbStruct = new DbStruct();

  public static DbStruct read(ResourceRef ref) {

    DbStructReader reader = new DbStructReader();

    try {
      reader.readFrom(ref);
    } catch (Exception e) {
      if (e instanceof RuntimeException) throw (RuntimeException) e;
      throw new RuntimeException(e);
    }

    return reader.dbStruct;
  }

  private final List<String> lines = new ArrayList<>();

  private static final Pattern INCLUDE = Pattern.compile("\\s*@\\s*include\\s+(\\S+)\\s*(#.*)?");

  private void readFrom(ResourceRef ref) throws Exception {
    final List<String> lines = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new InputStreamReader(ref.getInputStream(), "UTF-8"))) {
      while (true) {
        String line = br.readLine();
        if (line == null) break;
        lines.add(line);
      }
    }

    for (String line : lines) {

    }
  }

}
