package kz.greetgo.gbatis.stru.resource;

import java.io.InputStream;

public interface ResourceRef {
  InputStream getInputStream();

  ResourceRef change(String path);
}
