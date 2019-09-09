package es.ignacio.serranov.campusUnir.entity;

import java.util.List;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Site {

    private String entityPrefix;
	

    private List<SiteCollection> site_collection = null;
	
    public String getEntityPrefix() {
        return entityPrefix;
    }

    public void setEntityPrefix(String entityPrefix) {
        this.entityPrefix = entityPrefix;
    }

    public List<SiteCollection> getsite_collection() {
        return site_collection;
    }

    public void setsite_collection(List<SiteCollection> siteCollection) {
        this.site_collection = siteCollection;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("entityPrefix", entityPrefix).append("site_collection", site_collection).toString();
    }

    public Site(){}
}