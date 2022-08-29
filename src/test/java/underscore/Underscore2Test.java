package underscore;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import io.micronaut.context.BeanContext;
import io.micronaut.inject.qualifiers.Qualifiers;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.transaction.jdbc.DataSourceTransactionManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import jakarta.inject.Inject;

@MicronautTest
class Underscore2Test {

  @Inject
  protected BeanContext beanContext;

  @Test
  void test() {
    assertNotNull(beanContext.getBean(DataSourceTransactionManager.class, Qualifiers.byName("underscore_test")));
  }

  @Test
  void test2 () {
    assertNotNull(beanContext.getBean(DataSourceTransactionManager.class, Qualifiers.byName("underscore-test")));
  }

}
