/**
 * 
 */
package com.sapient.resttraining.config;

/**
 * @author admi
 *
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
/**
  @Bean
  CommandLineRunner initDatabase(MemberRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new Member("Bilbo Baggins", "burglar")));
      log.info("Preloading " + repository.save(new Member("Frodo Baggins", "thief")));
    };
  }**/
  
}
