package testing

import com.google.inject.AbstractModule

class TestModule extends AbstractModule {
  def configure() = {
    bind(classOf[ES]).asEagerSingleton
  }
}