package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;

public class FilterTest implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {
		JbpmContext jbpmContext = JbpmConfiguration.getInstance().createJbpmContext(JbpmContext.DEFAULT_JBPM_CONTEXT_NAME);
		try {
			filterChain.doFilter(request, response);
		} catch (Exception e) {
			
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
