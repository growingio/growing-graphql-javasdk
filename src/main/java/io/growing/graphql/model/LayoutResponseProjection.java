package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Layout
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class LayoutResponseProjection extends GraphQLResponseProjection {

    public LayoutResponseProjection() {
    }

    @Override
    public LayoutResponseProjection all$() {
        return all$(3);
    }

    @Override
    public LayoutResponseProjection all$(int maxDepth) {
        this.y();
        this.w();
        this.h();
        this.x();
        this.minW();
        this.minH();
        this.moved();
        this.Static();
        this.isDraggable();
        this.isResizable();
        this.typename();
        return this;
    }

    public LayoutResponseProjection y() {
        return y(null);
    }

    public LayoutResponseProjection y(String alias) {
        fields.add(new GraphQLResponseField("y").alias(alias));
        return this;
    }

    public LayoutResponseProjection w() {
        return w(null);
    }

    public LayoutResponseProjection w(String alias) {
        fields.add(new GraphQLResponseField("w").alias(alias));
        return this;
    }

    public LayoutResponseProjection h() {
        return h(null);
    }

    public LayoutResponseProjection h(String alias) {
        fields.add(new GraphQLResponseField("h").alias(alias));
        return this;
    }

    public LayoutResponseProjection x() {
        return x(null);
    }

    public LayoutResponseProjection x(String alias) {
        fields.add(new GraphQLResponseField("x").alias(alias));
        return this;
    }

    public LayoutResponseProjection minW() {
        return minW(null);
    }

    public LayoutResponseProjection minW(String alias) {
        fields.add(new GraphQLResponseField("minW").alias(alias));
        return this;
    }

    public LayoutResponseProjection minH() {
        return minH(null);
    }

    public LayoutResponseProjection minH(String alias) {
        fields.add(new GraphQLResponseField("minH").alias(alias));
        return this;
    }

    public LayoutResponseProjection moved() {
        return moved(null);
    }

    public LayoutResponseProjection moved(String alias) {
        fields.add(new GraphQLResponseField("moved").alias(alias));
        return this;
    }

    public LayoutResponseProjection Static() {
        return Static(null);
    }

    public LayoutResponseProjection Static(String alias) {
        fields.add(new GraphQLResponseField("static").alias(alias));
        return this;
    }

    public LayoutResponseProjection isDraggable() {
        return isDraggable(null);
    }

    public LayoutResponseProjection isDraggable(String alias) {
        fields.add(new GraphQLResponseField("isDraggable").alias(alias));
        return this;
    }

    public LayoutResponseProjection isResizable() {
        return isResizable(null);
    }

    public LayoutResponseProjection isResizable(String alias) {
        fields.add(new GraphQLResponseField("isResizable").alias(alias));
        return this;
    }

    public LayoutResponseProjection typename() {
        return typename(null);
    }

    public LayoutResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
