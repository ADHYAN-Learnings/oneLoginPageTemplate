package org.framework.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
@EnableWebMvc
public class ApplicationConfiguration implements WebMvcConfigurer {
	
	@Bean
	public TilesConfigurer tilesConfigurer() {
	      TilesConfigurer tilesConfigurer =  new TilesConfigurer();
	      tilesConfigurer.setDefinitions(new String[] {"/WEB-INF/tiles/tiles.xml"});
	      tilesConfigurer.setCheckRefresh(true);
	      return tilesConfigurer;
	}
	
	public void configureViewResolvers(ViewResolverRegistry registry) {
		TilesViewResolver viewResolver = new TilesViewResolver();
		registry.viewResolver(viewResolver);
	}
	
	/* Step:1  In registry.addResourceHandler("") give the path you want to start from
	 * Step:2  addResourceLocations("") give the actual location of the file, and it should
	 *         from  'resources' which is inside  src->main->webapp->resources
	 * For Example      
	 *   registry.addResourceHandler("/css/**").addResourceLocations("/resources/bootstrap/css/");
	 *   
	 *   and you have to your implementation  file as
	 *   <spring:url value="/css/filename.extension">
	 * */
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/CustomCss/**").addResourceLocations("/resources/CustomCss/");
		registry.addResourceHandler("/CustomJs/**").addResourceLocations("/resources/CustomJs/");
	}
}
