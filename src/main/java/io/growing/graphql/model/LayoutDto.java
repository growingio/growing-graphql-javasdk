package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class LayoutDto implements java.io.Serializable {

    private Integer y;
    private Integer w;
    private Integer h;
    private Integer x;
    private Integer minW;
    private Integer minH;
    private Boolean moved;
    private Boolean Static;
    private Boolean isDraggable;
    private Boolean isResizable;

    public LayoutDto() {
    }

    public LayoutDto(Integer y, Integer w, Integer h, Integer x, Integer minW, Integer minH, Boolean moved, Boolean Static, Boolean isDraggable, Boolean isResizable) {
        this.y = y;
        this.w = w;
        this.h = h;
        this.x = x;
        this.minW = minW;
        this.minH = minH;
        this.moved = moved;
        this.Static = Static;
        this.isDraggable = isDraggable;
        this.isResizable = isResizable;
    }

    public Integer getY() {
        return y;
    }
    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getW() {
        return w;
    }
    public void setW(Integer w) {
        this.w = w;
    }

    public Integer getH() {
        return h;
    }
    public void setH(Integer h) {
        this.h = h;
    }

    public Integer getX() {
        return x;
    }
    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getMinW() {
        return minW;
    }
    public void setMinW(Integer minW) {
        this.minW = minW;
    }

    public Integer getMinH() {
        return minH;
    }
    public void setMinH(Integer minH) {
        this.minH = minH;
    }

    public Boolean getMoved() {
        return moved;
    }
    public void setMoved(Boolean moved) {
        this.moved = moved;
    }

    public Boolean getStatic() {
        return Static;
    }
    public void setStatic(Boolean Static) {
        this.Static = Static;
    }

    public Boolean getIsDraggable() {
        return isDraggable;
    }
    public void setIsDraggable(Boolean isDraggable) {
        this.isDraggable = isDraggable;
    }

    public Boolean getIsResizable() {
        return isResizable;
    }
    public void setIsResizable(Boolean isResizable) {
        this.isResizable = isResizable;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (y != null) {
            joiner.add("y: " + GraphQLRequestSerializer.getEntry(y));
        }
        if (w != null) {
            joiner.add("w: " + GraphQLRequestSerializer.getEntry(w));
        }
        if (h != null) {
            joiner.add("h: " + GraphQLRequestSerializer.getEntry(h));
        }
        if (x != null) {
            joiner.add("x: " + GraphQLRequestSerializer.getEntry(x));
        }
        if (minW != null) {
            joiner.add("minW: " + GraphQLRequestSerializer.getEntry(minW));
        }
        if (minH != null) {
            joiner.add("minH: " + GraphQLRequestSerializer.getEntry(minH));
        }
        if (moved != null) {
            joiner.add("moved: " + GraphQLRequestSerializer.getEntry(moved));
        }
        if (Static != null) {
            joiner.add("static: " + GraphQLRequestSerializer.getEntry(Static));
        }
        if (isDraggable != null) {
            joiner.add("isDraggable: " + GraphQLRequestSerializer.getEntry(isDraggable));
        }
        if (isResizable != null) {
            joiner.add("isResizable: " + GraphQLRequestSerializer.getEntry(isResizable));
        }
        return joiner.toString();
    }

    public static LayoutDto.Builder builder() {
        return new LayoutDto.Builder();
    }

    public static class Builder {

        private Integer y;
        private Integer w;
        private Integer h;
        private Integer x;
        private Integer minW;
        private Integer minH;
        private Boolean moved;
        private Boolean Static;
        private Boolean isDraggable;
        private Boolean isResizable;

        public Builder() {
        }

        public Builder setY(Integer y) {
            this.y = y;
            return this;
        }

        public Builder setW(Integer w) {
            this.w = w;
            return this;
        }

        public Builder setH(Integer h) {
            this.h = h;
            return this;
        }

        public Builder setX(Integer x) {
            this.x = x;
            return this;
        }

        public Builder setMinW(Integer minW) {
            this.minW = minW;
            return this;
        }

        public Builder setMinH(Integer minH) {
            this.minH = minH;
            return this;
        }

        public Builder setMoved(Boolean moved) {
            this.moved = moved;
            return this;
        }

        public Builder setStatic(Boolean Static) {
            this.Static = Static;
            return this;
        }

        public Builder setIsDraggable(Boolean isDraggable) {
            this.isDraggable = isDraggable;
            return this;
        }

        public Builder setIsResizable(Boolean isResizable) {
            this.isResizable = isResizable;
            return this;
        }


        public LayoutDto build() {
            return new LayoutDto(y, w, h, x, minW, minH, moved, Static, isDraggable, isResizable);
        }

    }
}
