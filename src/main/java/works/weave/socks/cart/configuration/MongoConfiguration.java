package works.weave.socks.cart.configuration;

import org.springframework.boot.autoconfigure.mongo.MongoClientSettingsBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class MongoConfiguration {

    @Bean
    public MongoClientSettingsBuilderCustomizer mongoDBDefaultSettings() {
        return builder -> {
            builder.applyToClusterSettings( blockBuilder -> {
                blockBuilder.serverSelectionTimeout(10000, TimeUnit.MILLISECONDS);
            });
        };
    }
}
