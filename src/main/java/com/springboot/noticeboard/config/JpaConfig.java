package com.springboot.noticeboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@EnableJpaAuditing
@Configuration
public class JpaConfig {

	@Bean
	public AuditorAware<String> auditorAware() {
		return () -> Optional.of("raagdol");		// TODO: spring security로 인증 기능을 붙이게 될 때 수정
	}
}
