package kz.greetgo.gbatis.struct;

import kz.greetgo.gbatis.struct.resource.ClassResourceRef;
import kz.greetgo.gbatis.struct.resource.ResourceRef;
import kz.greetgo.gbatis.struct.struct.TestDbStruct;
import org.testng.annotations.Test;

import static org.fest.assertions.Assertions.assertThat;

public class DbStructReaderTest {
  @Test
  public void read_notNull() {
    ResourceRef ref = ClassResourceRef.create(TestDbStruct.class, "test.dbStruct");

    DbStruct dbStruct = DbStructReader.read(ref);

    assertThat(dbStruct).isNotNull();
  }

  @Test
  public void read_simpleParsed() {
    ResourceRef ref = ClassResourceRef.create(TestDbStruct.class, "test.dbStruct");

    DbStruct dbStruct = DbStructReader.read(ref);

    assertThat(dbStruct).isNotNull();

    assertThat(dbStruct.typeMap.size()).isGreaterThanOrEqualTo(3);
    assertThat(dbStruct.typeMap.keySet()).contains("client");
    assertThat(dbStruct.typeMap.get("client").fieldList).hasSize(3);

    assertThat(dbStruct.typeMap.get("client").fieldList.get(0).name).isEqualTo("surname");
    assertThat(dbStruct.typeMap.get("client").fieldList.get(0).type).isEqualTo("str500");
    assertThat(dbStruct.typeMap.get("client").fieldList.get(0).comment).isEqualTo("фамилия клиента");
  }
}
