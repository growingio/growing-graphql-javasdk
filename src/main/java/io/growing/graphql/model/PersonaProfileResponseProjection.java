package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PersonaProfile
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class PersonaProfileResponseProjection extends GraphQLResponseProjection {

    public PersonaProfileResponseProjection() {
    }

    public PersonaProfileResponseProjection id() {
        return id(null);
    }

    public PersonaProfileResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public PersonaProfileResponseProjection name() {
        return name(null);
    }

    public PersonaProfileResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public PersonaProfileResponseProjection properties(PropertyResponseProjection subProjection) {
        return properties(null, subProjection);
    }

    public PersonaProfileResponseProjection properties(String alias, PropertyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("properties").alias(alias).projection(subProjection));
        return this;
    }

    public PersonaProfileResponseProjection typename() {
        return typename(null);
    }

    public PersonaProfileResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
