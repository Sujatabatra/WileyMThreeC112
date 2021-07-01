package com.sujata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.Dancer;
import com.sujata.producer.Drum;
import com.sujata.producer.Guitar;
import com.sujata.producer.Instrumentalist;
import com.sujata.producer.Juggler;
import com.sujata.producer.Singer;
import com.sujata.producer.Tabla;

@Configuration
public class PerformanceConfiguration {

	@Bean
	public Singer Saumya() {
		return new Singer("Thinking Out Loud");
	}

	@Bean(name="Aryan")
	public Dancer getDancer() {
		return new Dancer("HipHop");
	}
	
	@Bean
	public Juggler Kratika() {
		Juggler juggler=new Juggler();
		juggler.setBalls(5);
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
