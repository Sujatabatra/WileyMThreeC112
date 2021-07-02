package com.sujata.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

import com.sujata.producer.Dancer;
import com.sujata.producer.Drum;
import com.sujata.producer.Guitar;
import com.sujata.producer.Instrumentalist;
import com.sujata.producer.Juggler;
import com.sujata.producer.Singer;
import com.sujata.producer.Tabla;

@Configuration
@PropertySource(ignoreResourceNotFound = true, value = "classpath:values.properties")
public class PerformanceConfiguration {

	@Value("${performer.song}")
	private String song;
	@Value("${performer.style}")
	private String style;
	@Value("${performer.balls}")
	private int balls;
	
	@Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }
	@Bean
	@Lazy(true)
	@Scope("prototype")
	public Singer Saumya() {
		return new Singer(song);
	}

	@Bean(name="Aryan")
	public Dancer getDancer() {
		return new Dancer(style);
	}
	
	@Bean
	public Juggler Kratika() {
		Juggler juggler=new Juggler();
		juggler.setBalls(balls);
		return juggler;
	}
	
	@Bean
	public Guitar guitar() {
		return new Guitar();
	}
	
	@Bean
	public Tabla tabla() {
		return new Tabla();
	}
	@Bean
	public Drum drum() {
		return new Drum();
	}
	
	@Bean
	public Instrumentalist Vasu() {
		Instrumentalist instrumentalist=new Instrumentalist();
		instrumentalist.setInstrument(guitar());
		return instrumentalist;
	}
}
