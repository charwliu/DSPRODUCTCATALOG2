package tmf.org.dsmapi.catalog.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import tmf.org.dsmapi.catalog.Catalog;

/**
 *
 * @author bahman.barzideh
 *
 */
@Stateless
public class CatalogFacade extends AbstractFacade<Catalog> {

    @PersistenceContext(unitName="DSProductCatalogPU")
    private EntityManager entityManager;

    public CatalogFacade() {
        super(Catalog.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }

}