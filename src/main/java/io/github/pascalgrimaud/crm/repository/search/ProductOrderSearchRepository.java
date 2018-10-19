package io.github.pascalgrimaud.crm.repository.search;

import io.github.pascalgrimaud.crm.domain.ProductOrder;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the ProductOrder entity.
 */
public interface ProductOrderSearchRepository extends ElasticsearchRepository<ProductOrder, Long> {
}
