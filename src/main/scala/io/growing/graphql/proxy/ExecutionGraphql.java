package io.growing.graphql.proxy;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import io.growing.graphql.util.Configs;
import io.growing.graphql.util.OkHttp;
import scala.concurrent.Await;
import scala.concurrent.Future;
import scala.concurrent.duration.Duration;

import java.util.concurrent.TimeoutException;

/**
 * @author liguobin@growingio.com
 * @version 1.0, 2020/7/29
 */
public interface ExecutionGraphql extends OkHttp {

    default Object execute(String entityClazzName, GraphQLOperationRequest request, GraphQLResponseProjection projection) {
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        Future<Object> retFuture;
        Object ret = null;
        try {

            retFuture = createExecuteRequest(graphQLRequest, entityClazzName);
            ret = Await.result(retFuture, Duration.Inf());
        } catch (InterruptedException | TimeoutException e) {
            System.err.println(e.getLocalizedMessage());
        }
        return ret;
    }

    default Boolean excluded(String resolverMethodName, String projectionMethodName) {
        if (Configs.globalExcludeFields().contains(projectionMethodName)) {
            return true;
        }
        return Configs.excludeFields().get(resolverMethodName).isDefined() && Configs.excludeFields().get(resolverMethodName).get().contains(projectionMethodName);
    }
}
