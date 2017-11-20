package lu.innoviction.configuration;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;


/**
 * Configure CROS to allow browsers to make cross domain requests.
 * @author OthmaneSENOUCI
 */
@Component
public class CORSFilter  implements Filter {

	/***
	 * Configure the system to allow cross domain requests and also to allow authentication.
	 * @param req
	 * @param res
	 * @param chain
	 * 
	 */
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
	
	    HttpServletResponse response = (HttpServletResponse) res;
	
	    response.setHeader("Access-Control-Allow-Origin", "*");
	    response.setHeader("Access-Control-Allow-Credentials", "true");
	    response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE"); 
	    response.setHeader("Access-Control-Max-Age", "3600");
	    response.setHeader("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With, remember-me, authorization");
	
	    chain.doFilter(req, res);
	}
	
	@Override
	public void init(FilterConfig filterConfig) {
	}
	
	@Override
	public void destroy() {
	}

}