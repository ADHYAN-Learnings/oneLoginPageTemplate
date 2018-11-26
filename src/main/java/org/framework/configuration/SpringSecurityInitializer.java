/* @Author Aditya Pandey
 * 1 Nov 2018
 */
package org.framework.configuration;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SpringSecurityInitializer extends AbstractSecurityWebApplicationInitializer {
	public SpringSecurityInitializer() {
	  super(SecurityConfiguration.class);   
   }
}
