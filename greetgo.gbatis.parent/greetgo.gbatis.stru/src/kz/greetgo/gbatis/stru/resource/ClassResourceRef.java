package kz.greetgo.gbatis.stru.resource;

import java.io.InputStream;

public class ClassResourceRef implements ResourceRef {

  private final Class<?> aClass;
  private final String path;

  private ClassResourceRef(Class<?> aClass, String path) {
    this.aClass = aClass;
    this.path = path;
  }

  public static ResourceRef create(Class<?> aClass, String path) {
    return new ClassResourceRef(aClass, path);
  }

  @Override
  public InputStream getInputStream() {
    return aClass.getResourceAsStream(path);
  }

  @Override
  public ResourceRef change(String path) {
    if (path.startsWith("/")) return create(aClass, path);

    final int lastSlash = this.path.lastIndexOf('/');
    if (lastSlash < 0) return create(aClass, path);

    return create(aClass, this.path.substring(0, lastSlash + 1) + path);
  }
}
