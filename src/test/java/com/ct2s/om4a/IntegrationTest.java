package com.ct2s.om4a;

import com.ct2s.om4a.config.AsyncSyncConfiguration;
import com.ct2s.om4a.config.EmbeddedElasticsearch;
import com.ct2s.om4a.config.EmbeddedMongo;
import com.ct2s.om4a.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { GenesysWarehouseApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedMongo
@EmbeddedElasticsearch
public @interface IntegrationTest {
}
