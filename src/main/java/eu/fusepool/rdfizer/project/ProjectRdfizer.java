package eu.fusepool.rdfizer.project;

import java.io.InputStream;

import org.apache.clerezza.rdf.core.MGraph;
import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.ConfigurationPolicy;
import org.apache.felix.scr.annotations.Deactivate;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;
import org.osgi.framework.Constants;
import org.osgi.service.component.ComponentContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.fusepool.datalifecycle.Rdfizer;


@Component(immediate = true, metatype = true, policy = ConfigurationPolicy.OPTIONAL)
@Service(Rdfizer.class)
@Properties(value = {
    @Property(name = Constants.SERVICE_RANKING,
            intValue = ProjectRdfizer.DEFAULT_SERVICE_RANKING)
})
public class ProjectRdfizer implements Rdfizer {

    final Logger log = LoggerFactory.getLogger(this.getClass());
    
    public static final int DEFAULT_SERVICE_RANKING = 101;
    public final String RDFIZER_TYPE_LABEL = "rdfizer";
    public final String RDFIZER_TYPE_VALUE = "project";
    
    public MGraph transform(InputStream stream) {
        // TODO Auto-generated method stub
        return null;
    }

    public String getName() {        
        return this.RDFIZER_TYPE_VALUE;
    }
    
    @Activate
    protected void activate(ComponentContext context) {
        log.info("Project CSV Rdfize service is being activated");
    }

    @Deactivate
    protected void deactivate(ComponentContext context) {
        log.info("Project CSV Rdfize service is being deactivated");
    }

}
