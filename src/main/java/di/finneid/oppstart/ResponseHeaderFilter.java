package di.finneid.oppstart;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

// TODO Dette fungerer ikke, hverken for dynamiske eller statiske forespørsler
//      Er det måten det gjøres på eller er det hvordan spørringen skjer?
//      starter den i det hele tatt? ser ikke noe i loggene, er det loggkonfigen som er feil?
//@WebFilter("/*")
@WebFilter("/")
public class ResponseHeaderFilter implements Filter {

    private static final Logger log = LogManager.getLogger(ResponseHeaderFilter.class);

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {

//        log.info("Mottar førespørsel, som videresendes");
//        chain.doFilter(request, response);
//        log.info("Forespørsel ferdigbehandler...");
//        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
//        httpServletResponse.setHeader(
//                "Cache-Control:", "no-cache");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // ...
        log.info("Registrerer filter...");
        System.out.println("SDGGAFGASGDAFGAFDSG");
    }

    @Override
    public void destroy() {
        // ...
    }
}