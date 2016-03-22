package kz.greetgo.gbatis.struct.resource;

import java.io.InputStream;

public interface ResourceRef {
  InputStream getInputStream();

  ResourceRef change(String path);
}
