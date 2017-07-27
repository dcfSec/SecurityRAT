package org.appsec.securityRAT.repository.search;

import org.appsec.securityRAT.domain.TrainingBranchNode;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data ElasticSearch repository for the TrainingBranchNode entity.
 */
public interface TrainingBranchNodeSearchRepository extends ElasticsearchRepository<TrainingBranchNode, Long> {
}
