/*
 * RestApiClient
 *
 * This file was automatically generated for XionGlobal by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.xionglobal.api.client.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ProductId type.
 */
public class ProductId {
    private Integer id;

    /**
     * Default constructor.
     */
    public ProductId() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     */
    public ProductId(
            Integer id) {
        this.id = id;
    }

    /**
     * Getter for Id.
     * Id of product you will want to make payment for.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Id of product you will want to make payment for.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Converts this ProductId into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProductId [" + "id=" + id + "]";
    }

    /**
     * Builds a new {@link ProductId.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProductId.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId());
        return builder;
    }

    /**
     * Class to build instances of {@link ProductId}.
     */
    public static class Builder {
        private Integer id;



        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * Builds a new {@link ProductId} object using the set fields.
         * @return {@link ProductId}
         */
        public ProductId build() {
            return new ProductId(id);
        }
    }
}
